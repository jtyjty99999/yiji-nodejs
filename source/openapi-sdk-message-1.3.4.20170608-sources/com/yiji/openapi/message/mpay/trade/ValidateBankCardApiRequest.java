package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 银行卡鉴权 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "validateBankCard", type = ApiMessageType.Request)
public class ValidateBankCardApiRequest extends ApiRequest {
	
	/**
	 * 银行卡号
	 */
	@NotBlank
	@Length(max = 32, min = 10)
	@OpenApiField(desc = "银行卡号",demo = "123456789012345687")
	private String bankAccountNo;
	
	/**
	 * 银行代码
	 */
	@NotBlank
	@Length(max = 40)
	@OpenApiField(desc = "银行代码",demo = "ABC")
	private String bankCode;
	
	/**
	 * 银行开启名
	 */
	@NotBlank
	@Length(max = 60, min = 1)
	@OpenApiField(desc = "银行开户名",demo = "易极付")
	private String realName;
	
	/**
	 * 身份证证件号
	 */
	@NotBlank
	@Length(max = 50, min = 6)
	@OpenApiField(desc = "身份证证件号",demo = "123456789012345678")
	private String certNo;
	
	/**
	 * 卡类型
	 */
	@NotBlank
	@OpenApiField(desc = "卡类型",demo = "DEBIT_CARD")
	private String cardType;
	
	/**
	 * 手机号
	 */
	@Length(max = 11, min = 11)
	@NotBlank
	@OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	
	/**
	 * 信用卡有效期
	 */
	@Length(max = 10)
	@OpenApiField(desc = "信用卡有效期",demo = "1512")
	private String validDate;
	
	/**
	 * 信用卡安全效验码
	 */
	@Length(max = 10)
	@OpenApiField(desc = "信用卡安全效验码",demo = "128")
	private String cvv2;
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getValidDate() {
		return validDate;
	}
	
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	
	public String getCvv2() {
		return cvv2;
	}
	
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	
}
