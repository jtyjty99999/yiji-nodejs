/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-19 18:43 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.mpay.enums.PurposeEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-19
 */
@OpenApiMessage(service = "queryMpayUserBindCardList", type = ApiMessageType.Request)
public class QueryMpayUserBindCardListRequest extends ApiRequest {

    /**
     * 内部会员号
     */
    @NotNull
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "内部会员号" , demo = "20140709010000825596" , constraint = "")
    private String userId;
    /**
     * 签约用户 :DEDUCT、WITHDRAW、ALL
     */
    @NotNull
    @OpenApiField(desc = "签约目的" , demo = "DEDUCT" , constraint = "")
    private PurposeEnum purpose;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PurposeEnum getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeEnum purpose) {
        this.purpose = purpose;
    }
}
