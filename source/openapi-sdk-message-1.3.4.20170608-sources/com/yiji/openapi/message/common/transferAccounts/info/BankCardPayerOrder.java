/**
 * 
 */
package com.yiji.openapi.message.common.transferAccounts.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author Administrator
 *
 */
public class BankCardPayerOrder {
	/** 证件类型 */
	@NotNull
	@OpenApiField(desc = "证件类型")
	private String certType;
	
	/** 证件号 */
	@NotBlank
	@OpenApiField(desc = "证件号")
	private String cardNo;
	
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	/** 银行枚举 */
	@NotNull
	@OpenApiField(desc = "银行code")
	private String bankCode;
	
	/** 银行卡类型 */
	@NotNull
	@OpenApiField(desc = "银行卡类型")
	private String bankCardType;
	
	/** 银行账号 */
	@NotBlank
	@OpenApiField(desc = "银行卡号")
	private String bankAccountNo;
	
	/** 银行名称 */
	@NotBlank
	@OpenApiField(desc = "银行名称")
	private String bankAccountName;
	
	/** 银行卡所在的省名称 */
	@NotBlank
	@OpenApiField(desc = "省份名称")
	private String provName;
	
	/** 银行卡所在的城市名称 */
	@NotBlank
	@OpenApiField(desc = "城市名称")
	private String cityName;
	
	/**
	 * 
	 */
	public BankCardPayerOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the certType
	 */
	public String getCertType() {
		return certType;
	}
	
	/**
	 * @param certType the certType to set
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	/**
	 * @return the bankCardType
	 */
	public String getBankCardType() {
		return bankCardType;
	}
	
	/**
	 * @param bankCardType the bankCardType to set
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
