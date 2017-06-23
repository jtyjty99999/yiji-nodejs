/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月4日 下午2:30:43 创建
 */
package com.yiji.openapi.message.product.pos;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年11月4日
 */
@OpenApiMessage(service = "posCashierOrderSync", type = ApiMessageType.Request)
public class PosCashierOrderSyncRequest extends ApiRequest {
	@NotBlank
	@Length(max = 15)
	@OpenApiField(desc = "商户编号", constraint = "商户编号", demo = "er3223432sdsd30")
	private String merchantId;
	
	@NotBlank
	@OpenApiField(desc = "终端编号", constraint = "终端编号", demo = "23454563")
	private String termId;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "2015110414340580524_YIPINHUI")
	private String outOrderNo;
	
	@Range(min = 1)
	@OpenApiField(desc = "金额", constraint = "金额", demo = "6666")
	private long amount;
	
	@OpenApiField(desc = "状态", constraint = "状态", demo = "wait")
	private String status;
	
	@NotNull
	@OpenApiField(desc = "日期", constraint = "日期", demo = "2015-11-04 12:10:10")
	private Date date;
	
	@OpenApiField(desc = "描述", constraint = "描述", demo = "POS订单同步成功")
	private String memo;
	
	public String getMerchantId() {
		return this.merchantId;
	}
	
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	public String getTermId() {
		return this.termId;
	}
	
	public void setTermId(String termId) {
		this.termId = termId;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public long getAmount() {
		return this.amount;
	}
	
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
