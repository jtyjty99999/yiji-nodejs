package com.yiji.openapi.message.product.ewpay;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.yiji.openapi.message.product.ewpay.info.EwpayClearItems;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-25 18:01.
 */
@OpenApiMessage(service = "qftClear", type = ApiMessageType.Request)
public class QftClearRequest extends ApiRequest {

    /**
     * 外部商户清分批次号
     */
    @NotNull
    @Size(min = 1, max = 32)
    @OpenApiField(desc = "商户清分批次号",demo = "12348765346584")
    private String outBatchNo;

    /**
     * 清分订单列表
     */
    @NotNull
    @OpenApiField(desc = "清分订单列表")
    private List<EwpayClearItems> clearOrderItems;

    public String getOutBatchNo() {
        return outBatchNo;
    }

    public void setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo;
    }

    public List<EwpayClearItems> getClearOrderItems() {
        return clearOrderItems;
    }

    public void setClearOrderItems(List<EwpayClearItems> clearOrderItems) {
        this.clearOrderItems = clearOrderItems;
    }
}
