/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月25日 上午10:33:38 创建
 */
package com.yiji.openapi.message.product.easyexchange;

import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "singlePaymentUpload", type = ApiMessageType.Request)
public class SinglePaymentUploadRequest extends ApiRequest {
	
	@OpenApiField(desc = "支付单业务类型编码", constraint = "支付单业务类型编码,默认为SPECIAL", demo = "NORMAL")
	private String orderFlowType;
	
	@OpenApiField(desc = "电商平台企业名称", constraint = "电商平台企业名称", demo = "易极付")
	private String eplatEntName;
	
	@OpenApiField(desc = "电商平台企业编码", constraint = "电商平台在海关的备案编号或代码", demo = "Q001")
	private String eplatEntCode;
	
	@NotBlank
	@OpenApiField(desc = "电商商户企业名称", constraint = "商户在海关备案时填写的名称", demo = "淘宝网")
	private String eshopEntName;
	
	@NotBlank
	@OpenApiField(desc = "电商商户企业代码", constraint = "商户在海关的备案编号或代码；其中宁波海关填电商的组织机构代码", demo = "Q001")
	private String eshopEntCode;
	
	@NotNull
	@OpenApiField(desc = "申报海关代码", constraint = "申报海关代码", demo = "CQ_8000")
	private String customsCode;
	
	@NotBlank
	@Length(max = 30)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "156772595")
	private String outOrderNo;
	
	@NotEmpty
	@Size(min = 1, max = 3)
	@OpenApiField(desc = "支付交易号", constraint = "支付交易号，也叫交易流水号，数组方式传递；数组内元素个数至少为1，不能超过3个",
			demo = "{\"20151125000002637903\"}")
	private Set<String> tradeNo;
	
	@OpenApiField(desc = "支付方式", constraint = "支付方式", demo = "ALIPAY")
	private String paymentType;
	
	@NotBlank
	@OpenApiField(desc = "支付人证件类型", constraint = "支付人证件类型", demo = "Identity_Card")
	private String payerDocType;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "支付人证件号码", constraint = "支付人证件号码", demo = "500221196512192013")
	private String payerId;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "支付人姓名", constraint = "支付人姓名", demo = "张三")
	private String payerName;
	
	@OpenApiField(desc = "进口业务类型", constraint = "进口业务类型,重庆海关不能为空", demo = "DIRECT_IMPORT")
	private String bizTypeCode;
	
	@NotBlank
	@OpenApiField(desc = "货款币种", constraint = "货款币种", demo = "CNY")
	private String goodsCurrency;
	
	@NotNull
	@OpenApiField(desc = "货款金额", constraint = "货款金额", demo = "6.66")
	private Money goodsAmount;
	
	@NotBlank
	@OpenApiField(desc = "税款币种", constraint = "税款币种", demo = "CNY")
	private String taxCurrency;
	
	@NotNull
	@OpenApiField(desc = "税款金额", constraint = "税款金额", demo = "6.66")
	private Money taxAmount;
	
	@NotBlank
	@OpenApiField(desc = "物流币种", constraint = "物流币种", demo = "CNY")
	private String freightCurrency;
	
	@NotNull
	@OpenApiField(desc = "物流金额", constraint = "物流金额", demo = "6.66")
	private Money freightAmount;
	
	@OpenApiField(desc = "业务类型", constraint = "业务类型，深圳海关必填", demo = "STORE")
	private String appStatus;
	
	@OpenApiField(desc = "进出口标示", constraint = "进出口标示，郑州海关必填 ", demo = "IMPORT")
	private String ieType;
	
	@OpenApiField(desc = "业务交易类型", constraint = "业务交易类型，广州海关必填 ", demo = "OTHER_PORT")
	private String bizTransType;
	
	/**
	 * 电商平台代码（国检平台）：电商平台在广州南沙智检平台或广州单一窗口备案的编号
	 * */
	@OpenApiField(desc = "电商平台代码(国检平台)", constraint = "电商平台在广州南沙智检平台或广州单一窗口备案的编号", demo = "562568412354")
	private String eplatCodeForNgct;
	
	/**
	 * 电商企业代码（国检平台）：清关的电商企业在广州南沙智检平台或广州单一窗口备案的编号，以后会广州海关必填
	 * */
	@OpenApiField(desc = "电商企业代码（国检平台）", demo = "231461253", constraint = "清关的电商企业在广州南沙智检平台或广州单一窗口备案的编号,广州海关必填")
	private String eEntCodeForNgct;
	/**
	 * 电商平台互联网域名:清关电商企业的互联网域名，以后会广州海关必填
	 * */
	@OpenApiField(demo = "1546165431253", desc = "电商平台互联网域名", constraint = "清关电商企业的互联网域名,广州海关必填")
	private String eplatDNS;
	
	/**
	 * 国检 编码（广州必填） 000069 南沙局本部 442301 广州机场综保办 说明：对应海关的国检机构的代码，以后会广州海关必填
	 */
	@OpenApiField(desc = "国检编码", constraint = "广州海关必填", demo = "000069")
	private String ngtcCode;
	
	@OpenApiField(desc = "保费", constraint = "重庆海关必填", demo = "50000")
	private Money premiumAmount;
	
	@OpenApiField(desc = "币种", constraint = "重庆海关必填，目前只支持人民币", demo = "CNY")
	private String premiumCurrency;
	
	/**
	 * 操作类型(添加、修改、删除)
	 */
	
	@OpenApiField(desc = "操作类型", constraint = "默认值是增加", demo = "ADD")
	private String operationType;
	
	public String getOperationType() {
		return operationType;
	}
	
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	
	public String getOrderFlowType() {
		return this.orderFlowType;
	}
	
	public void setOrderFlowType(String orderFlowType) {
		this.orderFlowType = orderFlowType;
	}
	
	public String getEplatEntName() {
		return this.eplatEntName;
	}
	
	public void setEplatEntName(String eplatEntName) {
		this.eplatEntName = eplatEntName;
	}
	
	public String getEplatEntCode() {
		return this.eplatEntCode;
	}
	
	public void setEplatEntCode(String eplatEntCode) {
		this.eplatEntCode = eplatEntCode;
	}
	
	public String getEshopEntName() {
		return this.eshopEntName;
	}
	
	public void setEshopEntName(String eshopEntName) {
		this.eshopEntName = eshopEntName;
	}
	
	public String getEshopEntCode() {
		return this.eshopEntCode;
	}
	
	public void setEshopEntCode(String eshopEntCode) {
		this.eshopEntCode = eshopEntCode;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public Set<String> getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(Set<String> tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPayerDocType() {
		return this.payerDocType;
	}
	
	public void setPayerDocType(String payerDocType) {
		this.payerDocType = payerDocType;
	}
	
	public String getPayerId() {
		return this.payerId;
	}
	
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	
	public String getPayerName() {
		return this.payerName;
	}
	
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	
	public String getBizTypeCode() {
		return this.bizTypeCode;
	}
	
	public void setBizTypeCode(String bizTypeCode) {
		this.bizTypeCode = bizTypeCode;
	}
	
	public String getGoodsCurrency() {
		return this.goodsCurrency;
	}
	
	public void setGoodsCurrency(String goodsCurrency) {
		this.goodsCurrency = goodsCurrency;
	}
	
	public Money getGoodsAmount() {
		return this.goodsAmount;
	}
	
	public void setGoodsAmount(Money goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	
	public String getTaxCurrency() {
		return this.taxCurrency;
	}
	
	public void setTaxCurrency(String taxCurrency) {
		this.taxCurrency = taxCurrency;
	}
	
	public Money getTaxAmount() {
		return this.taxAmount;
	}
	
	public void setTaxAmount(Money taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	public String getFreightCurrency() {
		return this.freightCurrency;
	}
	
	public void setFreightCurrency(String freightCurrency) {
		this.freightCurrency = freightCurrency;
	}
	
	public Money getFreightAmount() {
		return this.freightAmount;
	}
	
	public void setFreightAmount(Money freightAmount) {
		this.freightAmount = freightAmount;
	}
	
	public String getAppStatus() {
		return this.appStatus;
	}
	
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}
	
	public String getIeType() {
		return this.ieType;
	}
	
	public void setIeType(String ieType) {
		this.ieType = ieType;
	}
	
	public String getBizTransType() {
		return this.bizTransType;
	}
	
	public void setBizTransType(String bizTransType) {
		this.bizTransType = bizTransType;
	}
	
	public String getCustomsCode() {
		return customsCode;
	}
	
	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public String getEplatCodeForNgct() {
		return eplatCodeForNgct;
	}
	
	public void setEplatCodeForNgct(String eplatCodeForNgct) {
		this.eplatCodeForNgct = eplatCodeForNgct;
	}
	
	public String geteEntCodeForNgct() {
		return eEntCodeForNgct;
	}
	
	public void seteEntCodeForNgct(String eEntCodeForNgct) {
		this.eEntCodeForNgct = eEntCodeForNgct;
	}
	
	public String getEplatDNS() {
		return eplatDNS;
	}
	
	public void setEplatDNS(String eplatDNS) {
		this.eplatDNS = eplatDNS;
	}
	
	public String getNgtcCode() {
		return ngtcCode;
	}
	
	public void setNgtcCode(String ngtcCode) {
		this.ngtcCode = ngtcCode;
	}
	
	public Money getPremiumAmount() {
		return premiumAmount;
	}
	
	public void setPremiumAmount(Money premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	public String getPremiumCurrency() {
		return premiumCurrency;
	}
	
	public void setPremiumCurrency(String premiumCurrency) {
		this.premiumCurrency = premiumCurrency;
	}
}
