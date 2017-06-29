package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.Employee.EmpDetails;
import com.demo.Employee.EmpID;
import com.demo.Employee.JsonResponse;
import com.demo.dao.ConnDAO;
import com.demo.dao.EmpDAO;




@Controller
public class HomeController  {

	@Autowired
    @Qualifier("employeeValidator")
    private Validator validator;
 
	@Autowired
	@Qualifier("CommDAO")
	private EmpDAO contact;
    
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "NewFile";
	}
	
	@RequestMapping(value="/users",method = RequestMethod.POST)
	public  @ResponseBody JsonResponse editContact(@ModelAttribute(value="employee")EmpID employee, BindingResult bindingResult) {
		
		System.out.println("In controller "+employee.getEmployeeid());
		validator.validate(employee, bindingResult);
		JsonResponse res=new JsonResponse();
		if(bindingResult.hasErrors())
		{
			System.out.println("In errors");
			 res.setStatus("FAIL");
			 res.setResult(bindingResult.getAllErrors());
			 return res;
		}
		
		System.out.println("outside errors");
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring_Module.xml");
		//ConnDAO contact=(ConnDAO) context.getBean("CommDAO");
		contact = new EmpDAO();
		System.out.println("callin impl with :"+employee.getEmployeeid());
		EmpDetails emp= contact.findEmployee(employee.getEmployeeid());
		res.setStatus("SUCCESS");
		res.setResult(emp);
		return res;
	}
}

