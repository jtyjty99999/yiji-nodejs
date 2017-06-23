/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-19 14:57 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-19
 */
@OpenApiMessage(service = "queryMpayUserInfo", type = ApiMessageType.Response)
public class QueryMpayUserInfoResponse extends ApiResponse {
    /**
     * 内部会员号
     */
    @NotBlank
    @OpenApiField(desc = "内部会员号", demo = "20140709010000825596", constraint = "内部会员号")
    private String userId;
    /**
     * 真实姓名（mask）
     */
    @OpenApiField(desc = "真实姓名", demo = "熊本熊", constraint = "")
    private String realName;
    /**
     * 认证状态 <li>UNAUTHERIZED("U", "未认证") <li>AUTHORIZED("A", "已认证") <li>
     * INAUTHORIZED("I", "认证中") <li>REJECT("R", "被驳回") <li>OVERDUE("O", "过期")
     */
    @OpenApiField(desc = "认证状态", demo = "AUTHORIZED", constraint = "{\"data\":[\"UNAUTHERIZED:未认证\",\"AUTHORIZED:已认证\",\"INAUTHORIZED:认证中\",\"REJECT:被驳回\",\"OVERDUE:过期\"],\"name\":\"实名状态\"}")
    private String certifyStatus;
    /**
     * 手机号
     */
    @OpenApiField(desc = "手机号", demo = "13028784555", constraint = "")
    private String mobileNo;
    /**
     * 小额免密状态 1开启、0关闭
     */
    @OpenApiField(desc = "小额免密状态", demo = "2", constraint = "{\"data\":[\"1:开启\",\"0:关闭\"],\"name\":\"是否显示抬头\"}")
    private String microPayStatus;
    /**
     * 小额免密额度
     */
    @OpenApiField(desc = "小额免密额度", demo = "20000", constraint = "")
    private Money microMaxAmount;
    /**
     * 支付账户等级 暂定:0未开通、2二类用户、3三类用户
     */
    @OpenApiField(desc = "支付账户等级", demo = "", constraint = "{\"data\":[\"0:未开通\",\"2:二类用户\",\"3:三类用户\"],\"name\":\"支付账户等级\"}")
    private String accountLevel;
    /**
     * 账户余额
     */
    @NotNull
    @OpenApiField(desc = "账户余额", demo = "188888", constraint = "")
    private Money balance;

    /**
     * 是否已设置支付密码 1已设置，0未设置
     */
    @OpenApiField(desc = "是否已设置支付密码", demo = "1", constraint = "{\"data\":[\"1:已设置\",\"0:未设置\"],\"name\":\"是否已设置支付密码\"}\"")
    private String havePayPassword;

    /**
     * 支付账户状态:“0” 未开通 “1” 已开通 “2” 审核中 “3” 未通过 “4” 实名已过期
     */
    @OpenApiField(desc = "支付账户状态", demo = "", constraint = "“0” :未开通 “1” :已开通 “2”: 审核中 “3” :未通过 “4” :实名已过期")
    private String accountStatus;

    /**
     * 实名认证更新有效期状态:UN：无更新；UU：更新中；UP：更新通过；UR：更新驳回
     */
    @OpenApiField(desc = "实名认证更新有效期状态", demo = "", constraint = "UN：无更新；UU：更新中；UP：更新通过；UR：更新驳回")
    private String updateValidityStatus;

    /**
     * 实名即将过期提醒:“1”提醒 “0”不提醒
     */
    @OpenApiField(desc = "实名即将过期提醒", demo = "", constraint = "“1”提醒 “0”不提醒")
    private String remind;
    /**
     * 余额限额
     */
    @OpenApiField(desc = "余额限额", demo = "258888", constraint = "")
    private Money balanceQuota;

    @OpenApiField(desc = "开通支付账户时间", demo = "2016年6月15日", constraint = "开通支付账户时间")
    private String openPayAccountTime;

    @OpenApiField(desc = "证件有效期", demo = "2016年6月15日", constraint = "证件有效期")
    private String licenseValidTime;

    @Length(max = 18)
    @OpenApiField(desc = "证件号码", demo = "500221198412192145", constraint = "证件号码")
    private String certNo;

    @OpenApiField(desc = "支付账户开通失败原因", demo = "证件有效期过期", constraint = "当accountStatus为3的时候返回")
    private String failReason;

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getUpdateValidityStatus() {
        return updateValidityStatus;
    }

    public void setUpdateValidityStatus(String updateValidityStatus) {
        this.updateValidityStatus = updateValidityStatus;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind;
    }

    public Money getBalanceQuota() {
        return balanceQuota;
    }

    public void setBalanceQuota(Money balanceQuota) {
        this.balanceQuota = balanceQuota;
    }

    public String getHavePayPassword() {
        return havePayPassword;
    }

    public void setHavePayPassword(String havePayPassword) {
        this.havePayPassword = havePayPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCertifyStatus() {
        return certifyStatus;
    }

    public void setCertifyStatus(String certifyStatus) {
        this.certifyStatus = certifyStatus;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMicroPayStatus() {
        return microPayStatus;
    }

    public void setMicroPayStatus(String microPayStatus) {
        this.microPayStatus = microPayStatus;
    }

    public Money getMicroMaxAmount() {
        return microMaxAmount;
    }

    public void setMicroMaxAmount(Money microMaxAmount) {
        this.microMaxAmount = microMaxAmount;
    }

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public String getOpenPayAccountTime() {
        return openPayAccountTime;
    }

    public void setOpenPayAccountTime(String openPayAccountTime) {
        this.openPayAccountTime = openPayAccountTime;
    }

    public String getLicenseValidTime() {
        return licenseValidTime;
    }

    public void setLicenseValidTime(String licenseValidTime) {
        this.licenseValidTime = licenseValidTime;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
