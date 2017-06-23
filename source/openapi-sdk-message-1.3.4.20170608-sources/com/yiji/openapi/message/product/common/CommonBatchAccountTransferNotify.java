package com.yiji.openapi.message.product.common;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/10/31 11:17.
 */
@OpenApiMessage(service = "commonBatchAccountTransfer", type = ApiMessageType.Notify)
public class CommonBatchAccountTransferNotify extends ApiNotify {

    @OpenApiField(desc = "商户子业务订单号",demo = "61265164141615614")
    private String subMerchOrderNo;

    @OpenApiField(desc = "代发金额",demo = "88.66")
    private String amount;

    @OpenApiField(desc = "代发状态",demo = "SUCCESS",constraint = "{\"data\":[\"SUCCESS:成功\",\"FAIL:失败\",\"PROCESSING:处理中\"],\"name\":\"代发状态\"}")
    private String status;

    @OpenApiField(desc = "失败原因",demo = "失败原因")
    private String failReason;

    @OpenApiField(desc = "平台商手续费",demo = "8.66")
    private String merchantChargeAmount;

    public String getSubMerchOrderNo() {
        return subMerchOrderNo;
    }

    public void setSubMerchOrderNo(String subMerchOrderNo) {
        this.subMerchOrderNo = subMerchOrderNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public String getMerchantChargeAmount() {
        return merchantChargeAmount;
    }

    public void setMerchantChargeAmount(String merchantChargeAmount) {
        this.merchantChargeAmount = merchantChargeAmount;
    }
}
