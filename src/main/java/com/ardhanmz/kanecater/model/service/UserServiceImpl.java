package com.ardhanmz.kanecater.model.service;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ardhanmz.kanecater.model.MsUser;

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
	public List<MsUser> getAll() {
		Query<MsUser> query = getSession().createQuery("from MsUser", MsUser.class);
		return query.getResultList();
	}

	@Transactional
	@Override
	public MsUser getOneById(int uuidMsUser) {
		String hibernateQuery = "FROM MsUser MU WHERE MU.UUID_MS_USER = :uuidMsUser";
		Query<MsUser> query = getSession().createQuery(hibernateQuery, MsUser.class);
		query.setParameter(uuidMsUser, uuidMsUser);
		return query.getSingleResult();
	}

	@Transactional
	@Override
	public void save(MsUser msUser) {
		getSession().save(msUser);
	}

	@Transactional
	@Override
	public void update(MsUser msUser) {
		getSession().update(msUser);

	}

	@Transactional
	@Override
	public int delete(int uuidMsUser) {
		int result = 99;
		String hibernateQuery = "DELETE FROM MsUser MU WHERE MU.uuidMsUser = :uuidMsUser";
		Query<MsUser> query = getSession().createQuery(hibernateQuery, MsUser.class);
		query.setParameter(uuidMsUser, uuidMsUser);
		try {
			result = query.executeUpdate();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return result;
	}

}
