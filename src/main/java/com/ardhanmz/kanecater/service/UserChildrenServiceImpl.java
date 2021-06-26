package com.ardhanmz.kanecater.service;

import com.ardhanmz.kanecater.model.MsUserChildrenEntity;
import com.ardhanmz.kanecater.model.MsUserEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class UserChildrenServiceImpl implements UserChildrenService{
    @Autowired
    private EntityManager entityManager;

    public Session getSession() {
        Session session = entityManager.unwrap(Session.class);
        return session;
    }

    @Override
    public List<MsUserChildrenEntity> getAllChildrendByUserId(int uuidMsuser) {
        String hibernateQuery = "FROM MsUserChildrenEntity WHERE msUserByUuidMsUser = :uuidMsUser";
        Query query = getSession().createQuery(hibernateQuery);
        query.setParameter("uuidMsUser", uuidMsuser);
        if (query.list().isEmpty()){
            return (List<MsUserChildrenEntity>) query.list().get(0);
        } else {
            return null;
        }
    }

    @Override
    public MsUserChildrenEntity getChildrenByUserId(int uuidMsUser) {
        String hibernateQuery = "FROM MsUserChildrenEntity WHERE msUserByUuidMsUser = :uuidMsUser";
        Query query = getSession().createQuery(hibernateQuery);
        query.setParameter("uuidMsUser", uuidMsUser);
        if (query.list().isEmpty()){
            return null;
        } else {
            return (MsUserChildrenEntity) query.list().get(0);
        }
    }

    @Override
    public String saveChildren(MsUserChildrenEntity msUserChildrenEntity) {
        return null;
    }

    @Override
    public String updateChildren(MsUserChildrenEntity msUserChildrenEntity) {
        return null;
    }

    @Override
    public int deleteChildrenByUserId(int uuidMsUser) {
        return 0;
    }

    @Override
    public int deleteChildren(MsUserChildrenEntity msUserChildrenEntity) {
        return 0;
    }
}
