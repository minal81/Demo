package com.CakeLover;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table(name="Customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer CuId;
	private String CuName;
	private Long CuMobileNo;
	private Integer CakeQuantity;
	private String PaymentMethod;
	
	
	 @OneToOne(cascade = CascadeType.ALL )

     @JoinColumn(name = "CuId")
	private CakeDetails cakedetails;


	public Integer getCuId() {
		return CuId;
	}


	public void setCuId(Integer cuId) {
		CuId = cuId;
	}


	public String getCuName() {
		return CuName;
	}


	public void setCuName(String cuName) {
		CuName = cuName;
	}


	


	public CakeDetails getCakedetails() {
		return cakedetails;
	}


	public void setCakedetails(CakeDetails cakedetails) {
		this.cakedetails = cakedetails;
	}


	public Integer getCakeQuantity() {
		return CakeQuantity;
	}
	public void setCakeQuantity(Integer cakeQuantity) {
		CakeQuantity = cakeQuantity;
	}


	public Long getCuMobileNo() {
		return CuMobileNo;
	}


	public void setCuMobileNo(Long cuMobileNo) {
		CuMobileNo = cuMobileNo;
	}


	public String getPaymentMethod() {
		return PaymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
}
