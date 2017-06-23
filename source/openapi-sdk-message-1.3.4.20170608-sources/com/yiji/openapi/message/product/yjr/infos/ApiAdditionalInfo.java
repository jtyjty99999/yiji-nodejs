package com.yiji.openapi.message.product.yjr.infos;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-14 9:56.
 */
public class ApiAdditionalInfo {
    /**
     * 用户客户端IP，目前使用ipv4的格式，例如192.168.1.110 *
     */
    @OpenApiField(desc = "用户客户端IP",constraint = "目前使用ipv4的格式",demo = "192.168.1.1")
    private String userEndIp;

    /**
     * 用户终端类型 *
     * <br>
     *     @see com.yjf.payengine.common.enums.String
     */
    @OpenApiField(desc = "用户终端类型",demo = "PC")
    private String userTemunalType;

    /**
     * 交易类型 *
     * <br>
     *     @see com.yjf.payengine.common.enums.String
     */
    @OpenApiField(desc = "交易类型",demo = "FASTPAYTRADE")
    private String tradeCategory;

    /**
     * 商品类型码
     */
    @OpenApiField(desc = "商品类型码",demo = "1236541")
    private String goodsTypeCode;

    /**
     * 商品类型名称
     */
    @OpenApiField(desc = "商品类型名称",demo = "电脑周边")
    private String goodsTypeName;

    /**
     * 商品名称
     */
    @OpenApiField(desc = "商品名称",demo = "笔记本")
    private String goodsName;

    /**
     * 商户名称 *
     */
    @OpenApiField(desc = "商户名称",demo = "重庆易极付科技有限公司")
    private String merchantName;

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

    public String getTradeCategory() {
        return tradeCategory;
    }

    public void setTradeCategory(String tradeCategory) {
        this.tradeCategory = tradeCategory;
    }

    public String getGoodsTypeCode() {
        return goodsTypeCode;
    }

    public void setGoodsTypeCode(String goodsTypeCode) {
        this.goodsTypeCode = goodsTypeCode;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }
}
