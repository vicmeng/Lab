package cn.edu.bcu.ls.service;

import javax.servlet.http.HttpServletResponse;

import cn.edu.bcu.ls.entity.Report;

/**
 * 
 * @author 11379
 *
 */
public interface ReportService {
	Boolean insertReport(Report report);
	String getReprot(int r_id);
}
