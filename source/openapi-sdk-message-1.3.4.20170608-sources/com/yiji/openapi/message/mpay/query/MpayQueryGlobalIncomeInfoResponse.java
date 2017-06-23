/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-20 19:51 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.mpay.query.info.OpenapiSummaryDataDtos;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "mpayQueryGlobalIncomeInfo", type = ApiMessageType.Response)
public class MpayQueryGlobalIncomeInfoResponse extends ApiResponse {

    @NotNull
    @OpenApiField(desc = "汇总信息列表", demo = "", constraint = "汇总信息列表")
    private List<OpenapiSummaryDataDtos> summaryList;

    @NotBlank
    @OpenApiField(desc = "数据时间", demo = "2016-02-12 13:14:44", constraint = "数据时间")
    private String sysDate;

    public List<OpenapiSummaryDataDtos> getSummaryList() {
        return summaryList;
    }

    public void setSummaryList(List<OpenapiSummaryDataDtos> summaryList) {
        this.summaryList = summaryList;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }
}
