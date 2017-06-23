/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-20 19:59 创建
 *
 */
package com.yiji.openapi.message.mpay.query.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author zhike@yiji.com
 */
public class OpenapiSummaryDataDtos {

    @NotBlank
    @OpenApiField(desc = "代码", demo = "DSDFF_3234", constraint = "代码")
    private String code;

    @NotBlank
    @OpenApiField(desc = "名称", demo = "张三", constraint = "名称")
    private String name;

    @NotNull
    @OpenApiField(desc = "金额", demo = "66.66", constraint = "金额")
    private Money amount;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
