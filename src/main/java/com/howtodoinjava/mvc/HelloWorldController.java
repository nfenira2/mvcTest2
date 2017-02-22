package com.howtodoinjava.mvc;
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.model.MyBean;  
  
@Controller  
public class HelloWorldController {
      
    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
        MyBean model=new MyBean();
        if(password!=null && password.equals("admin")){  
        String message = "HELLO "+name;        
        model.setMessage(message);
        
        return new ModelAndView("hello", "model", model);  
        }  
        else{  
        	model.setMessage("Sorry, username or password error");
            return new ModelAndView("errorpage", "model",model);  
        }  
    }  
      
}  