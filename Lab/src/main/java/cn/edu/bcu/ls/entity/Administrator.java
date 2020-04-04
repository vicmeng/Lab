package cn.edu.bcu.ls.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author 11379
 *
 */
@Data
@NoArgsConstructor
public class Administrator {
	private Integer a_id;
	private String a_account;
	private String a_password;
	private String a_type;
	private String a_name;
}
