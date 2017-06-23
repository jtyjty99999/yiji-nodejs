/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:00:55 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class SellingTradeOrderInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * 供应商ID
	 */
	private String supplierId;
	
	/**
	 * 供应商名称
	 */
	private String supplierName;
	
	/**
	 * 订单应付金额
	 */
	private Money paymentAmount;
	
	/**
	 * 发货状态，{0表示未发货，1表示已发货，2表示已收货}
	 */
	private String deliveryStatus;
	
	/**
	 * 付款状态，{0表示未付款，1表示已付款}
	 */
	private String paymentStatus;
	
	/**
	 * 订单状态，{0表示已提交，1表示已取消，2表示已完成， 5表示已审核}
	 */
	private String status;
	
	/**
	 * 订货日期
	 */
	private String orderDate;
	
	public String getOrderNo() {
		return orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getSupplierId() {
		return supplierId;
	}
	
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	
	public String getSupplierName() {
		return supplierName;
	}
	
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	public Money getPaymentAmount() {
		return paymentAmount;
	}
	
	public void setPaymentAmount(Money paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	public String getStatus() {
		return status;
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
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
}

    