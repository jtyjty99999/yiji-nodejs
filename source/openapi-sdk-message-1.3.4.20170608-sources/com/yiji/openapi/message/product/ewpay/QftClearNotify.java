package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-25 18:08.
 */
@OpenApiMessage(service = "qftClear", type = ApiMessageType.Notify)
public class QftClearNotify extends ApiNotify {
    /**
     * 清分批次
     */
    @OpenApiField(desc = "清分批次",demo = "6541621684321")
    private String outBatchNo;

    /**
     * 外部订单号
     */
    @OpenApiField(desc = "外部订单号",demo = "21345698701234569780")
    private String outOrderNo;

    /**
     * 企富通订单号
     */
    @OpenApiField(desc = "企富通订单号",demo = "2315546987")
    private String payOrderNo;
    /**
     * 订单清分状态
     */
    @OpenApiField(desc = "订单清分状态",demo = "success",constraint = "success:成功<br>fail:失败")
    private String clearStatus;

    public String getOutBatchNo() {
        return outBatchNo;
    }

    public void setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getClearStatus() {
        return clearStatus;
    }

    public void setClearStatus(String clearStatus) {
        this.clearStatus = clearStatus;
    }
}
