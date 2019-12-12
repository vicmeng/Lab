package cn.edu.bcu.ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Customer;
import cn.edu.bcu.ls.mapper.CustomerMapper;
import cn.edu.bcu.ls.service.CustomerService;
/**
 * 
 * @author 11379
 *
 */

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Customer getCustomer(String c_number) {

		Customer customer = customerMapper.getCustomer(c_number);

		return customer;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerMapper.insertCustomer(customer);
	}

	@Override
	public boolean updataCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerMapper.updataCustomer(customer);
	}

	@Override
	public boolean deleteCustomerById(String c_number) {
		// TODO Auto-generated method stub
		return customerMapper.deleteCustomerById(c_number);
	}

}
