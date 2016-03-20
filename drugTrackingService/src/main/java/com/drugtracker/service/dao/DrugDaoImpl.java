package com.drugtracker.service.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.drugtracker.service.model.Drug;

import util.HibernateUtil;

public class DrugDaoImpl implements DrugDao{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public DrugDaoImpl() {

	}

	@Override
	public List<Drug> getDrugs()

	{

		Session s = sessionFactory.openSession();

		List<Drug> drugs = s.createCriteria(Drug.class).list();

		s.close();
		return drugs;

	}

	@Override
	public Drug getDrug(int drug_id)

	{

		Session s = sessionFactory.openSession();

		Criteria cr = s.createCriteria(Drug.class);

		cr.add(Restrictions.eq("drug_id", drug_id));

		Drug drug = (Drug) cr.list().get(0);

		s.close();
		return drug;

	}
	
	@Override
	public void insertDrug(Drug drug){
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(drug);
		s.getTransaction().commit();
		s.close();
		}
}
