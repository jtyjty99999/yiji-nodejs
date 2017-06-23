package com.yiji.openapi.message.product.yxt;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.yxt.info.GeneralWithholdBatchSingleOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月23日
 */
@OpenApiMessage(service = "yxtBatchDeduct", type = ApiMessageType.Request)
public class YxtBatchDeductRequest extends ApiRequest {
	
	/**
	 * 批量代扣外部订单号
	 */
	@NotEmpty
	@Size(max = 40)
	@OpenApiField(desc = "批量代扣外部订单号")
	private String externalBatchWithholdNo;
	
	/**
	 * 批量代扣订单列表
	 */
	@NotEmpty
	@OpenApiField(desc = "批量代扣订单列表")
	private List<GeneralWithholdBatchSingleOrder> batchWithholdList;
	
	@NotEmpty
	@OpenApiField(desc = "备注")
	private String memo;
	
	public String getExternalBatchWithholdNo() {
		return externalBatchWithholdNo;
	}
	
	public void setExternalBatchWithholdNo(String externalBatchWithholdNo) {
		this.externalBatchWithholdNo = externalBatchWithholdNo;
	}
	
	public List<GeneralWithholdBatchSingleOrder> getBatchWithholdList() {
		return this.batchWithholdList;
	}
	
	public void setBatchWithholdList(List<GeneralWithholdBatchSingleOrder> batchWithholdList) {
		this.batchWithholdList = batchWithholdList;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
