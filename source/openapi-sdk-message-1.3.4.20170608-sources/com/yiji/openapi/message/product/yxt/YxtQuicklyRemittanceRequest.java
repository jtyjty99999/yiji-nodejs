package com.yiji.openapi.message.product.yxt;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-10-10 17:43.
 */
@OpenApiMessage(service = "yxtQuicklyRemittance", type = ApiMessageType.Request)
public class YxtQuicklyRemittanceRequest extends ApiRequest {

    /**
     * 代发金额
     */
    @NotNull
    @OpenApiField(desc = "代发金额",demo = "88.66")
    private Money amount;

    /**
     *
     */
    @NotEmpty
    @OpenApiField(desc = "商户订单号",demo = "123456789132")
    private String outOrderNo;

    /**
     * 合同照片
     */
    @NotEmpty
    @OpenApiField(desc = "合同照片",constraint = "合同照片的URL地址",demo = "http://www.yiji.com/1.jpg")
    private String contractUrl;

    /**
     * 客户真实姓名
     */
    @NotEmpty
    @OpenApiField(desc = "客户真实姓名",demo = "易极付")
    private String realName;

    /**
     * 客户手机号
     */
    @NotEmpty
    @OpenApiField(desc = "客户手机号",demo = "10086100101")
    private String mobileNo;

    /**
     * 客户身份证号码
     */
    @NotEmpty
    @OpenApiField(desc = "客户身份证号码",demo = "123456789023145678")
    private String certNo;

    /**
     * 银行编码
     */
    @NotEmpty
    @OpenApiField(desc = "银行编码",demo = "ABC")
    private String bankCode;

    /**
     * 银行名称
     */
    @NotEmpty
    @OpenApiField(desc = "银行名称",demo = "中国农业银行")
    private String bankName;

    /**
     * 银行卡号
     */
    @NotEmpty
    @OpenApiField(desc = "银行卡号",demo = "31264578931245612")
    private String bankCardNo;

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }
}
