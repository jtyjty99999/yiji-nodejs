package com.yiji.openapi.message.product.ewpay;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.yiji.openapi.message.product.ewpay.info.EwpaySettlementItems;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-25 18:04.
 */
@OpenApiMessage(service = "qftSettlement", type = ApiMessageType.Request)
public class QftSettlementRequest extends ApiRequest {

    /**
     * 商户结算批次号
     */
    @NotNull
    @Size(min = 1, max = 32)
    @OpenApiField(desc = "商户结算批次号",demo = "215648321687")
    private String outBatchNo;

    /**
     * 结算订单列表
     */
    @NotNull
    @OpenApiField(desc = "结算订单列表")
    private List<EwpaySettlementItems> settlementOrderItems;

    public String getOutBatchNo() {
        return outBatchNo;
    }

    public void setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo;
    }

    public List<EwpaySettlementItems> getSettlementOrderItems() {
        return settlementOrderItems;
    }

    public void setSettlementOrderItems(List<EwpaySettlementItems> settlementOrderItems) {
        this.settlementOrderItems = settlementOrderItems;
    }
}
