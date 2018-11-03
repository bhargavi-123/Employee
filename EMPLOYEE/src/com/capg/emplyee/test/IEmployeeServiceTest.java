package com.capg.emplyee.test;

import static org.junit.Assert.*;
import junit.framework.AssertionFailedError;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.employee.exception.EmployeeException;
import com.capg.emplyee.bean.EmployeeBean;
import com.capg.emplyee.service.EmployeeServiceImp;
import com.capg.emplyee.service.IEmployeeService;


public class IEmployeeServiceTest {
    
private static  IEmployeeService employeeService = null;

    @BeforeClass
	 public static  void createInstance() {
		employeeService = new EmployeeServiceImp();
	}
    @Test(expected = EmployeeException.class)
    public void testEidForLength() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23);
    	employeeBean.setEname("saibhargavi");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    	
    	
    	
    }
    @Test(expected = EmployeeException.class)
    public void testEidForNumber() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23%676);
    	employeeBean.setEname("saibhargavi");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    }
    @Test
    public void testEid() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(2675);
    	employeeBean.setEname("saibhargavi");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertTrue(result);
    }
    @Test(expected = EmployeeException.class)
    public void testEnameForAlphabet() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("4342");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    }
    @Test(expected = EmployeeException.class)
    public void testEnameForLength() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(2453);
    	employeeBean.setEname("sai");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    }
    @Test(expected = EmployeeException.class)
    public void testEnameForNotNull() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    }
    @Test
    public void testEname() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("saibhargavi");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertTrue(result);
    }
    @Test(expected = EmployeeException.class)
    public void testSalForOnlyNumber() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("saibhargavi");
    	employeeBean.setSal(20%00.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    }
    @Test(expected = EmployeeException.class)
    public void testsalForGreaterThanZero() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("saibhargavi");
    	employeeBean.setSal(-678.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    }
    @Test
    public void testsal() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("saibhargavi");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertTrue(result);
    }
    @Test(expected = NullPointerException.class)
    public void testDeptForNotNull() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("sai bhargavi");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept(null);
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    }
    @Test
    public void testDept() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("sai bhargavi");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("Testing");
    	boolean result = employeeService.validateName(employeeBean);
    	assertTrue(result);
    }
    @Test(expected = EmployeeException.class)
    public void testDeptOnlyAlphabet() throws Exception {
    	
    	EmployeeBean employeeBean = new EmployeeBean();
    	employeeBean.setEid(23676);
    	employeeBean.setEname("saibhargavi");
    	employeeBean.setSal(200.0);
    	employeeBean.setDept("23454614");
    	boolean result = employeeService.validateName(employeeBean);
    	assertFalse(result);
    }
    
}
