package com.yiji.openapi.message.product.fund.infos;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/9 17:06.
 */
public class FundProfitRateInfo {

    @OpenApiField(desc = "基金产品编码", demo = "000371")
    private String fundProductCode;

    @OpenApiField(desc = "利率日期", demo = "2016-12-12", constraint = "格式：yyyy-MM-dd")
    private String rateDay;

    /**
     * 七日年化收益率
     */
    @OpenApiField(desc = "七日年化收益率", demo = "4.123", constraint = "格式为带三位小数的数字：x.xxx")
    private String sevenRate;

    /**
     * 万份收益
     */
    @OpenApiField(desc = "万份收益", demo = "0.7895", constraint = "格式为带四位小数的数字：x.xxxx")
    private String perMillionProfit;

    public String getFundProductCode() {
        return fundProductCode;
    }

    public void setFundProductCode(String fundProductCode) {
        this.fundProductCode = fundProductCode;
    }

    public String getRateDay() {
        return rateDay;
    }

    public void setRateDay(String rateDay) {
        this.rateDay = rateDay;
    }

    public String getSevenRate() {
        return sevenRate;
    }

    public void setSevenRate(String sevenRate) {
        this.sevenRate = sevenRate;
    }

    public String getPerMillionProfit() {
        return perMillionProfit;
    }

    public void setPerMillionProfit(String perMillionProfit) {
        this.perMillionProfit = perMillionProfit;
    }
}
