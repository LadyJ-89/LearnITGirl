package com.drugtracker.service.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.drugtracker.service.model.DrugTrack;

import util.HibernateUtil;

public class DrugTrackDaoImpl implements DrugTrackDao {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public DrugTrackDaoImpl() {

	}

	@Override
	public List<DrugTrack> getDrugTracks()

	{

		Session s = sessionFactory.openSession();

		List<DrugTrack> drugtracks = s.createCriteria(DrugTrack.class).list();

		s.close();
		return drugtracks;

	}

	@Override
	public DrugTrack getDrugTrack(int drug_plan_id)

	{

		Session s = sessionFactory.openSession();

		Criteria cr = s.createCriteria(DrugTrack.class);

		cr.add(Restrictions.eq("drug_plan_id", drug_plan_id));

		DrugTrack drugtrack = (DrugTrack) cr.list().get(0);

		s.close();
		return drugtrack;

	}
	
	@Override
	public void insertDrugTrack(DrugTrack drugtrack){
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(drugtrack);
		s.getTransaction().commit();
		s.close();
		}
}
