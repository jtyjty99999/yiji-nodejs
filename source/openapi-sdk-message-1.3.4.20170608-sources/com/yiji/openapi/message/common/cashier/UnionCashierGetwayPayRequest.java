package com.yiji.openapi.message.common.cashier;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.cashier.info.ProdDetailInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "unionCashierGetwayPay", type = ApiMessageType.Request)
public class UnionCashierGetwayPayRequest extends ApiRequest {
	
	@NotNull
	@Size(min = 1, max = 40)
	@OpenApiField(desc = "商品信息列表")
	private List<ProdDetailInfo> prodInfoList;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家id",demo = "20140814010000052219")
	private String buyerUserId;
	
	@OpenApiField(desc = "网关类型",demo = "NETBANK")
	private String gatewayType;
	
	@OpenApiField(desc = "样式风格",demo = "PC_NORMAL")
	private String uiStyle;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号",demo = "123456789123456")
	private String outOrderNo;
	
	@NotBlank
	@OpenApiField(desc = "银行简称",demo = "ABC")
	private String bankCode;
	
	@OpenApiField(desc = "对公对私",demo = "PERSONAL")
	private String personalCorporateType;
	
	@NotNull
	@OpenApiField(desc = "银行卡类型",demo = "DEBIT")
	private String debitCreditType;
	
	@Length(max = 20)
	@OpenApiField(desc = "买家手机号",demo = "10086100101")
	private String buyerMobile;

	public List<ProdDetailInfo> getProdInfoList() {
		return this.prodInfoList;
	}

	public void setProdInfoList(List<ProdDetailInfo> prodInfoList) {
		this.prodInfoList = prodInfoList;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getGatewayType() {
		return this.gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public String getUiStyle() {
		return this.uiStyle;
	}

	public void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getPersonalCorporateType() {
		return this.personalCorporateType;
	}

	public void setPersonalCorporateType(String personalCorporateType) {
		this.personalCorporateType = personalCorporateType;
	}

	public String getDebitCreditType() {
		return this.debitCreditType;
	}

	public void setDebitCreditType(String debitCreditType) {
		this.debitCreditType = debitCreditType;
	}

	public String getBuyerMobile() {
		return this.buyerMobile;
	}

	public void setBuyerMobile(String buyerMobile) {
		this.buyerMobile = buyerMobile;
	}
	
}
