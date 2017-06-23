/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-01 17:43 创建
 */
package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/1
 */
public class BillOrderItemV2Info implements Serializable {
    /** 易生活本地订单号 */
    @OpenApiField(desc = "易生活本地订单号", demo = "1234564")
    private String orderNo;

    /** 订单明细项流水号 */
    @OpenApiField(desc = "订单明细项流水号", demo = "1234564")
    private String itemNo;

    /** 订单明细项状态 */
    @OpenApiField(desc = "订单明细项状态", demo = "XXX")
    private String itemStatus;

    /** 代理商用户ID */
    @OpenApiField(desc = "代理商用户ID", demo = "20123123823412323")
    private String agentUserId;

    /** 付款用户ID */
    @OpenApiField(desc = "付款用户ID", demo = "20123123823412323")
    private String payUserId;

    /** 机构编码 */
    @OpenApiField(desc = "机构编码", demo = "1234564")
    private String agencyCode;

    /** 用户编码 */
    @OpenApiField(desc = "用户编码", demo = "1234564")
    private String userCode;

    /** 时间段开始时间 */
    @OpenApiField(desc = "时间段开始时间", demo = "2013-08-21")
    private String startTime;

    /** 时间段结束时间 */
    @OpenApiField(desc = "时间段结束时间", demo = "2013-08-29")
    private String endTime;

    /** 缴费类型 */
    @OpenApiField(desc = "缴费类型", demo = "XXX")
    private String paymentType;

    /** 用户姓名 */
    @OpenApiField(desc = "用户姓名", demo = "陈世美")
    private String userName;

    /** 缴费动作开始时间 */
    @OpenApiField(desc = "缴费动作开始时间", demo = "2013-08-29")
    private String paymentStartTime;

    /** 缴费结束开始时间 */
    @OpenApiField(desc = "缴费结束开始时间", demo = "2013-08-29")
    private String paymentFinishTime;

    /** 用户缴费金额 */
    @OpenApiField(desc = "易生活本地订单号", demo = "1234564")
    private String paymentAmount;

    /** 滞纳金 */
    @OpenApiField(desc = "滞纳金", demo = "2.12")
    private String forfeitAmount;

    /** 业务名称 */
    @OpenApiField(desc = "业务名称", demo = "订单")
    private String bizName;

    /** 业务数量 */
    @OpenApiField(desc = "业务数量", demo = "34")
    private String quantity;

    /** 起度 */
    @OpenApiField(desc = "起度", demo = "2")
    private String startCount;

    /** 止度 */
    @OpenApiField(desc = "止度", demo = "65")
    private String endCount;

    /** 月份 */
    @OpenApiField(desc = "月份", demo = "3")
    private String month;

    /** 备注 */
    @OpenApiField(desc = "备注", demo = "1234564")
    private String memo;

    /** 条目外部流水号 */
    @OpenApiField(desc = "条目外部流水号", demo = "1234564")
    private String itemOutSerialNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getItemOutSerialNo() {
        return itemOutSerialNo;
    }

    public void setItemOutSerialNo(String itemOutSerialNo) {
        this.itemOutSerialNo = itemOutSerialNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(String agentUserId) {
        this.agentUserId = agentUserId;
    }

    public String getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(String payUserId) {
        this.payUserId = payUserId;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPaymentStartTime() {
        return paymentStartTime;
    }

    public void setPaymentStartTime(String paymentStartTime) {
        this.paymentStartTime = paymentStartTime;
    }

    public String getPaymentFinishTime() {
        return paymentFinishTime;
    }

    public void setPaymentFinishTime(String paymentFinishTime) {
        this.paymentFinishTime = paymentFinishTime;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getForfeitAmount() {
        return forfeitAmount;
    }

    public void setForfeitAmount(String forfeitAmount) {
        this.forfeitAmount = forfeitAmount;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStartCount() {
        return startCount;
    }

    public void setStartCount(String startCount) {
        this.startCount = startCount;
    }

    public String getEndCount() {
        return endCount;
    }

    public void setEndCount(String endCount) {
        this.endCount = endCount;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
