package com.drugtracker.service.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.drugtracker.service.model.VitalSign;
import util.HibernateUtil;

public class VitalSignDaoImpl implements VitalSignDao {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public VitalSignDaoImpl() {

	}

	@Override
	public List<VitalSign> getVitalSigns()

	{

		Session s = sessionFactory.openSession();

		List<VitalSign> vitalsigns = s.createCriteria(VitalSign.class).list();

		s.close();
		return vitalsigns;

	}

	@Override
	public VitalSign getVitalSign(int sign_id)

	{

		Session s = sessionFactory.openSession();

		Criteria cr = s.createCriteria(VitalSign.class);

		cr.add(Restrictions.eq("sign_id", sign_id));

		VitalSign vitalsign = (VitalSign) cr.list().get(0);

		s.close();
		return vitalsign;

	}
	
	@Override
	public void insertVitalSign(VitalSign vitalsign){
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(vitalsign);
		s.getTransaction().commit();
		s.close();
		}
}
