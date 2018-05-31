package cn.huiyifyj.bean;

import cn.huiyifyj.bean.IdEntity;

public class Comment extends IdEntity {

	private int cId; // 评论id
	private String cContent; // 评论的内容
	private int byId; // 被评论的人的id
	
	//注：继承的父类还含有 userId 这里指的是 发表评论的人的ID
	
	//Getters and Setters
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcContent() {
		return cContent;
	}
	public void setcContent(String cContent) {
		this.cContent = cContent;
	}
	public int getById() {
		return byId;
	}
	public void setById(int byId) {
		this.byId = byId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}