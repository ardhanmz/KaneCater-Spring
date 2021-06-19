package com.ardhanmz.kanecater.request;

import com.ardhanmz.kanecater.model.MsUser;
import com.ardhanmz.kanecater.util.http.RequestType;
import com.google.gson.annotations.SerializedName;

public class UserSaveRequest extends RequestType{
	@SerializedName("userdata")
	private MsUser userData;

	public MsUser getUserData() {
		return userData;
	}

	public void setUserData(MsUser userData) {
		this.userData = userData;
	}
	
	
}
