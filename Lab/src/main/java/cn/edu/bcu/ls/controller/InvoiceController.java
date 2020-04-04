package cn.edu.bcu.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.bcu.ls.entity.Invoice;
import cn.edu.bcu.ls.service.InvoiceService;
import io.swagger.annotations.Api;

/**
 * 
 * @author 11379
 *
 */
@Api(description = "报销操作接口")
@RestController
public class InvoiceController {
	
	
	@Autowired
	private InvoiceService invoiceService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping(value = "checkInvoice")
	public Integer checkInvoice(Invoice invoice) {
		Integer a=invoiceService.checkInvoice(invoice.getL_id());
		Integer b=invoiceService.checkInvoice2(invoice.getL_id());
		if(b==null) {
			b=0;
		}
		return a-b;
		
		
		
	}
	
	@PostMapping(value="insertInvoice")
	public boolean insertInvoice(Invoice invoice) {
		return invoiceService.insertInvoice(invoice);
	}
	
}
