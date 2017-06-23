/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-31 18:47 创建
 *
 */
package com.yiji.openapi.message.common.trade;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.trade.info.PayBankOrderInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.enums.ApiServiceResultCode;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-31
 */
@OpenApiMessage(service = "fastPaySDKPay", type = ApiMessageType.Request)
public class FastPaySDKPayRequest extends ApiRequest {

    /**
     * 用户客户端ip
     */
    @Length(max = 128)
    @OpenApiField(desc = "用户客户端ip" , demo = "192.168.56.52" , constraint = "")
    private String userEndIp;

    /**
     * mac地址
     */
    @Length(max = 48)
    @OpenApiField(desc = "mac地址" , demo = "14-DD-A9-DE-FF-87" , constraint = "")
    private String macAddress;

    /**
     * 终端类型
     */
    @OpenApiField(desc = "终端类型" , demo = "pc" , constraint = "默认为pc")
    private String userTerminalType;

    /** 交易流水号 */
    @NotBlank
    @Length(min = 20, max = 20)
    @OpenApiField(desc = "交易流水号" , demo = "P464742078516256741A53" , constraint = "创建即时到账订单返回的业务流水号")
    private String tradeNo;

    /** 付款人会员号，余额支付时不能为空 */
    @Length(min = 20, max = 20)
    @OpenApiField(desc = "付款人会员号" , demo = "20160407010010858983" , constraint = "付款人会员号，余额支付时不能为空")
    private String payerUserId;

    /** 银行相关信息，非余额、代扣和快捷时必传 */
    @NotNull
    @OpenApiField(desc = "银行相关信息" , demo = "" , constraint = "银行相关信息，非余额、代扣和快捷时必传")
    private PayBankOrderInfo payBankOrderInfo;

//    /** 绑卡流水号，代扣和快捷支付时不能为空 */
//    @Length(max = 32)
//    @OpenApiField(desc = "绑卡流水号" , demo = "" , constraint = "绑卡流水号，代扣和快捷支付时不能为空")
//    private String pactNo;

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getUserTerminalType() {
        return userTerminalType;
    }

    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType;
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

    public PayBankOrderInfo getPayBankOrderInfo() {
        return payBankOrderInfo;
    }

    public void setPayBankOrderInfo(PayBankOrderInfo payBankOrderInfo) {
        this.payBankOrderInfo = payBankOrderInfo;
    }
}
