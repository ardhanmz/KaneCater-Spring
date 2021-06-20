package com.ardhanmz.kanecater.repository;

import java.util.List;

import com.ardhanmz.kanecater.model.MsUserChildren;

public interface MsUserChildrenDAO {
	List<MsUserChildren> getAll();

	MsUserChildren getOneById(int uuidMsUserChildren);

	void save(MsUserChildren msUser);

	void update(MsUserChildren msUser);

	void delete(int uuidMsUserChildren);
}
