package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/27 14:06.
 */
@OpenApiMessage(service = "commonEnchashmentStatusQuery", type = ApiMessageType.Request)
public class CommonEnchashmentStatusQueryRequest extends ApiRequest {

    /**
     * 订单号
     */
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "取现订单号",demo = "456329681523643164")
    private String tradeNo;

    /**
     * userId
     */
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "易极付用户ID",demo = "2016965874859685874859")
    private String userId;

    /**
     * 开始时间
     */
    @OpenApiField(desc = "开始时间",demo = "2017-02-27 15:12:41",constraint = "格式：yyyy-MM-dd hh:MM:ss")
    private Date beginTime;

    /**
     * 结束时间
     */
    @OpenApiField(desc = "结束时间",demo = "2017-02-27 15:12:41",constraint = "格式：yyyy-MM-dd hh:MM:ss")
    private Date endTime;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
