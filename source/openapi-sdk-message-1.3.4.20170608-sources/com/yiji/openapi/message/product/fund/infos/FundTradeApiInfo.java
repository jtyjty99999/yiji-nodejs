package com.yiji.openapi.message.product.fund.infos;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-22 9:49.
 */
public class FundTradeApiInfo {
    /**
     * 订单号
     */
    @OpenApiField(desc = "商户订单号", demo = "156435214685104684")
    private String merchOrderNo;

    /**
     * 易极付用户Id
     */
    @OpenApiField(desc = "易极付用户Id", demo = "2016548548546595485")
    private String userId;

    /**
     * 基金产品编码
     */
    @OpenApiField(desc = "基金产品编码", demo = "000371")
    private String fundProductCode;

    /**
     * 交易类型（申购、赎回）
     */
    @OpenApiField(desc = "交易类型", demo = "BUY_IN")
    private String tradeType;

    /**
     * 赎回模式（申购为null）
     */
    @OpenApiField(desc = "赎回模式", demo = "T_0")
    private String tradeMode;

    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额", demo = "88.66")
    private Money amount;

    /**
     * 交易时间
     */
    @OpenApiField(desc = "交易时间", demo = "2016-11-12 23:15:45")
    private Date tradeTime;

    /**
     * 交易状态
     */
    @OpenApiField(desc = "交易状态", demo = "SUCCESS")
    private String tradeStatus;

    public String getMerchOrderNo() {
        return merchOrderNo;
    }

    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFundProductCode() {
        return fundProductCode;
    }

    public void setFundProductCode(String fundProductCode) {
        this.fundProductCode = fundProductCode;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }
}
