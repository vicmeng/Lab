package cn.edu.bcu.ls.entity;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

/**
 * 
 * @author 11379
 *
 */
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

	public Order() {
		super();
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public String getO_name() {
		return o_name;
	}

	public void setO_name(String o_name) {
		this.o_name = o_name;
	}

	public String getO_state() {
		return o_state;
	}

	public void setO_state(String o_state) {
		this.o_state = o_state;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getP_way() {
		return p_way;
	}

	public void setP_way(String p_way) {
		this.p_way = p_way;
	}

	public BigInteger getP_money() {
		return p_money;
	}

	public void setP_money(BigInteger p_money) {
		this.p_money = p_money;
	}

	public String getP_state() {
		return p_state;
	}

	public void setP_state(String p_state) {
		this.p_state = p_state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
