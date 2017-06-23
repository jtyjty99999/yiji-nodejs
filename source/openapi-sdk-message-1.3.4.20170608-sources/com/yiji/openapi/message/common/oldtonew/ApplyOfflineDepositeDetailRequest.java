package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-28<br>
 */
@OpenApiMessage(service = "applyOfflineDepositeDetail", type = ApiMessageType.Request)
public class ApplyOfflineDepositeDetailRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "金额", demo = "10.00")
	private String amount;

	@OpenApiField(desc = "银行卡号", demo = "622198753679087****")
	private String bankCardNo;

	@OpenApiField(desc = "银行简称", demo = "ICBC")
	private String bankCode;

	@NotNull
	@OpenApiField(desc = "类型", constraint = "ESTATE_OFFLINE_DEPOSITE:易房保线下充值", demo = "ESTATE_OFFLINE_DEPOSITE")
	private String businessType;

	@OpenApiField(desc = "身份证号", demo = "50010119920724****")
	private String certNo;

	@NotNull
	@OpenApiField(desc = "所在城市", demo = "重庆市")
	private String city;

	@OpenApiField(desc = "币种", demo = "CNY")
	private String currency;

	@NotNull
	@OpenApiField(desc = "外部订单号", demo = "AD23FSDF23423432")
	private String outBizNo;

	@OpenApiField(desc = "真实姓名", demo = "张三")
	private String realName;

	@NotNull
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "会员ID", demo = "12346579801234567980")
	private String userId;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	
	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOutBizNo() {
		return outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
