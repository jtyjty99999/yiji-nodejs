/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午2:32:05 创建
 */
package com.yiji.openapi.message.product.ewpay;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "qftIntegratedPayment", type = ApiMessageType.Response)
public class QftIntegratedPaymentResponse extends ApiResponse {
	
	@NotBlank
	@OpenApiField(desc = "统一流水号" ,demo = "500237199008287628")
	private String gid;
	
	@OpenApiField(desc = "商户id" ,demo = "500237199008287628")
	private String parterId;
	
	@NotBlank
	@OpenApiField(desc = "渠道id" ,demo = "openapi")
	private String channelId;
	
	@NotBlank
	@OpenApiField(desc = "交易号" ,demo = "cowpayorderno1443078490480")
	private String tradeNo;
	
	@OpenApiField(desc = "商户卡号" ,demo = "12345678901234567890")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户资金帐号" ,demo = "12345678901234567890")
	private String merchantAccNo;
	
	@OpenApiField(desc = "入口编码" ,demo = "01")
	private String inlet = "01";

	@OpenApiField(desc = "请求时间" ,demo = "20160232143022")
	private Date requestDate=new Date();

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getParterId() {
		return this.parterId;
	}

	public void setParterId(String parterId) {
		this.parterId = parterId;
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getMerchantCardNo() {
		return this.merchantCardNo;
	}

	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}

	public String getMerchantAccNo() {
		return this.merchantAccNo;
	}

	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}

	public String getInlet() {
		return this.inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
	}

}
