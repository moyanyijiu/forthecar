/**
 现有校验函数列表
 */
/**
 *校验器程序
 ×author : chunson
 */
//var isFocus = false;//是否让控件得到焦点
Validator = function(){
	//校验器状态变量
	this.check_result = true;//校验结果状态，全部校验通过为true，否则为false
	this.errors_map = {};//所有错误的{错误名,错误消息}的MAP
	this.error_names = [];//所有[错误名]的LIST
	//显示变量及默认值
	this.error_color = "red";//默认的错误显示颜色,可以根据需要设置修改
	this.error_prifix = "<li>";//每条错误前面的信息,可以根据需要设置修改
	this.error_div_id = "error_div";//用于显示错误的元素id(元素可以为<div>,<span>,<p>,<td>等),
	
	//可以根据需要设置修改,或在调用showError(div_id)时以参数传入
	
	//--------------------------------------------------------------------------------
	/**
	 *以下是校验器的操作函数
	 */
	//得到校验结果,当且只当全部校验通过时返回true
	this.getResult=function(){
		return this.check_result;
	}
	this.setErrorDiv=function(div_id){
		this.error_div_id=div_id;
	}
	
	//重置校验器,为避免多次校验结果重叠,在再次验证之前先调用此函数重置
	this.reset=function(){
		this.check_result = true;
		this.error_names = [];
		this.errors_map = {};
		$("#" + this.error_div_id).empty();
	}
	
	//在页面上指定id的区块中显示错误信息
	this.showError=function showError(input_name,error_msg){
			$(".infoListTable").each(function(i){
				if($(this).find("#"+input_name).length > 0)
				{
					$(".tab_right").eq(i).click();
				}
			})
			jQuery.simpleTips(input_name,error_msg,2000);
	}
	
	//往错误列表里面添加错误信息
	this.addError=function addError(input_name, error_msg){
		if (typeof(input_name) == 'undefined' || typeof(error_msg) == 'undefined') {
			return;
		}
		//$("#"+input_name).parent().focus();
		this.showError(input_name,error_msg);
		return;
	}	
	
	//得到指定名字的错误,参数name是在checkXXX(value,name)中的name,或addError(name,error_msg)中的name
	this.getError=function (name){
		if (typeof(name) == 'undefined') {
			return "";
		}
		return this.errors_map[name];
	}
	
	//---------------------------------------------------------------------------------
	/**
	 *以下是校验函数,在进行表单校验时,只要依次调用校验函数,最后调用getCheck_result()得到是否全部通过,如果不通过,调用showError(div_id)把错误显示到指定区域
	 *每个函数在最后一个参数name是要校验的主体名,如"用户名",传入该参数有两个用处,一是可以通过getError("用户名")用于得到特定错误信息,二是用于错误显示
	 */
	//校验值不能为空
	
	//校验日期
	
	this.checkEmpty=function (value, name,input_name){
		value = value+"";
		if (value == "null" || value == null || (value = $.trim(value)).length == 0) { //|| trim(oStr)==""
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项不能为空");
						
			return false;
		}
		else {
			return true;
		}
	}
	//校验字符串的长度
	this.checkStrLength=function (value,name,maxnum,input_name){	
		if (value != "" && value != null) {				
			if(value.LenDB() > maxnum)
			{
				this.check_result = false;
				this.addError(input_name, "【" + name + "】项输入的内容字数不能大于"+maxnum);
				return false;
			}
			else
				return true;
		}
		else {
			return true;
		}
	}
	//只能是中英文数字
	this.checkStrCharacter=function(value,name,input_name,input_name){
		if (value != "" && value != null) {
			var reString4=/^[^\s_~`!@#%&=;:\/\$<>\|\"\'\^\*\+\[\]\?]*$/;
			if(!reString4.test(value))
			{
				this.check_result = false;
				this.addError(input_name, "【" + name + "】项不能输入特殊字符!");
				return false;
			}
			else
				return true;
		}
		else {
			return true;
		}
	}

	//校验值只能填写营业执照号
	this.checkBusinessLicense=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rDigit = /^\d{15}$/;
		var bVal = rDigit.test(value);
		//alert(bVal);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的格式有误,营业执照号为15位数字　参考格式: 120106000050968");
			return false;
		}
	}
	
	//校验值只能填写数字
	this.checkDigit=function (value, name,booleanFlag,input_name){
		
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rDigit = /^\d+$/;
		var bVal = rDigit.test(value);
		//alert(bVal);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的数字格式有误,参考格式: 518");
			return false;
		}
	}
	
	//校验值只能是Email格式
	this.checkEmail=function (value, name ,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rEmail = /^(\w|-)(\w|-){0,20}(\.)?(\w|-){0,20}@(\w|-){1,20}\.((\w|-){1,20}\.){0,2}\w\w\w?$/;
		var bVal = rEmail.test(value, name);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的电子邮件格式有误,参考格式: dt@cicro.com");
			return false;
		}
		
	}
	
	//校验值只能是网络URL
	this.checkWebsite=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;		
		
		var rWebsite = /^(http:\/\/)?(\w|-){1,20}\.((\w|-){1,20}\.){0,2}\w\w\w?(:\d{1,4})?(\/\w{0,20}){0,2}(\.\w{1,4})?$/;
		var bVal = rWebsite.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的网络URL地址有误,参考格式: http://www.cicro.com/");
			return false;
		}
	}

	//校验值只能是域名
	this.checkDomain=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;		
		
		var rWebsite = /^[0-9a-z]+\.[0-9a-z]+\.[0-9a-z]+(\.[0-9a-z]+)?$/;
		var bVal = rWebsite.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的域名有误,参考格式: www.cicro.com");
			return false;
		}
	}
	
	//校验值只能是IP
	this.checkIP=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rIP = /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;
		var bVal = rIP.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的IP格式错误,参考格式: 192.168.12.25");
			return false;
		}
	}

	//校验值只能是传真号码
	this.checkFax=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;	
		
		return this.checkTelephone(value, name,true,input_name);
	}
	
	//校验值只能是电话号码
	this.checkTelephone=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;	
		var rPhone = /^(\(?\d?\d?\d\d\)? ?-? ?)?\d\d\d?\d? ?-? ?\d\d\d\d(-\d?\d?\d\d){0,1}$/;
		var bVal = rPhone.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的电话(传真)号码格式错误,参考格式: 029-87998008");
			return false;
		}
	}
	
	//校验值只能是手机号码
	this.checkMobile=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rMobile = /^1\d{10}$/;
		var bVal = rMobile.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的手机号码格式错误,参考格式: 13988889999");
			return false;
		}
	}
	
	
	//校验值只能是邮编
	this.checkZip=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rZip = /^\d{6}$/;
		var bVal = rZip.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的邮编格式错误,参考格式: 710000");
			return false;
		}
	}
	
	//校验值只能是整数
	this.checkInt=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rInt = /^(\+|-)?\d*$/;
		var bVal = rInt.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中只能填写整数");
			return false;
		}
	}
	
	//校验证只能是正整数
	this.checkUnsignedInt=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		if (value != '') {
			var rUnsignedInt = /^\d*$/;
			var bVal = rUnsignedInt.test(value);
			if (bVal) {
				return true;
			}
			else {
				this.check_result = false;
				this.addError(input_name, "【" + name + "】项只能输入正整数,参考格式: 112");
				return false;
			}
		}
		else
		{
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项不能为空");
			return false;
		}
	}
	
	//校验证只能是浮点小数
	this.checkFloat=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rFloat = /^(\+|-)?\d*\.?\d+$/;
		var bVal = rFloat.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中只能填写小数,参考格式: 13.21");
			return false;
		}
	}
	
	//校验证只能是正浮点小数
	this.checkUnsignedFloat=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rUnsignedFloat = /^\d*\.?\d+$/;
		var bVal = rUnsignedFloat.test(value);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中只能填写大于零的小数,参考格式: 13.21");
			return false;
		}
	}
	//验证金额格式
	this.isMoney=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var regu = "^[\-\+]?[0-9]+([\.][0-9]{1,3})?$";
		var re = new RegExp(regu); 
		if (re.test(value)){
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中只能填写金额格式,参考格式: 13.21 或 -400");
			return false;
		}
	}

	//验证面积格式
	this.isArea=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var regu = "^[0-9]+([\.][0-9]{1,3})?$";
		var re = new RegExp(regu); 
		if (re.test(value)){
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中只能填写整数或小数点后3位的数字,参考格式: 100 或 97.82");
			return false;
		}
	}
	
	//校验值只能是身份证号
	this.checkIDCard=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;
		value = value.toUpperCase();
		var rID = /^(\d{15}|\d{17}(\d|X))$/;
		var bVal = rID.test(value);
		
		if (!bVal) {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的身份证号码格式错误,参考格式: 342332191810130973");
			return false;
		}
		var birthDate = "";
		if (value.length == 15) {
			birthDate = value.substring(6, 12);
		}
		else {
			birthDate = value.substring(6, 14);
		}
		if (bVal && value.length == 18) {
			var Wi = [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2];
			var VC = [1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2];
			var Ai = 0;
			var AiWi = 0;
			for (var i = 0; i < 17; i++) {
				Ai = parseInt(value.substring(i, i + 1));
				AiWi += Ai * Wi[i];
			}
			var mVal = AiWi % 11;
			
			if (VC[mVal] != value.substring(17, 18)) {
				bVal = false;
			}
		}
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的身份证号码格式错误,参考格式: 342332191810130973");
			return false;
		}
	}
	
	//校验值只能是时间格式
	this.checkDate=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rDot = /\./gi;
		var rSlash = /\//gi;
		//var rBlank = / /gi;
		//var rColon = /:/gi;
		
		value = value.replace(rDot, "-");
		value = value.replace(rSlash, "-");
		//value = value.replace(rColon,"-");
		//value = value.replace(rBlank,"-");
		
		var iDateValues = [0, 1, 1, 0, 0, 0, 0];
		
		if (value.indexOf("-") < 0) {
			//if (value.length == 6){
			//    value = "20" + value;
			//}
			//if (value.length != 8 || !checkDigit(value,name)){
			//    return false;
			//}
			//iDateValues[0] = parseInt(value.substring(0,4),10);
			//iDateValues[1] = parseInt(value.substring(4,6),10);
			//iDateValues[2] = parseInt(value.substring(6),10);
			return false;
		}
		else {
			var rDate = /^[1-4]\d\d\d(-[0-1]?\d)?(-[0-3]?\d)?$/;
			var bVal = rDate.test(value);
			if (!bVal) {
				return false;
			}
			var sDateValues = value.split("-");
			for (var i = 0; i < sDateValues.length; i++) {
				iDateValues[i] = parseInt(sDateValues[i], 10);
			}
		}
		
		var tempDate = new Date(iDateValues[0], iDateValues[1] - 1, iDateValues[2], iDateValues[3], iDateValues[4], iDateValues[5], iDateValues[6]);
		var iTempDate = tempDate.getDate();
		var iTempMonth = tempDate.getMonth();
		if (iTempDate != iDateValues[2] || iTempMonth != (iDateValues[1] - 1)) {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的日期格式错误,参考格式: 2008-12-21");
			return false;
		}
		else {
			return true;
		}
	}
	
	//校验值只能是时间格式
	this.checkTime=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var rTime = /^[0-2]?\d?(:[0-5]?\d){0,2}$/;
		var bVal = rTime.test(value);
		if (!bVal) {
			return false;
		}
		var iHour = 0;
		var iMinute = 0;
		var iSecond = 0;
		var aTimeValue = value.split(":");
		var aTimeName = ["iHour", "iMinute", "iSecond"];
		
		for (var i = 0; i < aTimeValue.length; i++) {
			eval(aTimeName[i] + "=parseInt(aTimeValue[i],10);");
		}
		if (iHour > 23 || iMinute > 59 || iSecond > 59) {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的时间格式错误,参考格式: 12:22:11");
			return false;
		}
		return true;
	}
	
	//校验Checkbox必须选择
	this.checkSelected=function (oCheckbox){
		if (oCheckbox.type == "checkbox") {
			if (oCheckbox.checked == true) {
				return true;
			}
		}
		else {
			for (var i = 0; i < oCheckbox.length; i++) {
				if (oCheckbox[i].checked == true) {
					return true;
				}
			}
		}
		this.check_result = false;
		this.addError(input_name, "【" + name + "】中没有被选择的项");
		return false;
	}
	
	//校验值只能是数字和大写字母
	this.checkUpper=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		Val = value;
		myRegExp = /^([A-Z0-9]+)$/;
		var bVal = myRegExp.test(Val);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(name, "【" + name + "】项只能填写数字和大写字母,参考格式: CICRO123");
			return false;
		}
	}
	//校验值只能是字母
	this.checkLetter=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		Val = value;
		myRegExp = /^([a-zA-Z]+)$/;
		var bVal = myRegExp.test(Val);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项只能填写字母,参考格式: cicro");
			return false;
		}
	}
	//校验值只能是小写字母
	this.checkLowerLetter=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		Val = value;
		myRegExp = /^([a-z]+)$/;
		var bVal = myRegExp.test(Val);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项只能填写小写字母,参考格式: cicro");
			return false;
		}
	}
	
	//校验值只能是数字和小写字母
	this.checkLower=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		Val = value;
		myRegExp = /^([a-zA-Z0-9]+)$/;
		var bVal = myRegExp.test(Val);
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项只能填写数字和小写字母,参考格式: cicro123");
			return false;
		}
	}
	
	//校验值只能是数字
	this.checkNumber=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		if (value != '') {
			Val = value;
			myRegExp = /^([0-9]+)$/;
			var bVal = (myRegExp.test(Val));
			if (bVal) {
				return true;
			}
			else {
				this.check_result = false;
				this.addError(input_name, "【" + name + "】只能填写数字,参考格式: 123456");
				return false;
			}
		}
	}
	
	//校验值只能是数字,字母和符号
	this.checkLetterAndSign=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		Val = value;
		myRegExp = /^([A-z0-9;:!@#%&_=<>,"'\-\/\`\~\$\^\*\(\)\+\|\\\?\.\{\}\[\] ]+)$/;
		var bVal = (myRegExp.test(Val));
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项只能填写数字和字母,参考格式: cicro");
			return false;
		}
	}
	
	//校验值只能是中文
	this.checkChinese=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var reg = /^[\u4E00-\u9FA5]+$/;
		if (reg.test(value)) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中只能填写中文,参考格式: 时光");
			return false;
		}
	}
	
	//校验值只能是数字和字母和汉字
	this.checkLetterAndChinese=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		if (value != '') {
			Val = value;
			myRegExp = /^(\w|[\u4E00-\u9FA5])*$/;
			var bVal = (myRegExp.test(Val));
			if (bVal) {
				return true;
			}
			else {
				this.check_result = false;
				this.addError(input_name, "【" + name + "】只能填写正整数、字母和中文字符！");
				return false;
			}
		}
	}
	
	
	//校验值只能填写年份
	this.checkYear=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var bVal = (isDigit(value));
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写年份格式错误,参考格式: 2008");
			return false;
		}
	}
	
	//判断日期时间
	this.checkDataTimeAfter=function (styear, endyear, name,input_name){	
		if (styear != '' && endyear != '') {
			var reg_ymd=/^([\d]{4})-([\d]{1,2})-([\d]{1,2})\s([\d]{1,2}):([\d]{1,2})$/;
			var arr_dt1,arr_dt2,dt1,dt2;

			arr_dt1=styear.match(reg_ymd);
			arr_dt2=endyear.match(reg_ymd);
		
			dt1=new Date(arr_dt1[1],arr_dt1[2],arr_dt1[3],arr_dt1[4],arr_dt1[5]);
			dt2=new Date(arr_dt2[1],arr_dt2[2],arr_dt2[3],arr_dt2[4],arr_dt2[5]);

			if(dt2 > dt1)
			{
				return true;
			}
			else {
				this.check_result = false;
				this.addError(input_name, "【" + name + "】的结束时间不能早于开始时间！");
				return false;
			}
		}
	}

	//判断日期时间
	this.checkDataAfter=function (styear, endyear, name,input_name){		
		if (styear != '' && endyear != '') {
			var reg_ymd=/^([\d]{4})-([\d]{1,2})-([\d]{1,2})$/;
			var arr_dt1,arr_dt2,dt1,dt2;

			arr_dt1=styear.match(reg_ymd);
			arr_dt2=endyear.match(reg_ymd);
		
			dt1=new Date(arr_dt1[1],arr_dt1[2],arr_dt1[3]);
			dt2=new Date(arr_dt2[1],arr_dt2[2],arr_dt2[3]);

			if(dt2 > dt1)
			{
				return true;
			}
			else {
				this.check_result = false;
				this.addError(input_name, "【" + name + "】的结束时间不能早于开始时间！");
				return false;
			}
		}
	}
	
	
	//校验值只能是月份
	this.checkcheckMonth=function (value, name,booleanFlag,input_name){
		if(booleanFlag && (value == null || (value = $.trim(value)).length == 0)) 
			return true;				
		var bVal = true;
		if (str.length == 2) {
			if (str.charAt(0) == '0') {
				bVal = isDigit(str.charAt(1)) && 0 < new Number(str.charAt(1)) && 10 > new Number(str.charAt(1));
			}
			else 
				bVal = (isDigit(value, name) && 9 < new Number(value, name) && 13 > new Number(value, name));
		}
		else {
			bVal = false;
		}
		if (bVal) {
			return true;
		}
		else {
			this.check_result = false;
			this.addError(input_name, "【" + name + "】项中填写的月份格式错误,参考格式: 029-87998008");
			return false;
		}
	}
	
	//判断参数是否为数字,注意,此函数不是校验函数
	function isDigit(value){
		var rDigit = /^\d+$/;
		var bVal = rDigit.test(value);
		//alert(bVal);
		return bVal;
	}
	
	
	function isFloat(sStr){
		xs = "0123456789."
		for (i = 0; i < xs.length; i++) {
			ss = sStr.charAt(i);
			if (xs.indexOf(ss) < 0) 
				return false;
		}
		if (sStr.indexOf(".") > 0) 
			if (sStr.substring(sStr.indexOf(".") + 1).indexOf(".") != -1) 
				return false;
		if (sStr.length == 1 && sStr == xs.charAt(10)) 
			return false;
		return true;
	}
	
	function data(value, name){
		var digit = /^((1[0-2])|([1-9])|(0[1-9]))$/;
		var lVal = false;
		var rVal = false;
		lVal = digit.test(value);
		if (!lVal) {
			this.check_result = false;
			this.addError(name, "【" + name + "】项中只能填写数字并且范围只能在(1-12)月范围内,参考格式: 1-12！");
			return false;
		}
	}
	
	this.checkMonthNotBefore=function (value1, value2, name){
		var digit = /^((1[0-2])|([1-9])|(0[1-9]))$/;
		var lVal = false;
		var rVal = false;
		if (value1 != "") {
			data(value1, name);
		}
		if (value2 != "") {
			data(value2, name);
		}
		if (value1 != "" && value2 != "") {
			data(value1, name);
			data(value2, name);
			if (parseInt(value1) > parseInt(value2)) {
				this.check_result = false;
				this.addError(name, "【" + name + "】结束月份不能早于起始月份！");
				return false;
			}
		}
		return true;
	}

	this.checkSpecialStr=function(value,name){
		var reString4=/^[^%\'\_]*$/;
		if(!reString4.test(value))
		{
			parent.alertN("<div style='line-height:20px'>"+name+"不能输入%号，单引号和下划线特殊符号");
			return false;
		}
		else
			return true;
	}

}

function checkInputValue(input_name,isEmpty,maxLength,message,vaildFuction)
{
	val.isFocus = false;
	if(!isEmpty)
	{		
		if(!val.checkEmpty($("#"+input_name).val(),message,input_name))
		{
			return;			
		}		
	}
	if(vaildFuction != "" && vaildFuction != null)
	{
		if(eval('val.'+vaildFuction+'($("#'+input_name+'").val(),"'+message+'",true,"'+input_name+'")') == false)
		{
			return;
		}
	}
	if(!val.checkStrLength($("#"+input_name).val(),message,maxLength,input_name) == false)
	{
		return;
	}	
}


//表单验证提示
jQuery.simpleTips = function(source,content,millisec){
	
	//$("#"+source).scrollTop(300);

	var $source = (typeof(source)== 'object') ? $(source) : $('#'+source);
	$source.css('cursor','pointer');
	
	var suffx = $source.attr('id') ? $source.attr('id') : new Date().getTime();
	var jtipId = "Tip_" + suffx + new Date().getTime();
	var jtipContentId = "TipInner_" + suffx;
		
	var thePos = $source.position();
		
	//$("body").append("<div id='" +jtipId+ "' class='Tip' ><div class='Tip_arrow_left'></div><div class='Tip_content' id='" +jtipContentId+ "'></div></div>");//right side
	$("body").append('<div id="' +jtipId+ '" class="tip" style="left:'+(thePos.left+50)+'px;top:'+(thePos.top-20)+'px"><div class="tip_top_left"></div><div class="tip_top_bg"></div><div class="tip_top_right"></div><div class="tip_mid"><div><div>'+content+'</div></div></div><div class="tip_foot_left"></div><div class="tip_foot_bg"></div><div class="tip_foot_right"></div></div>');//right side

	$("#"+jtipId+" .tip_top_bg").css("width",$("#"+jtipId+" .tip_mid").width()-10);
	$("#"+jtipId+" .tip_foot_bg").css("width",$("#"+jtipId+" .tip_mid").width()-33);
	$('#'+jtipId).fadeIn("slow");	
	
	if(millisec)setTimeout("jTipHide('" +jtipId+ "')",millisec);
	
	jTipHide = function(objectId){
	  $('#'+objectId).fadeOut("slow",function(){
		 $(this).detach();
	  });
   }
};