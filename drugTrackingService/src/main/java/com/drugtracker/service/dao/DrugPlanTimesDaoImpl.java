package com.drugtracker.service.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.drugtracker.service.model.DrugPlanTimes;

import util.HibernateUtil;

public class DrugPlanTimesDaoImpl implements DrugPlanTimesDao {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public DrugPlanTimesDaoImpl() {

	}

	@Override
	public List<DrugPlanTimes> getDrugPlanTimes()

	{

		Session s = sessionFactory.openSession();

		List<DrugPlanTimes> drugplantimes = s.createCriteria(DrugPlanTimes.class).list();

		s.close();
		return drugplantimes;

	}

	@Override
	public DrugPlanTimes getDrugPlanTime(int drug_plan_id)

	{

		Session s = sessionFactory.openSession();

		Criteria cr = s.createCriteria(DrugPlanTimes.class);

		cr.add(Restrictions.eq("drug_plan_id", drug_plan_id));

		DrugPlanTimes drugplantime = (DrugPlanTimes) cr.list().get(0);

		s.close();
		return drugplantime;

	}
	
	@Override
	public void insertDrugPlanTime(DrugPlanTimes drugplantime){
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(drugplantime);
		s.getTransaction().commit();
		s.close();
		}
}
