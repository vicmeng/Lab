package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Customer;
/**
 * 
 * @author 11379
 *
 */
public interface CustomerMapper {
	Customer getCustomer(String c_number);

	boolean insertCustomer(Customer customer);

	boolean updataCustomer(Customer customer);
}
