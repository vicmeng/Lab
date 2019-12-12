package cn.edu.bcu.ls.mapper;

import java.util.List;

import cn.edu.bcu.ls.entity.Order;

/**
 * 
 * @author 11379
 *
 */
public interface OrderMapper {
	boolean insertOrder(Order order);

	boolean updateOrderByIdWithState(Order order);

	boolean insertPayByOid(Order order);

	Order getOrderByOid(int o_id);

	List<Order> queryAllOrderByState(String o_state, String l_id);

	Order queryPayByOid(int o_id);

	boolean updataPayState(Order order);

	Order queryOrder(Integer o_id);
}
