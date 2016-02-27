package com.spring.example.controller;
import java.util.ArrayList;  
import java.util.List;  
  
import com.spring.example.bean.User;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;  
  
@RestController  
public class UserController {
	@RequestMapping(value = "/users", method = RequestMethod.GET,headers="Accept=application/json")  
	 public List<User> getUsers()  
	 {  
	  List<User> listOfUsers = new ArrayList<User>();  
	  listOfUsers=createUserList();  
	  return listOfUsers;  
	 }  
	  
	 @RequestMapping(value = "/user/{id}", method = RequestMethod.GET,headers="Accept=application/json")  
	 public User getUserById(@PathVariable int id)  
	 {  
	  List<User> listOfUsers = new ArrayList<User>();  
	  listOfUsers=createUserList();  
	  
	  for (User user: listOfUsers) {  
	   if(user.getId()==id)  
	    return user;  
	  }  
	    
	  return null;  
	 }  
	  
	// Utiliy method to create country list.  
	 public List<User> createUserList()  
	 {  
	  User firstUser=new User(1, "Smith");  
	  User secondUser=new User(4, "Johnson");  
	  User thirdUser=new User(3, "Williams");  
	  User fourthUser=new User(2, "Brown");  
	  
	  List<User> listOfUsers = new ArrayList<User>();  
	  listOfUsers.add(firstUser);  
	  listOfUsers.add(secondUser);  
	  listOfUsers.add(thirdUser);  
	  listOfUsers.add(fourthUser);  
	  return listOfUsers;  
	 }  
}
