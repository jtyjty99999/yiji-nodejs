package com.yiji.openapi.message.product.pmp;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-14 10:57.
 */
@OpenApiMessage(service = "pmpQueryOrderStatus", type = ApiMessageType.Request)
public class PmpQueryOrderStatusRequest extends ApiRequest {

    @NotBlank
    @Size( max = 20)
    @OpenApiField(desc = "商户订单号", constraint = "订单号长度不超过20字节",demo = "132564789123564")
    private String outOrderId;

    @NotBlank
    @OpenApiField(desc = "机构介入识别标识",demo = "yongh")
    private String orgAccId;

    public String getOrgAccId() {
        return orgAccId;
    }

    public void setOrgAccId(String orgAccId) {
        this.orgAccId = orgAccId;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }
}
