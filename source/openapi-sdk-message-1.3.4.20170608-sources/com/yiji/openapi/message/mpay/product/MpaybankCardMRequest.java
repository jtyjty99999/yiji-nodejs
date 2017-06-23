/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-29 17:02 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-29
 */
@OpenApiMessage(service = "mpaybankCardM", type = ApiMessageType.Request)
public class MpaybankCardMRequest extends ApiRequest {

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "会员Id" , demo = "20141225010000062065" , constraint = "")
    private String userId;

    @NotBlank
    @OpenApiField(desc = "会员类型" , demo = "MEMBER_TYPE_PATERN" , constraint = "1，商户会员：MEMBER_TYPE_PATERN，2，易极付会员：MEMBER_TYPE_YIJI")
    private String memberType;

    @OpenApiField(desc = "用户姓名",demo = "熊本熊")
    private String name;

    @OpenApiField(desc = "用户姓名是否固定",demo = "true" ,constraint = "")
    private String stable;

    @OpenApiField(desc = "手机号码",demo = "13618456512" ,constraint = "")
    private String mobileNo;

    @OpenApiField(desc = "手机号码是否固定",demo = "true" ,constraint = "")
    private String mobileNoStable;

    @OpenApiField(desc = "用户银行卡号",demo = "6225445545654758" ,constraint = "")
    private String cardNo;

    @OpenApiField(desc = "用户银行卡号是否固定",demo = "true" ,constraint = "")
    private String cardNoStable;

    @OpenApiField(desc = "身份证号码",demo = "510231245415645" ,constraint = "")
    private String certNo;

    @OpenApiField(desc = "身份证号码是否固定",demo = "true" ,constraint = "")
    private String certNoStable;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStable() {
        return stable;
    }

    public void setStable(String stable) {
        this.stable = stable;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMobileNoStable() {
        return mobileNoStable;
    }

    public void setMobileNoStable(String mobileNoStable) {
        this.mobileNoStable = mobileNoStable;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNoStable() {
        return cardNoStable;
    }

    public void setCardNoStable(String cardNoStable) {
        this.cardNoStable = cardNoStable;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertNoStable() {
        return certNoStable;
    }

    public void setCertNoStable(String certNoStable) {
        this.certNoStable = certNoStable;
    }
}
