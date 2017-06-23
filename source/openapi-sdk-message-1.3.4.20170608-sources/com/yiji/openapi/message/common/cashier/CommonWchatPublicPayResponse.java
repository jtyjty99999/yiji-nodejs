package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-11 10:51.
 */
@OpenApiMessage(service = "commonWchatPublicPay", type = ApiMessageType.Response)
public class CommonWchatPublicPayResponse extends ApiResponse {
	
	/** 返回移动端执行json 用于与微信进行交互 */
	@OpenApiField(
			desc = "微信交互JSON",
			demo = "{jsapi_appid:wxd4b88facae91ecb3;jsapi_timestamp:1452044801;jsapi_noncestr:q3O1lPYp4UMwts7I;jsapi_package:prepay_id=wx20160106094640cba3aa70f80863675142;jsapi_signtype:MD5;jsapi_paysign:809B42A22E40162045D9B0B595ABB538}")
	private String jsApiForm;
	
	/** 交易流水号 */
	@OpenApiField(desc = "交易流水号", demo = "34156015612354")
	private String tradeNo;
	
	/** 付款总金额 */
	@OpenApiField(desc = "付款总金额", demo = "88.66")
	private Money payAmount;
	
	/** 买家手续费 */
	@OpenApiField(desc = "买家手续费", demo = "88.66")
	private Money chargeAmount;
	
	public String getJsApiForm() {
		return jsApiForm;
	}
	
	public void setJsApiForm(String jsApiForm) {
		this.jsApiForm = jsApiForm;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Money getPayAmount() {
		return payAmount;
	}
	
	public void setPayAmount(Money payAmount) {
		this.payAmount = payAmount;
	}
	
	public Money getChargeAmount() {
		return chargeAmount;
	}
	
	public void setChargeAmount(Money chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
}
