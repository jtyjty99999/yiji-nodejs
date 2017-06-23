package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/5 14:18.
 */
@OpenApiMessage(service = "commonOfflineTradePay", type = ApiMessageType.Request)
public class CommonOfflineTradePayRequest extends ApiRequest {

    /**
     * 用户客户端ip
     */
    @Size(max = 128)
    @OpenApiField(desc = "用户客户端ip" , demo = "192.168.22.33" , constraint = "")
    private String userEndIp;

    /** 商品类型名称 */
    @Size(max = 64)
    @OpenApiField(desc = "商品类型" , demo = "食品" , constraint = "")
    private String goodsType;

    /** 商品名称 */
    @Size(max = 64)
    @OpenApiField(desc = "商品名称" , demo = "大熊" , constraint = "")
    private String goodsName;



    @Length(max = 128)
    @OpenApiField(desc = "备注" , demo = "食品类" , constraint = "")
    private String memo;

    /**
     * 买家会员号
     */
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "买家会员号" , demo = "205110515125145125145" , constraint = "")
    private String buyerUserId;

    /**
     * 卖家会员号
     */
    @Length(max = 20, min = 20)
    @NotBlank
    @OpenApiField(desc = "卖家会员号" , demo = "205110515125145125145" , constraint = "")
    private String sellerUserId;

    /**
     * 交易金额
     */
    @NotNull
    @OpenApiField(desc = "交易金额" , demo = "258888" , constraint = "")
    private Money tradeAmount;

    /**
     * 未付款自动关闭时间，单位为分钟，默认10天
     */
    @OpenApiField(desc = "未付款自动关闭时间" , demo = "14400" , constraint = "单位为分钟，默认10天")
    private long autoCloseDuration = 10 * 24 * 60L;

    /**
     * 请求mac地址
     */
    @Length(max = 48)
    @OpenApiField(desc = "请求mac地址" , demo = "00-50-56-C0-00-08" , constraint = "")
    private String macAddress;

    /**
     * 分润信息
     */
    @OpenApiField(desc = "分润信息",constraint = "分润最多支持10笔,单笔分润格式:userId1~amount1~memo1^userId2~amount2~memo2",demo = "2012658947952258175214~88.66~分润^45631541323241~65.21~fenrun")
    private String shareProfits;

    @OpenApiField(desc = "分润方式",demo = "M",constraint = "默认M")
    private String shareMethod;

    @OpenApiField(desc = "二级商户partnerId",demo = "20165245968745236951",constraint = "仅限特殊场景使用（商户平台下的商户），如没有切勿传递该字段")
    private String merchantPartnerId;

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public long getAutoCloseDuration() {
        return autoCloseDuration;
    }

    public void setAutoCloseDuration(long autoCloseDuration) {
        this.autoCloseDuration = autoCloseDuration;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getShareProfits() {
        return shareProfits;
    }

    public void setShareProfits(String shareProfits) {
        this.shareProfits = shareProfits;
    }

    public String getShareMethod() {
        return shareMethod;
    }

    public void setShareMethod(String shareMethod) {
        this.shareMethod = shareMethod;
    }

    public String getMerchantPartnerId() {
        return merchantPartnerId;
    }

    public void setMerchantPartnerId(String merchantPartnerId) {
        this.merchantPartnerId = merchantPartnerId;
    }
}
