package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-24 14:45.
 */
@OpenApiMessage(service = "qftQueryPaymentInfo", type = ApiMessageType.Request)
public class QftQueryPaymentInfoRequest extends ApiRequest {
    /** 用户id */
    @OpenApiField(desc = "用户id",demo = "12354697801324657980",constraint = "用户登录易极付ID")
    private String userId;

    /** 查询页数 */
    @OpenApiField(desc = "查询页数", constraint = "默认为1，查询第一页", demo = "1")
    private int pageNum = 1;

    /** 每页查询数量 */
    @OpenApiField(desc = "每页查询数量", demo = "10", constraint = "默认为10，显示10条记录")
    private int pageSize = 10;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
