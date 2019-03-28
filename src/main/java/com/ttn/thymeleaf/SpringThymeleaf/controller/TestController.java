package com.ttn.thymeleaf.SpringThymeleaf.controller;

import com.ttn.thymeleaf.SpringThymeleaf.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {

    /*Question 1*/
    @RequestMapping(value = "/js", method = RequestMethod.GET)
    public String showAlert() {
        return "showalert";
    }

    /*Question 2*/
    @RequestMapping(value = "/css", method = RequestMethod.GET)
    public String showCss() {
        return "showcss";
    }

    /*Question 3*/
    @RequestMapping(value = "/showEmployee",method = RequestMethod.POST)
    public String showRegisteredData(HttpServletRequest request, Model model){
        String name=request.getParameter("name");
        int age=Integer.parseInt(request.getParameter("age"));
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "showRegisteredEmployee";
    }

    @RequestMapping(value = "/showEmployee",method = RequestMethod.GET)
    public String sayHElloForm(){
        return "employeeregistration";
    }

//    /*Question 4*/
//    @RequestMapping(value = "/employee",method = RequestMethod.GET)
//    public String showEmployee(Model model){
//        List<Employee> employeeList= Arrays.asList(new Employee("Shivam","Saxena",21),
//                                                   new Employee("Vineet","Chaudary",23));
//        model.addAttribute("employee",employeeList);
//        return "showEmployee";
//    }

    /*Question 5*/
    @RequestMapping(value = "/checkAdmin" ,method = RequestMethod.POST)
    public String isAdmin(HttpServletRequest request,Model model){
        String value=request.getParameter("admin");
        model.addAttribute("isAdmin",value);
        return "checkadmin";
    }
    @RequestMapping(value = "/checkAdmin",method = RequestMethod.GET)
    public String passAdminValue(){
        return "formToCheckAdmin";
    }

    /*Question 6*/
    @RequestMapping(value = "/headerandfooter" ,method = RequestMethod.GET)
    public String headerAndFooter(){
        return "footer";
    }

    /*Question 7*/
    @RequestMapping(value = "/showtime")
    public String showTime(){
        return "ajaxtime";
    }

    @RequestMapping(value = "/getTime" ,method = RequestMethod.GET  )
    @ResponseBody
    public String getTime(){
        return new Date().toLocaleString();
    }

    /*Question 8*/
    @RequestMapping(value = "/condition" ,method = RequestMethod.GET)
    public String conditionalTag(){
        return "conditionalTag";
    }

    /*Question 9*/
    @RequestMapping(value = "/showEnums",method = RequestMethod.GET)
    public String showEnums(){
        return "getEnum";
    }

    /*Question 10*/
    @RequestMapping(value = "/showLoader")
    public String showLoader(){
        return "registration";
    }

    @PostMapping("/registrationSubmit")
    @ResponseBody
    public String registerEmployee(@ModelAttribute Employee employee)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Registered: "+employee.getName()+"\n";
    }
//
//    @RequestMapping(value = "/ajaxCall" ,method = RequestMethod.GET  )
//    public String getLoader(){
//        return "ajaxcall";
//    }
}
