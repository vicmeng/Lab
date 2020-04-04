package cn.edu.bcu.ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.edu.bcu.ls.entity.Customer;
import cn.edu.bcu.ls.entity.Invoice;
import cn.edu.bcu.ls.mapper.CustomerMapper;
import cn.edu.bcu.ls.mapper.InvoiceMapper;
import cn.edu.bcu.ls.service.CustomerService;
import cn.edu.bcu.ls.service.InvoiceService;
/**
 * 
 * @author 11379
 *
 */

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceMapper invoiceMapper;

	@Override
	public Integer checkInvoice(Integer l_id) {
		// TODO Auto-generated method stub
		
		return invoiceMapper.checkInvoice(l_id);
	}

	@Override
	public Integer checkInvoice2(Integer l_id) {
		// TODO Auto-generated method stub
		return invoiceMapper.checkInvoice2(l_id);
	}

	@Override
	public boolean insertInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoiceMapper.insertInvoice(invoice);
	}


}
