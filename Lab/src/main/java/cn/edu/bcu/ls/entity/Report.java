package cn.edu.bcu.ls.entity;

/**
 * 
 * @author 11379
 *
 */
public class Report {
	private int r_id;
	private int o_id;
	private String r_content;
	private String e_state;

	public Report() {
		super();
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public String getR_content() {
		return r_content;
	}

	public void setR_content(String r_content) {
		this.r_content = r_content;
	}

	public String getE_state() {
		return e_state;
	}

	public void setE_state(String e_state) {
		this.e_state = e_state;
	}

	@Override
	public String toString() {
		return "Report [r_id=" + r_id + ", o_id=" + o_id + ", r_content=" + r_content + ", e_state=" + e_state + "]";
	}

}
