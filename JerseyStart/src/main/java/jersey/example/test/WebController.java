package jersey.example.test;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;  

@Path("/webservice")  
public class WebController {
	private static Map<String, User> users = new HashMap<String, User>();  
    
    static {  
          
        User user1 = new User();  
        user1.setUserId("1");  
        user1.setUserName("Smith");  
        users.put(user1.getUserId(), user1);  
          
        User user2 = new User();  
        user2.setUserId("2");  
        user2.setUserName("Wilson");  
        users.put(user2.getUserId(), user2);  
          
    }  
 
    @GET  
    @Path("/hello")  
    @Produces("text/plain")  
    public String hello(){  
        return "Hello World!!!";      
    }  
      
    @GET  
    @Path("/message/{message}")  
    @Produces("text/plain")  
    public String showMsg(@PathParam("message") String message){  
        return message;      
    }  
      
    @GET  
    @Path("/users")  
    @Produces("application/xml")  
    public List<User> listUsers(){  
        return new ArrayList<User>(users.values());  
    }  
      
    @GET  
    @Path("/user/{userId}")  
    @Produces("application/xml")  
    public User getEmployee(@PathParam("userId")String userId){  
        return users.get(userId);          
    }  
      
    @GET  
    @Path("/json/users/")  
    @Produces("application/json")  
    public List<User> listUsersJSON(){  
        return new ArrayList<User>(users.values());  
    }  
 
    @GET  
    @Path("/json/user/{userId}")  
    @Produces("application/json")  
    public User getEmployeeJSON(@PathParam("userId")String userId){  
        return users.get(userId);          
    }  
}
