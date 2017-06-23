package com.yiji.openapi.message.product.fund;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

import java.util.Date;

/**
 * Created by qianli on 2016/12/28.
 * 查询基金交易订单详情
 */
@OpenApiMessage(service = "fundTradeOrderDetails", type = ApiMessageType.Response)
public class FundTradeOrderDetailsResponse extends ApiResponse {

    /**
     * 易极付用户Id
     */
    @OpenApiField(desc = "易极付用户Id", demo = "20165248596548562365")
    private String userId;

    /**
     * 基金产品编码
     */
    @OpenApiField(desc = "基金产品编码", demo = "000371")
    private String fundProductCode;

    /**
     * 交易类型（申购、赎回）
     */
    @OpenApiField(desc = "交易类型", demo = "BUY_IN:申购;BUY_OUT:赎回")
    private String tradeType;

    /**
     * 赎回模式（申购为null）
     */
    @OpenApiField(desc = "赎回模式", demo = "T_0", constraint = "交易类型为BUY_IN时,返回null")
    private String tradeMode;

    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额", demo = "55.66")
    private Money amount;

    /**
     * 交易时间
     */
    @OpenApiField(desc = "交易时间", demo = "2016-12-28 16:05:41")
    private Date tradeTime;

    /**
     * 交易状态
     */
    @OpenApiField(desc = "业务状态", demo = "SUCCESS")
    private String tradeStatus;

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

    public void setTradeTime(Date tradeTime) {

        this.tradeTime = tradeTime;
    }

}
