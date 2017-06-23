/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月7日 下午2:58:03 创建
 */
package com.yiji.openapi.message.common.query.info;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月7日
 */

public class OpenApiIntegrateQuotaInfo {
	@Length(max = 20)
	@OpenApiField(desc = "会员ID", constraint = "会员ID", demo = "20150817010007217971")
	private String userId;
	
	@Length(max = 1)
	@OpenApiField(desc = "用户类型", constraint = "用户类型[P:个人,B:企业]", demo = "B")
	private String userType;
	
	@Length(max = 1)
	@OpenApiField(desc = "用户状态", constraint = "用户状态[W:未激活,Q:快速注册用户,T:正常用户]", demo = "W")
	private String userStatus;
	
	@Length(max = 1)
	@OpenApiField(desc = "用户运行时状态", constraint = "用户运行时状态[B:冻结,C:注销,T:正常]", demo = "B")
	private String runtimeStatus;
	
	@Length(max = 10)
	@OpenApiField(desc = "认证指示", constraint = "认证指示[NONE:无需认证,QUICK:需弱实名（公安部或银行认证）,NORMAL:需正常实名（上传证件照）,UPDATE:需更新证件日期,PROCESSING:认证中]", demo = "PROCESSING")
	private String certifyIndicate;
	
	@Length(max = 10)
	@OpenApiField(desc = "要素状态", constraint = "要素状态[COMPLETE:要素齐全,INCOMPLETE:要素不全,PROCESSING:审核中]", demo = "INCOMPLETE")
	private String elementStatus;
	
	@Length(max = 20)
	@OpenApiField(desc = "国籍", constraint = "国籍", demo = "INCOMPLETE")
	private String country;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getRuntimeStatus() {
		return this.runtimeStatus;
	}

	public void setRuntimeStatus(String runtimeStatus) {
		this.runtimeStatus = runtimeStatus;
	}

	public String getCertifyIndicate() {
		return this.certifyIndicate;
	}

	public void setCertifyIndicate(String certifyIndicate) {
		this.certifyIndicate = certifyIndicate;
	}

	public String getElementStatus() {
		return this.elementStatus;
	}

	public void setElementStatus(String elementStatus) {
		this.elementStatus = elementStatus;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

    