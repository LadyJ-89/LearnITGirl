package com.springmvc.example.users;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.example.users.dao.UserDao;
import com.springmvc.example.users.model.User;

@RestController
@RequestMapping("/service")
public class RestServiceController {
	private UserDao userdao = new UserDao();

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> users() {
		return userdao.getUsers();
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User user(HttpServletRequest request) {
		if (request.getParameter("id") != null) {
			return userdao.getUser(Integer.parseInt(request.getParameter("id")));
		}
		return null;
	}
}
