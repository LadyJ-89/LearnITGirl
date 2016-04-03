package com.drugtracker.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.drugtracker.service.dao.DrugDao;
import com.drugtracker.service.dao.DrugDaoImpl;
import com.drugtracker.service.dao.DrugPlanDao;
import com.drugtracker.service.dao.DrugPlanDaoImpl;
import com.drugtracker.service.dao.DrugPlanTimesDao;
import com.drugtracker.service.dao.DrugPlanTimesDaoImpl;
import com.drugtracker.service.dao.DrugTrackDao;
import com.drugtracker.service.dao.DrugTrackDaoImpl;
import com.drugtracker.service.dao.UserDao;
import com.drugtracker.service.dao.UserDaoImpl;
import com.drugtracker.service.dao.VitalSignDao;
import com.drugtracker.service.dao.VitalSignDaoImpl;
import com.drugtracker.service.model.Drug;
import com.drugtracker.service.model.DrugPlan;
import com.drugtracker.service.model.DrugPlanTimes;
import com.drugtracker.service.model.DrugTrack;
import com.drugtracker.service.model.User;
import com.drugtracker.service.model.VitalSign;

@RestController
@RequestMapping("/service")
public class RestServiceController {
	private UserDao userdao = new UserDaoImpl();
	private DrugDao drugdao = new DrugDaoImpl();
	private DrugPlanDao drugplandao = new DrugPlanDaoImpl();
	private DrugPlanTimesDao drugplantimesdao = new DrugPlanTimesDaoImpl();
	private DrugTrackDao drugtrackdao = new DrugTrackDaoImpl();
	private VitalSignDao vitalsigndao = new VitalSignDaoImpl();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> users() {
		return userdao.getUsers();
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User user(HttpServletRequest request) {
		if (request.getParameter("id") != null) {
			return userdao.getUser(request.getParameter("id"));
		}
		return null;
	}
	
	@RequestMapping(value = "/drugs", method = RequestMethod.GET)
	public List<Drug> drugs() {
		return drugdao.getDrugs();
	}

	@RequestMapping(value = "/drug", method = RequestMethod.GET)
	public Drug drug(HttpServletRequest request) {
		if (request.getParameter("id") != null) {
			return drugdao.getDrug(Integer.parseInt(request.getParameter("id")));
		}
		return null;
	}
	
	@RequestMapping(value = "/drugplans", method = RequestMethod.GET)
	public List<DrugPlan> drugplans() {
		return drugplandao.getDrugPlans();
	}

	@RequestMapping(value = "/drugplan", method = RequestMethod.GET)
	public DrugPlan drugPlan(HttpServletRequest request) {
		if (request.getParameter("id") != null) {
			return drugplandao.getDrugPlan(Integer.parseInt(request.getParameter("id")));
		}
		return null;
	}
	
	@RequestMapping(value = "/drugplantimes", method = RequestMethod.GET)
	public List<DrugPlanTimes> drugplantimes() {
		return drugplantimesdao.getDrugPlanTimes();
	}

	@RequestMapping(value = "/drugplantime", method = RequestMethod.GET)
	public DrugPlanTimes drugPlanTimes(HttpServletRequest request) {
		if (request.getParameter("id") != null) {
			return drugplantimesdao.getDrugPlanTime(Integer.parseInt(request.getParameter("id")));
		}
		return null;
	}
	
	@RequestMapping(value = "/drugtracks", method = RequestMethod.GET)
	public List<DrugTrack> drugtrakcs() {
		return drugtrackdao.getDrugTracks();
	}

	@RequestMapping(value = "/drugtrack", method = RequestMethod.GET)
	public DrugTrack drugtrack(HttpServletRequest request) {
		if (request.getParameter("id") != null) {
			return drugtrackdao.getDrugTrack(Integer.parseInt(request.getParameter("id")));
		}
		return null;
	}
	
	@RequestMapping(value = "/vitalsigns", method = RequestMethod.GET)
	public List<VitalSign> vitalsigns() {
		return vitalsigndao.getVitalSigns();
	}

	@RequestMapping(value = "/vitalsign", method = RequestMethod.GET)
	public VitalSign vitalsign(HttpServletRequest request) {
		if (request.getParameter("id") != null) {
			return vitalsigndao.getVitalSign(Integer.parseInt(request.getParameter("id")));
		}
		return null;
	}
}
