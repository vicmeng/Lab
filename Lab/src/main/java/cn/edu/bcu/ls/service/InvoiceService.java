package cn.edu.bcu.ls.service;

import cn.edu.bcu.ls.entity.Invoice;
/**
 * 
 * @author 11379
 *
 */
public interface InvoiceService {
	Integer checkInvoice(Integer l_id);
	Integer checkInvoice2(Integer l_id);
	boolean insertInvoice(Invoice invoice);
}
