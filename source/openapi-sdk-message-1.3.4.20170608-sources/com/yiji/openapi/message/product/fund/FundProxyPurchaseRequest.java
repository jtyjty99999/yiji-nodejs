package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by qianli on 2017/01/04.
 * 代理申购
 */
@OpenApiMessage(service = "fundProxyPurchase", type = ApiMessageType.Request)
public class FundProxyPurchaseRequest extends ApiRequest {
    /**
     * 被代理申购的易极付用户Id
     */
    @NotBlank
    @OpenApiField(desc = "被代理申购的易极付用户Id",demo = "20165248596548562365")
    private String userId;

    /**
     * 代理申购用户的易极付Id
     */
    @NotBlank
    @OpenApiField(desc = "代理申购用户的易极付Id",demo = "20165248596548562365")
    private String proxyUserId;


    /**
     * 基金产品编码
     */
    @NotBlank
    @OpenApiField(desc = "基金产品编码",demo = "000371")
    private String fundProductCode;

    /**
     * 申购金额
     */
    @NotNull
    @OpenApiField(desc = "申购金额",demo = "125.66")
    private Money amount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFundProductCode() {
        return fundProductCode;
    }

    public void setFundProductCode(String fundProductCode) {
        this.fundProductCode = fundProductCode;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getProxyUserId() {
        return proxyUserId;
    }

    public void setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
    }
}
