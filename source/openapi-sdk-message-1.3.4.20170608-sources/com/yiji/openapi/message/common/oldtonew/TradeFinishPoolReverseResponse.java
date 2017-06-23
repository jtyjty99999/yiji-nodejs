package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.TradeSimpleStringInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-20<br>
 */
@Deprecated
@OpenApiMessage(service = "tradeFinishPoolReverse", type = ApiMessageType.Response)
public class TradeFinishPoolReverseResponse extends ApiResponse {

	@OpenApiField(desc = "交易号", demo = "1231232132131")
	private String tradeNo;

	@OpenApiField(desc = "外部交易号", demo = "12345908778999")
	private String tradeOutBizNo;

	@OpenApiField(desc = "子交易号", demo = "12345908778999")
	private String subTradeNo;

	@OpenApiField(desc = "返回数据", demo = "xxx")
	private String resultData;

	@OpenApiField(desc = "", demo = "12345908778999")
	private List<TradeSimpleStringInfo> info;

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

	public String getSubTradeNo() {
		return subTradeNo;
	}

	public void setSubTradeNo(String subTradeNo) {
		this.subTradeNo = subTradeNo;
	}

	public String getResultData() {
		return resultData;
	}

	public void setResultData(String resultData) {
		this.resultData = resultData;
	}

	public List<TradeSimpleStringInfo> getInfo() {
		return info;
	}

	public void setInfo(List<TradeSimpleStringInfo> info) {
		this.info = info;
	}
}
