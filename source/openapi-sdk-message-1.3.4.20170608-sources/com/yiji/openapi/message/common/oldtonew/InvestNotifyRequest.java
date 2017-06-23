/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午8:15:02 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "investNotifyApiService", type = ApiMessageType.Request)
public class InvestNotifyRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "理财产品的总额", demo = "1.11")
	private Money productAmount;

	@NotNull
	@OpenApiField(desc = "投资人本金", demo = "1.11")
	private Money amount;

	@NotBlank
	@OpenApiField(desc = "理财产品类型", demo = "小贷产品")
	private String productType;

	@NotBlank
	@OpenApiField(desc = "批次号", demo = "20160125153715587486")
	private String batchNo;

	@NotBlank
	@OpenApiField(desc = "理财渠道来源",
			constraint = "{\"data\":[\"E8:易八\",\"E9:易九\",\"FRT:房融通\",\"FUND:基金\",\"guiyin:贵银\"],\"name\":\"理财渠道来源\"}",
			demo = "E8")
	private String channelSrc;

	@NotBlank
	@OpenApiField(desc = "理财渠道投资明细ID", demo = "openapi")
	private String extId;

	@NotBlank
	@OpenApiField(desc = "通知类型",
			constraint = "{\"data\":[\"1:投资申请\",\"3:投资成功\",\"4:投资流标\",\"5:投资收益中\",\"7:已全部还款\",\"10:投资失败\"],\"name\":\"通知类型\"}",
			demo = "1")
	private String notifyType;

	@NotNull
	@OpenApiField(desc = "投资周期(以月为单位)", demo = "1")
	private int period;

	@NotBlank
	@OpenApiField(desc = "理财产品ID", demo = "454")
	private String productId;

	@NotBlank
	@OpenApiField(desc = "理财产品名称", demo = "2013款奥迪A8")
	private String productName;

	@OpenApiField(desc = "理财合同", demo = "http://www.oschina.net")
	private String contractURL;

	@OpenApiField(desc = "理财凭证（担保函）", demo = "http://www.oschina.net")
	private String receiptURL;

	@OpenApiField(desc = "理财凭证（担保合同）", demo = "http://www.oschina.net")
	private String guaranteeURL;

	@OpenApiField(desc = "收益利息", demo = "1.11")
	private Money profit;

	@NotBlank
	@OpenApiField(desc = "投资人userId", demo = "20150519020005491913")
	private String userId;

	@NotBlank
	@OpenApiField(desc = "年化率(千分比为单位)", demo = "95")
	private String annualRate;

	@OpenApiField(desc = "购买确认时间", constraint = "yyyy-MM-dd HH:mm:ss", demo = "2016-11-11 11:11:11")
	private Date confirmTime;

	@OpenApiField(desc = "还款时间", constraint = "yyyy-MM-dd HH:mm:ss", demo = "2016-11-11 11:11:11")
	private Date repaymentTime;

	@OpenApiField(desc = "还款交易订单号", demo = "1246546516235465")
	private String tradeNo;

	public Money getProductAmount() {
		return this.productAmount;
	}

	public void setProductAmount(Money productAmount) {
		this.productAmount = productAmount;
	}

	public Money getAmount() {
		return this.amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getChannelSrc() {
		return this.channelSrc;
	}

	public void setChannelSrc(String channelSrc) {
		this.channelSrc = channelSrc;
	}

	public String getExtId() {
		return this.extId;
	}

	public void setExtId(String extId) {
		this.extId = extId;
	}

	public String getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public int getPeriod() {
		return this.period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getContractURL() {
		return this.contractURL;
	}

	public void setContractURL(String contractURL) {
		this.contractURL = contractURL;
	}

	public String getReceiptURL() {
		return this.receiptURL;
	}

	public void setReceiptURL(String receiptURL) {
		this.receiptURL = receiptURL;
	}

	public String getGuaranteeURL() {
		return this.guaranteeURL;
	}

	public void setGuaranteeURL(String guaranteeURL) {
		this.guaranteeURL = guaranteeURL;
	}

	public Money getProfit() {
		return this.profit;
	}

	public void setProfit(Money profit) {
		this.profit = profit;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAnnualRate() {
		return this.annualRate;
	}

	public void setAnnualRate(String annualRate) {
		this.annualRate = annualRate;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public Date getRepaymentTime() {
		return this.repaymentTime;
	}

	public void setRepaymentTime(Date repaymentTime) {
		this.repaymentTime = repaymentTime;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
