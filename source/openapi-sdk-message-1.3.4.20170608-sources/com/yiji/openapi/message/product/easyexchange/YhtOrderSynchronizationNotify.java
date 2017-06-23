/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-05 14:59 创建
 *
 */
package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-05
 */
@OpenApiMessage(service = "yhtOrderSynchronization", type = ApiMessageType.Notify)
public class YhtOrderSynchronizationNotify extends ApiNotify {
    /**付款号 */
    @OpenApiField(desc = "付款号" , demo = "021505105002100041212" , constraint = "")
    private String crossPayNo;

    @OpenApiField(desc = "批次号" , demo = "021505105002100041212" , constraint = "")
    private String batchNo;

    @OpenApiField(desc = "错误文件的名称" , demo = "fileName.txt" , constraint = "")
    private String errorFile;

    @OpenApiField(desc = "金额" , demo = "258555" , constraint = "")
    private Money amount;

    public String getCrossPayNo() {
        return crossPayNo;
    }

    public void setCrossPayNo(String crossPayNo) {
        this.crossPayNo = crossPayNo;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getErrorFile() {
        return errorFile;
    }

    public void setErrorFile(String errorFile) {
        this.errorFile = errorFile;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
