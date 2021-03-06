package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Administrator;
import cn.edu.bcu.ls.entity.Customer;
/**
 * 
 * @author 11379
 *
 */
public interface AdministratorService {
	boolean insertAdministrator(Administrator administrator);

	List<Administrator> queryAllAdministrator(String a_type);

	boolean updateAdministratorById(Administrator administrator);

	boolean deleteAdministratorById(int a_id);
}
