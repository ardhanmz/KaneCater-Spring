package com.ardhanmz.kanecater.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ms_user_children")
public class MsUserChildren {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int UuidMsUserChildren;
	
	
	@Column
	private int UuidMsUser;
	
	@Column
	private String childrenName;
	
	@Column
	private String birthDate;
	
	@Column
	private String sex;
	
	@Column
	private String weight;
	
	@Column
	private String height;
	
	@Column
	private String school;
	
	@Column
	private String classSchool;
	
	@Column
	private Byte[] image;
}
