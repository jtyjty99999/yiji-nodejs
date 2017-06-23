package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "tradeRefund", type = ApiMessageType.Response)
public class TradeRefundApiResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易号，商家发起交易时的号码", demo = "12345689123456")
	private String tradeNo;
	
	@OpenApiField(desc = "外部订单号", demo = "123456456321456")
	private String outOrderNo;
	
	@OpenApiField(desc = "退款状态", constraint = "{\"data\":[\"SUCCESS:退款成功\",\"FAIL:退款失败\",\"PROCESSING:处理中\"],\"name\":\"退款状态\"}", demo = "SUCCESS")
	private String refundStatus;
	
	@OpenApiField(desc = "实际退款金额", demo = "88.66")
	private Money refundAmount;
	
	@OpenApiField(desc = "处理描述", demo = "退款成功")
	private String message;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getRefundStatus() {
		return refundStatus;
	}
	
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	
	public Money getRefundAmount() {
		return refundAmount;
	}
	
	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}
