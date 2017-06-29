package com.demo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.demo.Employee.EmpDetails;
import com.demo.Employee.EmpID;
public class EmpDAO implements ConnDAO {

	public DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(EmpDetails Emp) {
		// TODO Auto-generated method stub
		
	}

	public EmpDetails findEmployee(String empid) {
		System.out.println("Fetching details :"+empid);
     String sql = ("SELECT * FROM Databasetable WHERE ID =?");
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,empid);
			EmpDetails customer = new EmpDetails();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer.setEmpdesignation(rs.getString("Designation"));
				customer.setEmpid(rs.getString("ID"));
				customer.setEmpname(rs.getString("Name"));
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			System.out.println("connection error:"+e);
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	public String CheckEmpID(String employeeid) {
		 String sql = ("SELECT TOP 1 ID FROM Databasetable WHERE ID =?");
		 Connection conn = null;
			
			try {
				conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1,employeeid);
				ResultSet rs = ps.executeQuery();
				EmpID empID=new EmpID();
				if (rs.next()) {
					empID.setEmployeeid(rs.getString("ID"));
				}
				rs.close();
				ps.close();
		 
		return empID.getEmployeeid();
			} catch (SQLException e) {
				System.out.println("connection error:"+e);
				throw new RuntimeException(e);
			} finally {
				if (conn != null) {
					try {
					conn.close();
					} catch (SQLException e) {}
				}
			}
	}
	
		
	}
	

