package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 移动转账请求对象
 * 
 * @author lingjiao
 */
@OpenApiMessage(service = "mpayWithdraw", type = ApiMessageType.Request)
public class MpayWithdrawRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "用户编号,发起人userId",constraint="用户编号,发起人userId",demo="20151016000451549430")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "绑卡编号",constraint="绑卡编号",demo="20150713000000485104")
	private String pactNo;
	
	@NotBlank
	@Size(max = 32)
	@OpenApiField(desc = "支付密码/易手富密码", security = true,constraint="支付密码/易手富密码",demo="123456")
	private String password;
	
	@NotNull
	@OpenApiField(desc = "金额(元)",constraint="金额(元),支持2位小数",demo="6.66")
	private Money amount;
	
	@OpenApiField(desc = "外部订单号",constraint="外部订单号",demo="20150713000000485104")
	private String outBizNo;
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
}
