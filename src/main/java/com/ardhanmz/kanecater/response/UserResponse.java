package com.ardhanmz.kanecater.response;

import com.ardhanmz.kanecater.model.MsUserEntity;
import com.ardhanmz.kanecater.util.http.ResponseType;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserResponse extends ResponseType {
    @SerializedName("user")
    private MsUserEntity userEntity;

    public MsUserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(MsUserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
