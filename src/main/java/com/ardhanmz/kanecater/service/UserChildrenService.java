package com.ardhanmz.kanecater.service;

import com.ardhanmz.kanecater.model.MsUserChildrenEntity;

import java.util.List;

public interface UserChildrenService {
    List<MsUserChildrenEntity> getAllChildrendByUserId(int uuidMsuser);

    MsUserChildrenEntity getChildrenByUserId(int uuidMsUser);

    String saveChildren(MsUserChildrenEntity msUserChildrenEntity);

    String updateChildren (MsUserChildrenEntity msUserChildrenEntity);

    int deleteChildrenByUserId(int uuidMsUser);

    int deleteChildren(MsUserChildrenEntity msUserChildrenEntity);
}
