package com.ardhanmz.kanecater.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ms_user", schema = "kanecater", catalog = "")
public class MsUserEntity {
    private int uuidMsUser;
    private Timestamp dtmCrt;
    private String usrCrt;
    private String userName;
    private Timestamp dtmUpd;
    private String usrUpd;
    private String email;
    private String fullName;
    private String password;
    private String role;
    private String image;

    @Id
    @Column(name = "UUID_MS_USER")
    public int getUuidMsUser() {
        return uuidMsUser;
    }

    public void setUuidMsUser(int uuidMsUser) {
        this.uuidMsUser = uuidMsUser;
    }

    @Basic
    @Column(name = "DTM_CRT")
    public Timestamp getDtmCrt() {
        return dtmCrt;
    }

    public void setDtmCrt(Timestamp dtmCrt) {
        this.dtmCrt = dtmCrt;
    }

    @Basic
    @Column(name = "USR_CRT")
    public String getUsrCrt() {
        return usrCrt;
    }

    public void setUsrCrt(String usrCrt) {
        this.usrCrt = usrCrt;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "DTM_UPD")
    public Timestamp getDtmUpd() {
        return dtmUpd;
    }

    public void setDtmUpd(Timestamp dtmUpd) {
        this.dtmUpd = dtmUpd;
    }

    @Basic
    @Column(name = "USR_UPD")
    public String getUsrUpd() {
        return usrUpd;
    }

    public void setUsrUpd(String usrUpd) {
        this.usrUpd = usrUpd;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "FULL_NAME")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ROLE")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "IMAGE")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MsUserEntity that = (MsUserEntity) o;
        return uuidMsUser == that.uuidMsUser && Objects.equals(dtmCrt, that.dtmCrt) && Objects.equals(usrCrt, that.usrCrt) && Objects.equals(userName, that.userName) && Objects.equals(dtmUpd, that.dtmUpd) && Objects.equals(usrUpd, that.usrUpd) && Objects.equals(email, that.email) && Objects.equals(fullName, that.fullName) && Objects.equals(password, that.password) && Objects.equals(role, that.role) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidMsUser, dtmCrt, usrCrt, userName, dtmUpd, usrUpd, email, fullName, password, role, image);
    }
}
