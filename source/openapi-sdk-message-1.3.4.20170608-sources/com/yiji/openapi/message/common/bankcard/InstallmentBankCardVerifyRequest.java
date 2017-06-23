package com.yiji.openapi.message.common.bankcard;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by HuCheng on 2015/5/13.
 */
@OpenApiMessage(service = "installmentBankCardVerify", type = ApiMessageType.Request)
public class InstallmentBankCardVerifyRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "真实姓名", constraint = "银行卡持有人真实姓名")
	private String realName;
	
	@NotBlank
	@Length(max = 18)
	@OpenApiField(desc = "身份证号", constraint = "银行卡持有人身份证号")
	private String certNo;
	
	@NotNull
	@OpenApiField(desc = "银行卡类型", constraint = "银行卡类型 DEBIT_CARD : 借记卡 CREDIT_CARD:信用卡")
	private String bankCardType;
	
	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "银行编码", constraint = "卡号对应的银行编码")
	private String bankCode;
	
	@OpenApiField(desc = "服务类型", constraint = "服务类型:HOUSE_PROPERTY:物业代缴;INSTALLMENT:分期收款")
	private String serviceType;
	
	@NotBlank
	@Length(max = 40)
	@OpenApiField(desc = "银行卡号", constraint = "需要查询的银行卡号")
	private String bankCardNo;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "手机号码", constraint = "银行卡持有人手机号")
	private String mobileNo;
	
	@Length(max = 32)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号",demo="P144733894089711")
	private String outOrderNo;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankCardType() {
		return bankCardType;
	}
	
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	
	public String getServiceType() {
		return serviceType;
	}
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
