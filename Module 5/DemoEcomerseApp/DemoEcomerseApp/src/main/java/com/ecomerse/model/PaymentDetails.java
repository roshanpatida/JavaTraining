package com.ecomerse.model;

import jakarta.persistence.Entity;


public class PaymentDetails {

	private String payementMethod;
	private String status;
	private String paymentId;
	private String razorpayPaymentLinkId;
	private String razorpayPaymentLinkRefereceId;
	private String razorpayPaymentLinkStatus;
	private String razorpayPaymentId;
	
	
	public String getPayementMethod() {
		return payementMethod;
	}
	public void setPayementMethod(String payementMethod) {
		this.payementMethod = payementMethod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getRazorpayPaymentLinkId() {
		return razorpayPaymentLinkId;
	}
	public void setRazorpayPaymentLinkId(String razorpayPaymentLinkId) {
		this.razorpayPaymentLinkId = razorpayPaymentLinkId;
	}
	public String getRazorpayPaymentLinkRefereceId() {
		return razorpayPaymentLinkRefereceId;
	}
	public void setRazorpayPaymentLinkRefereceId(String razorpayPaymentLinkRefereceId) {
		this.razorpayPaymentLinkRefereceId = razorpayPaymentLinkRefereceId;
	}
	public String getRazorpayPaymentLinkStatus() {
		return razorpayPaymentLinkStatus;
	}
	public void setRazorpayPaymentLinkStatus(String razorpayPaymentLinkStatus) {
		this.razorpayPaymentLinkStatus = razorpayPaymentLinkStatus;
	}
	public String getRazorpayPaymentId() {
		return razorpayPaymentId;
	}
	public void setRazorpayPaymentId(String razorpayPaymentId) {
		this.razorpayPaymentId = razorpayPaymentId;
	}
	public PaymentDetails(String payementMethod, String status, String paymentId, String razorpayPaymentLinkId,
			String razorpayPaymentLinkRefereceId, String razorpayPaymentLinkStatus, String razorpayPaymentId) {
		super();
		this.payementMethod = payementMethod;
		this.status = status;
		this.paymentId = paymentId;
		this.razorpayPaymentLinkId = razorpayPaymentLinkId;
		this.razorpayPaymentLinkRefereceId = razorpayPaymentLinkRefereceId;
		this.razorpayPaymentLinkStatus = razorpayPaymentLinkStatus;
		this.razorpayPaymentId = razorpayPaymentId;
	}
	
	public PaymentDetails() {}
	
}
