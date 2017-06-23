package com.yiji.openapi.message.common.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-10-12 9:40.
 */
@OpenApiMessage(service = "commonPactQueryByCardNo", type = ApiMessageType.Response)
public class CommonPactQueryByCardNoResponse extends ApiResponse {
    /**
     * 流水号
     */
    @OpenApiField(desc = "签约流水号", demo = "123456978312")
    private String pactNo;

    /**
     * 会员号
     */
    @OpenApiField(desc = "会员号", demo = "12564798123")
    private String userId;

    /**
     * 签约类型
     */
    @OpenApiField(desc = "签约类型", demo = "REAL_NAME")
    private String pactType;

    /**
     * 签约用途
     */
    @OpenApiField(desc = "签约用途", demo = "WITHDRAW")
    private String purpose;

    /**
     * 签约状态
     */
    @OpenApiField(desc = "签约状态", demo = "PACT_SUCCESS")
    private String status;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPactType() {
        return pactType;
    }

    public void setPactType(String pactType) {
        this.pactType = pactType;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
