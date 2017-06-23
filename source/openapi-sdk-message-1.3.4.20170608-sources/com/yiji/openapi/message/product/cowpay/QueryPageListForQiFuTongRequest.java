package com.yiji.openapi.message.product.cowpay;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/4/17.
 */
@OpenApiMessage(service = "queryOrderInfoPageList", type = ApiMessageType.Request)
public class QueryPageListForQiFuTongRequest extends ApiRequest {
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易订单号")
	private String tradeOrderNo;
	
	@OpenApiField(desc = "付款人用户id")
	private String payerUserId;
	
	@OpenApiField(desc = "卖家用户id")
	private String sellerUserId;
	
	@OpenApiField(desc = "状态")
	private Integer state;
	
	@OpenApiField(desc = "开始时间")
	private Date startTime;
	
	@OpenApiField(desc = "结束时间")
	private Date endTime;
	
	@OpenApiField(desc = "查询页数")
	private int pageNum = 1;
	
	@OpenApiField(desc = "每页记录数")
	private int pageSize = 10;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeOrderNo() {
		return tradeOrderNo;
	}
	
	public void setTradeOrderNo(String tradeOrderNo) {
		this.tradeOrderNo = tradeOrderNo;
	}
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
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
}
