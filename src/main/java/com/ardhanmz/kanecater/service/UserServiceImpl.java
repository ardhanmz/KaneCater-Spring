package com.ardhanmz.kanecater.service;

import java.util.List;
import javax.persistence.EntityManager;

import com.ardhanmz.kanecater.model.MsUserEntity;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private EntityManager entityManager;

	public Session getSession() {
		Session session = entityManager.unwrap(Session.class);
		return session;
	}

	@Transactional
	@Override
	public List<MsUserEntity> getAll() {
		Query<MsUserEntity> query = getSession().createQuery("from MsUserEntity", MsUserEntity.class);
		return query.getResultList();
	}

	@Transactional
	@Override
	public MsUserEntity getOneById(int uuidMsUser) {
		String hibernateQuery = "FROM MsUserEntity WHERE uuidMsUser = :uuidMsUser";
		Query query = getSession().createQuery(hibernateQuery);
		query.setParameter("uuidMsUser", uuidMsUser);
		if (query.list().isEmpty()){
			return null;
		} else {
			return (MsUserEntity) query.list().get(0);
		}
	}

	@Transactional
	@Override
	public void save(MsUserEntity msUser) {
		getSession().save(msUser);
	}

	@Transactional
	@Override
	public void update(MsUserEntity msUser) {
		getSession().update(msUser);
	}

	@Transactional
	@Override
	public int delete(int uuidMsUser) {
		int result = 99;
		String hibernateQuery = "DELETE FROM MsUserEntity WHERE uuidMsUser = :uuidMsUser";
		Query query = getSession().createQuery(hibernateQuery);
		query.setParameter("uuidMsUser", uuidMsUser);
		try {
			result = query.executeUpdate();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return result;
	}

}