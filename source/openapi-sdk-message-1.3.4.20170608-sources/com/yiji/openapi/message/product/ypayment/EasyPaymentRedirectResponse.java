package com.yiji.openapi.message.product.ypayment;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-13 14:17.
 */
@OpenApiMessage(service = "easyPaymentRedirect", type = ApiMessageType.Response)
public class EasyPaymentRedirectResponse extends ApiResponse {

    @OpenApiField(desc = "平台标识",demo = "yipinhui")
    private String platformType;

    @OpenApiField(desc = "用户ID",demo = "20150804020006971060")
    private String userId;

    @OpenApiField(desc = "系统时间",demo = "")
    private String systemTime;

    @OpenApiField(desc = "gid",demo = "")
    private String gid;

    @OpenApiField(desc = "入口编码",demo = "01")
    private String inlet;

    @OpenApiField(desc = "缴费类型",demo = "RECHARGE")
    private String paymentModel;

    public String getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(String paymentModel) {
        this.paymentModel = paymentModel;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
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

}
