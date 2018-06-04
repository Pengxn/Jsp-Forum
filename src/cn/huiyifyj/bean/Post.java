package cn.huiyifyj.bean;

import cn.huiyifyj.bean.IdEntity;

public class Post extends IdEntity {

	private int pId; // 帖子ID
	private String titles; // 帖子标题
	private String pContent; // 发帖内容
	private String userName; // 发帖人姓名

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getTitles() {
		return titles;
	}
	public void setTitles(String titles) {
		this.titles = titles;
	}
	public String getpContent() {
		return pContent;
	}
	public void setpContent(String pContent) {
		this.pContent = pContent;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
