/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-16 18:03 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-16
 */
@OpenApiMessage(service = "queryYrtCustomerInfo", type = ApiMessageType.Response)
public class QueryYrtCustomerInfoResponse extends ApiResponse {

    /**会员id*/
    @OpenApiField(desc = "会员id" , demo = "201608154878457" , constraint = "")
    private String userId;

    @OpenApiField(desc = "用户名",demo = "张三")
    private String userName;
    /**用户邮箱*/
    @OpenApiField(desc = "用户邮箱" , demo = "mao@yiji.com" , constraint = "")
    private String email;

    /**用户手机号*/
    @OpenApiField(desc = "用户手机号" , demo = "13658974512" , constraint = "")
    private String mobileNo;

    /**用户真实姓名*/
    @OpenApiField(desc = "用户真实姓名" , demo = "郑大壮" , constraint = "")
    private String realName;

    /**用户证件类型*/
    @OpenApiField(desc = "用户证件类型" , demo = "Identity_Card" , constraint = "")
    private String certType;

    /** 证件号 */
    @OpenApiField(desc = "证件号" , demo = "522101199902241219" , constraint = "")
    private String	certNo;

    /** 10,0 账户余额 */
    @OpenApiField(desc = "账户余额" , demo = "5888888" , constraint = "")
    private Money balance;

    /** 10,0 账户冻结额度 */
    @OpenApiField(desc = "账户冻结额度" , demo = "566666" , constraint = "")
    private Money freezeAmount;

    /**是否实名*/
    @OpenApiField(desc = "是否实名" , demo = "false" , constraint = "")
    private boolean isAuth = false;

    /**是否强实名*/
    @OpenApiField(desc = "是否强实名" , demo = "false" , constraint = "")
    private boolean isStrongAuth = false;

    /** 结果状态 */
    @NotBlank
    @OpenApiField(desc = "结果状态" , demo = "SUCCESS" , constraint = "")
    protected String status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public Money getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(Money freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public boolean isAuth() {
        return isAuth;
    }

    public void setAuth(boolean auth) {
        isAuth = auth;
    }

    public boolean isStrongAuth() {
        return isStrongAuth;
    }

    public void setStrongAuth(boolean strongAuth) {
        isStrongAuth = strongAuth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
