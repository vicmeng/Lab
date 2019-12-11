package cn.edu.bcu.ls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bcu.ls.entity.Order;
import cn.edu.bcu.ls.service.OrderService;
import io.swagger.annotations.Api;

/**
 * 
 * @author 11379
 *
 */
@Api(description = "委托单操作接口")
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping(value = "insertOrder")
	public boolean insertOrder(Order order) {

		return orderService.insertOrder(order);

	}

	@PutMapping(value = "updateOrderByIdWithState")
	public boolean updateOrderByIdWithState(Order order) {

		return orderService.updateOrderByIdWithState(order);

	}

	@PostMapping(value = "insertPayByOid")
	public boolean insertPayByOid(Order order) {

		return orderService.insertPayByOid(order);

	}

	@GetMapping(value = "queryAllOrderByState")
	public List<Order> queryAllOrderByState(String o_state) {

		return orderService.queryAllOrderByState(o_state);

	}

	@GetMapping(value = "queryPayByOid")
	public Order queryPayByOid(int o_id) {

		return orderService.queryPayByOid(o_id);

	}

}
