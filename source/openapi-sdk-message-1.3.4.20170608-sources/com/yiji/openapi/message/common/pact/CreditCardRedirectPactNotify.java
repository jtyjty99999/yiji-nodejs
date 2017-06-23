package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import org.hibernate.validator.constraints.Length;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/4/14 11:41.
 */
@OpenApiMessage(service = "creditCardRedirectPact", type = ApiMessageType.Notify)
public class CreditCardRedirectPactNotify extends ApiNotify {

    /** 签约流水号 */
    @OpenApiField(desc = "签约流水号",demo = "5125962520545124")
    private String pactNo;

    @Length(max = 20, min = 20)
    @OpenApiField(desc = "易极付用户ID", demo = "20165284596325148")
    private String userId;

    /** 签约状态 */
    @OpenApiField(desc = "签约状态",demo = "PACT",constraint = "{\"data\":[\"PACT:签约成功\",\"其它状态:签约失败\"],\"name\":\"签约状态\"}")
    private String pactStatus;

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

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
    }
}