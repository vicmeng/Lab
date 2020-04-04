package cn.edu.bcu.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Administrator;
import cn.edu.bcu.ls.entity.Customer;
import cn.edu.bcu.ls.mapper.AdministratorMapper;
import cn.edu.bcu.ls.mapper.CustomerMapper;
import cn.edu.bcu.ls.service.AdministratorService;
import cn.edu.bcu.ls.service.CustomerService;
/**
 * 
 * @author 11379
 *
 */

@Service
public class AdministratorServiceImpl implements AdministratorService {

	@Autowired
	private AdministratorMapper administratorMapper;

	@Override
	public boolean insertAdministrator(Administrator administrator) {
		// TODO Auto-generated method stub
		return administratorMapper.insertAdministrator(administrator);
	}

	@Override
	public List<Administrator> queryAllAdministrator(String a_type) {
		// TODO Auto-generated method stub
		return administratorMapper.queryAllAdministrator(a_type);
	}

	@Override
	public boolean updateAdministratorById(Administrator administrator) {
		// TODO Auto-generated method stub
		return administratorMapper.updateAdministratorById(administrator);
	}

	@Override
	public boolean deleteAdministratorById(int a_id) {
		// TODO Auto-generated method stub
		return administratorMapper.deleteAdministratorById(a_id);
	}

	

}
