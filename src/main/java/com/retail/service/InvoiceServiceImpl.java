package com.retail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.model.Invoice;
import com.retail.repository.InvoiceRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j(topic = "InvoiceServiceImpl")
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Override
	public Optional<Invoice> getInvoiceById(Long id) {
		log.info("getInvoiceById method is called");
		return invoiceRepository.findById(id);
	}

	@Override
	public List<Invoice> getInvoices() {
		log.info("getInvoices method is called");
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice addInvoice(Invoice invoice) {
		log.info("addInvoice method is called");
		return invoiceRepository.save(invoice);

	}

	@Override
	public Invoice updateInvoice(Invoice invoice) {
		log.info("updateInvoice method is called");
		return invoiceRepository.save(invoice);
	}

	@Override
	public Invoice deleteInvoice(Long id) {
		log.info("deleteInvoice method is called");
		Optional<Invoice> invoice = invoiceRepository.findById(id);
		invoiceRepository.delete(invoice.get());
		return invoice.get();
	}

}
