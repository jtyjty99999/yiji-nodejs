package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年8月3日
 */
@OpenApiMessage(service = "mpayTradePayment", type = ApiMessageType.Request)
public class MpayTradePaymentRequest extends ApiRequest {
	/** 用户编号 */
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "用户编号",constraint="用户编号",demo="20150619010000072320")
	private String userId;
	
	/** 收款方 */
	@Length(max = 20)
	@OpenApiField(desc = "收款方",constraint="收款方",demo="20150619010000072320")
	private String sellerId;
	
	/** 金额，单位元,支持两位小数 */
	@OpenApiField(desc = "金额",constraint="支付金额必须大于0",demo="6.66")
	private Money amount;
	
	/** 支付密码 */
	@NotBlank
	@Length(min = 6, max = 32)
	@OpenApiField(desc = "支付密码", security = true,constraint="支付密码",demo="123456")
	private String password;
	
	@Length(max = 64)
	@OpenApiField(desc = "备注",constraint="备注",demo="操作成功")
	private String memo;
	
	@OpenApiField(desc = " 交易号",constraint="如果交易号为空，则创建一个交易再进行支付",demo="20151026000317089240")
	@Length(min = 10, max = 32)
	private String tradeNo;
	
	@Length(max = 32)
	@OpenApiField(desc = "签约编号",constraint="签约编号",demo="20150705000000455716")
	private String pactNo;
	
	@OpenApiField(desc = "金额来源",constraint="余额支付，代扣支付",demo="BY_BALANCE")
	private String payWay;
	
	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getPactNo() {
		return this.pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public String getPayWay() {
		return this.payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getSellerId() {
		return sellerId;
	}
	
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
