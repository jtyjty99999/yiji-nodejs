package com.yiji.openapi.message.product.fund;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by qianli on 2017/01/04.
 * 代理申购
 */
@OpenApiMessage(service = "fundProxyPurchase", type = ApiMessageType.Notify)
public class FundProxyPurchaseNotify extends ApiNotify {

    /**
     * 结果状态
     */
    @NotNull
    @OpenApiField(desc = "结果状态",demo = "SUCCESS",constraint = "{\"data\":[\"SUCCESS:申购成功\",\"FAIL:申购失败\"],\"name\":\"申购结果\"}")
    private String status;

    /**
     * 申购金额
     */
    @NotNull
    @OpenApiField(desc = "申购金额",demo = "125.66")
    private Money amount;

    @OpenApiField(desc = "基金公司受理时间",demo = "1972-12-12 00:45:54")
    private Date receiveTime;

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
