package cn.huiyifyj.bean;

import cn.huiyifyj.bean.IdEntity;

public class Comment extends IdEntity {

	private int cId; // ����id
	private String cContent;// ���۵�����
	private int byId;// �����۵��˵�id
	
	//ע���̳еĸ��໹���� userId ����ָ���� �������۵��˵�ID
	
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