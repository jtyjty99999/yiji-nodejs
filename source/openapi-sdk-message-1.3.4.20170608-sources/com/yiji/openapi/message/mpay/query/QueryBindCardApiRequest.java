package com.yiji.openapi.message.mpay.query;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 查询绑卡信息 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "queryBindCard", type = ApiMessageType.Request)
public class QueryBindCardApiRequest extends ApiRequest {
	
	@Length(max = 64)
	@OpenApiField(desc = "外部商户会员id",demo = "12345679801234567890")
	private String partnerUserId;
	
	/** 移动设备号 */
	@Length(max = 200)
	@OpenApiField(desc = "设备id",demo = "1235642345")
	private String deviceId;
	
	@OpenApiField(desc = "买家id",demo = "12345678901234569870")
	private String buyerUserId;
	@OpenApiField(desc = "交易号",demo = "1234653214568456")
	private String tradeNo;
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPartnerUserId() {
		return partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}
