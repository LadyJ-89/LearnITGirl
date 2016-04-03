package com.drugtracker.service.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.drugtracker.service.model.User;

import util.HibernateUtil;

public class UserDaoImpl implements UserDao{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public UserDaoImpl() {

	}

	@Override
	public List<User> getUsers()

	{

		Session s = sessionFactory.openSession();

		List<User> users = s.createCriteria(User.class).list();

		s.close();
		return users;

	}

	@Override
	public User getUser(String user_id)

	{

		Session s = sessionFactory.openSession();

		Criteria cr = s.createCriteria(User.class);

		cr.add(Restrictions.eq("user_id", user_id));

		User user = (User) cr.list().get(0);

		s.close();
		return user;

	}
	
	@Override
	public void insertUser(User user){
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
		s.close();
		}
}
