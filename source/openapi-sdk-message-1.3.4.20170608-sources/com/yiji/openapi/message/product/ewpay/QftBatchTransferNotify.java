/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-01 15:54 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-01
 */
@OpenApiMessage(service = "qftBatchTransfer", type = ApiMessageType.Notify)
public class QftBatchTransferNotify extends ApiNotify {

    @OpenApiField(desc = "批次的处理状态" , demo = "PROCESSING" , constraint = "")
    private String  batchStatus;

    @OpenApiField(desc = "明细外部订单号" , demo = "201503000121151211" , constraint = "")
    private String  itemMerchOrderNo;

    @OpenApiField(desc = "明细转账处理状态" , demo = "TRADE_FINISHED" , constraint = "")
    private String  itemTradeStatus;

    @OpenApiField(desc = "明细交易流水号" , demo = "20160616000000003831" , constraint = "")
    private String  itemTradeNo;

    @OpenApiField(desc = "明细通知信息" , demo = "转账成功" , constraint = "")
    private String  itemTradeMessage;

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public String getItemMerchOrderNo() {
        return itemMerchOrderNo;
    }

    public void setItemMerchOrderNo(String itemMerchOrderNo) {
        this.itemMerchOrderNo = itemMerchOrderNo;
    }

    public String getItemTradeStatus() {
        return itemTradeStatus;
    }

    public void setItemTradeStatus(String itemTradeStatus) {
        this.itemTradeStatus = itemTradeStatus;
    }

    public String getItemTradeNo() {
        return itemTradeNo;
    }

    public void setItemTradeNo(String itemTradeNo) {
        this.itemTradeNo = itemTradeNo;
    }

    public String getItemTradeMessage() {
        return itemTradeMessage;
    }

    public void setItemTradeMessage(String itemTradeMessage) {
        this.itemTradeMessage = itemTradeMessage;
    }
}
