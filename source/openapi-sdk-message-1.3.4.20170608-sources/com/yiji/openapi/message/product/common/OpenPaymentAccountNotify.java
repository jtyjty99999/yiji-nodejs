package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import org.hibernate.validator.constraints.Length;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "openPaymentAccount", type = ApiMessageType.Notify)
public class OpenPaymentAccountNotify extends ApiNotify {


    @OpenApiField(desc = "用户注册类型",demo = "PERSONAL")
    private String registerUserType;

    @Length(max = 100)
    @OpenApiField(desc = "外部用户id",demo = "216521651821")
    private String outUserId;

    @OpenApiField(desc = "易极付用户会员id",demo = "216521651821")
    private String userId;

    @OpenApiField(desc = "账户等级",demo = "216521651821",constraint = "{\"data\":[\"1：一类\",\"2：二类\",\"3：三类\"],\"name\":\"仅针对个人支付账户\"}")
    private String accountLevel;

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public String getRegisterUserType() {
        return registerUserType;
    }

    public void setRegisterUserType(String registerUserType) {
        this.registerUserType = registerUserType;
    }
}
