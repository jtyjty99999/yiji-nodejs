package com.yiji.openapi.message.product.yzz;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yzzHandRepaymentTrade", type = ApiMessageType.Response)
public class YzzHandRepaymentTradeResponse extends ApiResponse {
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	@OpenApiField(desc = "还款用户ID")
	private String userId;
	
	@OpenApiField(desc = "交易号")
	private String repaymentNo;
	
	@OpenApiField(desc = "借款交易主交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "交易状态")
	private String tradeStatus;
	
	@OpenApiField(desc = "还款总金额")
	private Money totalAmount;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRepaymentNo() {
		return repaymentNo;
	}
	
	public void setRepaymentNo(String repaymentNo) {
		this.repaymentNo = repaymentNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
