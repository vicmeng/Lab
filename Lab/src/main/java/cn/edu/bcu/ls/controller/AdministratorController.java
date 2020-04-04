package cn.edu.bcu.ls.controller;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.bcu.ls.entity.Administrator;
import cn.edu.bcu.ls.entity.Order;
import cn.edu.bcu.ls.entity.Report;
import cn.edu.bcu.ls.service.AdministratorService;
import cn.edu.bcu.ls.service.OrderService;
import cn.edu.bcu.ls.service.ReportService;
import io.swagger.annotations.Tag;

/**
 * 
 * @author 11379
 *
 */
@RestController
public class AdministratorController {

	@Autowired
	private AdministratorService administratorService;
	
	
	
	
	/**
	 * 
	 * @param administrator
	 * @return 添加管理员
	 */
	
	@PostMapping(value = "insertAdministrator")
	public boolean insertAdministrator(Administrator administrator) {
		return administratorService.insertAdministrator(administrator);
	}
	/**
	 * 
	 * @param a_type
	 * @return 查询管理员 可以按照类型查询
	 */
	@GetMapping(value = "queryAlladministrator")
	public List<Administrator> queryAlladministrator(
			@RequestParam(value = "a_type", required = false, defaultValue = "-1") String a_type) {
		return administratorService.queryAllAdministrator(a_type);

	}
	
	@PutMapping(value="updateAdministratorById")
	public boolean updateAdministratorById(Administrator administrator) {
		return administratorService.updateAdministratorById(administrator);
		
	}
	
	@DeleteMapping(value="deleteAdministratorById")
	public boolean deleteAdministratorById(int a_id) {
		return administratorService.deleteAdministratorById(a_id);
	}
	
}
