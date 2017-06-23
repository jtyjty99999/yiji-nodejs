package com.yiji.openapi.message.common.cashier;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-29 9:56.
 */
@OpenApiMessage(service = "freeDeposit", type = ApiMessageType.Request)
public class FreeDepositRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "易极付用户ID",demo = "12345678901234567890")
    private String userId;

    @OpenApiField(desc = "冻结类型",demo = "DEPOSIT_FREEZE")
    private String freezeBalanceType;

    @OpenApiField(desc = "收费扩展标识",constraint = "用于扩展收费，例如商户要求vip按一种方式收费，非vip按另一种方式收费",demo = "VIP")
    private String chargeExtend;

    @NotNull
    @OpenApiField(desc = "充值金额",demo = "88.66")
    private Money depositAmount;

    @OpenApiField(desc = "对公对私标志",demo = "PERSONAL",constraint = "不填则既支持对公又支持对私")
    private String publicOptionTag;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFreezeBalanceType() {
        return freezeBalanceType;
    }

    public void setFreezeBalanceType(String freezeBalanceType) {
        this.freezeBalanceType = freezeBalanceType;
    }

    public String getChargeExtend() {
        return chargeExtend;
    }

    public void setChargeExtend(String chargeExtend) {
        this.chargeExtend = chargeExtend;
    }

    public Money getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Money depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getPublicOptionTag() {
        return publicOptionTag;
    }

    public void setPublicOptionTag(String publicOptionTag) {
        this.publicOptionTag = publicOptionTag;
    }
}
