package cn.edu.bcu.ls.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bcu.ls.entity.Customer;
import cn.edu.bcu.ls.entity.Order;
import cn.edu.bcu.ls.service.CustomerService;
import io.swagger.annotations.Api;

/**
 * 
 * @author 11379
 *
 */

@Api(description = "客户操作接口")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService sustomerService;

	@PostMapping(value = "queryCustomer")
	public Customer queryCustomer( @RequestParam(value = "c_number", required = false) @Valid String c_number) {
		Customer customer = sustomerService.getCustomer(c_number);
		if (customer != null) {
			return customer;
		}
		return new Customer();

	}

	@PostMapping(value = "insertCustomer")
	public boolean insertCustomer(@Valid Customer customer) {
		return sustomerService.insertCustomer(customer);
	}

	@PutMapping(value = "updataCustomer")
	public boolean updataCustomer(@Valid Customer customer) {
		return sustomerService.updataCustomer(customer);
	}
}
