package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-29<br>
 */
@OpenApiMessage(service = "fastpayRefund", type = ApiMessageType.Response)
public class FastpayRefundResponse extends ApiResponse {

	@OpenApiField(desc = "交易号", demo = "xxx")
	private String tradeNo;

	@OpenApiField(desc = "渠道id", demo = "xxx")
	private String channelId;

	@OpenApiField(desc = "统一流水号", demo = "12399871238312312")
	private String gid;

	@OpenApiField(desc = "入口", demo = "01")
	private String inlet;

	@OpenApiField(desc = "商户卡号", demo = "xxx")
	private String merchantCardNo;

	@OpenApiField(desc = "商户账户号", demo = "xxx")
	private String merchantAccNo;

	@OpenApiField(desc = "商户用户id", demo = "xxx")
	private String merchantUserId;

	@OpenApiField(desc = "商户订单号", demo = "xxx")
	private String merchantOrderBizNo;

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

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
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
}
