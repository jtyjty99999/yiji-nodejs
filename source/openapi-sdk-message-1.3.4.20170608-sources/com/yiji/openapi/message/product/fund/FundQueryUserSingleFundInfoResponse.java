package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by qianli on 2017/1/3.
 * 查找指定用户的基金账务（查一条）
 */
@OpenApiMessage(service = "fundQueryUserSingleFundInfo", type = ApiMessageType.Response)
public class FundQueryUserSingleFundInfoResponse extends ApiResponse {
    /**
     * 总收益
     */
    @OpenApiField(desc = "总收益",demo = "0.66")
    private Money totalProfit;

    /**
     * 昨日收益
     */
    @OpenApiField(desc = "昨日收益",demo = "0.66")
    private Money yesterdayProfit;

    /**
     * 余额
     */
    @OpenApiField(desc = "余额",demo = "188.66")
    private Money balance;

    /**
     * 易极付用户Id
     */
    @OpenApiField(desc = "易极付用户Id",demo = "20165248596548562365")
    private String userId;

    /**
     * 基金产品编码
     */
    @OpenApiField(desc = "基金产品编码",demo = "000371")
    private String fundProductCode;

    public Money getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Money totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Money getYesterdayProfit() {
        return yesterdayProfit;
    }

    public void setYesterdayProfit(Money yesterdayProfit) {
        this.yesterdayProfit = yesterdayProfit;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
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
}
