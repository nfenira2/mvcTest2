package com.howtodoinjava.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.model.MyBean;  
  
@Controller  
public class WelcomeWorldController {  
  
    @RequestMapping("/welcome")  
    public ModelAndView helloWorld() {  
  
        String message = "WELCOME SPRING MVC";  
        MyBean model=new MyBean();
        model.setMessage(message);
        
        return new ModelAndView("welcomepage", "model", model);  
    }  
      
}  
