package com.sheheryar.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="records")
public class Records {
	
	@Id
	@Column(name="deal_id")
	 private String dealID;	
	
	@Column(name="file_name")
	 private String fileName;
	
	@Column(name="ordering_currency")
	 private String orderingCurrency;
	
	@Column(name="to_currency")
	 private String toCurrency;
	
	@Column(name="timestamp")
	 private String timestamp;	
	
	@Column(name="deal_amount")
	 private String dealAmount;

	public String getDealID() {
		return dealID;
	}

	public void setDealID(String dealID) {
		this.dealID = dealID;
	}

	public String getOrderingCurrency() {
		return orderingCurrency;
	}

	public void setOrderingCurrency(String orderingCurrency) {
		this.orderingCurrency = orderingCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getDealAmount() {
		return dealAmount;
	}

	public void setDealAmount(String dealAmount) {
		this.dealAmount = dealAmount;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}		

}
