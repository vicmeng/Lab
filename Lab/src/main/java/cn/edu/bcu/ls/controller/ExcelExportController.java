package cn.edu.bcu.ls.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.core.io.ClassPathResource;

import cn.edu.bcu.ls.entity.Order;

/**
 * 
 * @author 11379
 *
 */
public class ExcelExportController {
	public static void excel(HttpServletRequest request, HttpServletResponse response, Order order) {
		try {
			String filePath = "static/报告模板.xls";
			ClassPathResource cpr = new ClassPathResource(filePath);
			InputStream inputStream = cpr.getInputStream();
			HSSFWorkbook wb = new HSSFWorkbook(inputStream);

			// 根据页面index 获取sheet页

			HSSFSheet sheet = wb.getSheet("Sheet1");
			HSSFRow row = sheet.createRow(3);

			// 创建HSSFCell对象 设置单元格的值
			int i = 7;

			row.createCell(7).setCellValue(order.getO_id());

			row.createCell(8).setCellValue(order.getCustomer().getC_name());

			row.createCell(9).setCellValue(order.getCustomer().getC_type());

			row.createCell(10).setCellValue(order.getCustomer().getC_number());
			row.createCell(12).setCellValue(order.getO_name());
			// 输出Excel文件

			OutputStream output = response.getOutputStream();

			response.reset();

			// 设置文件头

			response.setHeader("Content-Disposition",

					"attchement;filename=" + new String("人员信息.xls".getBytes("gb2312"), "ISO8859-1"));

			response.setContentType("application/msexcel");

			wb.write(output);

			wb.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
