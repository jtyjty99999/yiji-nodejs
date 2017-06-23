package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/9 16:27.
 */
@OpenApiMessage(service = "fundQueryProfitRateHistory", type = ApiMessageType.Request)
public class FundQueryProfitRateHistoryRequest extends ApiRequest {
    /**
     * 基金产品编码
     */
    @NotBlank
    @OpenApiField(desc = "基金产品编码",demo = "000371")
    private String fundProductCode;

    /**
     * 开始时间（为null表示不限制开始时间）
     */
    @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}")
    @OpenApiField(desc = "开始时间",demo = "2016-12-12",constraint = "为空则不限制开始时间")
    private String startTime;

    /**
     * 结束时间（为null表示不限制结束时间）
     */
    @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}")
    @OpenApiField(desc = "结束时间",demo = "2016-12-25",constraint = "为空则不限制结束时间")
    private String endTime;

    @Min(1)
    @OpenApiField(desc = "查看页码",demo = "1",constraint = "默认1,看第一页")
    private int currentPage = 1;

    @Min(1)
    @OpenApiField(desc = "每页记录数量",demo = "10",constraint = "默认10")
    private int itemsPerPage = 10;

    public String getFundProductCode() {
        return fundProductCode;
    }

    public void setFundProductCode(String fundProductCode) {
        this.fundProductCode = fundProductCode;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }
}
