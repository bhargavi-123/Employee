package com.capg.emplyee.service;

import com.capg.employee.exception.EmployeeException;
import com.capg.emplyee.bean.EmployeeBean;

public interface IEmployeeService {
    
	public  boolean addEmployee(EmployeeBean e);
	public boolean validateName(EmployeeBean e) throws EmployeeException;
	
	
}
