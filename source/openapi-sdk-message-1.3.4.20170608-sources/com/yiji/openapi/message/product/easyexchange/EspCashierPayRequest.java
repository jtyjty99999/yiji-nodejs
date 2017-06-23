package com.yiji.openapi.message.product.easyexchange;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.easyexchange.infos.WkGoodsInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "espCashierPay", type = ApiMessageType.Request)
public class EspCashierPayRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "外部商户流水号")
	private String outOrderNo;
	
	@NotEmpty
	@Length(max = 200)
	@OpenApiField(desc = "收货地址城市")
	private String shipToCity;
	
	@NotEmpty
	@OpenApiField(desc = "收货地址国家简码")
	private String shipToCountry;
	
	@NotEmpty
	@Length(max = 60)
	@OpenApiField(desc = "收货人姓")
	private String shipToFirstName;
	
	@NotEmpty
	@Length(max = 60)
	@OpenApiField(desc = "收货人名")
	private String shipToLastName;
	
	@NotEmpty
	@Length(max = 100)
	@OpenApiField(desc = "收货人电子邮箱")
	private String shipToEmail;
	
	@Length(max = 30)
	@OpenApiField(desc = "收货人电话")
	private String shipToPhoneNumber;
	
	@NotEmpty
	@Length(max = 30)
	@OpenApiField(desc = "收货人邮编")
	private String shipToPostalCode;
	
	@NotEmpty
	@Length(max = 200)
	@OpenApiField(desc = "收货人州")
	private String shipToState;
	
	@NotEmpty
	@Length(max = 255)
	@OpenApiField(desc = "收货地址一")
	private String shipToStreet1;
	
	@OpenApiField(desc = "物流费")
	private Money logisticsFee;
	
	@OpenApiField(desc = "物流方式")
	private String logisticsMode;
	
	@NotNull
	@OpenApiField(desc = "货物信息")
	private List<WkGoodsInfo> wkGoodsInfoList;
	
	@NotEmpty
	@Length(max = 200)
	@OpenApiField(desc = "所属网站")
	private String webSite;
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "客户email")
	private String customerEmail;
	
	@NotEmpty
	@OpenApiField(desc = "客户手机号")
	private String customerPhoneNumber;
	
	@Length(max = 40)
	@OpenApiField(desc = "商户邮箱(收款方)")
	private String merchantEmail;
	
	@Length(max = 60)
	@OpenApiField(desc = "商户名")
	private String merchantName;
	
	@NotNull
	@OpenApiField(desc = "交易金额")
	private Money amountLoc;
	
	@NotBlank
	@OpenApiField(desc = "币种")
	private String currencyCode;
	
	@NotBlank
	@OpenApiField(desc = "支付类型")
	private String orderType;
	
	@NotEmpty
	@OpenApiField(desc = "收银台页面类型", constraint = "skip/embed")
	private String espCashierType;
	
	@OpenApiField(desc = "备注")
	private String remark;
	
	@Length(max = 50)
	@OpenApiField(desc = "设备指纹")
	private String deviceFingerprintId;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getShipToCity() {
		return shipToCity;
	}
	
	public void setShipToCity(String shipToCity) {
		this.shipToCity = shipToCity;
	}
	
	public String getShipToCountry() {
		return shipToCountry;
	}
	
	public void setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
	}
	
	public String getShipToFirstName() {
		return shipToFirstName;
	}
	
	public void setShipToFirstName(String shipToFirstName) {
		this.shipToFirstName = shipToFirstName;
	}
	
	public String getShipToLastName() {
		return shipToLastName;
	}
	
	public void setShipToLastName(String shipToLastName) {
		this.shipToLastName = shipToLastName;
	}
	
	public String getShipToEmail() {
		return shipToEmail;
	}
	
	public void setShipToEmail(String shipToEmail) {
		this.shipToEmail = shipToEmail;
	}
	
	public String getShipToPhoneNumber() {
		return shipToPhoneNumber;
	}
	
	public void setShipToPhoneNumber(String shipToPhoneNumber) {
		this.shipToPhoneNumber = shipToPhoneNumber;
	}
	
	public String getShipToPostalCode() {
		return shipToPostalCode;
	}
	
	public void setShipToPostalCode(String shipToPostalCode) {
		this.shipToPostalCode = shipToPostalCode;
	}
	
	public String getShipToState() {
		return shipToState;
	}
	
	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}
	
	public String getShipToStreet1() {
		return shipToStreet1;
	}
	
	public void setShipToStreet1(String shipToStreet1) {
		this.shipToStreet1 = shipToStreet1;
	}
	
	public Money getLogisticsFee() {
		return logisticsFee;
	}
	
	public void setLogisticsFee(Money logisticsFee) {
		this.logisticsFee = logisticsFee;
	}
	
	public String getLogisticsMode() {
		return logisticsMode;
	}
	
	public void setLogisticsMode(String logisticsMode) {
		this.logisticsMode = logisticsMode;
	}
	
	public List<WkGoodsInfo> getWkGoodsInfoList() {
		return wkGoodsInfoList;
	}
	
	public void setWkGoodsInfoList(List<WkGoodsInfo> wkGoodsInfoList) {
		this.wkGoodsInfoList = wkGoodsInfoList;
	}
	
	public String getWebSite() {
		return webSite;
	}
	
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public String getMerchantEmail() {
		return merchantEmail;
	}
	
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	
	public String getMerchantName() {
		return merchantName;
	}
	
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	
	public Money getAmountLoc() {
		return amountLoc;
	}
	
	public void setAmountLoc(Money amountLoc) {
		this.amountLoc = amountLoc;
	}
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	public String getOrderType() {
		return orderType;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getEspCashierType() {
		return espCashierType;
	}
	
	public void setEspCashierType(String espCashierType) {
		this.espCashierType = espCashierType;
	}
	
	public String getDeviceFingerprintId() {
		return deviceFingerprintId;
	}
	
	public void setDeviceFingerprintId(String deviceFingerprintId) {
		this.deviceFingerprintId = deviceFingerprintId;
	}
}