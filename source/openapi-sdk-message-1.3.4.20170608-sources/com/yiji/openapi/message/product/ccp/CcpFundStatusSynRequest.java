/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月23日 下午4:15:37 创建
 */
package com.yiji.openapi.message.product.ccp;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.ccp.info.OpenApiEasyReleaseMortgageFundInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月23日
 */
@OpenApiMessage(service = "ccpFundStatusSyn", type = ApiMessageType.Request)
public class CcpFundStatusSynRequest extends ApiRequest {
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "20160323022055094794")
	private String outOrderNo;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "融资订单号", constraint = "融资订单号", demo = "20160323022055094794")
	private String bizNo;
	
	@NotNull
	@OpenApiField(desc = "所处阶段", constraint = "所处阶段", demo = "BEFORE_LOAN_FEE")
	private String synchFundPhase;
	
	@NotNull
	@OpenApiField(desc = "转账记录信息", constraint = "转账记录信息", demo = "")
	private List<OpenApiEasyReleaseMortgageFundInfo> fundInfos;
	
	@Length(max = 64)
	@OpenApiField(desc = "借款人易极付用户ID", constraint = "借款人易极付用户ID", demo = "20160323022055094794")
	private String userId;
	
	@Length(max = 64)
	@OpenApiField(desc = "借款人姓名", constraint = "借款人姓名", demo = "张三")
	private String userName;
	
	@Length(max = 64)
	@OpenApiField(desc = "借款人资金账号", constraint = "借款人资金账号", demo = "20160320111544")
	private String accountNo;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getBizNo() {
		return this.bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getSynchFundPhase() {
		return this.synchFundPhase;
	}
	
	public void setSynchFundPhase(String synchFundPhase) {
		this.synchFundPhase = synchFundPhase;
	}
	
	public List<OpenApiEasyReleaseMortgageFundInfo> getFundInfos() {
		return this.fundInfos;
	}
	
	public void setFundInfos(List<OpenApiEasyReleaseMortgageFundInfo> fundInfos) {
		this.fundInfos = fundInfos;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}
