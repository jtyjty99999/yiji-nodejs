package com.yiji.openapi.message.product.ewpay;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-23 17:03.
 */
@OpenApiMessage(service = "qftQueryOrderInfo", type = ApiMessageType.Request)
public class QftQueryOrderInfoRequest extends ApiRequest {
	
	/** 查询页数 */
	@OpenApiField(desc = "查询页数", constraint = "默认为1，查询第一页", demo = "1")
	private int pageNum = 1;
	
	/** 每页查询数量 */
	@OpenApiField(desc = "每页查询数量", demo = "10", constraint = "默认为10，显示10条记录")
	private int pageSize = 10;
	
	/** 外部订单号 */
	@OpenApiField(desc = "外部订单号", demo = "12345689641253")
	private String outOrderNo;
	
	/** 交易订单号 */
	@OpenApiField(desc = "交易订单号", demo = "123684564847564")
	private String tradeNo;
	
	/** 付款人ID */
	@OpenApiField(desc = "付款人ID（易极付）", demo = "12345678901234567890", constraint = "payeeUserId与payerUserId不能同时为空")
	private String payerUserId;
	
	/** 收款人ID */
	@OpenApiField(desc = "收款人ID（易极付）", demo = "12364579801324567980", constraint = "payeeUserId与payerUserId不能同时为空")
	private String payeeUserId;
	
	/** 状态 */
	@OpenApiField(desc = "状态", demo = "RECHARGESUCCESS")
	private String tradeStatus;
	
	/** 开始时间 */
	@OpenApiField(desc = "开始时间", demo = "2015-12-24 14:23:12")
	private Date startTime;
	
	/** 结束时间 */
	@OpenApiField(desc = "结束时间", demo = "2015-12-24 14:45:54")
	private Date endTime;
	
	public int getPageNum() {
		return pageNum;
	}
	
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getPayeeUserId() {
		return payeeUserId;
	}
	
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
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
