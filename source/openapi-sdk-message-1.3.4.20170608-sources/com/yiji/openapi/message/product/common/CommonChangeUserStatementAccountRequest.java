package com.yiji.openapi.message.product.common;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by hgeshu@yiji.com on 2016/8/1.
 */
@OpenApiMessage(service = "commonChangeUserStatementAccount", type = ApiMessageType.Request)
public class CommonChangeUserStatementAccountRequest extends ApiRequest {

    /** 用户Id */
    @NotBlank
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "易极付用户ID",demo = "201625463987452684259452")
    private String userId;

    /** 是否激活(默认设置关闭) */
    @OpenApiField(desc = "是否打开对账功能",demo = "ON",constraint = "默认打开")
    private String active;

    /** 开通日期，为空则默认为当前日期；对账文件在开通日期后一天才开始生成 */
    @OpenApiField(desc = "开通日期",demo = "2016-07-15",constraint = "默认为当前日期；对账文件在开通日期后一天才开始生成")
    private String openDate;

    private Date opendate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public Date getOpendate() {
        return opendate;
    }

    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }
}
