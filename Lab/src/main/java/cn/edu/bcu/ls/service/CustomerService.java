package cn.edu.bcu.ls.service;

import cn.edu.bcu.ls.entity.Customer;
/**
 * 
 * @author 11379
 *
 */
public interface CustomerService {
	Customer getCustomer(String c_number);

	boolean insertCustomer(Customer customer);

	boolean updataCustomer(Customer customer);
}
