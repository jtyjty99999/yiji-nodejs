/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * dengwei@yiji.com 2015年9月8日 下午7:56:58 创建
 */

package com.yiji.openapi.message.mpay.query;

import java.util.ArrayList;
import java.util.List;

import com.yiji.openapi.message.mpay.query.info.MpayBindCardObject;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 支付台查询绑卡列表结果
 * 
 * @author dengwei@yiji.com
 * 
 */
@OpenApiMessage(service = "mpayQueryPartnerUserInfo", type = ApiMessageType.Response)
public class QueryPartnerUserInfoResponse extends ApiResponse {
	
	/** 绑卡列表 */
	@OpenApiField(desc = "绑卡列表", demo = "")
	private List<MpayBindCardObject> cardList = new ArrayList<MpayBindCardObject>();
	
	/** 默认银行卡签约流水号 */
	@OpenApiField(desc = "默认银行卡签约流水号", demo = "Fbaska12Lf")
	private String defaultPactNo;
	
	/** 真实姓名 */
	@OpenApiField(desc = "真实姓名", demo = "张*")
	private String realName;
	
	/** 证件号码 */
	@OpenApiField(desc = "证件号码", demo = "511*************11")
	private String certNo;
	
	/** 手机号码 */
	@OpenApiField(desc = "手机号码", demo = "13800138000")
	private String mobileNo;
	
	/**
	 * 易极付用户编号（绑卡成功后有值）
	 */
	@OpenApiField(desc = "用户编号", demo = "20160211010010419914")
	private String userId;
	
	public List<MpayBindCardObject> getCardList() {
		return this.cardList;
	}
	
	public void setCardList(List<MpayBindCardObject> cardList) {
		this.cardList = cardList;
	}
	
	public String getDefaultPactNo() {
		return this.defaultPactNo;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setDefaultPactNo(String defaultPactNo) {
		this.defaultPactNo = defaultPactNo;
	}
}
