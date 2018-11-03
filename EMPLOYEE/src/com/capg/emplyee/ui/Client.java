package com.capg.emplyee.ui;

import java.util.Scanner;

import com.capg.employee.exception.EmployeeException;
import com.capg.emplyee.bean.EmployeeBean;
import com.capg.emplyee.service.EmployeeServiceImp;

public class Client {
	
	
	 public static void main(String[] args) {
		 
		 EmployeeServiceImp service = new EmployeeServiceImp();
		 Scanner sc = new Scanner(System.in);
		 EmployeeBean e = new EmployeeBean();
		 
			 
		 try {
		 System.out.println("Enter employee id");
		 int eid = sc.nextInt();
		 System.out.println("Enter employee name");
		 String ename = sc.next();
		 System.out.println("Enter employee sal");
		 double sal = sc.nextDouble();
		 System.out.println("Enter employee department");
		 String dept = sc.next();
		 e.setEid(eid);
		 e.setEname(ename);
		 e.setSal(sal);
		 e.setDept(dept);
		 
		 
		 
		 
		 boolean isvalid  = service.validateName(e);
		 if(isvalid) 
		 {
			 boolean add = service.addEmployee(e);
			 if(add) 
			 {
				 System.out.println("Employee is added");
			 }
			 
			 else{
				 System.out.println("employee is not added");
				 }
		 }
			 else {
				 System.out.println("invalid data");
			     }
		 }
				 catch(EmployeeException e1) {
					 System.out.println(e1.getMessage());
				 }
				 catch(Exception exception){
					 System.out.println("Enter details properly");
				 }
			 }
				
		 }





