package com.capg.emplyee.service;

import com.capg.employee.dao.EmployeeDaoImp;
import com.capg.employee.exception.EmployeeException;
import com.capg.employee.exception.ExceptionMessage;
import com.capg.emplyee.bean.EmployeeBean;

public class EmployeeServiceImp implements IEmployeeService {
    EmployeeDaoImp dao = new EmployeeDaoImp();
    
	@Override
	public boolean addEmployee(EmployeeBean e) {
		// TODO Auto-generated method stub
		return dao.addEmployee(e);
	}

	@Override
	public boolean validateName(EmployeeBean e) throws EmployeeException {
		// TODO Auto-generated method stub
	/*	boolean isValid=false;
		if(e.getEname().length() >=4 && e.getEid() > 999 && e.getSal() > 0)
		isValid = true;
		return isValid;*/
		boolean isvalid =true;
		if(!(e.getEid() >999)) {
			throw new EmployeeException(ExceptionMessage.ERROR1);
		}
		if(!(e.getEname().length() >= 4 && e.getEname().matches("[a-z A-Z]{4,}"))) {
			throw new EmployeeException(ExceptionMessage.ERROR2);
		}
		if(!(e.getSal()> 0)) {
			throw new EmployeeException(ExceptionMessage.ERROR3); 
		}
		if((e.getDept()== null && !(e.getDept().matches("[a-z]{20}")))) { 
			throw new EmployeeException(ExceptionMessage.ERROR4); 
		}
		return isvalid;
        }
}
