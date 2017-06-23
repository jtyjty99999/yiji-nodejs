package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/12/30 17:50.
 */
@OpenApiMessage(service = "fundQueryRate", type = ApiMessageType.Request)
public class FundQueryRateRequest extends ApiRequest {

    /**
     * 基金产品编码
     */
    @NotBlank
    @OpenApiField(desc = "基金产品编码",demo = "000371")
    private String fundProductCode;

    @NotBlank
    @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}")
    @OpenApiField(desc = "利率日期",demo = "2016-12-12",constraint = "格式：yyyy-MM-dd")
    private String rateDay;

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
}
