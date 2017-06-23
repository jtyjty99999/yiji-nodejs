/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-20 13:55 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-20
 */
@OpenApiMessage(service = "fundFreezeOrUnFreeze", type = ApiMessageType.Request)
public class FundFreezeOrUnFreezeRequest extends ApiRequest {

    /** 用户id <code>userId</code> */
    @NotBlank(message = "用户id不能为空")
    @OpenApiField(desc = "用户id" , demo = "20160418010011058184" , constraint = "")
    private String userId;

    /** 冻结(解冻)金额 <code>freezeAmount</code> */
    @NotNull(message = " 冻结(解冻)金额不能为空")
    @OpenApiField(desc = "冻结(解冻)金额" , demo = "300000" , constraint = "")
    private Money freezeAmount;

    /** 冻结(解冻)操作类型 <code>busiType</code> */
    @NotNull(message ="冻结(解冻)操作类型不能为空" )
    @OpenApiField(desc = "冻结(解冻)操作类型" , demo = "FREEZE" , constraint = "")
    private String busiType;

    /** 冻结(解冻)描述 <code>memo</code> */
    @NotBlank(message = "冻结(解冻)描述不能为空")
    @OpenApiField(desc = "冻结(解冻)描述" , demo = "冻结" , constraint = "")
    private String memo;

    /** 外部商户号 <code>outMerchantNo</code> */
    @NotBlank(message = "外部商户号不能为空")
    @OpenApiField(desc = "外部商户号" , demo = "" , constraint = "")
    private String outMerchantNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(Money freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOutMerchantNo() {
        return outMerchantNo;
    }

    public void setOutMerchantNo(String outMerchantNo) {
        this.outMerchantNo = outMerchantNo;
    }
}
