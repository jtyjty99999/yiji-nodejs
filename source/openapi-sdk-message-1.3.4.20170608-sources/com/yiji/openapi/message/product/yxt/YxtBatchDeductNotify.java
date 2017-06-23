package com.yiji.openapi.message.product.yxt;

import java.util.List;

import com.yiji.openapi.message.product.yxt.info.CreateFailOrderInfo;
import com.yiji.openapi.message.product.yxt.info.DeductResultInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月23日
 */
@OpenApiMessage(service = "yxtBatchDeduct", type = ApiMessageType.Notify)
public class YxtBatchDeductNotify extends ApiNotify {
	
	@OpenApiField(desc = "批量代扣外部订单号")
	private String externalBatchOrderNo;
	
	@OpenApiField(desc = "代扣成功列表")
	private List<DeductResultInfo> successList;
	
	@OpenApiField(desc = "代扣失败列表")
	private List<DeductResultInfo> failList;
	
	@OpenApiField(desc = "创建失败的订单列表")
	private List<CreateFailOrderInfo> createFailOrderList;
	
	public String getExternalBatchOrderNo() {
		return this.externalBatchOrderNo;
	}
	
	public void setExternalBatchOrderNo(String externalBatchOrderNo) {
		this.externalBatchOrderNo = externalBatchOrderNo;
	}
	
	public List<DeductResultInfo> getSuccessList() {
		return successList;
	}
	
	public void setSuccessList(List<DeductResultInfo> successList) {
		this.successList = successList;
	}
	
	public List<DeductResultInfo> getFailList() {
		return failList;
	}
	
	public void setFailList(List<DeductResultInfo> failList) {
		this.failList = failList;
	}
	
	public List<CreateFailOrderInfo> getCreateFailOrderList() {
		return createFailOrderList;
	}
	
	public void setCreateFailOrderList(List<CreateFailOrderInfo> createFailOrderList) {
		this.createFailOrderList = createFailOrderList;
	}
	
}
