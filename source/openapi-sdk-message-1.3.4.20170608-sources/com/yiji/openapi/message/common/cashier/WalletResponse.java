package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com on 2016/7/26.
 */
@OpenApiMessage(service = "wallet", type = ApiMessageType.Response)
public class WalletResponse extends ApiResponse {

    @OpenApiField(desc = "易极付用户ID", demo = "21345678901234567980")
    private String userId;

    @OpenApiField(desc = "gid")
    private String gid;

    @OpenApiField(desc = "入口")
    private String inlet;

    @OpenApiField(desc = "商户卡号")
    private String merchantCardNo;

    @OpenApiField(desc = "请求类型")
    private String requestTarget = "WALLET_HOME";

    @OpenApiField(desc = "请求时间")
    private String requestDate;

    @OpenApiField(desc = "时间戳")
    private long timestamp = System.currentTimeMillis();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
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

    public String getRequestTarget() {
        return requestTarget;
    }

    public void setRequestTarget(String requestTarget) {
        this.requestTarget = requestTarget;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
