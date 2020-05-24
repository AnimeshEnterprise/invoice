package com.retail.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.model.Invoice;
import com.retail.service.InvoiceService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j(topic = "InvoiceController")
@CrossOrigin(origins = "http://localhost:4200")
public class InvoiceController {
	@Autowired
	private InvoiceService invoiceService;

	@Autowired
	private Environment env;

	@GetMapping("/invoice/{id}")
	public Optional<Invoice> getInvoiceById(@PathVariable Long id) {
		log.info("getInvoiceById method is called");
		return invoiceService.getInvoiceById(id);
	}

	@GetMapping("/port")
	public String getPort() {
		log.info("getInvoiceById method is called");
		return env.getProperty("local.server.port");
	}

	@GetMapping("/invoices")
	public List<Invoice> getInvoices() {
		log.info("getInvoices method is called");
		return invoiceService.getInvoices();
	}

	@PostMapping("/invoice")
	public Invoice addInvoice(@RequestBody Invoice invoice) {
		log.info("addInvoice method is called");
		invoice.getInvoiceLines().forEach(e -> System.out.println(e.getHscode()));
		return invoiceService.addInvoice(invoice);
	}

	@PutMapping("/invoice")
	public Invoice updateInvoice(@RequestBody Invoice invoice) {
		log.info("updateInvoice method is called");
		return invoiceService.updateInvoice(invoice);
	}

	@DeleteMapping("/invoice/{id}")
	public Invoice deleteInvoice(@PathVariable Long id) {
		log.info("deleteInvoice method is called");
		return invoiceService.deleteInvoice(id);
	}
}
