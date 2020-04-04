package cn.edu.bcu.ls.entity;

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
public class Report {
	private int r_id;
	
	@NotNull(message = "o_id 不能为空")
	private int o_id;
	
	private String r_content;
	@NotNull(message = "o_id 不能为空")
	private String e_state="0";

	
}
