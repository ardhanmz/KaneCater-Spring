package com.ardhanmz.kanecater.response;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUserEntity;
import com.ardhanmz.kanecater.util.http.ResponseType;
import com.google.gson.annotations.SerializedName;

public class UserListResponse extends ResponseType{
	@SerializedName("listUser")
	private List<MsUserEntity> listUser;

	public List<MsUserEntity> getListUser() {
		return listUser;
	}

	public void setListUser(List<MsUserEntity> listUser) {
		this.listUser = listUser;
	}
	
	
}
