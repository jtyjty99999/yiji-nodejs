package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-28<br>
 */
@Deprecated
@OpenApiMessage(service = "mobileBind", type = ApiMessageType.Response)
public class TradePoolPayResponse extends ApiResponse {

	@OpenApiField(desc = "", demo = "")
	private String gid;

	@OpenApiField(desc = "订单", demo = "xxx")
	private String order;

	@OpenApiField(desc = "交易号", demo = "2332434324324323")
	private String tradeNo;

	@OpenApiField(desc = "渠道id", demo = "xxx")
	private String channelId;

	@OpenApiField(desc = "交易金额", demo = "1200.00")
	private String money;

	@OpenApiField(desc = "付款人会员id", demo = "234823094832094")
	private String payerUserId;

	@OpenApiField(desc = "UI风格", demo = "PC_NORMAL")
	private String uiStyle;

	@OpenApiField(desc = "入口", demo = "01")
	private String inlet;

	@OpenApiField(desc = "商户卡号", demo = "213123213213123")
	private String merchantCardNo;

	@OpenApiField(desc = "商户账户号", demo = "213123213213123")
	private String merchantAccNo;

	@OpenApiField(desc = "url地址", demo = "http://www.yiji.com")
	private String url;

	@OpenApiField(desc = "视图名称", demo = "demo.vm")
	private String viewName;

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getPayerUserId() {
		return payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getUiStyle() {
		return uiStyle;
	}

	public void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
}
