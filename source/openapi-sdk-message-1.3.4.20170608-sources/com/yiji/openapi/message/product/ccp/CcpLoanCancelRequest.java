package com.yiji.openapi.message.product.ccp;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Administrator on 2016/3/21.
*/
@OpenApiMessage(service = "ccpLoanCancel", type = ApiMessageType.Request)
public class CcpLoanCancelRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "商户订单号",demo = "201603080111111")
    private String outOrderNo;

    @NotBlank
    @OpenApiField(desc = "融资订单号",demo = "20160314152254")
    private String bizNo;

    @OpenApiField(desc = "备注",demo = "备注信息")
    private String remark;


    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

