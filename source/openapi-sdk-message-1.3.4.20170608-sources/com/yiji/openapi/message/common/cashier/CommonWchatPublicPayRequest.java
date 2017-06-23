package com.yiji.openapi.message.common.cashier;

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
 * @since 2016-01-11 10:50.
 */
@OpenApiMessage(service = "commonWchatPublicPay", type = ApiMessageType.Request)
public class CommonWchatPublicPayRequest extends ApiRequest {

    /**
     * 交易系统字段
     */
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
    private List<GoodsClause> goodsClauses;

    @Size(max = 10)
    @Valid
    @OpenApiField(desc = "分润项")
    private List<ProfitClause> profitClauses;

    @NotNull
    @OpenApiField(desc = "交易额",demo = "88.66")
    private Money tradeAmount = Money.zero();

    /** 币种（默认人民币） */
    @OpenApiField(desc = "币种",demo = "CNY",constraint = "默认人民币")
    private String currency;


    /**
     * 收银台字段
     */

    /** 公众号用户标示 是微信公众号和用户加起来生成的一个标识 */
    @NotBlank(message = "公众号用户标示不能为空")
    @OpenApiField(desc = "公众号用户标示",demo = "12346216312",constraint = "微信公众号与用户生成的一个标识")
    private String openid;

    /** IP地址 */
    @NotBlank(message = "IP不能为空")
    @OpenApiField(desc = "用户IP",demo = "192.168.1.1")
    private String userEndIp;

    /** 用户终端类型，01=PC端 02=移动端 */
    @OpenApiField(desc = "用户终端类型",demo = "MOBILE")
    private String userTemunalType;

    /** 收费扩展字段，特殊收费场景使用 */
    @OpenApiField(desc = "收费扩展字段",demo = "0",constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP")
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }

    public String getUserTemunalType() {
        return userTemunalType;
    }

    public void setUserTemunalType(String userTemunalType) {
        this.userTemunalType = userTemunalType;
    }

    public String getChargeExtend() {
        return chargeExtend;
    }

    public void setChargeExtend(String chargeExtend) {
        this.chargeExtend = chargeExtend;
    }
}
