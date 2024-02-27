package com.ecomerse.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


public class PaymentInformation {

	@Column(name="card_Holder_name")
	private String cardHolderName;
	
	@Column(name= "card_Number")
	private String cardNumber;
	
	@Column(name= "expiration_Date")
	private LocalDate expirationDate;
	
	@Column(name = "cvv")
	private String cvv;
	
}
