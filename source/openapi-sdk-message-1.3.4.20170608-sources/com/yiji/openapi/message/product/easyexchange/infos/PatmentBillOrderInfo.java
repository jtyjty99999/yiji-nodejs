package com.yiji.openapi.message.product.easyexchange.infos;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-21 10:38.
 */
public class PatmentBillOrderInfo {

    /** 支付单金额（如果商户类型是特殊，则不能为空） */
    @OpenApiField(desc = "支付单金额",demo = "88.66",constraint = "如果商户类型是特殊，则不能为空")
    private Money paymentBillAmount ;

    /** 支付人姓名（如果商户类型是特殊，则不能为空）*/
    @OpenApiField(desc = "支付人姓名",demo = "张三",constraint = "如果商户类型是特殊，则不能为空")
    private String payerName;

    /** 支付人证件号码（如果商户类型是特殊，则不能为空）*/
    @OpenApiField(desc = "支付人证件号码",demo = "54126533246632456",constraint = "如果商户类型是特殊，则不能为空")
    private String payerId;

    /** 支付方式  （如果商户类型是特殊，则不能为空）*/
    @OpenApiField(desc = "支付方式",demo = "onlinepay",constraint = "如果商户类型是特殊，则不能为空")
    private String paymentType;

    /** 申报海关代码 */
    @NotBlank
    @Size(max=15, message="the max length is 15")
    @OpenApiField(desc = "申报海关代码",demo = "8003")
    private String customsCode;

    /** 原始商户订单号 */
    @NotBlank
    @Size(max=40, message="the max length is 40")
    @OpenApiField(desc = "商户订单号",demo = "5245746312658")
    private String outOrderNo;

    /** 交易流水号(如果商户类型是一般，则不能为空) */
    @NotBlank
    @Size(max=40, message="the max length is 40")
    @OpenApiField(desc = "交易流水号",demo = "3542865126853458123")
    private String tradeNo;

    /** 业务类型(重庆特有) */
    @OpenApiField(desc = "业务类型",demo = "I20",constraint = "重庆特有,默认I20")
    private String bizTypeCode = "I20";

    public Money getPaymentBillAmount() {
        return paymentBillAmount;
    }

    public void setPaymentBillAmount(Money paymentBillAmount) {
        this.paymentBillAmount = paymentBillAmount;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCustomsCode() {
        return customsCode;
    }

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
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

    public String getBizTypeCode() {
        return bizTypeCode;
    }

    public void setBizTypeCode(String bizTypeCode) {
        this.bizTypeCode = bizTypeCode;
    }
}
