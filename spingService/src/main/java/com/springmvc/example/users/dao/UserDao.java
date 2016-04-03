package com.springmvc.example.users.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.springmvc.example.users.model.User;

import util.HibernateUtil;

public class UserDao {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public UserDao() {

	}

	public List<User> getUsers()

	{

		Session s = sessionFactory.openSession();

		List<User> users = s.createCriteria(User.class).list();

		s.close();
		return users;

	}

	public User getUser(int user_id)

	{

		Session s = sessionFactory.openSession();

		Criteria cr = s.createCriteria(User.class);

		cr.add(Restrictions.eq("user_id", user_id));

		User user = (User) cr.list().get(0);

		s.close();
		return user;

	}
}
