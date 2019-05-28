//初始化按钮样式
function initButtomStyle()
{
	$(":submit,:reset,:button").each(function(){	
		var n = $(this).val().length;
		$(this).addClass("btn");
		$(this).addClass("x"+n);
		$(this).hover(function(){$(this).addClass("btn-over");},function(){$(this).removeClass("btn-over");});
		$(this).mousedown(function(){$(this).addClass("btn-click");$(this).removeClass("btn-over");})
		$(this).mouseup(function(){$(this).addClass("btn-over");$(this).removeClass("btn-click");})
	})
}

//初始化页面内标签
function init_FromTabsStyle()
{
	
	$(".fromTabs > li").each(function(){	
		$(this).hover(
		  function () {
			$(this).addClass("list_tab_over");
		  },
		  function () {
			$(this).removeClass("list_tab_over");
		  }
		);
		
		$(this).click(
		  function () {
			$(".fromTabs > li").removeClass("list_tab_cur");
			$(this).addClass("list_tab_cur");
			$(".infoListTable").addClass("hidden");
			$("#listTable_"+$(this).index()).removeClass("hidden");
		  }
		);
	})	
}

//初始化表单控件样式
function init_input()
{
	$(":text").addClass("input_text");
	$(":text").blur( function () { $(this).removeClass("input_text_focus"); } );
	$(":text").focus( function () { $(this).addClass("input_text_focus"); } );
	
	$(":password").addClass("input_text");
	$(":password").blur( function () { $(this).removeClass("input_text_focus"); } );
	$(":password").focus( function () { $(this).addClass("input_text_focus"); } );
	
	$(":checkbox").addClass("input_checkbox");
	$("textarea").addClass("input_textarea");
	$("textarea").blur( function () { $(this).removeClass("input_textarea_focus"); } );
	$("textarea").focus( function () { $(this).addClass("input_textarea_focus"); } );
	
	$(":radio").addClass("input_radio");
	
	$("select").addClass("input_select");
}

//得到infoList内所有选中的input复选框的ID串，如”1,2,3,4“
function getInputBoxSelected(tableName)
{
	var ids = "";
	$("#"+tableName+" tbody .inputHeadCol:checked").each(function(){	
		ids += $(this).attr("id")+",";
	})
	ids = ids.substring(0,ids.length-1);
	alert(ids);
}


//table行单击事件后的检查函数
function clickInputCheckBox(tableName)
{
	if($("#"+tableName+" tbody .inputHeadCol:checked").length == $("#"+tableName+" tbody .inputHeadCol:checkbox").length)
	{
		$("#"+tableName+" thead :checkbox").attr("checked",true);
		
	}
	else
	{
		$("#"+tableName+" thead :checkbox").attr("checked",false);
	}
}


function Init_InfoTable(tableName)
{
	//奇偶行不同颜色
	$("#"+tableName+".odd_even_list tbody tr:odd").removeClass().addClass("tr_odd");
    $("#"+tableName+".odd_even_list tbody tr:even").removeClass().addClass("tr_even");
	
	$("#"+tableName+" tbody tr").each(function(){
		var $_tr=$(this);
		//alterRowColor($_tr);
		$(this).hover(
		  function () {
			$(this).addClass("tr_hover");
		  },
		  function () {
			$(this).removeClass("tr_hover");
		  }
		);
		
		if($(this).find(".inputHeadCol:checkbox").attr("checked")==true)
		{
			$(this).addClass("tr_selected");
		}
		
		//行单击事件
		$(this).click( 
			function (event) {
				if(!(("INPUT,A,SPAN,IMG").indexOf($(event.target)[0].tagName.toUpperCase())>-1))
				{
					$(this).find(".inputHeadCol:checkbox").attr("checked",!($(this).find(".inputHeadCol:checkbox").attr("checked")));
					
				}
				
				if($(this).find(".inputHeadCol:checkbox").attr("checked")==true)
				{
					$(this).addClass("tr_selected");
				}
				else
				{
					$(this).removeClass("tr_selected");
				}
				clickInputCheckBox(tableName);
			}
		);

	})
	
	//行头checkbox单击事件
	$("#"+tableName+" tbody .inputHeadCol:checkbox").each(function(){	
		$(this).click( 
			function () { 
				clickInputCheckBox(tableName);
			}
		);
	})
	
	//全选checkbox事件
	$("#"+tableName+" thead :checkbox").click(
		function () { 
			if($(this).attr("checked")==true){
				//alert($("#"+tableName+" tbody .inputHeadCol").txt());
				$("#"+tableName+" tbody .inputHeadCol:checkbox").attr("checked",true);
				$("#"+tableName+" tbody tr").addClass("tr_selected");
			}
			else
			{
				$("#"+tableName+" tbody .inputHeadCol:checkbox").attr("checked",false);
				$("#"+tableName+" tbody tr").removeClass("tr_selected");
			}
		}				  
	);
}

//初始化编辑器
function init_editer(textareaID)
{
	/*KE.show({
		id : textareaID,
		cssPath : './index.css',
		afterCreate : function(id) {
			KE.event.ctrl(document, 13, function() {
				KE.util.setData(id);
				document.forms['example'].submit();
			});
			KE.event.ctrl(KE.g[id].iframeDoc, 13, function() {
				KE.util.setData(id);
				document.forms['example'].submit();
			});
		}
	});	*/
}

//初始化编辑器-前台专用
function init_editer_min(textareaID)
{
	KE.show({
		id : textareaID,
		resizeMode : 0,
		cssPath : './index.css',
		afterCreate : function(id) {
			KE.event.ctrl(document, 13, function() {
				KE.util.setData(id);
				document.forms['example'].submit();
			});
			KE.event.ctrl(KE.g[id].iframeDoc, 13, function() {
				KE.util.setData(id);
				document.forms['example'].submit();
			});
		},
		items : [
				'undo', 'redo', 'cut', 'copy', 'paste','|', 'insertorderedlist', 'insertunorderedlist', '|',
		 'fontsize', 'textcolor',  'bold',
		'italic', 'underline',  '|','selectall']
	});	
}

function iniTabs()
{	
	$(".tabs-li").mouseover(
		function(){
			$(".tabs-li").removeClass("tabs-selected");
			$(this).addClass("tabs-selected");	
			var i = $(this).index();
			$(".tabs-panel").addClass("hidden");
			$($(".tabs-panel").get(i)).removeClass("hidden");
		}
	);
}
function iniTabs2()
{	
	$(".tabs-li2").mouseover(
		function(){
			$(".tabs-li2").removeClass("tabs-selected");
			$(this).addClass("tabs-selected");	
			var i = $(this).index();
			$(".tabs-panel2").addClass("hidden");
			$($(".tabs-panel2").get(i)).removeClass("hidden");
		}
	);
}

function iniNav()
{
	$(".nav li a").each(function(i){
		$(this).hover(
		  function () {
			$(this).addClass("hover");
		  },
		  function () {
			$(this).removeClass("hover");
		  }
		);
	});
}

//奇偶行不同颜色
function OddEvenColor(tableName)
{
	$("#"+tableName+".odd_even_list tbody tr:odd").removeClass().addClass("tr_odd");
    $("#"+tableName+".odd_even_list tbody tr:even").removeClass().addClass("tr_even");	
}
