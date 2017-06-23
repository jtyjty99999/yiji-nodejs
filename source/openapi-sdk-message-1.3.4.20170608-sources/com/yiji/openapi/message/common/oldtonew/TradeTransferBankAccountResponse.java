package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-14 14:37.
 */
@Deprecated
@OpenApiMessage(service = "trade_transfer_bank_account", type = ApiMessageType.Response)
public class TradeTransferBankAccountResponse extends ApiResponse {

    /** 交易号 */
    @OpenApiField(desc = "交易号",demo = "21345654684")
    protected String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
