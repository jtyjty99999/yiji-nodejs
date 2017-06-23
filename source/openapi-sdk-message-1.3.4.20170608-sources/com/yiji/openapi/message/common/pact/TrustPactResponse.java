package com.yiji.openapi.message.common.pact;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/3/24 9:19.
 */
@OpenApiMessage(service = "trustPact", type = ApiMessageType.Response)
public class TrustPactResponse extends ApiResponse {

    @OpenApiField(desc = "外部会员号",demo = "32436165246854",constraint = "不传则为随机值")
    private String outUserId;

    /**
     * 签约流水号（空中签约时，该参数代表子协议号）
     */
    @OpenApiField(desc = "签约流水号",demo = "45616416165416",constraint = "空中签约也叫子协议号")
    private String pactNo;

    /**
     * 签约状态
     */
    @OpenApiField(desc = "签约状态",demo = "PACT",constraint = "{\"data\":[\"PACT:签约成功\",\"PACT_FAIL:签约失败\"],\"name\":\"签约状态\"}")
    private String pactStatus;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
    }

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
    }
}
