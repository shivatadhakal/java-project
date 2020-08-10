package com.test.service;
import com.test.model.Employee;
import java.util.List;
public interface EmployeeService {

	
	boolean addEmp(Employee emp);
	boolean deleteEmp(int id);
	boolean updateEmp(Employee emp);
	Employee getById(int id);
	List<Employee> getAll();
	List<Employee> searchEmp(String inp);
	boolean addEmp1(Employee emp);
	
	
	
	
	
}
