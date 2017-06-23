package com.yiji.openapi.message.mpay.common;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.mpay.common.info.OpenApiPayeeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 移动转账请求对象
 * 
 * @author lingjiao
 */
@OpenApiMessage(service = "mpayTransfer", type = ApiMessageType.Request)
public class MpayTransferRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "卖家编号（收款方）",constraint="卖家编号（收款方）",demo="20151016026035860522")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "卖家编号（收款方）",constraint="卖家编号（收款方）",demo="[{\"amount\":\"22.50\",\"payeeUserId\":\"20150926010008168680\"}]")
	private List<OpenApiPayeeInfo> payeeList;
	
	@NotBlank
	@Size(max = 32)
	@OpenApiField(desc = "支付密码/易手富密码", security = true,constraint="支付密码/易手富密码",demo="123456")
	private String password;
	
	@OpenApiField(desc = "是否冻结金额中转账",constraint="是否冻结金额中转账",demo="true")
	private boolean unfreezeTransfer = false;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<OpenApiPayeeInfo> getPayeeList() {
		return payeeList;
	}
	
	public void setPayeeList(List<OpenApiPayeeInfo> payeeList) {
		this.payeeList = payeeList;
	}
	
	public boolean isUnfreezeTransfer() {
		return unfreezeTransfer;
	}
	
	public void setUnfreezeTransfer(boolean unfreezeTransfer) {
		this.unfreezeTransfer = unfreezeTransfer;
	}
	
}
