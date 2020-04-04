package cn.edu.bcu.ls.entity;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Invoice {
	private int i_id;
	@NotNull(message="name不能为空")
	private String i_name;
	@NotNull(message="content不能为空")
	private String i_content;
	@NotNull(message="i_money不能为空")
	private BigInteger i_money;
	@NotNull(message="l_id不能为空")
	private int l_id;
	
}
