/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-09 10:38 创建
 *
 */
package com.yiji.openapi.message.product.common;

import java.util.List;

import com.yiji.openapi.message.common.query.info.JointAccountFundsInInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonJointAccountQuery", type = ApiMessageType.Response)
public class CommonJointAccountQueryResponse extends ApiResponse {

    @OpenApiField(desc = "查询结果",constraint = "查询结果列表")
    private List<JointAccountFundsInInfo> contents;

    /** 第几页 */
    @OpenApiField(desc = "当前页",constraint = "当前页")
    private int curPage = 1;

    /** 每页条数 */
    @OpenApiField(desc = "每页条数",constraint = "每页条数")
    private int pageSize = 10;

    /**总页数*/
    @OpenApiField(desc = "总页数",constraint = "总页数")
    private long totalPages;

    /** 总记录数 */
    @OpenApiField(desc = "总记录数",constraint = "总记录数")
    private long totalCount = 0;


    public List<JointAccountFundsInInfo> getContents() {
        return contents;
    }

    public void setContents(List<JointAccountFundsInInfo> contents) {
        this.contents = contents;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}
