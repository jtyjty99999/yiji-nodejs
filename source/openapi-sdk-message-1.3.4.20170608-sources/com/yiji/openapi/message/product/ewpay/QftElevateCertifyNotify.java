package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2015-11-17 11:12.
 */
@OpenApiMessage(service = "qftElevateCertify", type = ApiMessageType.Notify)
public class QftElevateCertifyNotify extends ApiNotify {

    @OpenApiField(desc = "易极付用户ID",demo = "123456789012345657890")
    private String userId;

    @OpenApiField(desc = "实名认证状态",constraint = "ATP:认证通过<br>ATN:认证失败<br>AUT:认证中",demo = "ATP")
    private String status;

    @OpenApiField(desc = "用户类型",constraint = "PERSON:个人用户",demo = "PERSON")
    private String userType;

    @OpenApiField(desc = "结果描述",demo = "身份信息有误")
    private String message;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
