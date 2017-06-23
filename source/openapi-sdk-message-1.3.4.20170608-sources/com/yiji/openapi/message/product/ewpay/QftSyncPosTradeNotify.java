/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-19 14:02 创建
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
 * @since 2016-04-19
 */
@OpenApiMessage(service = "qftSyncPosTrade", type = ApiMessageType.Notify)
public class QftSyncPosTradeNotify extends ApiNotify {

    @OpenApiField(desc = "交易流水号", constraint = "交易流水号", demo = "123456789013245678")
    private String tradeNo;

    @OpenApiField(desc = "交易状态", constraint = "{\"data\":[\"SUCCESS:成功\",\"FAIL:失败\"],\"name\":\"交易状态\"}", demo = "SUCCESS")
    private String tradeStatus;

    @OpenApiField(desc = "执行动作", constraint = "执行动作", demo = "ESCOW_TRADE_BUYER_ESCOW_PAY")
    private String executeAction;


    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getExecuteAction() {
        return executeAction;
    }

    public void setExecuteAction(String executeAction) {
        this.executeAction = executeAction;
    }
}
