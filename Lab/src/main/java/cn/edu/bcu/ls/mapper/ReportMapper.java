package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Report;
/**
 * 
 * @author 11379
 *
 */
public interface ReportMapper {
	Boolean insertReport(Report report);
	String getReprot(int r_id);
}
