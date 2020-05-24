package com.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
