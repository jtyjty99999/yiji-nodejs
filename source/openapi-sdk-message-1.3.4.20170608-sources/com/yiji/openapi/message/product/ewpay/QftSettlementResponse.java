package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-25 18:04.
 */
@OpenApiMessage(service = "qftSettlement", type = ApiMessageType.Response)
public class QftSettlementResponse extends ApiResponse {

    /**
     * 结算批次
     */
    @OpenApiField(desc = "结算批次",demo = "6541621684321")
    private String outBatchNo;
    /**
     * 受理状态
     */
    @OpenApiField(desc = "受理状态",demo = "success",constraint = "success:成功<br>fail:失败")
    private String dealStatus;

    public String getOutBatchNo() {
        return outBatchNo;
    }

    public void setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }
}
