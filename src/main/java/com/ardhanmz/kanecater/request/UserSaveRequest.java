package com.ardhanmz.kanecater.request;

import com.ardhanmz.kanecater.model.MsUserEntity;
import com.ardhanmz.kanecater.util.http.RequestType;
import com.google.gson.annotations.SerializedName;
import org.apache.catalina.User;

import java.sql.Timestamp;

public class UserSaveRequest extends RequestType{
	@SerializedName("userData")
	private UserData userData;

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}
	
	
}

