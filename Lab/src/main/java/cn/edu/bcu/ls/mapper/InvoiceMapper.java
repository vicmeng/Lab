package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Customer;
import cn.edu.bcu.ls.entity.Invoice;
/**
 * 
 * @author 11379
 *
 */
public interface InvoiceMapper {
	Integer checkInvoice(Integer l_id);
	Integer checkInvoice2(Integer l_id);
	boolean insertInvoice(Invoice invoice);
}
