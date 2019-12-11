package cn.edu.bcu.ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Customer;
import cn.edu.bcu.ls.entity.Report;
import cn.edu.bcu.ls.mapper.CustomerMapper;
import cn.edu.bcu.ls.mapper.ReportMapper;
import cn.edu.bcu.ls.service.CustomerService;
import cn.edu.bcu.ls.service.ReportService;
/**
 * 
 * @author 11379
 *
 */

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportMapper reportMapper;

	@Override
	public Boolean insertReport(Report report) {
		// TODO Auto-generated method stub

		return reportMapper.insertReport(report);
	}

}
