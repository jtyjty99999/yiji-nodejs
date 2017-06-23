package com.yiji.openapi.message.product.ccp;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "stuCreditAmountApply", type = ApiMessageType.Notify)
public class StuCreditAmountApplyNotify extends ApiNotify {
	
	@OpenApiField(desc = "申请人ID")
	private String borrowerId;
	
	@OpenApiField(desc = "申请流水号")
	private String creditAmountApplicationNo;
	
	@OpenApiField(desc = "外部流水")
	private String outBizNo;
	
	@OpenApiField(desc = "申请状态")
	private String creditAmountStatus;
	
	@OpenApiField(desc = "批准的信用额度")
	private Money creditAmount;
	
	@OpenApiField(desc = "有效期")
	private Date expirationDate;
	
	public String getBorrowerId() {
		return borrowerId;
	}
	
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getCreditAmountStatus() {
		return creditAmountStatus;
	}
	
	public void setCreditAmountStatus(String creditAmountStatus) {
		this.creditAmountStatus = creditAmountStatus;
	}
	
	public Money getCreditAmount() {
		return creditAmount;
	}
	
	public void setCreditAmount(Money creditAmount) {
		this.creditAmount = creditAmount;
	}
	
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String getCreditAmountApplicationNo() {
		return creditAmountApplicationNo;
	}
	
	public void setCreditAmountApplicationNo(String creditAmountApplicationNo) {
		this.creditAmountApplicationNo = creditAmountApplicationNo;
	}
}
