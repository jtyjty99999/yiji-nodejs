package com.yiji.openapi.message.product.ewpay.info;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-28 9:44.
 */
public class EwpayClearItems {

    /**
     * 外部订单号
     */
    @NotNull
    @Size(min = 1, max = 32)
    @OpenApiField(desc = "外部订单号",demo = "21345698701234569780")
    private String outOrderNo;

    /**
     * 企富通订单号
     */
    @NotNull
    @Size(min = 1, max = 35)
    @OpenApiField(desc = "企富通订单号",demo = "2315546987")
    private String payOrderNo;

    /**
     * 服务费
     */
    @NotNull
    @OpenApiField(desc = "服务费",demo = "88.66")
    private Money serviceCharge;

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

    public Money getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Money serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
}
