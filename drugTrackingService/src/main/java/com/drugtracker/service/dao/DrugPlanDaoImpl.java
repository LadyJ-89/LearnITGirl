package com.drugtracker.service.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.drugtracker.service.model.DrugPlan;
import util.HibernateUtil;

public class DrugPlanDaoImpl implements DrugPlanDao {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public DrugPlanDaoImpl() {

	}

	@Override
	public List<DrugPlan> getDrugPlans()

	{

		Session s = sessionFactory.openSession();

		List<DrugPlan> drugplans = s.createCriteria(DrugPlan.class).list();

		s.close();
		return drugplans;

	}

	@Override
	public DrugPlan getDrugPlan(int drug_plan_id)

	{

		Session s = sessionFactory.openSession();

		Criteria cr = s.createCriteria(DrugPlan.class);

		cr.add(Restrictions.eq("drug_plan_id", drug_plan_id));

		DrugPlan drugplan = (DrugPlan) cr.list().get(0);

		s.close();
		return drugplan;

	}

	@Override
	public void insertDrugPlan(DrugPlan drugplan) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(drugplan);
		s.getTransaction().commit();
		s.close();
	}
}
