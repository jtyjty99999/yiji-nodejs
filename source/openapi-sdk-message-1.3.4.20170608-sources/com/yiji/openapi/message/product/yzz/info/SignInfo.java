/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午10:16:47 创建
 */
package com.yiji.openapi.message.product.yzz.info;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class SignInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String userId;
	/**
	 * 协议类型
	 */
	@NotBlank
	private String agreementType;

	private boolean signStatus;

	/**
	 * 签订时间
	 */
	private String signDate;

	public SignInfo() {
	}

	public SignInfo(String userId, String agreementType, boolean status, String signDate) {
		this.userId = userId;
		this.agreementType = agreementType;
		this.signStatus = status;
		this.signDate = signDate;
	}

	public String getAgreementType() {
		return agreementType;
	}

	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isSignStatus() {
		return signStatus;
	}

	public void setSignStatus(boolean signStatus) {
		this.signStatus = signStatus;
	}
}

    