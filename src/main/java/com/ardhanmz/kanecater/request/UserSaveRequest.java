package com.ardhanmz.kanecater.request;

import com.ardhanmz.kanecater.model.MsUserEntity;
import com.ardhanmz.kanecater.util.http.RequestType;
import com.google.gson.annotations.SerializedName;

public class UserSaveRequest extends RequestType{
	@SerializedName("userdata")
	private MsUserEntity userData;

	public MsUserEntity getUserData() {
		return userData;
	}

	public void setUserData(MsUserEntity userData) {
		this.userData = userData;
	}
	
	
}
