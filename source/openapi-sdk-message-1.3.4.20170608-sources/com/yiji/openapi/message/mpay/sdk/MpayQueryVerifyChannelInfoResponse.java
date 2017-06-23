package com.yiji.openapi.message.mpay.sdk;

import java.util.List;

import com.yiji.openapi.message.mpay.sdk.info.OpenapiChannelInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
@OpenApiMessage(service = "mpayQueryVerifyChannelInfo", type = ApiMessageType.Response)
public class MpayQueryVerifyChannelInfoResponse extends ApiResponse {
    /**
     * 真实姓名
     */
    @OpenApiField(desc = "真实姓名",demo = "张三")
    private String realName;

    /**
     * 身份证号
     */
    @OpenApiField(desc = "身份证号",demo = "502402561262515153")
    private String certNo;

    /**
     * 手机号码
     */
    @OpenApiField(desc = "手机号码",demo = "15238745230")
    private String mobileNo;

    /**
     * 开通、提升支付账户还需要的渠道数
     */
    @OpenApiField(desc = "需要的渠道数",demo = "5",constraint = "开通、提升账户还需要的渠道数")
    private int requireNum;

    /**
     * 认证渠道信息列表
     */
    @OpenApiField(desc = "认证渠道信息列表")
    private List<OpenapiChannelInfo> passChannelInfos;

    /**
     * 未通过渠道信息列表：包括未通过、未认证
     */
    @OpenApiField(desc = "未通过渠道信息列表",constraint = "包括未通过、未认证的渠道列表")
    private List<OpenapiChannelInfo> unPassChannelInfos;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getRequireNum() {
        return requireNum;
    }

    public void setRequireNum(int requireNum) {
        this.requireNum = requireNum;
    }

    public List<OpenapiChannelInfo> getPassChannelInfos() {
        return passChannelInfos;
    }

    public void setPassChannelInfos(List<OpenapiChannelInfo> passChannelInfos) {
        this.passChannelInfos = passChannelInfos;
    }

    public List<OpenapiChannelInfo> getUnPassChannelInfos() {
        return unPassChannelInfos;
    }

    public void setUnPassChannelInfos(List<OpenapiChannelInfo> unPassChannelInfos) {
        this.unPassChannelInfos = unPassChannelInfos;
    }
}
