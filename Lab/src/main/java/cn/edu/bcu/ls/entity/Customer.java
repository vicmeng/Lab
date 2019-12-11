package cn.edu.bcu.ls.entity;



import javax.validation.constraints.NotNull;

import cn.edu.bcu.ls.PhoneNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author 李硕
 *
 */
@Data
@NoArgsConstructor
public class Customer {
	private int c_id = -1;
	@NotNull(message = "c_name 不能为空")
	private String c_name;
	@NotNull(message = "c_type 不能为空")
	private String c_type;
	@PhoneNumber(message = "phoneNumber 格式不正确")
	@NotNull(message = "phoneNumber 不能为空")
	private String c_number;

	
}
