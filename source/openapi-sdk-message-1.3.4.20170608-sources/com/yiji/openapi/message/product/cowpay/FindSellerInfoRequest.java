package com.yiji.openapi.message.product.cowpay;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/1/20.
 */
@OpenApiMessage(service = "findSellerOrderInfoByUserId", type = ApiMessageType.Request)
public class FindSellerInfoRequest extends ApiRequest {
	
	@OpenApiField(desc = "页面记录数")
	private Long pageSize;
	
	@OpenApiField(desc = "页码数")
	private Long pageNo;
	
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@OpenApiField(desc = "订单状态")
	private String status;
	
	@OpenApiField(desc = "开始时间")
	private Date startTime;
	
	@OpenApiField(desc = "结束时间")
	private Date endTime;
	
	@OpenApiField(desc = "供应商ID")
	private String supplierId;
	
	@OpenApiField(desc = "发货状态")
	private String deliveryStatus;
	
	@OpenApiField(desc = "付款状态")
	private String paymentStatus;
	
	public Long getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	
	public Long getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public String getSupplierId() {
		return supplierId;
	}
	
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	public String getPaymentStatus() {
		return paymentStatus;
	}
	
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
}
