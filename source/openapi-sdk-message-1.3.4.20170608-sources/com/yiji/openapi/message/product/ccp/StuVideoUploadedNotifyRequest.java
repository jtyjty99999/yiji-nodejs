package com.yiji.openapi.message.product.ccp;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;



@OpenApiMessage(service = "stuVideoUploadedNotify", type = ApiMessageType.Request)
public class StuVideoUploadedNotifyRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "外部流水号")
	private String outBizNo;
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "申请流水号")
	private String creditAmountApplicationNo;
	
	@NotEmpty
	@Length(max = 512)
	@OpenApiField(desc = "视频存放的全路径")
	private String videoFileFullPath;
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getCreditAmountApplicationNo() {
		return creditAmountApplicationNo;
	}
	
	public void setCreditAmountApplicationNo(String creditAmountApplicationNo) {
		this.creditAmountApplicationNo = creditAmountApplicationNo;
	}
	
	public String getVideoFileFullPath() {
		return videoFileFullPath;
	}
	
	public void setVideoFileFullPath(String videoFileFullPath) {
		this.videoFileFullPath = videoFileFullPath;
	}
	
}
