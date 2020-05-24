package com.retail.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "invoice_line")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal subTotal;
	private BigDecimal grandTotal;
	private BigDecimal tax;
	private String purchaseRefNumber;
	private String invoiceNumber;
	private Long productId;
	private String productName;
	private BigDecimal quantity;
	private Long unitId;
	private String unitName;
	private BigDecimal unitPrice;
	private BigDecimal systemPrice;
	private String hscode;
}
