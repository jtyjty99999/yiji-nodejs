/**
 * 
 */
package com.yiji.openapi.message.common.transferAccounts.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author Administrator
 *
 */
public class BankCardPayeeOrder {
	/** 银行代码 */
	@NotNull
	@OpenApiField(desc = "银行代码")
	private String bankCode;
	
	/** 银行卡类型 */
	@NotNull
	@OpenApiField(desc = "银行卡类型")
	private String bankCardType;
	
	/** 转到的银行卡号 */
	@NotBlank
	@Length(max = 30)
	@OpenApiField(desc = "银行卡号")
	private String bankAccountNo;
	
	/** 银行账户开户名 */
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "开户姓名")
	private String bankAccountName;
	
	/** 银行省名 */
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "省份名称")
	private String provName;
	
	/** 银行市名 */
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "城市名称")
	private String cityName;
	
	/**
	 * @param bankCode
	 * @param String
	 * @param bankAccountNo
	 * @param bankAccountName
	 * @param provName
	 * @param cityName
	 */
	public BankCardPayeeOrder(String bankCode, String bankCardType, String bankAccountNo,
								String bankAccountName, String provName, String cityName) {
		super();
		this.bankCode = bankCode;
		this.bankCardType = bankCardType;
		this.bankAccountNo = bankAccountNo;
		this.bankAccountName = bankAccountName;
		this.provName = provName;
		this.cityName = cityName;
	}
	
	/**
	 * 
	 */
	public BankCardPayeeOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	/**
	 * @return the String
	 */
	public String getBankCardType() {
		return bankCardType;
	}
	
	/**
	 * @param String the String to set
	 */
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	
	/**
	 * @return the bankAccountNo
	 */
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	/**
	 * @param bankAccountNo the bankAccountNo to set
	 */
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	/**
	 * @return the bankAccountName
	 */
	public String getBankAccountName() {
		return bankAccountName;
	}
	
	/**
	 * @param bankAccountName the bankAccountName to set
	 */
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	
	/**
	 * @return the provName
	 */
	public String getProvName() {
		return provName;
	}
	
	/**
	 * @param provName the provName to set
	 */
	public void setProvName(String provName) {
		this.provName = provName;
	}
	
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
