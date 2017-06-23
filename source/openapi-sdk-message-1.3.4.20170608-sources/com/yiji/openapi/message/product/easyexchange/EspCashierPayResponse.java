package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "espCashierPay", type = ApiMessageType.Response)
public class EspCashierPayResponse extends ApiResponse {
	
	@OpenApiField(desc = "统一流水号")
	private String gid;
	
	@OpenApiField(desc = "收银台页面类型")
	private String espCashierType;
	
	@OpenApiField(desc = "交易码")
	private String tradeNo;
	
	@OpenApiField(desc = "支付类型")
	private String orderType;
	
	@OpenApiField(desc = "入口编码")
	private String inlet = "01";
	
	@OpenApiField(desc = "商户卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户资金帐号")
	private String merchantAccNo;
	
	@OpenApiField(desc = "商户会员ID")
	private String merchantUserId;
	
	@OpenApiField(desc = "商户外部业务ID")
	private String merchantOrderBizNo;
	
	@OpenApiField(desc = "渠道标识")
	private String channelId;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getEspCashierType() {
		return espCashierType;
	}
	
	public void setEspCashierType(String espCashierType) {
		this.espCashierType = espCashierType;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getOrderType() {
		return orderType;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getMerchantCardNo() {
		return merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccNo() {
		return merchantAccNo;
	}
	
	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}
	
	public String getMerchantUserId() {
		return merchantUserId;
	}
	
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	
	public String getMerchantOrderBizNo() {
		return merchantOrderBizNo;
	}
	
	public void setMerchantOrderBizNo(String merchantOrderBizNo) {
		this.merchantOrderBizNo = merchantOrderBizNo;
	}
	
	public String getChannelId() {
		return channelId;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
}