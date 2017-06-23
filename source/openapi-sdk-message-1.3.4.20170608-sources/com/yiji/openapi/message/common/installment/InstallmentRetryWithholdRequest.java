package com.yiji.openapi.message.common.installment;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by sky on 2015/5/19.
 */
@OpenApiMessage(service = "installmentRetryWithhold", type = ApiMessageType.Request)
public class InstallmentRetryWithholdRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "代扣定单号")
	@Size(min = 20, max = 20)
	private String installmentOrderNo;
	
	/**
	 * 日期时间格式。为空时立即重试；不为空时，在此时间后重试代扣
	 */
	@OpenApiField(desc = "预约重试时间")
	public Date nextRetryTime;
	
	public Date getNextRetryTime() {
		return nextRetryTime;
	}
	
	public void setNextRetryTime(Date nextRetryTime) {
		this.nextRetryTime = nextRetryTime;
	}
	
	public String getInstallmentOrderNo() {
		return installmentOrderNo;
	}
	
	public void setInstallmentOrderNo(String installmentOrderNo) {
		this.installmentOrderNo = installmentOrderNo;
	}
}
