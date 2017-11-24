/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.source.packages.method;

import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
@Configuration
public class testdbcontroller {
    @Autowired
    SessionFactory sessionfactory;
    @RequestMapping(value = "/databasedemo", method = RequestMethod.GET)
    public ModelAndView getdatabasedemo (HttpServletRequest request, HttpServletResponse response){
        ModelAndView newmodelview= new ModelAndView("index");
        Session session=sessionfactory.openSession();
        SQLQuery query=session.createSQLQuery("select cc_name from cost_center_hierarchy where cc_id='3'");
        String name=query.toString();
        System.out.println("database.source.packages.method.testdbcontroller.getdatabasedemo() " +name);
        return newmodelview;
    }
    
}
