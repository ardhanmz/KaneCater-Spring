package com.ardhanmz.kanecater.request;

public class UserData {
    private int uuidMsUser;
    private Long dtmCrt;
    private String usrCrt;
    private String userName;
    private Long dtmUpd;
    private String usrUpd;
    private String email;
    private String fullName;
    private String password;
    private String role;
    private String image;

    public int getUuidMsUser() {
        return uuidMsUser;
    }

    public void setUuidMsUser(int uuidMsUser) {
        this.uuidMsUser = uuidMsUser;
    }

    public Long getDtmCrt() {
        return dtmCrt;
    }

    public void setDtmCrt(Long dtmCrt) {
        this.dtmCrt = dtmCrt;
    }

    public String getUsrCrt() {
        return usrCrt;
    }

    public void setUsrCrt(String usrCrt) {
        this.usrCrt = usrCrt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getDtmUpd() {
        return dtmUpd;
    }

    public void setDtmUpd(Long dtmUpd) {
        this.dtmUpd = dtmUpd;
    }

    public String getUsrUpd() {
        return usrUpd;
    }

    public void setUsrUpd(String usrUpd) {
        this.usrUpd = usrUpd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
