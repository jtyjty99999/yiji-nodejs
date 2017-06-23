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

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 
 * 
 * @author mayansen
 * 
 */
@OpenApiMessage(service = "ppmNewWithdraw", type = ApiMessageType.Response)
public class PpmWithdrawResponse extends ApiResponse {
	
	@Length(max = 20)
	@NotBlank
	@OpenApiField(desc = "收费编码")
	private String chargeCode;
	
	@Length(max = 20)
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@Length(max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@Length(max = 20)
	@OpenApiField(desc = "gid")
	private String gid;
	
	@OpenApiField(desc = "入口编码")
	private String inlet = "01";
	
	@OpenApiField(desc = "商户会员irechargeBackApply d")
	private String merchantUserId;
	
	@OpenApiField(desc = "商户卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户资金账号")
	private String merchantAccNo;
	
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
	 * @return the chargeCode
	 */
	public String getChargeCode() {
		return chargeCode;
	}
	
	/**
	 * @param chargeCode the chargeCode to set
	 */
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	
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
	
	/**
	 * @return the gid
	 */
	public String getGid() {
		return gid;
	}
	
	/**
	 * @param gid the gid to set
	 */
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getMerchantUserId() {
		return merchantUserId;
	}
	
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	
	public String getMerchantCardNo() {
		return merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccNo() {
		return merchantAccNo;
	}
	
	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
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
