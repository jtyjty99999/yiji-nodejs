package com.yiji.openapi.message.product.ewpay.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-24 14:56.
 */
public class EwpayPaymentRelationShip {
    /** 用户id */
    @OpenApiField(desc = "用户id",demo = "12345678901234658970",constraint = "易极付用户ID")
    private String userId;

    /** 用户名 */
    @OpenApiField(desc = "用户名",demo = "企富通")
    private String userName;

    /** 用户真实姓名 */
    @OpenApiField(desc = "用户真实姓名",demo = "企富通")
    private String userRealName;

    /** 用户电话 */
    @OpenApiField(desc = "用户电话",demo = "10086100101")
    private String mobile;

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

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
