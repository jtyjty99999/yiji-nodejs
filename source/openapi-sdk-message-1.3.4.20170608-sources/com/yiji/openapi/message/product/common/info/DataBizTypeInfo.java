/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-27 14:14 创建
 *
 */
package com.yiji.openapi.message.product.common.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-27
 */
public class DataBizTypeInfo {

    @OpenApiField(desc = "交易类型",demo = "WITHDRAW_SINGLE")
    private String dataBizTypeEnum;

    public String getDataBizTypeEnum() {
        return dataBizTypeEnum;
    }

    public void setDataBizTypeEnum(String dataBizTypeEnum) {
        this.dataBizTypeEnum = dataBizTypeEnum;
    }
}
