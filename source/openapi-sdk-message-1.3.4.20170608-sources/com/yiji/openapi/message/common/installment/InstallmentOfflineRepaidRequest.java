package com.yiji.openapi.message.common.installment;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by HuCheng on 2015/5/19.
 */
@OpenApiMessage(service = "installmentOfflineRepaid", type = ApiMessageType.Request)
public class InstallmentOfflineRepaidRequest extends ApiRequest {
	
	@NotNull
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "还款分期数", constraint = "默认为1期")
	private int time = 1;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	

	public void check() {
		if (time < 1) {
			throw new IllegalArgumentException("线下分期还款期数必须大于等于1");
		}
	}
	
}
