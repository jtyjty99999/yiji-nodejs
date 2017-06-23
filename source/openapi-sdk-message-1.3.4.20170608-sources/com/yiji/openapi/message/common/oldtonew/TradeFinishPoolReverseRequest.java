package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-20<br>
 */
@Deprecated
@OpenApiMessage(service = "tradeFinishPoolReverse", type = ApiMessageType.Request)
public class TradeFinishPoolReverseRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "交易号", demo = "xxx")
	private String tradeNo;

	@OpenApiField(desc = "外部交易号", demo = "xxx")
	private String tradeOutBizNo;

	@Length(max = 1024)
	@OpenApiField(desc = "交易备注", demo = "备注信息")
	private String tradeMemo;

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeOutBizNo() {
		return tradeOutBizNo;
	}

	public void setTradeOutBizNo(String tradeOutBizNo) {
		this.tradeOutBizNo = tradeOutBizNo;
	}

	public String getTradeMemo() {
		return tradeMemo;
	}

	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
}
