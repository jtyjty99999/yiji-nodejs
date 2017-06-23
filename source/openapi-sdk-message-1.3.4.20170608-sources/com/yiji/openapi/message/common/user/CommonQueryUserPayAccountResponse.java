package com.yiji.openapi.message.common.user;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

import java.util.Date;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/20 11:11.
 */
@OpenApiMessage(service = "commonQueryUserPayAccount", type = ApiMessageType.Response)
public class CommonQueryUserPayAccountResponse extends ApiResponse {

    /**
     * 是否是支付账户
     * */
    @OpenApiField(desc = "是否开通支付账户",demo = "true")
    private boolean isPayAccount = false;

    /**
     * 支付账户等级
     * <br>仅仅当账户登记为 [1，2，3] 的时候才会返回值
     */
    @OpenApiField(desc = "支付账户等级",demo = "LEVEL_0")
    private String accountLevel;

    ///////////////////////实名相关信息///////////////////
    /**
     * 实名状态
     * 可以通过这个枚举判断是否开通支付账户以及开通状态
     * */
    @OpenApiField(desc = "实名状态",demo = "UNAUTHERIZED")
    private String certifyStatus;

    /**
     * 实名认证升级状态：UN("UN", "无升级"),UU("UU", "升级中"),UP("UP", "升级通过"),UR("UR", "升级驳回");     *
     */
    @OpenApiField(desc = "实名认证升级状态",demo = "UN")
    private String promoteStatus;

    /**
     * 开通支付账户时间
     * */
    @OpenApiField(desc = "开通支付账户时间",demo = "2017-04-25 14:45:54",constraint = "格式：yyyy-MM-dd hh:mm:ss")
    private Date openPayAccTime;

    public boolean isPayAccount() {
        return isPayAccount;
    }

    public void setPayAccount(boolean payAccount) {
        isPayAccount = payAccount;
    }

    public Date getOpenPayAccTime() {
        return openPayAccTime;
    }

    public void setOpenPayAccTime(Date openPayAccTime) {
        this.openPayAccTime = openPayAccTime;
    }

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public String getCertifyStatus() {
        return certifyStatus;
    }

    public void setCertifyStatus(String certifyStatus) {
        this.certifyStatus = certifyStatus;
    }

    public String getPromoteStatus() {
        return promoteStatus;
    }

    public void setPromoteStatus(String promoteStatus) {
        this.promoteStatus = promoteStatus;
    }
}
