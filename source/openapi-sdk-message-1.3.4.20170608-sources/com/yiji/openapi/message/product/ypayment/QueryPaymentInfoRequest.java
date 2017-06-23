package com.yiji.openapi.message.product.ypayment;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-13 10:11.
 */
@OpenApiMessage(service = "queryPaymentInfo", type = ApiMessageType.Request)
public class QueryPaymentInfoRequest extends ApiRequest {

    private final static String startDate = " 00:00:00";
    private final static String endDate = " 23:59:59";

    /**
     * 缴费类型(可为空，不为空查出具体的那一类)
     */
    @OpenApiField(desc = "缴费类型",demo = "MOBILE")
    private String paymentType;

    /**
     * 开始时间(可为空)
     */
    @OpenApiField(desc = "开始时间",demo = "2016-01-01")
    private String  startTime;
    private Date starttime;


    /**
     * 结束时间(可为空)
     */
    @OpenApiField(desc = "结束时间",demo = "2016-01-01")
    private String  endTime;
    private Date endtime;

    /**
     * 易极付用户（必填）
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户ID",demo = "20141225010000062065")
    private String userId;

    /**
     * 平台类型
     */
    @NotBlank
    @OpenApiField(desc = "平台类型",demo = "ypanment",constraint = "签约时分配的平台类型")
    private String platformType;

    /**
     * 当前页号
     */
    @OpenApiField(desc = "当前页号",demo = "1",constraint = "默认为1")
    private int currentPage = 1;

    /**
     * 当页记录数 默认为10条记录
     */
    @OpenApiField(desc = "每页记录数",demo = "10",constraint = "默认10条记录")
    private int countOfCurrentPage = 10;

    /**
     * 子订单号(可为空，不为空查出具体的那一笔子订单)
     */
    @OpenApiField(desc = "子订单号",demo = "20150512050515",constraint = "")
    private String paymentOrderNo;

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public static String getStartDate() {
        return startDate;
    }

    public static String getEndDate() {
        return endDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCountOfCurrentPage() {
        return countOfCurrentPage;
    }

    public void setCountOfCurrentPage(int countOfCurrentPage) {
        this.countOfCurrentPage = countOfCurrentPage;
    }



}
