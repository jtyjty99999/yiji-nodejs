/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-01 11:04 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.ewpay.info.ToBalanceOrderInfo;
import com.yiji.openapi.message.product.ewpay.info.ToBusinessCardOrderInfo;
import com.yiji.openapi.message.product.ewpay.info.ToPersonCardOrderInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-01
 */
@OpenApiMessage(service = "qftBatchTransfer", type = ApiMessageType.Request)
public class QftBatchTransferRequest extends ApiRequest {

    /** 付款人账户 */
    @NotBlank
    @Size(min = 20, max = 20)
    @OpenApiField(desc = "付款人账户" , demo = "201501320000315151" , constraint = "")
    private String payerUserId;
    /** 付款人外部会员ID */
    @Size(max = 50)
    @OpenApiField(desc = "付款人外部会员ID" , demo = "201501320000315151" , constraint = "")
    private String outPayerShopId;
    /** 付款人外部会员名 */
    @Size(max = 256)
    @OpenApiField(desc = "付款人外部会员名" , demo = "201501320000315151" , constraint = "")
    private String outPayerShopName;
    /** 到余额列表 */
    @OpenApiField(desc = "到余额列表" , demo = "" , constraint = "")
    private List<ToBalanceOrderInfo> toBalanceList;
    /** 到个人银行卡列表 */
    @OpenApiField(desc = "到个人银行卡列表" , demo = "" , constraint = "")
    private List<ToPersonCardOrderInfo> toPersonCardList;
    /** 到对公银行卡列表 */
    @OpenApiField(desc = "到对公银行卡列表" , demo = "" , constraint = "")
    private List<ToBusinessCardOrderInfo> toBusinessCardList;

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public String getOutPayerShopId() {
        return outPayerShopId;
    }

    public void setOutPayerShopId(String outPayerShopId) {
        this.outPayerShopId = outPayerShopId;
    }

    public String getOutPayerShopName() {
        return outPayerShopName;
    }

    public void setOutPayerShopName(String outPayerShopName) {
        this.outPayerShopName = outPayerShopName;
    }

    public List<ToBalanceOrderInfo> getToBalanceList() {
        return toBalanceList;
    }

    public void setToBalanceList(List<ToBalanceOrderInfo> toBalanceList) {
        this.toBalanceList = toBalanceList;
    }

    public List<ToPersonCardOrderInfo> getToPersonCardList() {
        return toPersonCardList;
    }

    public void setToPersonCardList(List<ToPersonCardOrderInfo> toPersonCardList) {
        this.toPersonCardList = toPersonCardList;
    }

    public List<ToBusinessCardOrderInfo> getToBusinessCardList() {
        return toBusinessCardList;
    }

    public void setToBusinessCardList(List<ToBusinessCardOrderInfo> toBusinessCardList) {
        this.toBusinessCardList = toBusinessCardList;
    }
}
