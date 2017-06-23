/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午2:52:42 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "forwardConIdentify", type = ApiMessageType.Response)
public class ForwardConIdentifyResponse extends ApiResponse {

	@OpenApiField(desc = "GID", demo = "Q0060101002652016012609020672400000")
	private String gid;

	@OpenApiField(desc = "商户ID", demo = "20141230020003577146")
	private String merchantId;

	@OpenApiField(desc = "用户名", demo = "123@yiji.com")
	private String userName;

	@OpenApiField(desc = "用户类型", demo = "P")
	private String userType;

	@OpenApiField(desc = "真实姓名", demo = "张三")
	private String realName;

	@OpenApiField(desc = "证件号", demo = "500240198208164079")
	private String certNo;

	@OpenApiField(desc = "电子邮箱", demo = "abc@xxx.com")
	private String email;

	@OpenApiField(desc = "通知地址", demo = "http://www.oschina.net")
	private String notifyUrl;

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

}
