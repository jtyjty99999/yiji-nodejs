package com.yiji.openapi.message.product.common.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
public class CreatTradeInfo {

    /**
     * 单笔交易订单号
     */
    @NotNull
    @Length(min = 1, max = 64)
    @OpenApiField(desc = "单笔交易外部订单号",demo = "234531545")
    private String merchOrderNo;

    /**
     * 交易名称
     */
    @Length(max = 64)
    @OpenApiField(desc = "交易名称",demo = "及时到账")
    private String tradeName;

    /**
     * 交易金额
     */
    @NotNull
    @OpenApiField(desc = "交易金额",demo = "84.51")
    private Money tradeAmount;

    @OpenApiField(desc = "交易流水号")
    private String tradeNo;

    @NotNull
    @OpenApiField(desc = "创建结果",demo = "SUCCESS",constraint = "{\"data\":[\"SUCCESS：创建成功\",\"FAIL：创建失败\"],\"name\":\"创建结果\"}")
    private String creatResult;

    @OpenApiField(desc = "失败原因")
    private String failReason;

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getCreatResult() {
        return creatResult;
    }

    public void setCreatResult(String creatResult) {
        this.creatResult = creatResult;
    }
}
