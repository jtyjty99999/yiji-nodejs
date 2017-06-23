package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/12/30 17:51.
 */
@OpenApiMessage(service = "fundQueryRate", type = ApiMessageType.Response)
public class FundQueryRateResponse extends ApiResponse {

    /**
     * 基金产品编码
     */
    @NotBlank
    @OpenApiField(desc = "基金产品编码", demo = "000371")
    private String fundProductCode;

    @NotBlank
    @OpenApiField(desc = "利率日期", demo = "2016-12-12", constraint = "格式：yyyy-MM-dd")
    private String rateDay;

    /**
     * 是否是节假日
     */
    @OpenApiField(desc = "是否是节假日", demo = "true", constraint = "{\"data\":[\"true:节假日\",\"false：非节假日\"],\"name\":\"是否节假日\"}")
    private boolean isHoliday;

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

    public boolean isHoliday() {
        return isHoliday;
    }

    public void setHoliday(boolean holiday) {
        isHoliday = holiday;
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
