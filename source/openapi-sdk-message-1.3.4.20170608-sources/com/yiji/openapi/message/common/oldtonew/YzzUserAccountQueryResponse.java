package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-19<br>
 */
@OpenApiMessage(service = "yzzUserAccountQuery", type = ApiMessageType.Response)
public class YzzUserAccountQueryResponse extends ApiResponse {

	@OpenApiField(desc = "用户id", demo = "12345679801324567890")
	private String userId;

	@OpenApiField(desc = "邮箱", demo = "someone@yiji.com")
	private String email;

	@OpenApiField(desc = "用户名", demo = "yijifu001")
	private String userName;

	@OpenApiField(desc = "真实姓名", demo = "易极付")
	private String realName;

	@OpenApiField(desc = "用户状态", demo = "快速注册用户")
	private String userStatus;

	@OpenApiField(desc = "认证状态", demo = "已认证")
	private String certifyStatus;

	@OpenApiField(desc = "运行状态", demo = "账户被冻结")
	private String runtimeStatus;

	@OpenApiField(desc = "地址", demo = "重庆市渝北区黄山大道")
	private String address;

	@OpenApiField(desc = "手机", demo = "1352398xxxx")
	private String mobile;

	@OpenApiField(desc = "省份", demo = "重庆市")
	private String province;

	@OpenApiField(desc = "城市", demo = "重庆市")
	private String city;

	//账户总余额(账户所有金额，包括可用的和冻结的)
	@OpenApiField(desc = "账户总余额", demo = "0.99")
	private String balance;
	//可用余额
	@OpenApiField(desc = "可用余额", demo = "0.01")
	private String availableBalance;
	//冻结余额
	@OpenApiField(desc = "冻结余额", demo = "0.98")
	private String freezeBalance;

	public String getUserId() {

		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getCertifyStatus() {
		return certifyStatus;
	}

	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}

	public String getRuntimeStatus() {
		return runtimeStatus;
	}

	public void setRuntimeStatus(String runtimeStatus) {
		this.runtimeStatus = runtimeStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getFreezeBalance() {
		return freezeBalance;
	}

	public void setFreezeBalance(String freezeBalance) {
		this.freezeBalance = freezeBalance;
	}
}
