package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 绑卡支付 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "mobileBindPay", type = ApiMessageType.Request)
public class MobileBindPayApiRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号",demo = "312456798012456789")
	private String tradeNo;
	
	/**
	 * 检验码
	 */
	@NotBlank
	@Length(max = 10)
	@OpenApiField(desc = "检验码",demo = "123456")
	private String verifyCode;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "支付密码",demo = "32148975ds")
	private String payPassword;
	
	/**
	 * 银行卡号
	 */
	@NotBlank
	@Length(max = 32, min = 10)
	@OpenApiField(desc = "银行卡号",demo = "13246523165213")
	private String bankAccountNo;
	
	/**
	 * 信用卡有效期
	 */
	@Length(max = 10)
	@OpenApiField(desc = "信用卡有效期",constraint = "格式：YYMM。如2001年1月，0101",demo = "0101")
	private String validDate;
	
	/**
	 * 信用卡安全效验码
	 */
	@Length(max = 10)
	@OpenApiField(desc = "信用卡安全效验码",demo = "245")
	private String cvv2;
	/**
	 * 无密支付标示， add by dw
	 */
	@Length(max = 10)
	@OpenApiField(desc = "无密支付标示",demo = "microPay")
	private String microPay;
	
	@OpenApiField(desc = "银行编码",demo = "ABC")
	private String bankCode;
	@OpenApiField(desc = "银行卡类型",demo = "DEBIT_CARD")
	private String cardType;
	@OpenApiField(desc = "手机号码",demo = "10086100101")
	private String mobileNo;
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getVerifyCode() {
		return verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public String getPayPassword() {
		return payPassword;
	}
	
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
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
	
	public String getMicroPay() {
		return microPay;
	}
	
	public void setMicroPay(String microPay) {
		this.microPay = microPay;
	}
	
}
