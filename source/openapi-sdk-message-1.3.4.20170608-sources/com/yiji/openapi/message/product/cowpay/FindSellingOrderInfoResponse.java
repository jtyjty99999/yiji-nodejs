/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-20 16:03 创建
 *
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.SellingCustomerInfo;
import com.yiji.openapi.message.product.cowpay.info.SellingOrderHistoryInfo;
import com.yiji.openapi.message.product.cowpay.info.SellingTradeOrderDetailInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "findSellerOrderInfo", type = ApiMessageType.Response)
public class FindSellingOrderInfoResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "通知地址")
	private String noticeUrl;
	
	@OpenApiField(desc = "订单日期")
	private String orderDate;
	
	@OpenApiField(desc = "订单编号")
	private String outOrderNo;
	
	@OpenApiField(desc = "订单状态")
	private String status;
	
	@OpenApiField(desc = "发货状态")
	private String deliveryStatus;
	
	@OpenApiField(desc = "付款状态")
	private String paymentStatus;
	
	@OpenApiField(desc = "订单应付金额")
	private Money paymentAmount;
	
	@OpenApiField(desc = "订单已付金额")
	private Money paidAmount;
	
	@OpenApiField(desc = "订单总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "客户信息")
	private SellingCustomerInfo customerInfo;
	
	@OpenApiField(desc = "订单操作历史信息")
	private List<SellingOrderHistoryInfo> orderHistoryInfo;
	
	@OpenApiField(desc = "经销商订单信息")
	private List<SellingTradeOrderDetailInfo> orderDetailInfoList;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getNoticeUrl() {
		return noticeUrl;
	}
	
	public void setNoticeUrl(String noticeUrl) {
		this.noticeUrl = noticeUrl;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Money getPaymentAmount() {
		return paymentAmount;
	}
	
	public void setPaymentAmount(Money paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	public Money getPaidAmount() {
		return paidAmount;
	}
	
	public void setPaidAmount(Money paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public SellingCustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	
	public void setCustomerInfo(SellingCustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	
	public List<SellingOrderHistoryInfo> getOrderHistoryInfo() {
		return orderHistoryInfo;
	}
	
	public void setOrderHistoryInfo(List<SellingOrderHistoryInfo> orderHistoryInfo) {
		this.orderHistoryInfo = orderHistoryInfo;
	}
	
	public List<SellingTradeOrderDetailInfo> getOrderDetailInfoList() {
		return orderDetailInfoList;
	}
	
	public void setOrderDetailInfoList(List<SellingTradeOrderDetailInfo> orderDetailInfoList) {
		this.orderDetailInfoList = orderDetailInfoList;
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
