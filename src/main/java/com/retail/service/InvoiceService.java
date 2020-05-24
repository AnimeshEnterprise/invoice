package com.retail.service;

import java.util.List;
import java.util.Optional;

import com.retail.model.Invoice;

public interface InvoiceService {

	Optional<Invoice> getInvoiceById(Long id);

	List<Invoice> getInvoices();

	Invoice addInvoice(Invoice invoice);

	Invoice updateInvoice(Invoice invoice);

	Invoice deleteInvoice(Long id);

}
