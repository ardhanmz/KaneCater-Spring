package com.ardhanmz.kanecater.repository;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUserEntity;

public interface MsUserDAO {
	List<MsUserEntity> getAll();
	
	MsUserEntity getOneById(int uuidMsUser);
	
	void save(MsUserEntity msUser);
	
	void update(MsUserEntity msUser);
	
	void delete (int uuidMsUser);
}
