package com.yiji.openapi.message.common.oldtonew;

import java.util.LinkedList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.common.oldtonew.info.TradePoolSubTansferInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-28<br>
 */
@Deprecated
@OpenApiMessage(service = "tradePoolPay", type = ApiMessageType.Request)
public class TradePoolPayRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "交易号", demo = "123213123213213")
	private String tradeNo;

	@OpenApiField(desc = "交易备注", demo = "备注信息")
	@Length(max = 1024)
	private String tradeMemo;

	@OpenApiField(desc="集资交易子列表",demo="[交易1，交易2，交易3]")
	private List<TradePoolSubTansferInfo> subOrders = new LinkedList<TradePoolSubTansferInfo>();

	@Length(max = 64)
	@OpenApiField(desc = "交易名称", demo = "xxx")
	private String tradeName;

	@OpenApiField(desc = "付款人会员号", demo = "32423894023234234423")
	private String payerUserId;

	@OpenApiField(desc = "交易金额", demo = "1200.00")
	private String tradeAmount;

	@OpenApiField(desc = "UI风格", demo = "PC_NORMAL")
	private String uiStyle;

	@OpenApiField(desc = "xxx", demo = "xxx")
	private String tradePoolSubTansferOrders;

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeMemo() {
		return tradeMemo;
	}

	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public List<TradePoolSubTansferInfo> getSubOrders() {
		return subOrders;
	}

	public void setSubOrders(List<TradePoolSubTansferInfo> subOrders) {
		this.subOrders = subOrders;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getPayerUserId() {
		return payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getUiStyle() {
		return uiStyle;
	}

	public void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
	}

	public String getTradePoolSubTansferOrders() {
		return tradePoolSubTansferOrders;
	}

	public void setTradePoolSubTansferOrders(String tradePoolSubTansferOrders) {
		this.tradePoolSubTansferOrders = tradePoolSubTansferOrders;
	}
}
