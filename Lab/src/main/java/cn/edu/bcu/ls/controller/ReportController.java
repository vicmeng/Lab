package cn.edu.bcu.ls.controller;

import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.bcu.ls.entity.Order;
import cn.edu.bcu.ls.entity.Report;
import cn.edu.bcu.ls.service.OrderService;
import cn.edu.bcu.ls.service.ReportService;

/**
 * 
 * @author 11379
 *
 */
@RestController
public class ReportController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private ReportService reportService;

	@GetMapping("/exportExcel")
	public void exportExcel(HttpServletRequest request, HttpServletResponse response, int o_id) {

		Order order = orderService.getOrderByOid(o_id);
		

		ExcelExportController.excel(request, response, order);
	}

	@PostMapping("/insterReport")
	public boolean loadExport(@Valid Report report, @RequestParam("file") MultipartFile file,
			RedirectAttributes redirectAttributes, HttpServletRequest request) {

		report.setR_content(LoadController.upload(file, request));
		reportService.insertReport(report);
		Order order = new Order();
		order.setO_id(report.getO_id());
		order.setO_state("4");

		return orderService.updateOrderByIdWithState(order);
	}
}
