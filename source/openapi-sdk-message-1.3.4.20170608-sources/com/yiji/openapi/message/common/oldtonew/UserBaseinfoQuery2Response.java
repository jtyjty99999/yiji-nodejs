/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月17日 下午1:51:14 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.message.common.oldtonew.info.OpenApiUserBaseInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年11月17日
 */
@OpenApiMessage(service = "userBaseinfoQuery2", type = ApiMessageType.Response)
public class UserBaseinfoQuery2Response extends ApiResponse{
	
	/** 用户基本信息 */
	@OpenApiField(desc="用户基本信息",constraint="用户基本信息",demo="\"resultData\":\"{\"balance\":\"0.00\",\"createDate\":\"1376885116000\",\"outUserId\":\"9480094\",\"realName\":\"open_uti03bdz\",\"unbalance\":\"0.00\",\"userId\":\"20130310bj8719393487\",\"userName\":\"zbj:19393487\",\"userStatus\":\"created\"}")
	private OpenApiUserBaseInfo resultData ;

	public OpenApiUserBaseInfo getResultData() {
		return this.resultData;
	}

	public void setResultData(OpenApiUserBaseInfo resultData) {
		this.resultData = resultData;
	}
	
}