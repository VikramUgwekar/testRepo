package com.demo.validation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.demo.Employee.EmpID;
import com.demo.dao.ConnDAO;

public class EmployeeValidator implements Validator {

	public boolean supports(Class<?> Employeeid) {

		return EmpID.class.isAssignableFrom(Employeeid);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "employeeid", "error.employeeid","Employee Id cannot be null");
		EmpID emp=(EmpID) target;
		String out=emp.getEmployeeid();
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring_Module.xml");
		ConnDAO contact=(ConnDAO) context.getBean("CommDAO");

		String empid=contact.CheckEmpID(out);

		int length=out.length();
		if(length< 6 || length>6)
		{
			errors.rejectValue("employeeid", "invalidid", new Object[]{"'Employee Id'"}, "Please enter valid EmployeeId");

		}
		else if(length<0){
			errors.rejectValue("employeeid", "negativevalue", new Object[]{"'Employee Id'"}, "EmployeeId can't be negative");

		}
		else if(empid==null){
			errors.rejectValue("employeeid", "doesnotexist", new Object[]{"'Employee Id'"}, "EmployeeId does not exist");
		}

	}

}
