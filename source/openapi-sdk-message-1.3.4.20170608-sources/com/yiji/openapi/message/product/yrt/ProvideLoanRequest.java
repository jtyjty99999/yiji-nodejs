/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-17 16:43 创建
 *
 */
package com.yiji.openapi.message.product.yrt;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.yrt.info.TransEntriesInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-17
 */
@OpenApiMessage(service = "provideLoan", type = ApiMessageType.Request)
public class ProvideLoanRequest extends ApiRequest {

    /** 批量转账条目 <code>transEntries</code> */
    @NotNull(message = "批量转账条目不能为空")
    @OpenApiField(desc = "批量转账条目" , demo = "" , constraint = "")
    private List<TransEntriesInfo> transEntries;

    /** 交易日期 <code>transDate</code> */
    @NotNull(message = "交易日期不能为空")
    @OpenApiField(desc = "交易日期" , demo = "2016-10-25" , constraint = "")
    private Date transDate;

    /** 外部商户号 <code>outMerchantNo</code> */
    @NotBlank(message = "外部商户号不能为空")
    @OpenApiField(desc = "外部商户号" , demo = "20140730020001144381" , constraint = "")
    private String outMerchantNo;

    public List<TransEntriesInfo> getTransEntries() {
        return transEntries;
    }

    public void setTransEntries(List<TransEntriesInfo> transEntries) {
        this.transEntries = transEntries;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getOutMerchantNo() {
        return outMerchantNo;
    }

    public void setOutMerchantNo(String outMerchantNo) {
        this.outMerchantNo = outMerchantNo;
    }
}
