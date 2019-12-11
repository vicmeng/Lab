package cn.edu.bcu.ls.entity;

/**
 * 
 * @author 李硕
 *
 */
public class Customer {
	private int c_id = -1;
	private String c_name;
	private String c_type;
	private String c_number;

	public Customer() {
		super();
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
	}

	public String getC_number() {
		return c_number;
	}

	public void setC_number(String c_number) {
		this.c_number = c_number;
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_type=" + c_type + ", c_number=" + c_number + "]";
	}

}
