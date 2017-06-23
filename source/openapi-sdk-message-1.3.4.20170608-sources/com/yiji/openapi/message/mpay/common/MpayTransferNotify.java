package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2015-10-27 11:15.
 */
@OpenApiMessage(service = "mpayTransfer", type = ApiMessageType.Notify)
public class MpayTransferNotify extends ApiNotify {
    @OpenApiField(desc = "交易类型",demo = "充值")
    private String type;

    @OpenApiField(desc = "交易金额",demo = "88.66")
    private String amount;

    @OpenApiField(desc = "用户ID",demo = "12345679801234567890")
    private String userId;

    @OpenApiField(desc = "用户名",demo = "易极付")
    private String userName;

    @OpenApiField(desc = "充值状态",constraint="充值状态",demo="true")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
