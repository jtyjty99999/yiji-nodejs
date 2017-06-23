/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-03-30 14:55 创建
 *
 */
package com.yiji.openapi.message.common.ppm;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-03-30
 */
@OpenApiMessage(service = "redirectOpenPayAccount", type = ApiMessageType.Response)
public class OpenPayAccountResponse extends ApiResponse {

	@NotBlank
	@OpenApiField(desc = "GID")
	private String gid;

	@NotBlank
	@OpenApiField(desc = "用户名")
	private String userId;

	@NotBlank
	@OpenApiField(desc = "入口")
	private String inlet;

	@NotBlank
	@OpenApiField(desc = "系统名")
	private String systemName;

	@OpenApiField(desc = "开通支付账户等级", demo = "2",constraint = "默认是2，2二类、3三类")
	private String accountLevel="2";

	@OpenApiField(desc = "是否需要标题" , demo = "1" , constraint = "移动端1：默认是，1是、0否")
	private String title="1";

	@OpenApiField(desc = "行为" , demo = "REGISTERP" , constraint = "如有特殊需求请与易极付单独商定")
	private String behavior;



	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getInlet() {
		return inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getAccountLevel() {
		return accountLevel;
	}

	public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
}
