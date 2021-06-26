package com.ardhanmz.kanecater.repository;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUserChildrenEntity;

public interface MsUserChildrenDAO {
	List<MsUserChildrenEntity> getAll();

	MsUserChildrenEntity getOneById(int uuidMsUserChildren);

	void save(MsUserChildrenEntity msUser);

	void update(MsUserChildrenEntity msUser);

	void delete(int uuidMsUserChildren);
}
