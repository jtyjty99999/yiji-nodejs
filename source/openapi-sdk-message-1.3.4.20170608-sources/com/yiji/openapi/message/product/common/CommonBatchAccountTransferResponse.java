package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import org.hibernate.validator.constraints.Length;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/10/31 11:16.
 */
@OpenApiMessage(service = "commonBatchAccountTransfer", type = ApiMessageType.Response)
public class CommonBatchAccountTransferResponse extends ApiResponse {

    @Length(max = 20)
    @OpenApiField(desc = "登录ID", constraint = "会员登录名称")
    private String userId;

    /** 请求目标*/
    @Length(max = 20)
    @OpenApiField(desc = "请求目标")
    private String requestTarget;

    /** 入口编码 */
    @OpenApiField(desc = "入口编码",constraint = "入口编码")
    private String inlet = "01";

    /** 商户卡号 */
    @OpenApiField(desc = "商户卡号", constraint = "商户卡号")
    private String merchantCardNo;

    /** 商户资金账号 */
    @OpenApiField(desc = "商户资金帐号", constraint = "商户资金帐号")
    private String merchantAccountNo;

    /** 商户会员号 */
    @OpenApiField(desc = "商户会员号", constraint = "商户会员号")
    private String merchantUserId;

    /** 请求时间 */
    @OpenApiField(desc = "请求时间 ", constraint = "请求时间")
    private String requestDate;

    @OpenApiField(desc = "gid")
    private String gid;

    @OpenApiField(desc = "批量代发批次号")
    private String batchNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRequestTarget() {
        return requestTarget;
    }

    public void setRequestTarget(String requestTarget) {
        this.requestTarget = requestTarget;
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

    public String getMerchantAccountNo() {
        return merchantAccountNo;
    }

    public void setMerchantAccountNo(String merchantAccountNo) {
        this.merchantAccountNo = merchantAccountNo;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
}
