package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by tyongfu@yiji.com on 2016/1/20.
 */
@OpenApiMessage(service = "invoice", type = ApiMessageType.Request)
public class InvoiceRequest extends ApiRequest {

    @OpenApiField(demo = "",constraint = "",desc = "电子缴款号")
    private String electronicPaymentNo;

    @OpenApiField(demo = "",constraint = "",desc = "缴款书编号")
    private String paymentCode = "";

    @OpenApiField(demo = "张三",constraint = "",desc = "缴款人姓名")
    private String paymentName = "";

    @NotBlank
    @OpenApiField(demo = "",constraint = "",desc = "执收单位编号")
    private String unitCode;

    @NotBlank
    @OpenApiField(demo = "",constraint = "",desc = "项目编号")
    private String projectCode;

    @NotNull
    @OpenApiField(demo = "",constraint = "",desc = "缴款数量")
    private int paymentNumber;

    @NotBlank
    @OpenApiField(demo = "",constraint = "",desc = "财政专户账号")
    private String accountNumber;

    @NotBlank
    @OpenApiField(demo = "",constraint = "",desc = "校验码")
    private String checkCode;

    @NotBlank
    @OpenApiField(demo = "",constraint = "",desc = "开票日期")
    private String billingDate;

    private Date date;
    
    public String getElectronicPaymentNo() {
        return electronicPaymentNo;
    }

    public void setElectronicPaymentNo(String electronicPaymentNo) {
        this.electronicPaymentNo = electronicPaymentNo;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}
