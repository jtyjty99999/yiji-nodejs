package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-27<br>
 */
@OpenApiMessage(service = "productPushApiService", type = ApiMessageType.Request)
public class ProductPushRequest extends ApiRequest {

	@OpenApiField(desc = "金额", demo = "12.00")
	private String amount;

	@OpenApiField(desc = "借款人", demo = "张三")
	private String borrower;

	@OpenApiField(desc = "产品详情url", demo = "http://www.yiji.com")
	private String detailUrl;

	@OpenApiField(desc = "周期", demo = "1")
	private String period;

	@OpenApiField(
			desc = "周期单位",
			constraint = "{\"name\":\"周期单位\",\"data\":"
						 + "[\"DAY:天\","
						 + "\"WEEK:周\","
						 + "\"MONTH:个月\","
						 + "\"YEAR:年\""
						 + "]}",
			demo = "YEAR")
	private String periodUnit;

	@OpenApiField(desc = "产品利率", demo = "0.05")
	private String yearRate;

	@NotNull
	@OpenApiField(desc = "产品id", demo = "a23423423423423")
	private String productId;

	@OpenApiField(desc = "产品名称", demo = "生财宝")
	private String productName;

	@OpenApiField(desc = "产品json数据", demo = "xxx")
	private String productJson;

	@OpenApiField(desc = "风险等级", demo = "xxx")
	private String riskRank;

	@NotNull
	@OpenApiField(
			desc = "平台类型",
			constraint = "{\"name\":\"平台类型\",\"data\":"
						 + "[\"E8:易八\","
						 + "\"E9:易九\","
						 + "\"FRT:房融通\","
						 + "\"FUND:基金\","
						 + "\"FRT:房融通\","
						 + "\"guiyin:贵银\""
						 + "]}",
			demo = "E8")
	private String sourceType;

	@OpenApiField(desc = "开始投资时间", demo = "2015-10-12 00:00")
	private String startTime;

	@OpenApiField(desc = "结束投资时间", demo = "2015-12-12 00:00")
	private String endTime;

	@NotNull
	@OpenApiField(
			desc = "状态",
			constraint = "{\"name\":\"状态\",\"data\":"
						 + "[\"-1:融资已撤销\","
						 + "\"0:等待投资\","
						 + "\"1:立即投资\","
						 + "\"2:投资已满\","
						 + "\"3:项目成立\","
						 + "\"4:已正常还款\","
						 + "\"5:投资失败\""
						 + "]}",
			demo = "2")
	private String status;

	@OpenApiField(desc = "产品类型", demo = "xxx")
	private String productType;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getDetailUrl() {
		return detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPeriodUnit() {
		return periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
	}

	public String getYearRate() {
		return yearRate;
	}

	public void setYearRate(String yearRate) {
		this.yearRate = yearRate;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductJson() {
		return productJson;
	}

	public void setProductJson(String productJson) {
		this.productJson = productJson;
	}

	public String getRiskRank() {
		return riskRank;
	}

	public void setRiskRank(String riskRank) {
		this.riskRank = riskRank;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
}

