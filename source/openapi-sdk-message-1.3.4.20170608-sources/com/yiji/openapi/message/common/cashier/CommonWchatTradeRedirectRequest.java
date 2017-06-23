package com.yiji.openapi.message.common.cashier;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.common.trade.info.GoodsClause;
import com.yiji.openapi.message.common.trade.info.ProfitClause;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-11-27 17:14.
 */
@OpenApiMessage(service = "commonWchatTradeRedirect", type = ApiMessageType.Request)
public class CommonWchatTradeRedirectRequest extends ApiRequest {
    @Length(max = 64)
    @OpenApiField(desc = "交易名称",demo = "交易")
    private String tradeName;

    @Length(max = 64)
    @NotBlank
    @OpenApiField(desc = "外部订单号",demo = "12345698701")
    private String outOrderNo;

    @NotBlank
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "卖家id",demo = "20140814010000052219")
    private String sellerUserId;

    @Length(max = 20, min = 20)
    @OpenApiField(desc = "卖家卡号",constraint = "非银行卡号，而是易极付体系多资金卡号",demo = "2116498321658416631")
    private String sellerCardNo;

    @Length(max = 1024)
    @OpenApiField(desc = "交易备注",demo = "付款")
    protected String tradeMemo;

    @NotEmpty
    @Valid
    @OpenApiField(desc = "商品条款")
    private List<GoodsClause> goodsClauses = new ArrayList<GoodsClause>();

    @Size(max = 10)
    @Valid
    @OpenApiField(desc = "分润项")
    private List<ProfitClause> profitClauses = new ArrayList<ProfitClause>();

    @NotNull
    @OpenApiField(desc = "交易额",demo = "88.66")
    private Money tradeAmount = Money.zero();

    /** 币种（默认人民币） */
    @OpenApiField(desc = "币种",demo = "CNY",constraint = "默认人民币")
    private String currency;

    /**
     * 收银台字段
     */
    @OpenApiField(desc = "付款类型",demo = "NORMAL")
    private String payFrom;

    @OpenApiField(desc = "页面风格",demo = "PC_NORMAL")
    private String uiStyle;

    @OpenApiField(desc = "特殊渠道标示",constraint = "如农行K宝、minipay等",demo = "minipay")
    private String mutableType;

    @OpenApiField(desc = "收费扩展字段", constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP",demo = "0")
    private String chargeExtend;

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public String getSellerCardNo() {
        return sellerCardNo;
    }

    public void setSellerCardNo(String sellerCardNo) {
        this.sellerCardNo = sellerCardNo;
    }

    public String getTradeMemo() {
        return tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo;
    }

    public List<GoodsClause> getGoodsClauses() {
        return goodsClauses;
    }

    public void setGoodsClauses(List<GoodsClause> goodsClauses) {
        this.goodsClauses = goodsClauses;
    }

    public List<ProfitClause> getProfitClauses() {
        return profitClauses;
    }

    public void setProfitClauses(List<ProfitClause> profitClauses) {
        this.profitClauses = profitClauses;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPayFrom() {
        return payFrom;
    }

    public void setPayFrom(String payFrom) {
        this.payFrom = payFrom;
    }

    public String getUiStyle() {
        return uiStyle;
    }

    public void setUiStyle(String uiStyle) {
        this.uiStyle = uiStyle;
    }

    public String getMutableType() {
        return mutableType;
    }

    public void setMutableType(String mutableType) {
        this.mutableType = mutableType;
    }

    public String getChargeExtend() {
        return chargeExtend;
    }

    public void setChargeExtend(String chargeExtend) {
        this.chargeExtend = chargeExtend;
    }
}
