package com.CakeLover;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "CAKEDETAIL")
public class CakeDetails {

	  @Id

      @GeneratedValue(strategy = GenerationType.AUTO)
	  
	private Integer id;
	private Integer CuId;
	private Float Weight;
	private Float  Price;
	private String CakeFlavour;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCuId() {
		return CuId;
	}
	public void setCuId(Integer cuId) {
		CuId = cuId;
	}
	
	public Float getWeight() {
		return Weight;
	}
	public void setWeight(Float weight) {
		Weight = weight;
	}
	public String getCakeFlavour() {
		return CakeFlavour;
	}
	public void setCakeFlavour(String cakeFlavour) {
		CakeFlavour = cakeFlavour;
	}
	
	public Float getPrice() {
		return Price;
	}


	public void setPrice(Float price) {
		Price = price;
	}
	public CakeDetails(Integer cuId, Float weight, Float price, String cakeFlavour) {
		super();
		
		this.CuId = cuId;
		this.Weight = weight;
		this.Price = price;
		this.CakeFlavour = cakeFlavour;
	}
}
