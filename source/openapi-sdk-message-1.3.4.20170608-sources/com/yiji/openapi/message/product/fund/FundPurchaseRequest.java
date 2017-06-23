package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by qianli on 2016/12/26.
 * 升财宝申购（个人、企业）
 */
@OpenApiMessage(service = "fundPurchase", type = ApiMessageType.Request)
public class FundPurchaseRequest extends ApiRequest {
    /**
     * 易极付用户Id
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户Id", demo = "20165248596548562365")
    private String userId;

    /**
     * 基金产品编码
     */
    @NotBlank
    @OpenApiField(desc = "基金产品编码", demo = "000371")
    private String fundProductCode;

    /**
     * 用户在易极付的银行卡签约号(个人必传)
     */
    @OpenApiField(desc = "绑卡编号", demo = "5123454", constraint = "个人必传,企业不能传")
    private String pactNo;

    /**
     * 申购金额
     */
    @NotNull
    @OpenApiField(desc = "申购金额", demo = "125.66")
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

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
