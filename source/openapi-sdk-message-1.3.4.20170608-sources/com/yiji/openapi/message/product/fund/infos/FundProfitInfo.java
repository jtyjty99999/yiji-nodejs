package com.yiji.openapi.message.product.fund.infos;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/3 15:02.
 */
public class FundProfitInfo {

    /**
     * 易极付用户Id
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户Id",demo = "20165248596548562365")
    private String userId;

    /**
     * 基金产品编码
     */
    @NotBlank
    @OpenApiField(desc = "基金产品编码",demo = "000371")
    private String fundProductCode;

    /**
     * 收益日期（年、月、日有效）
     */
    @OpenApiField(desc = "收益日期",demo = "2016-12-14",constraint = "格式：yyyy-MM-dd")
    private String profitDay;

    /**
     * 收益
     */
    @OpenApiField(desc = "收益",demo = "88.66")
    private Money profit;

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

    public String getProfitDay() {
        return profitDay;
    }

    public void setProfitDay(String profitDay) {
        this.profitDay = profitDay;
    }

    public Money getProfit() {
        return profit;
    }

    public void setProfit(Money profit) {
        this.profit = profit;
    }
}
