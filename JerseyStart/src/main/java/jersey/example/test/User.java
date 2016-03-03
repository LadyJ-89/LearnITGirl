package jersey.example.test;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  

@XmlRootElement(name = "user")  
public class User {
	private String userId;  
    private String userName;  

      
    @XmlElement  
    public String getUserId() {  
        return userId;  
    }  
      
    public void setUserId(String userId) {  
        this.userId = userId;  
    }  
      
    @XmlElement  
    public String getUserName() {  
        return userName;  
    }  
      
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
}  