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


@OpenApiMessage(service = "espPciOrderPay", type = ApiMessageType.Request)
public class EspPciOrderPayRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "商户外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "用户的ip地址")
	private String ipAddress;
	
	@NotEmpty
	@Length(max = 200)
	@OpenApiField(desc = "账单地址城市")
	private String billToCity;
	
	@NotEmpty
	@OpenApiField(desc = "账单地址国家简码")
	private String billToCountry;
	
	@NotEmpty
	@Length(max = 200)
	@OpenApiField(desc = "账单地址州")
	private String billToState;
	
	@NotEmpty
	@Length(max = 30)
	@OpenApiField(desc = "地区邮编")
	private String billToPostalCode;
	
	@NotEmpty
	@Length(max = 100)
	@OpenApiField(desc = "账单地址用户邮箱")
	private String billToEmail;
	
	@NotEmpty
	@Length(max = 60)
	@OpenApiField(desc = "账单地址用户姓")
	private String billToFirstName;
	
	@NotEmpty
	@Length(max = 60)
	@OpenApiField(desc = "账单地址用户名")
	private String billToLastName;
	
	@NotEmpty
	@Length(max = 30)
	@OpenApiField(desc = "账单地址电话")
	private String billToPhoneNumber;
	
	@NotEmpty
	@Length(max = 255)
	@OpenApiField(desc = "账单地址街道一")
	private String billToStreet1;
	
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
	
	@NotEmpty
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
	
	@NotNull
	@OpenApiField(desc = "物流费")
	private Money logisticsFee;
	
	@NotEmpty
	@OpenApiField(desc = "物流方式")
	private String logisticsMode;
	
	@NotNull
	@OpenApiField(desc = "货物信息")
	private List<WkGoodsInfo> wkGoodsInfoList;
	
	@NotEmpty
	@Length(max = 200)
	@OpenApiField(desc = "所属网站")
	private String webSite;
	
	@NotBlank
	@OpenApiField(desc = "卡类型")
	private String cardType;
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "客户email")
	private String customerEmail;
	
	@NotEmpty
	@OpenApiField(desc = "客户手机号")
	private String customerPhoneNumber;
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "商户邮箱(收款方)")
	private String merchantEmail;
	
	@NotEmpty
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
	@OpenApiField(desc = "cardNo")
	private String cardNo;
	
	@NotEmpty
	@OpenApiField(desc = "cvv三字码")
	private String cvv;
	
	@NotEmpty
	@OpenApiField(desc = "姓")
	private String cardHolderFirstName;
	
	@NotEmpty
	@OpenApiField(desc = "名")
	private String cardHolderLastName;
	
	@NotEmpty
	@Length(max = 4, min = 4)
	@OpenApiField(desc = "过期日期")
	private String expirationDate;
	
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
	
	public String getBillToCity() {
		return billToCity;
	}
	
	public void setBillToCity(String billToCity) {
		this.billToCity = billToCity;
	}
	
	public String getBillToCountry() {
		return billToCountry;
	}
	
	public void setBillToCountry(String billToCountry) {
		this.billToCountry = billToCountry;
	}
	
	public String getBillToState() {
		return billToState;
	}
	
	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}
	
	public String getBillToPostalCode() {
		return billToPostalCode;
	}
	
	public void setBillToPostalCode(String billToPostalCode) {
		this.billToPostalCode = billToPostalCode;
	}
	
	public String getBillToEmail() {
		return billToEmail;
	}
	
	public void setBillToEmail(String billToEmail) {
		this.billToEmail = billToEmail;
	}
	
	public String getBillToFirstName() {
		return billToFirstName;
	}
	
	public void setBillToFirstName(String billToFirstName) {
		this.billToFirstName = billToFirstName;
	}
	
	public String getBillToLastName() {
		return billToLastName;
	}
	
	public void setBillToLastName(String billToLastName) {
		this.billToLastName = billToLastName;
	}
	
	public String getBillToPhoneNumber() {
		return billToPhoneNumber;
	}
	
	public void setBillToPhoneNumber(String billToPhoneNumber) {
		this.billToPhoneNumber = billToPhoneNumber;
	}
	
	public String getBillToStreet1() {
		return billToStreet1;
	}
	
	public void setBillToStreet1(String billToStreet1) {
		this.billToStreet1 = billToStreet1;
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
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
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
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getCvv() {
		return cvv;
	}
	
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	public String getCardHolderFirstName() {
		return cardHolderFirstName;
	}
	
	public void setCardHolderFirstName(String cardHolderFirstName) {
		this.cardHolderFirstName = cardHolderFirstName;
	}
	
	public String getCardHolderLastName() {
		return cardHolderLastName;
	}
	
	public void setCardHolderLastName(String cardHolderLastName) {
		this.cardHolderLastName = cardHolderLastName;
	}
	
	public String getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public String getDeviceFingerprintId() {
		return deviceFingerprintId;
	}
	
	public void setDeviceFingerprintId(String deviceFingerprintId) {
		this.deviceFingerprintId = deviceFingerprintId;
	}
}