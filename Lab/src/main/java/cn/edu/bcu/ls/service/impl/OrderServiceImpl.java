package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Customer;
import cn.edu.bcu.ls.entity.Order;
import cn.edu.bcu.ls.mapper.CustomerMapper;
import cn.edu.bcu.ls.mapper.OrderMapper;
import cn.edu.bcu.ls.service.CustomerService;
import cn.edu.bcu.ls.service.OrderService;

/**
 * 
 * @author 11379
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public boolean insertOrder(Order order) {

		return orderMapper.insertOrder(order);
	}

	@Override
	public boolean updateOrderByIdWithState(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.updateOrderByIdWithState(order);
	}

	@Override
	public boolean insertPayByOid(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.insertPayByOid(order);
	}

	@Override
	public Order getOrderByOid(int o_id) {
		// TODO Auto-generated method stub
		return orderMapper.getOrderByOid(o_id);
	}

	@Override
	public List<Order> queryAllOrderByState(String o_state) {
		// TODO Auto-generated method stub
		return orderMapper.queryAllOrderByState(o_state);
	}

	@Override
	public Order queryPayByOid(int o_id) {
		// TODO Auto-generated method stub
		return orderMapper.queryPayByOid(o_id);
	}

}
