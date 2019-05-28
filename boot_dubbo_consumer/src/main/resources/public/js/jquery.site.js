$(document).ready(function() {

	//首页的表单数量增加和减少；
	$(".add").click(function(){
		var n = $(this).siblings('.num').val();
		var num=parseInt(n)+1;
		var kcnum = $(this).siblings("input[name='kucun']").val();
		if(num > kcnum){
			$(this).siblings('.num').val(kcnum);
			alert('非常抱歉，库存不足！');
		}else{
			$(this).siblings('.num').val(num);
		}
	});
	$(".jian").click(function(){
		var n = $(this).siblings('.num').val();
		var num=parseInt(n)-1;
		if(num <= 0){
			$(this).siblings('.num').val('1');
			alert('非常抱歉，不能为0!');
		}else{
			$(this).siblings('.num').val(num);
		}
	});




	//规格增加选定效果
	$('#J_cu').click(function(){
		if($(this).hasClass('cur')){
			$(this).removeClass('cur');
		}else{
			$(this).addClass('cur');
		}
	});




//幻灯片
	$('#J_slide').slide({
			contentCls: 'slideBox', 	/**对应的图片上一层  也就是所谓的内容  从导航处选择内容**/
			cur: 'cur',			/**要的滚动效果**/
			speed: 80,        /**幻灯片时间**/
			effect: 'scroll',	/**效果：滚动**/
			direction: 'x',   /**滚动的方向**/
		});
	
	



});









































