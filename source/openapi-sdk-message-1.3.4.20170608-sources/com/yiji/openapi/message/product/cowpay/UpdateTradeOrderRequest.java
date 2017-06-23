package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Jason Ma on 2015/4/18.
 */
@OpenApiMessage(service = "updateTradeOrder", type = ApiMessageType.Request)
public class UpdateTradeOrderRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易金额")
	private Money amount;
	
	@OpenApiField(desc = "描述")
	private String memo;
	
	@OpenApiField(desc = "单据号")
	private String documentsNo;
	
	@OpenApiField(desc = "附件地址")
	private String attachmentUrl;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getDocumentsNo() {
		return documentsNo;
	}
	
	public void setDocumentsNo(String documentsNo) {
		this.documentsNo = documentsNo;
	}
	
	public String getAttachmentUrl() {
		return attachmentUrl;
	}
	
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}
}
