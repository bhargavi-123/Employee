package com.capg.employee.dao;

import java.util.ArrayList;

import com.capg.emplyee.bean.EmployeeBean;

public class EmployeeDaoImp implements IEmployeeDao {
	
	
  private static ArrayList<EmployeeBean> a1 = new ArrayList<>();
	@Override
	public boolean addEmployee(EmployeeBean e) {
		// TODO Auto-generated method stub
		return a1.add(e);
		
	}

}
