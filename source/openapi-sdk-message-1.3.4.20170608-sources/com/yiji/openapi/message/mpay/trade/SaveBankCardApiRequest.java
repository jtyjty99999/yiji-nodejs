package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 新增银行卡 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "saveBankCard", type = ApiMessageType.Request)
public class SaveBankCardApiRequest extends ApiRequest {
	
	@OpenApiField(desc = "银行卡号",demo = "12345678912345662")
	@NotBlank
	private String bankAccountNo;
	
	@OpenApiField(desc = "交易号",demo = "2135645463125")
	@NotBlank
	private String tradeNo;
	
	@NotBlank
	@OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	
	@OpenApiField(desc = "信用卡有效期",constraint = "格式：YYMM。如2005年12月，0512",demo = "0512")
	private String validDate;
	
	@OpenApiField(desc = "信用卡cvv2",demo = "125")
	private String cvv2;
	
	@OpenApiField(desc = "银行编码",demo = "ABC")
	@NotBlank
	private String bankCode;
	
	@OpenApiField(desc = "银行类型",demo = "bankType")
	@NotBlank
	private String bankType;
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
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
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankType() {
		return bankType;
	}
	
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
}
