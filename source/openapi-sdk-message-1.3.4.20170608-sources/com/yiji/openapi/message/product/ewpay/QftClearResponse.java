package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-25 18:01.
 */
@OpenApiMessage(service = "qftClear", type = ApiMessageType.Response)
public class QftClearResponse extends ApiResponse {

    /**
     * 清分批次
     */
    @OpenApiField(desc = "清分批次",demo = "6541621684321")
    private String outBatchNo;
    /**
     * 受理状态
     */
    @OpenApiField(desc = "受理状态",demo = "success",constraint = "success:成功<br>fail:失败")
    private String dealStatus;

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getOutBatchNo() {
        return outBatchNo;
    }

    public void setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo;
    }
}
