/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-04 16:00 创建
 *
 */
package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-04
 */
@OpenApiMessage(service = "yhtRemitMoneyApply", type = ApiMessageType.Notify)
public class YhtRemitMoneyApplyNotify extends ApiNotify {

    @OpenApiField(desc = "付款号" , demo = "2015013011112141" , constraint = "")
    private String crossPayNo;


    public String getCrossPayNo() {
        return crossPayNo;
    }

    public void setCrossPayNo(String crossPayNo) {
        this.crossPayNo = crossPayNo;
    }
}
