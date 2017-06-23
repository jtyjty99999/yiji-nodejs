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

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author mayansen
 * 
 */
@OpenApiMessage(service = "ppmNewWithdraw", type = ApiMessageType.Request)
public class PpmWithdrawRequest extends ApiRequest {
	
	@Size(max = 20)
	@NotBlank(message = "外部订单号不能为空！")
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@Size(max = 20)
	@NotBlank(message = "userId不能为空！")
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@Size(max = 200)
	@OpenApiField(desc = "银行卡信息")
	private String cardInfos;
	
	@Size(max = 50)
	@OpenApiField(desc = "业务类型")
	private String bizType;
	
	@Size(max = 10)
	@OpenApiField(desc = "是否需要绑卡")
	private String needBindCard;
	
	/**
	 * @return the outOrderNo
	 */
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	/**
	 * @param outOrderNo the outOrderNo to set
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCardInfos() {
		return cardInfos;
	}
	
	public void setCardInfos(String cardInfos) {
		this.cardInfos = cardInfos;
	}
	
	public String getBizType() {
		return bizType;
	}
	
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	
	public String getNeedBindCard() {
		return needBindCard;
	}
	
	public void setNeedBindCard(String needBindCard) {
		this.needBindCard = needBindCard;
	}
}
