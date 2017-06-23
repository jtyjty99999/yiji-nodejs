package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 易手富 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "mobilePay", type = ApiMessageType.Request)
public class MobilePayApiRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号",demo = "23145678912456798")
	private String tradeNo;
	
	/**
	 * 验证码
	 */
	@NotBlank
	@Length(max = 10)
	@OpenApiField(desc = "验证码",demo = "123456")
	private String verifyCode;
	
	@Length(min = 6, max = 50)
	@OpenApiField(desc = "支付密码",demo = "12345678902s")
	private String payPassword;
	
	/**
	 * 默认绑定
	 */
	@OpenApiField(desc = "绑定标示",constraint = "1：是，0：否",demo = "1")
	private String isBind;
	
	/**
	 * 银行卡号
	 */
	@NotBlank
	@Length(max = 32, min = 10)
	@OpenApiField(desc = "银行卡号",demo = "1236457890123456")
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
	@Length(max = 60, min = 1)
	@OpenApiField(desc = "银行开户名",demo = "易极付")
	private String realName;
	
	/**
	 * 身份证证件号
	 */
	@NotBlank
	@Length(max = 50, min = 6)
	@OpenApiField(desc = "身份证证件号",demo = "12345678901234567890")
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
	@NotBlank
	@Length(max = 11, min = 11)
	@OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	
	/**
	 * 信用卡有效期
	 */
	@Length(max = 10)
	@OpenApiField(desc = "信用卡有效期",constraint = "格式：YYMM。如2005年12月，0512",demo = "0512")
	private String validDate;
	
	/**
	 * 信用卡安全效验码
	 */
	@Length(max = 10)
	@OpenApiField(desc = "信用卡安全效验码",demo = "128")
	private String cvv2;
	
	/**
	 * 移动设备号
	 */
	@Length(max = 128)
	@OpenApiField(desc = "移动设备号",constraint = "苹果：openUdid;安卓：misi",demo = "misi")
	private String deviceId;
	
	/**
	 * 手机卡号
	 */
	@Length(max = 100)
	@OpenApiField(desc = "手机卡号",demo = "10086100101")
	private String smi;
	
	/**
	 * 无密支付标示，add by dw
	 */
	@Length(max = 10)
	@OpenApiField(desc = "无密支付标示",demo = "microPay")
	private String microPay;
	
	/**
	 * 签约流水号
	 */
	@OpenApiField(desc = "签约流水号",demo = "123456789124565")
	private String pactNo;
	
	/**
	 * 身份证有效期
	 */
	@Length(max = 20)
	@OpenApiField(desc = "身份证有效期",constraint = "格式：”yyyy-mm-dd”, 如果是长期，传”1972-12-12”",demo = "1972-12-12")
	private String certNoValidDate;
	
	/**
	 * 职业
	 */
	@Length(max = 64)
	@OpenApiField(desc = "职业", constraint = "职业",demo = "职员")
	private String profession;
	
	/**
	 * 地址
	 */
	@Length(max = 256)
	@OpenApiField(desc = "地址",demo = "重庆市北部新区黄山大道中段9号木星大厦一区6楼")
	private String address;
	
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
	
	public String getIsBind() {
		return isBind;
	}
	
	public void setIsBind(String isBind) {
		this.isBind = isBind;
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
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
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
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getSmi() {
		return smi;
	}
	
	public void setSmi(String smi) {
		this.smi = smi;
	}
	
	public String getMicroPay() {
		return microPay;
	}
	
	public void setMicroPay(String microPay) {
		this.microPay = microPay;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public String getCertNoValidDate() {
		return certNoValidDate;
	}
	
	public void setCertNoValidDate(String certNoValidDate) {
		this.certNoValidDate = certNoValidDate;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
