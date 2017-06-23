package com.yiji.openapi.message.product.fund;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/12/28 10:30.
 */
@OpenApiMessage(service = "fundPageQuery", type = ApiMessageType.Request)
public class FundPageQueryRequest extends ApiRequest {

    /**
     * 易极付用户Id
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户Id", demo = "20165248596548562365")
    private String userId;

    /**
     * 基金产品编码
     */
    @NotBlank
    @OpenApiField(desc = "基金产品编码", demo = "000371")
    private String fundProductCode;

    /**
     * 交易类型（为null表示不限制类型）
     */
    @OpenApiField(desc = "交易类型", demo = "BUY_IN", constraint = "为空则所有类型都查")
    private String tradeType;

    /**
     * 开始时间（为null表示不限制开始时间）
     */
    @OpenApiField(desc = "开始时间", demo = "2016-12-12 14:45:41", constraint = "为空则不限制开始时间")
    private Date startTime;

    /**
     * 结束时间（为null表示不限制结束时间）
     */
    @OpenApiField(desc = "结束时间", demo = "2016-12-25 14:45:25", constraint = "为空则不限制结束时间")
    private Date endTime;

    @OpenApiField(desc = "查看页码", demo = "0", constraint = "默认0,看第一页")
    private int currentPage = 0;

    @OpenApiField(desc = "每页记录数量", demo = "10", constraint = "默认10")
    private int itemsPerPage = 10;

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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
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
