package com.yiji.openapi.message.product.ccp;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Administrator on 2016/3/25.
 */

@OpenApiMessage(service = "ccpLoan", type = ApiMessageType.Request)
public class CcpLoanApiRequest extends ApiRequest {


    @NotBlank
    @OpenApiField(desc = "融资订单号",demo = "201603130054")
    private String bizNo;

    @NotBlank
    @OpenApiField(desc = "外部商户订单号",demo = "201603080111111")
    private String outOrderNo;


    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }
}
