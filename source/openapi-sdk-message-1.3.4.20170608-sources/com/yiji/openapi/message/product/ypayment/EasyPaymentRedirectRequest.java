package com.yiji.openapi.message.product.ypayment;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-13 14:17.
 */
@OpenApiMessage(service = "easyPaymentRedirect", type = ApiMessageType.Request)
public class EasyPaymentRedirectRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "缴费类型",demo = "RECHARGE")
    private String paymentModel;

    @NotBlank
    @OpenApiField(desc = "平台标识",demo = "yipinhui")
    private String platformType;

    @NotBlank
    @OpenApiField(desc = "易极付ID",demo = "20150804020006971060")
    private String userId;

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
}
