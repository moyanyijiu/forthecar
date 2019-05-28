function setClickCount(app_id,id)
{
	if(app_id == "appeal")
	{
		jsonrpc.SQRPC.setSQClickCount(id);
	}
}

//保存评论
function insertComment(app_id,site_id,item_id,cmt_content)
{
	var cb = new Bean("com.cicro.wcm.bean.system.comment.CommentBean",true);
	cb.item_id = item_id;
	cb.app_id = app_id;
	cb.site_id = site_id;
	cb.cmt_content = cmt_content;
	try{
		cb.me_id = memberBean.me_id;
		cb.me_nickname = memberBean.me_nickname;
	}catch(e){}

	return jsonrpc.CommentManRPC.insertComment(cb);
}
