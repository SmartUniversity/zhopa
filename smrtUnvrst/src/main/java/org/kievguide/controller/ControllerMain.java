/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kievguide.controller;



import com.mkyong.customer.dao.UserDAO;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Maksym
 */

@Controller
public class ControllerMain {
    
    @RequestMapping(value="/firstrequest", method=RequestMethod.GET)
    public ModelAndView signInAction( HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        
        modelAndView.addObject("user", "Привет");
        modelAndView.setViewName("index");
        return modelAndView;
        
    }
    
    @RequestMapping(value="/signin", method=RequestMethod.GET)
    public ModelAndView signIn( HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        
        ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
         
         UserDAO test = (UserDAO) context.getBean("userDAO");
        
        modelAndView.addObject("myvalue", test.findTotalCustomer());
        modelAndView.setViewName("sign-in");
        return modelAndView;
        
    }
    
    @RequestMapping(value="/reg", method=RequestMethod.POST)
    public ModelAndView reg( HttpServletResponse response, @RequestParam("n") Integer card_n, @RequestParam("p") String pass, @RequestParam("f") MultipartFile file){
        ModelAndView modelAndView = new ModelAndView();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        UserDAO test = (UserDAO) context.getBean("userDAO");
        
        test.insert("new", "new", 1, "photo", card_n, pass);
        
        modelAndView.setViewName("index");
        return modelAndView;
        
    }
    
    @RequestMapping(value="/s-up")
    public ModelAndView s_up( HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
     
        modelAndView.setViewName("sign-up");
        return modelAndView;
        
    }




    private Object ServletContext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

            
}
