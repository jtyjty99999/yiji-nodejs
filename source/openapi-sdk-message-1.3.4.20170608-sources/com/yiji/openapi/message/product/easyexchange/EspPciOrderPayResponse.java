package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "espPciOrderPay", type = ApiMessageType.Response)
public class EspPciOrderPayResponse extends ApiResponse {
	
	@OpenApiField(desc = "当前处理描述")
	private String msg;
	
	@OpenApiField(desc = "返回码")
	private String code;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "失败详情", constraint = "风控信息也在里面传递")
	private String ErrCodeCtx;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getErrCodeCtx() {
		return ErrCodeCtx;
	}
	
	public void setErrCodeCtx(String errCodeCtx) {
		ErrCodeCtx = errCodeCtx;
	}
}