package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-01 11:33.
 */
@OpenApiMessage(service = "queryPayChannelApi", type = ApiMessageType.Request)
public class QueryPayChannelApiRequest extends ApiRequest {

    /** 所属产品 */
    @OpenApiField(desc = "所属产品",demo = "DEFAULT")
    private String owner;
    //--------------------------------------常用--------------------------------------

    /** 渠道特殊标号[特殊时候用.默认N] */
    @OpenApiField(desc = "渠道特殊标号",demo = "N",constraint = "特殊时候用.默认N")
    private String extFlag;

    /** 产品子集[extFlag=Y时传入] */
    @OpenApiField(desc = "产品子集",demo = "yjf-common",constraint = "extFlag=Y时传入")
    private String subOwner = "yjf-common";

    /** 银行代码 */
    @OpenApiField(desc = "银行代码",demo = "ABC")
    private String bankCode;

    /** 支付类型[大类下所有] */
    @OpenApiField(desc = "支付类型",demo = "DEPOSIT")
    private String payType;

    /** 渠道类型[精确小类] */
    @OpenApiField(desc = "渠道类型",demo = "DEPOSIT_EBANK")
    private String apiType;

    /** 卡类型 */
    @OpenApiField(desc = "卡类型",demo = "DEBIT_CARD")
    private String cardType;

    /** 是否对公 */
    @OpenApiField(desc = "是否对公",demo = "Y")
    private String publicTag;

    @OpenApiField(demo = "123564812356412",desc = "交易号")
    private String tradeNo;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getExtFlag() {
        return extFlag;
    }

    public void setExtFlag(String extFlag) {
        this.extFlag = extFlag;
    }

    public String getSubOwner() {
        return subOwner;
    }

    public void setSubOwner(String subOwner) {
        this.subOwner = subOwner;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPublicTag() {
        return publicTag;
    }

    public void setPublicTag(String publicTag) {
        this.publicTag = publicTag;
    }
}
