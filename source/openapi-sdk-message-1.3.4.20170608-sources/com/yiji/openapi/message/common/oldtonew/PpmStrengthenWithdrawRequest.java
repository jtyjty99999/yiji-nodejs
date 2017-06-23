package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-14 17:06.
 */
@OpenApiMessage(service = "ppmStrengthenWithdraw", type = ApiMessageType.Request)
public class PpmStrengthenWithdrawRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "易极付用户ID",demo = "1253456564812214645")
    private String userId;

    @OpenApiField(desc = "提现模式",demo = "0",constraint = "0:T+0;1:T+1;3:T+3;默认为T+0")
    private String delay;

    @OpenApiField(desc = "收费对象",constraint = "P平台商 U用户",demo = "P")
    private String payMode;

    @OpenApiField(demo = "收费码",desc = "收费码")
    private String chargeCode;

    @OpenApiField(desc = "业务类型",demo = "default")
    private String bizType;

    @OpenApiField(desc = "卡信息",demo = "156468513234")
    private String cardInfos;

    @OpenApiField(desc = "是否需要绑卡",demo = "N")
    private String needBindCard;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getCardInfos() {
        return cardInfos;
    }

    public void setCardInfos(String cardInfos) {
        this.cardInfos = cardInfos;
    }

    public String getNeedBindCard() {
        return needBindCard;
    }

    public void setNeedBindCard(String needBindCard) {
        this.needBindCard = needBindCard;
    }
}
