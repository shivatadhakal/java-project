package com.test.service;


import com.test.db.DB;
import com.test.model.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
public class EmployeeServiceImp implements EmployeeService{
	
	Connection con=null;
	
	public  EmployeeServiceImp()
	{
		
	 	con = DB.getDb();
	 	 
	}
	
	
	@Override
	public boolean addEmp(Employee emp) {
		String sql = "insert into employee(fname,lname,gender,dob,joiningDate,phone,email,company,post,country,city,state,salary)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";	
		
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, emp.getFname());
			pstm.setString(2, emp.getLname());
			pstm.setString(3, emp.getGender());
			pstm.setDate(4, emp.getDob());
			pstm.setDate(5, emp.getJoiningDate());
			pstm.setString(6, emp.getPhone());
			pstm.setString(7, emp.getEmail());
			pstm.setString(8, emp.getCompany());
			pstm.setString(9, emp.getPost());
			pstm.setString(10, emp.getCountry());
			pstm.setString(11, emp.getCity());
			pstm.setString(12, emp.getState());
			pstm.setInt(13, emp.getSalary());
			
			pstm.execute();
			return true;
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override// delete from the database
	public boolean deleteEmp(int id) {
		
		String sql="delete from employee where id = "+id;
		
		try {
			Statement s=con.createStatement();
			
			s.execute(sql);
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
	
	
	
}


	

	@Override
	public boolean updateEmp(Employee emp) {
		
		String sql = "insert into employee set fname=?,lname=?,gender=?,dob=?,joiningDate=?,phone=?,email=?,company=?,post=?,country=?,city=?,state=?,salary=? where id=?";	

		
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1,emp.getFname());
			pstm.setString(2, emp.getLname());
			pstm.setString(3, emp.getGender());
			pstm.setDate(4, emp.getDob());
			pstm.setDate(5, emp.getJoiningDate());
			pstm.setString(6, emp.getPhone());
			pstm.setString(7, emp.getEmail());
			pstm.setString(8, emp.getCompany());
			pstm.setString(9, emp.getPost());
			pstm.setString(10, emp.getCountry());
			pstm.setString(11, emp.getCity());
			pstm.setString(12, emp.getState());
			pstm.setInt(13, emp.getSalary());
			pstm.setInt(14,emp.getID());
			pstm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	
		
		
		
		
		
	}


	@Override
	public Employee getById(int id) {
		
		Employee emp=new Employee();
		String sql="select *from employee where id ="+id;
		
		try {
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery(sql);
			
			while(r.next())
			{
				
				emp.setID(r.getInt("id"));
				emp.setFname(r.getString("fname"));
				emp.setLname(r.getString("lname"));
				emp.setCity(r.getString("city"));
				emp.setCompany(r.getString("company"));
				emp.setState(r.getString("state"));
				emp.setEmail(r.getString("email"));
				emp.setGender(r.getString("gender"));
				emp.setDob(r.getDate("dob"));
				emp.setJoiningDate(r.getDate("date"));
				emp.setPost(r.getString("post"));
				emp.setSalary(r.getInt("salary"));
				emp.setPhone(r.getString("phone"));
				emp.setCountry(r.getString("country"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return emp;
		
		
		
		
		
	}


	@Override
	public List<Employee> getAll() {
		
		
List<Employee> elist = new ArrayList<>();
		
		String sql = "select * from employee";
		
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Employee emp = new Employee();
				
				emp.setID(rs.getInt("id"));
				emp.setFname(rs.getString("fname"));
				emp.setLname(rs.getString("lname"));
				emp.setCompany("company");
				emp.setPhone("phone");
				
				elist.add(emp);
			}
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return elist;
		
		
		
		
		
		
		

		
		
	}


	@Override
	public List<Employee> searchEmp(String inp) {
		
		
		List<Employee> elist = new ArrayList<>();
				
				String sql = "select * from employee where fname like '%"+inp+"%' OR company like '%"+inp+"%' ";
				
				try {
					Statement stm = con.createStatement();
					ResultSet rs = stm.executeQuery(sql);
					
					while(rs.next()) {
						Employee emp = new Employee();
						
						emp.setID(rs.getInt("id"));
						emp.setFname(rs.getString("fname"));
						emp.setLname(rs.getString("lname"));
						emp.setCompany("company");
						emp.setPhone("phone");
						
						elist.add(emp);
					}
					
					
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
				
				
				return elist;
				
				
				
		
		
		
		
		
		
		
		
		
		
	}
	


	@Override
	public boolean addEmp1(Employee emp) {
		// TODO Auto-generated method stub
		return false;
		
		
		
		
		
		
		
	}




	
	
	
}
