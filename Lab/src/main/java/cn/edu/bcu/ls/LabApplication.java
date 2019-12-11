package cn.edu.bcu.ls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * 
 * @author 李硕
 * 启动类
 *
 */
@MapperScan(value = "cn.edu.bcu.ls.mapper")
@ComponentScan(basePackages = { "cn.edu.bcu.ls" })
@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabApplication.class, args);
	}

}
