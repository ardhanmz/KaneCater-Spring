package com.ardhanmz.kanecater.util.http;

import com.google.gson.annotations.SerializedName;

public class RequestType {
    @SerializedName("generic")
    private GeneralType generalType;

    public GeneralType getGeneralType() {
        return generalType;
    }

    public void setGeneralType(GeneralType generalType) {
        this.generalType = generalType;
    }
}
