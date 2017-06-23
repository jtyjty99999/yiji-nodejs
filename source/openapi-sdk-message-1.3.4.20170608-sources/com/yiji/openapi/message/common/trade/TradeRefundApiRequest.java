package com.yiji.openapi.message.common.trade;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "tradeRefund", type = ApiMessageType.Request)
public class TradeRefundApiRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号",demo = "12345679801324657980")
	private String tradeNo;
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "外部订单号",demo = "12345647890123456")
	private String outOrderNo;
	
	@OpenApiField(desc = "退款类型", constraint = "SELLER_PAY_REFUND_AMOUNT卖家承担退款额,ALL_REFUND全部退款",demo = "ALL_REFUND")
	private String refundType;
	
	@OpenApiField(desc = "退款金额",demo = "88.66")
	private Money refundAmount;
	
	@OpenApiField(desc = "退款时间,格式yyyy-MM-dd",demo = "2015-12-12")
	private String refundTime;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "退款原因",demo = "取消交易")
	private String refundReason;
	
	@Length(max = 256)
	@OpenApiField(desc = "描述",demo = "取消交易")
	private String memo;
	

	public void check() throws IllegalArgumentException {
		if (refundAmount != null) {
			if (!refundAmount.greaterThan(Money.zero())) {
				throw new IllegalArgumentException("refundAmount not greater than 0");
			}
		}
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Money getRefundAmount() {
		return refundAmount;
	}
	
	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}
	
	public String getRefundTime() {
		return refundTime;
	}
	
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}
	
	public String getRefundReason() {
		return refundReason;
	}
	
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getRefundType() {
		return refundType;
	}
	
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}
