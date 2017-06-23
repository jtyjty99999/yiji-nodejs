/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月29日 下午2:26:12 创建
 */
package com.yiji.openapi.message.product.invest;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月29日
 */
@OpenApiMessage(service = "investEntryUnSign", type = ApiMessageType.Response)
public class InvestEntryUnSignResponse extends ApiResponse {

	@NotBlank
	@OpenApiField(desc = "gid", constraint = "gid")
	private String gid;

	@OpenApiField(desc = "入口编码", constraint = "入口编码")
	private String inlet = "01";

	@NotBlank
	@OpenApiField(desc = "平台标识", constraint = "由升财宝对每个外部商户定义一个唯一的标识符，<br>同步给外部商户，<br>再由外部商户传进来", demo = "QiFu")
	private String platformType;

	@NotBlank
	@OpenApiField(desc = "用户id", constraint = "用户id", demo = "20150619010000072320")
	private String userId;

	@OpenApiField(desc = "操作员id", constraint = "操作员id", demo = "20150619010000072320")
	private String operatorId;

	@NotBlank
	@OpenApiField(desc = "系统时间", constraint = "格式：yyyy-MM-dd HH:mm:ss", demo = "2015-12-29 15:02:56")
	private String systemTime;

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getInlet() {
		return this.inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
	}

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

	public String getSystemTime() {
		return this.systemTime;
	}

	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}

}
