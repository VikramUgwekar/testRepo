package com.demo.dao;

import com.demo.Employee.EmpDetails;

public interface ConnDAO {

	public void insert(EmpDetails Emp);
	public EmpDetails findEmployee(String contactId);
	public String CheckEmpID(String employeeid);
}
