package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by Administrator on 2016/3/14.
 */
@OpenApiMessage(service = "freePayGateway", type = ApiMessageType.Notify)
public class FreePayGatewayNotify extends ApiNotify {
    @OpenApiField(desc = "外部订单号",demo = "1234647923165")
    private String outOrderNo;

    @OpenApiField(desc = "交易号",demo = "12341654798623")
    private String tradeNo;

    @OpenApiField(desc = "交易类型",demo = "ESCROWTRADE")
    private String tradeType;

    @OpenApiField(desc = "交易状态",demo = "{\"data\":[\"1:trade_finished\",\"2:trade_closed\"],\"name\":\"交易状态\"}")
    private String tradeStatus;

    /**
     * @return the tradeNo
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * @param tradeNo the tradeNo to set
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * @return the tradeType
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * @param tradeType the tradeType to set
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
    /**
     * @return the payerUserId
     */
    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }
}
