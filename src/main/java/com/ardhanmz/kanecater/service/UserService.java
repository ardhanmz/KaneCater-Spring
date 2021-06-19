package com.ardhanmz.kanecater.service;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUser;

public interface UserService {
	List<MsUser> getAll();
	
	MsUser getOneById(int uuidMsUser);
	
	void save(MsUser msUser);
	
	void update(MsUser msUser);
	
	int delete (int uuidMsUser);
}
