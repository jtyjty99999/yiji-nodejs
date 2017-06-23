/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月29日 下午2:27:20 创建
 */
package com.yiji.openapi.message.product.invest;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月29日
 */
@OpenApiMessage(service = "investEntrySign", type = ApiMessageType.Notify)
public class InvestEntrySignNotify extends ApiNotify{
	
	@NotBlank
	@Length(max=40)
	@OpenApiField(desc="结果状态",constraint="结果状态[success:成功,fail:失败,processing:处理中]",demo="success")
	private String status;
	
	@NotBlank
	@Length(max=256)
	@OpenApiField(desc="结果描述",constraint="结果描述",demo="处理成功")
	private String description;
	
	@NotBlank
	@Length(max=40)
	@OpenApiField(desc="结果描述",constraint="处理的业务类型[PURCHASE:申购,REDEEM:赎回,SIGN:签约,UNSIGN:解约]",demo="REDEEM")
	private String bizType;
	
	@NotBlank
	@Length(max=40)
	@OpenApiField(desc="用户id",constraint="用户id",demo="20150619010000072320")
	private String userId;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

    