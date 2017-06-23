package com.yiji.openapi.message.product.ewpay;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-11-17 11:11.
 */
@OpenApiMessage(service = "qftElevateCertify", type = ApiMessageType.Request)
public class QftElevateCertifyRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "易极付用户ID",constraint = "与partnerShopId一一对应",demo = "123456789012345657890")
    private String userId;

    @NotBlank
    @OpenApiField(desc = "商户平台用户ID",constraint = "与userId一一对应",demo = "321654879812345")
    private String partnerShopId;

    @OpenApiField(desc = "终端类型",demo = "PC")
    private String clientType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPartnerShopId() {
        return partnerShopId;
    }

    public void setPartnerShopId(String partnerShopId) {
        this.partnerShopId = partnerShopId;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
