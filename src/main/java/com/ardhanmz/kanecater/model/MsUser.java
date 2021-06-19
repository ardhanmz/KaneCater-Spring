package com.ardhanmz.kanecater.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ms_user")
public class MsUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int UuidMsUser;
	
	@Column
	private Date dtmCrt;
	
	@Column
	private String usrCrt;
	
	@Column
	private Date dtmUpd;
	
	@Column
	private String usrUpd;
	
	@Column
	private String userName;
	
	@Column
	private String email;
	
	@Column
	private String fullName;
	
	@Column
	private String password;
	
	@Column
	private String role;
	
	@Column
	private Byte[] image;

	public int getUuidMsUser() {
		return UuidMsUser;
	}

	public void setUuidMsUser(int uuidMsUser) {
		UuidMsUser = uuidMsUser;
	}

	public Date getDtmCrt() {
		return dtmCrt;
	}

	public void setDtmCrt(Date dtmCrt) {
		this.dtmCrt = dtmCrt;
	}

	public String getUsrCrt() {
		return usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

	public Date getDtmUpd() {
		return dtmUpd;
	}

	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	public String getUsrUpd() {
		return usrUpd;
	}

	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "MsUser [UuidMsUser=" + UuidMsUser + ", dtmCrt=" + dtmCrt + ", usrCrt=" + usrCrt + ", dtmUpd=" + dtmUpd
				+ ", usrUpd=" + usrUpd + ", userName=" + userName + ", email=" + email + ", fullName=" + fullName
				+ ", password=" + password + ", role=" + role + ", image=" + Arrays.toString(image) + "]";
	}
	
	
}
