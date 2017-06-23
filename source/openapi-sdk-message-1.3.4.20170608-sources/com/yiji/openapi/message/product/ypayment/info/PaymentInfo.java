package com.yiji.openapi.message.product.ypayment.info;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-13 10:37.
 */
public class PaymentInfo {

    @Size(min = 0, max = 40)
    @OpenApiField(desc = "商户订单号", constraint = "订单号长度为0-40字节")
    private String merchOrderNo;

    /**
     * 缴费订单号
     */
    @NotBlank
    @OpenApiField(desc = "缴费订单号",demo = "12345613256874")
    private String paymentOrderNo;
    /**
     * 易极付会员ID
     */
    @NotBlank
    @OpenApiField(desc = "易极付会员ID",demo = "13246578901234567980")
    private String userId;

    /**
     * 缴费状态
     */
    @NotNull
    @OpenApiField(desc = "缴费状态",demo = "SUCCESS")
    private String paymentStatus;

    /**
     * 用户编码（卡号）
     */
    @NotBlank
    @OpenApiField(desc = "用户编码（卡号）",demo = "13618324237/6224651241792",constraint = "用户编码（话费充值时，为手机号；水电气缴费，为卡号）")
    private String userCode;

    /**
     * 资源编码
     */
    @NotBlank
    @OpenApiField(desc = "资源编码",demo = "32165123456")
    private String resourceCode;

    /**
     * 资源名称
     */
    @NotBlank
    @OpenApiField(desc = "资源名称",demo = "移动")
    private String resourceName;

    /**
     * 缴费类型
     */
    @NotNull
    @OpenApiField(desc = "缴费类型",demo = "MOBILE")
    private String paymentType;

    /**
     * 欠费金额
     */
    @NotNull
    @OpenApiField(desc = "欠费金额",demo = "88.66")
    private Money payable;

    /**
     * 月份
     */
    @NotBlank
    @OpenApiField(desc = "月份",demo = "6")
    private String month;

    /**
     * 缴费来源
     */
    @NotBlank
    @OpenApiField(desc = "业务平台",demo = "yipinhui")
    private String payFrom;

    @NotBlank
    @OpenApiField(desc = "是否是垃圾处理费",demo = "True: 是，False：否")
    private String isRubbish;

    @NotNull
    @OpenApiField(desc = "开始时间",demo = "21:02:04")
    private Date startTime;

    @NotNull
    @OpenApiField(desc = "结束时间",demo = "21:02:04")
    private Date endTime;

    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Money getPayable() {
        return payable;
    }

    public void setPayable(Money payable) {
        this.payable = payable;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPayFrom() {
        return payFrom;
    }

    public void setPayFrom(String payFrom) {
        this.payFrom = payFrom;
    }

    public String getIsRubbish() {
        return isRubbish;
    }

    public void setIsRubbish(String isRubbish) {
        this.isRubbish = isRubbish;
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
