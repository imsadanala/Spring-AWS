/**
 * 
 */
package com.springcould.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Suresh Sadanala
 *
 */
public class Coupon implements Serializable{

	private static final long serialVersionUID = 3313179101618816943L;

	private Long id;
	private String code;
	private BigDecimal discount;
	private String expDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

}
