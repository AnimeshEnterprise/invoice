package com.retail.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "invoice")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date createdDate;
	private Date dueDate;
	private Date paidDate;
	private BigDecimal subTotal;
	private BigDecimal grandTotal;
	private BigDecimal tax;
	private Long orderBy;
	private String orderByName;
	private String orderByAddress;
	private String purchaseRefNumber;
	private String invoiceNumber;
	private BigDecimal paidAmount;
	private BigDecimal dueAmount;
	private Long paymentDetails;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "invoiceId")
	private Set<InvoiceLine> invoiceLines;
}
