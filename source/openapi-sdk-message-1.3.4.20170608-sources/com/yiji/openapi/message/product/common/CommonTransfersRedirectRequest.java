/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月8日 下午1:42:05 创建
 */
package com.yiji.openapi.message.product.common;

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
 *
 */
@OpenApiMessage(service = "commonTransfersRedirect", type = ApiMessageType.Request)
public class CommonTransfersRedirectRequest extends ApiRequest{

    @NotBlank
    @Length(max = 20)
    @OpenApiField(desc = "登录名称",constraint = "会员登录名称",demo = "yijifu")
    private String loginName;
    
    @NotBlank
    @Length(max = 20)
    @OpenApiField(desc = "转账类型",constraint = "通用转账, 通用汇付",demo = "COMMON_TRANSFER")
    private String transferType;

	public String getLoginName() {
		return this.loginName;
	}


	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getTransferType() {
		return this.transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

}
