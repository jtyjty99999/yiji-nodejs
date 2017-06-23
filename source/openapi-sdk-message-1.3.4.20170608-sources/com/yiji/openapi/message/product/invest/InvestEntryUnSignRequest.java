/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月29日 下午2:25:59 创建
 */
package com.yiji.openapi.message.product.invest;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月29日
 */
@OpenApiMessage(service = "investEntryUnSign", type = ApiMessageType.Request)
public class InvestEntryUnSignRequest extends ApiRequest{
	
	@NotBlank
	@Length(max=35)
	@OpenApiField(desc="平台标识",constraint="由升财宝对每个外部商户定义一个唯一的标识符，<br>同步给外部商户，<br>再由外部商户传进来",demo="QiFu")
	private String platformType;
	
	@NotBlank
	@Length(max=40)
	@OpenApiField(desc="用户id",constraint="用户id",demo="20150619010000072320")
	private String userId;
	
	@Length(max=35)
	@OpenApiField(desc="操作员id",constraint="操作员id",demo="20150619010000072320")
	private String operatorId;

	public String getPlatformType() {
		return this.platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
}

    