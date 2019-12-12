package cn.edu.bcu.ls.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	/**
	 * 
	 * @param order
	 * @return 添加委托单信息
	 */
	@PostMapping(value = "insertOrder")
	public boolean insertOrder(Order order) {

		return orderService.insertOrder(order);

	}

	/**
	 * 
	 * @param order
	 * @return 修改委托单状态
	 */
	@PutMapping(value = "updateOrderByIdWithState")
	public boolean updateOrderByIdWithState(Order order) {

		return orderService.updateOrderByIdWithState(order);

	}

	/**
	 * 
	 * @param order
	 * @return 增加缴费单收入方式
	 */
	@PostMapping(value = "insertPayByOid")
	public boolean insertPayByOid(@Valid Order order) {

		return orderService.insertPayByOid(order);

	}

	/**
	 * 
	 * @param o_state
	 * @return 查看委托单以状态
	 */
	@GetMapping(value = "queryAllOrderByState")
	public List<Order> queryAllOrderByState(
			@RequestParam(value = "o_state", required = false, defaultValue = "-1") String o_state,
			@RequestParam(value = "l_id", required = false, defaultValue = "-1") String l_id) {

		return orderService.queryAllOrderByState(o_state,l_id);

	}

	/**
	 * 
	 * @param o_id
	 * @return 返回单个order
	 */
	@GetMapping(value = "queryOrder")
	public Order queryOrder(Integer o_id) {

		return orderService.queryOrder(o_id);

	}

	/**
	 * 
	 * @param o_id
	 * @return 查看缴费单
	 */
	@GetMapping(value = "queryPayByOid")
	public Order queryPayByOid(int o_id) {

		return orderService.queryPayByOid(o_id);

	}

	/**
	 * 
	 * @param order
	 * @return 修改缴费单状态
	 */
	@PostMapping(value = "updataPayState")
	public boolean updataPayState(Order order) {
		return orderService.updataPayState(order);

	}

}
