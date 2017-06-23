/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 下午2:36:02 创建
 */
package com.yiji.openapi.message.common.withdraw;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "yhWithdraw", type = ApiMessageType.Response)
public class YhWithdrawResponse extends ApiResponse {
	
	@OpenApiField(desc = "全局GID")
	private String gid;
	
	@OpenApiField(desc = "")
	private String merchantAccNo;
	
	@OpenApiField(desc = "提现类型")
	private String type;
	
	@OpenApiField(desc = "申请时间")
	private String requestTime;
	
	@OpenApiField(desc = "操作员登陆Id")
	private String loginId;
	
	@OpenApiField(desc = "产品码")
	private String productCode;
	
	@OpenApiField(desc = "业务子产品编码")
	private String subBizCode;
	
	@OpenApiField(desc = "入口")
	private String inlet = "01";
	
	@OpenApiField(desc = "资金卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "资金帐号")
	private String merchantAccountNo;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getMerchantAccNo() {
		return merchantAccNo;
	}
	
	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLoginId() {
		return loginId;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getSubBizCode() {
		return subBizCode;
	}
	
	public void setSubBizCode(String subBizCode) {
		this.subBizCode = subBizCode;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getMerchantCardNo() {
		return merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccountNo() {
		return merchantAccountNo;
	}
	
	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}
	
	public String getRequestTime() {
		return requestTime;
	}
	
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	
}
