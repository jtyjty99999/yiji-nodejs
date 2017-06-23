package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-29 9:56.
 */
@OpenApiMessage(service = "freeDeposit", type = ApiMessageType.Response)
public class FreeDepositResponse extends ApiResponse {

    @OpenApiField(desc = "gid")
    private String gid;

    @OpenApiField(desc = "易极付用户ID")
    private String userId;

    @OpenApiField(desc = "冻结类型")
    private String freezeBalanceType;

    @OpenApiField(desc = "收费扩展标识")
    private String chargeExtend;

    @OpenApiField(desc = "充值金额")
    private Money depositAmount;

    @OpenApiField(desc = "对公对私标志")
    private String publicOptionTag;

    @OpenApiField(desc = "样式风格")
    private String uiStyle = "FREE";

    @OpenApiField(desc = "接入渠道ID")
    private String channelId;

    @OpenApiField(desc = "商户卡号")
    private String merchantCardNo;

    @OpenApiField(desc = "商户资金账号")
    private String merchantAccNo;

    @OpenApiField(desc = "入口编码")
    private String inlet;

	public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

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

    public String getUiStyle() {
        return uiStyle;
    }

    public void setUiStyle(String uiStyle) {
        this.uiStyle = uiStyle;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getMerchantCardNo() {
        return merchantCardNo;
    }

    public void setMerchantCardNo(String merchantCardNo) {
        this.merchantCardNo = merchantCardNo;
    }

    public String getMerchantAccNo() {
        return merchantAccNo;
    }

    public void setMerchantAccNo(String merchantAccNo) {
        this.merchantAccNo = merchantAccNo;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
    }
}
