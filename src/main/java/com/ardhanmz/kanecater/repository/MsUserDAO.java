package com.ardhanmz.kanecater.repository;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUser;

public interface MsUserDAO {
	List<MsUser> getAll();
	
	MsUser getOneById(int uuidMsUser);
	
	void save(MsUser msUser);
	
	void update(MsUser msUser);
	
	void delete (int uuidMsUser);
}
