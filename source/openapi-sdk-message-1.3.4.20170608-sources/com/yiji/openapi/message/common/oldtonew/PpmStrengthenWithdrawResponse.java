package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-14 17:56.
 */
@OpenApiMessage(service = "ppmStrengthenWithdraw", type = ApiMessageType.Response)
public class PpmStrengthenWithdrawResponse extends ApiResponse {
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

    @OpenApiField(desc = "inlet",demo = "")
    private String inlet;

    @OpenApiField(desc = "商户卡号",demo = "")
    private String merchantCardNo;

    @OpenApiField(desc = "商户ID",demo = "")
    private String merchantUserId;

    @OpenApiField(desc = "商户资金账号",demo = "")
    private String merchantAccNo;

    @OpenApiField(desc = "商户号",demo = "")
    private String merchantId;

    @OpenApiField(desc = "操作员ID",demo = "")
    private String operatorId;

    @OpenApiField(desc = "操作员名字",demo = "")
    private String operatorName;

    @OpenApiField(desc = "key",demo = "")
    private String key;

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

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
