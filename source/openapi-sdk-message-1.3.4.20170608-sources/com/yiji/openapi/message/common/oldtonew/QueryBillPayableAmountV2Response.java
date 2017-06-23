package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.message.common.oldtonew.info.PayableInfos;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-28 14:00.
 */
@Deprecated
@OpenApiMessage(service = "mobileBind", type = ApiMessageType.Response)
public class QueryBillPayableAmountV2Response extends ApiResponse {

    @OpenApiField(desc = "欠费总额",demo = "88.66")
    private Money totalPayable;

    @OpenApiField(desc = "支付列表")
    private PayableInfos info;

    public Money getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(Money totalPayable) {
        this.totalPayable = totalPayable;
    }

    public PayableInfos getInfo() {
        return info;
    }

    public void setInfo(PayableInfos info) {
        this.info = info;
    }
}
