package com.yiji.openapi.message.product.easyexchange;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Jason Ma on 2015/4/28.
 */
@OpenApiMessage(service = "paymentBillV2Order", type = ApiMessageType.Request)
public class PaymentBillV2OrderRequest extends ApiRequest {
	/**
	 * 商户类型 A：特殊类型 B：一般类型
	 */
	@OpenApiField(desc = "商户类型")
	@Length(max = 10)
	private String eshopType = "A";
	
	/**
	 * 申报海关代码 8000：重庆关区 8001：重庆海关 8003：重庆机办 8005：万州海关 8006：重庆东站 8008：渝加工区
	 * 8010：寸滩水港 8011：两路空港 8013：西永综保 5349：深圳前海湾保税港区 4600：郑州关区 5100：广州海关
	 */
	@NotBlank
	@OpenApiField(desc = "申报海关代码")
	private String customsCode;
	
	/**
	 * 订单编号
	 */
	@NotBlank
	@OpenApiField(desc = "订单编号")
	@Length(max = 30)
	private String outOrderNo;
	
	/**
	 * 电商企业代码
	 */
	@NotBlank
	@OpenApiField(desc = "电商企业代码")
	@Length(max = 20)
	private String eshopEntCode;
	
	/**
	 * 电商企业名称
	 */
	@NotBlank
	@OpenApiField(desc = "电商企业名称")
	@Length(max = 100)
	private String eshopEntName;

	/**
	 * 付款人手机号
	 */
	@OpenApiField(desc = "付款人手机号")
	@Length(min = 11,max = 11)
	private String payerPhone;
	
	//===================================特殊商户必填==========================
	/**
	 * 支付人姓名
	 */
	@NotBlank
	@OpenApiField(desc = "支付人姓名")
	@Length(max = 32)
	private String payerName;
	
	/**
	 * 支付人证件类型 01：居民身份证
	 */
	@NotBlank
	@OpenApiField(desc = "支付人证件类型")
	private String payerDocType;
	
	/**
	 * 支付人证件号码
	 */
	@NotBlank
	@OpenApiField(desc = "支付人证件号码")
	@Length(max = 20)
	private String payerId;
	
	/**
	 * 货款金额币制 142：人民币 502：美元 116：日元 110：港币 303：英镑 300：欧元
	 */
	@NotBlank
	@OpenApiField(desc = "贷款币种")
	private String goodsCurrency;
	
	/**
	 * 货款金额
	 */
	@NotNull
	@OpenApiField(desc = "贷款金额")
	private Money goodsAmount;
	
	/**
	 * 税款金额币制
	 */
	@NotBlank
	@OpenApiField(desc = "税款币种")
	private String taxCurrency;
	
	/**
	 * 税款金额
	 */
	@NotNull
	@OpenApiField(desc = "税款金额")
	private Money taxAmount;
	
	/**
	 * 物流金额币制
	 */
	@NotBlank
	@OpenApiField(desc = "物流币种")
	private String freightCurrency;
	
	/**
	 * 物流金额
	 */
	@NotNull
	@OpenApiField(desc = "物流金额")
	private Money freightAmount;
	
	/**
	 * 支付交易号haob
	 */
	@NotBlank
	@OpenApiField(desc = "支付交易号")
	@Length(max = 40)
	private String tradeNo;
	
	/**
	 * 业务类型,默认为网购免税进口 I10：直购进口 I20：网购免税进口
	 */
	@OpenApiField(desc = "业务类型")
	private String bizTypeCode = "I20";
	
	/**
	 * 业务状态, 默认为申报 1：暂存 2：申报
	 */
	@OpenApiField(desc = "申报状态")
	private String appStatus = "2";
	
	/**
	 * 进出口标识 1：进口 2：出口
	 */
	@OpenApiField(desc = "进出口标示")
	private String ieType = "1";
	
	/**
	 * 备注
	 */
	@OpenApiField(desc = "备注")
	@Length(max = 255)
	private String memo;

	@NotBlank
	@OpenApiField(desc = "支付方式")
	private String paymentType;
	
	public String getEshopType() {
		
		return eshopType;
	}
	
	public void setEshopType(String eshopType) {
		this.eshopType = eshopType;
	}
	
	public String getCustomsCode() {
		return customsCode;
	}
	
	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getEshopEntCode() {
		return eshopEntCode;
	}
	
	public void setEshopEntCode(String eshopEntCode) {
		this.eshopEntCode = eshopEntCode;
	}
	
	public String getEshopEntName() {
		return eshopEntName;
	}
	
	public void setEshopEntName(String eshopEntName) {
		this.eshopEntName = eshopEntName;
	}
	
	public String getPayerName() {
		return payerName;
	}
	
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	
	public String getPayerDocType() {
		return payerDocType;
	}
	
	public void setPayerDocType(String payerDocType) {
		this.payerDocType = payerDocType;
	}
	
	public String getPayerId() {
		return payerId;
	}
	
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	
	public String getGoodsCurrency() {
		return goodsCurrency;
	}
	
	public void setGoodsCurrency(String goodsCurrency) {
		this.goodsCurrency = goodsCurrency;
	}
	
	public Money getGoodsAmount() {
		return goodsAmount;
	}
	
	public void setGoodsAmount(Money goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	
	public String getTaxCurrency() {
		return taxCurrency;
	}
	
	public void setTaxCurrency(String taxCurrency) {
		this.taxCurrency = taxCurrency;
	}
	
	public Money getTaxAmount() {
		return taxAmount;
	}
	
	public void setTaxAmount(Money taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	public String getFreightCurrency() {
		return freightCurrency;
	}
	
	public void setFreightCurrency(String freightCurrency) {
		this.freightCurrency = freightCurrency;
	}
	
	public Money getFreightAmount() {
		return freightAmount;
	}
	
	public void setFreightAmount(Money freightAmount) {
		this.freightAmount = freightAmount;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getBizTypeCode() {
		return bizTypeCode;
	}
	
	public void setBizTypeCode(String bizTypeCode) {
		this.bizTypeCode = bizTypeCode;
	}
	
	public String getAppStatus() {
		return appStatus;
	}
	
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}
	
	public String getIeType() {
		return ieType;
	}
	
	public void setIeType(String ieType) {
		this.ieType = ieType;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPayerPhone() {
		return payerPhone;
	}

	public void setPayerPhone(String payerPhone) {
		this.payerPhone = payerPhone;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
}
