/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-19 14:48 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/19
 */
@OpenApiMessage(service = "tradeCreate", type = ApiMessageType.Response)
public class TradeCreateResponse extends ApiResponse {

    @OpenApiField(desc = "交易号",demo = "12301239102321")
    private String tradeNo;

    @OpenApiField(desc = "入口",demo = "01")
    private String inlet;

    @OpenApiField(desc = "商户卡号",demo = "12301239102321")
    private String merchantCardNo;

    @OpenApiField(desc = "商户账号",demo = "12301239102321")
    private String merchantAccNo;

    @OpenApiField(desc = "商户用户ID",demo = "12301239102321")
    private String merchantUserId;

    @OpenApiField(desc = "商户业务流水号",demo = "12301239102321")
    private String merchantOrderBizNo;

    @OpenApiField(desc = "GID",demo = "12301239102321")
    private String gid;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
    }

    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo;
    }

    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getMerchantOrderBizNo() {
        return merchantOrderBizNo;
    }

    public void setMerchantOrderBizNo(String merchantOrderBizNo) {
        this.merchantOrderBizNo = merchantOrderBizNo;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGid() {
        return gid;
    }
}
