/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-09 10:30 创建
 *
 */
package com.yiji.openapi.message.product.common;

import java.util.Date;

import javax.validation.constraints.DecimalMin;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonJointAccountQuery", type = ApiMessageType.Request)
public class CommonJointAccountQueryRequest extends ApiRequest {
    /**
     * 联名卡卡号
     */
    @OpenApiField(desc = "联名卡卡号",constraint = "联名卡卡号")
    private String jointAccountNo;

    /**
     * 用户ID
     */
    @OpenApiField(desc = "用户ID",constraint = "用户登录易极付的ID")
    private String userId;

    /**
     * 入金流水号
     */
    @OpenApiField(desc = "入金流水号",constraint = "入金流水号")
    private String fundInBizNo;

    /**
     *金额范围上限
     */
    @OpenApiField(desc = "金额上限",constraint = "查询金额上限")
    private Money amountMax;

    /**
     *金额范围下限
     */
    @OpenApiField(desc = "查询金额下限",constraint = "查询金额下限")
    private Money amountMin;

    /**
     * 用途
     */
    @OpenApiField(desc = "用途",constraint = "用途")
    private String userFor;

    /**
     * 记录状态
     */
    @OpenApiField(desc = "记录状态",constraint = "记录状态")
    private String status;

    /** 开始时间 */
    @OpenApiField(desc = "开始时间",constraint = "开始时间")
    private Date beginTime;

    /** 结束时间 */
    @OpenApiField(desc = "结束时间",constraint = "结束时间")
    private Date endTime;

    /**
     * 第几页
     */
    @DecimalMin("0")
    @OpenApiField(desc = "当前页",constraint = "当前页")
    private int curPage = 1;

    /**
     * 每页记录数
     */
    @DecimalMin("1")
    @OpenApiField(desc = "每页记录总数",constraint = "每页记录总数")
    private int pageSize = 10;

    public String getJointAccountNo() {
        return jointAccountNo;
    }

    public void setJointAccountNo(String jointAccountNo) {
        this.jointAccountNo = jointAccountNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFundInBizNo() {
        return fundInBizNo;
    }

    public void setFundInBizNo(String fundInBizNo) {
        this.fundInBizNo = fundInBizNo;
    }

    public Money getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(Money amountMax) {
        this.amountMax = amountMax;
    }

    public Money getAmountMin() {
        return amountMin;
    }

    public void setAmountMin(Money amountMin) {
        this.amountMin = amountMin;
    }

    public String getUserFor() {
        return userFor;
    }

    public void setUserFor(String userFor) {
        this.userFor = userFor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
