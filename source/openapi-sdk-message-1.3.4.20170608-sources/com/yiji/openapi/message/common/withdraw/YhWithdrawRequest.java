/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 下午2:35:42 创建
 */
package com.yiji.openapi.message.common.withdraw;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "yhWithdraw", type = ApiMessageType.Request)
public class YhWithdrawRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 32)
	@OpenApiField(desc = "会员卡号")
	private String cardNo;
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "操作员登陆ID")
	private String loginId;
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "提现类型")
	private String type;
	
	public String getLoginId() {
		return loginId;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
}
