package cn.huiyifyj.bean;

import cn.huiyifyj.bean.IdEntity;

public class Via extends IdEntity {
	
	String photo; // 用户头像
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}