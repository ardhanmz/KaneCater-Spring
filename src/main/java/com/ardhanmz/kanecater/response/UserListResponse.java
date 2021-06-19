package com.ardhanmz.kanecater.response;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUser;
import com.ardhanmz.kanecater.util.http.ResponseType;
import com.google.gson.annotations.SerializedName;

public class UserListResponse extends ResponseType{
	@SerializedName("listUser")
	private List<MsUser> listUser;

	public List<MsUser> getListUser() {
		return listUser;
	}

	public void setListUser(List<MsUser> listUser) {
		this.listUser = listUser;
	}
	
	
}
