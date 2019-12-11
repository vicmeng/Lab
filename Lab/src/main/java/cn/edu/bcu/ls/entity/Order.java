package cn.edu.bcu.ls.entity;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author 11379
 *
 */
@Data
@NoArgsConstructor
public class Order {
	private int o_id;
	@NotNull(message = "name 不能为空")
	private String o_name;

	@NotNull(message = "state 不能为空")
	private String o_state = "0";

	@NotNull(message = "c_id 不能为空")
	private int c_id;

	@NotNull(message = "l_id 不能为空")
	private int l_id;

	private String p_way;

	private BigInteger p_money;

	@NotNull(message = "p_state 不能为空")
	private String p_state = "0";

	private Customer customer;

}
