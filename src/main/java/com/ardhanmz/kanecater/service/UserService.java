package com.ardhanmz.kanecater.service;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUserEntity;

public interface UserService {
	List<MsUserEntity> getAll();
	
	MsUserEntity getOneById(int uuidMsUser);
	
	void save(MsUserEntity msUser);
	
	void update(MsUserEntity msUser);
	
	int delete (int uuidMsUser);
}
