package cn.huiyifyj.bean;

import cn.huiyifyj.bean.IdEntity;

public class Via extends IdEntity {
	
	String avatar; // 用户头像
	// 同时也继承了父类的 userId

	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}