package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-25 18:05.
 */
@OpenApiMessage(service = "qftSettlement", type = ApiMessageType.Notify)
public class QftSettlementNotify extends ApiNotify {

    @OpenApiField(desc = "易极付ID",demo = "12346578901234567890")
    private String userId;

    @OpenApiField(desc = "商户结算批次号",demo = "215648321687")
    private String outBatchNo;

    @OpenApiField(desc = "结算状态",demo = "success",constraint = "success:成功<br>fail:失败")
    private String settlementStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOutBatchNo() {
        return outBatchNo;
    }

    public void setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo;
    }

    public String getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(String settlementStatus) {
        this.settlementStatus = settlementStatus;
    }
}
