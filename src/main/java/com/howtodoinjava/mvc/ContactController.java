package com.howtodoinjava.mvc;
import org.springframework.stereotype.Controller;  
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.SessionAttributes;  
import org.springframework.web.servlet.ModelAndView;  
import com.howtodoinjava.model.Contact;  
@Controller  
@SessionAttributes  
public class ContactController {  
    @RequestMapping(value = "/addContact", method = RequestMethod.POST)  
    public ModelAndView addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {  
        //write the code here to add contact  
        //return "redirect:confirmaddcontact.html";  
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("confirmaddcontact");
        modelAndView.addObject("model",contact );
        
        return modelAndView;  
        
    }  
      
    @RequestMapping("/contact")  
    public ModelAndView showContacts() {  
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("contact");
        modelAndView.addObject("command",new Contact() );
        return modelAndView;  
    }  
}  