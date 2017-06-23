package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-19<br>
 */
@OpenApiMessage(service = "bankCodeBinding.addInfo", type = ApiMessageType.Request)
public class BankCodeBindingAddInfoRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "用户ID", demo = "12346579801234567980")
	private String userId;

	@NotNull
	@OpenApiField(desc = "银行卡号", demo = "62177890xxxx8763")
	private String bankCardNo;

	@OpenApiField(desc = "银行联行号", demo = "308653018163")
	private String bankKey;

	@NotNull
	@OpenApiField(desc = "银行类型", demo = "ICBC")
	private String bankType;

	@OpenApiField(desc = "开户人姓名", demo = "张*")
	private String name;

	@OpenApiField(desc = "开户人证件类型", demo = "PASSPORT")
	private String certType;

	@OpenApiField(desc = "证件号", demo = "50010119740318xxxx")
	private String certNo;

	@OpenApiField(desc = "省份", demo = "黑龙江")
	private String province;

	@OpenApiField(desc = "城市", demo = "哈尔滨")
	private String city;

	@OpenApiField(desc = "详细地址", demo = "江北区糖厂社区2468号")
	private String address;

	@OpenApiField(
			desc = "银行卡类型",
			constraint = "{\"name\":\"银行卡类型\",\"data\":"
						 + "[\"DEBIT_CARD:借记卡\","
						 + "\"CREDIT_CARD:信用卡\","
						 + "\"VISA:visa卡\","
						 + "\"MASTER:master卡\""
						 + "]}",
			demo = "DEBIT_CARD")
	private String bankCardType;

	@OpenApiField(
			desc = "银行账户类型",
			constraint = "{\"name\":\"银行账户类型\",\"data\":"
						 + "[\"PUBLIC:对公\","
						 + "\"PERSONAL:对私\""
						 + "]}",
			demo = "PERSONAL")
	private String bankAccountType;

	@OpenApiField(
			desc = "性别",
			constraint = "{\"name\":\"性别\",\"data\":"
						 + "[\"M:男性\","
						 + "\"F:女性\","
						 + "\"U:未知\""
						 + "]}",
			demo = "M")
	private String gender;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankKey() {
		return bankKey;
	}

	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
