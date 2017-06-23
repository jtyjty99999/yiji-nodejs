package com.yiji.openapi.message.product.common;

import java.util.List;

import com.yiji.openapi.message.product.common.info.AccountLogInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-08 10:16.
 */
@OpenApiMessage(service = "commonMerchantTradeInfosQuary", type = ApiMessageType.Response)
public class CommonMerchantTradeInfosQuaryResponse extends ApiResponse {

    /**
     * 记录
     */
    @OpenApiField(desc = "交易记录")
    private List<AccountLogInfo> accountLogInfoForApis;

    /** 总记录数 */
    @OpenApiField(desc = "总记录数",demo = "0")
    private long totalCount = 0;

    /**
     * 页码
     */
    @OpenApiField(desc = "页码",demo = "1")
    private int page;

    /**
     * 总页数
     */
    @OpenApiField(desc = "总页数",demo = "1")
    private int totalPage;

    /**
     * 是否有下一页
     */
    @OpenApiField(desc = "是否有下一页",demo = "true",constraint = "布尔值")
    private boolean nextPage;

    public List<AccountLogInfo> getAccountLogInfoForApis() {
        return accountLogInfoForApis;
    }

    public void setAccountLogInfoForApis(List<AccountLogInfo> accountLogInfoForApis) {
        this.accountLogInfoForApis = accountLogInfoForApis;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public boolean isNextPage() {
        return nextPage;
    }

    public void setNextPage(boolean nextPage) {
        this.nextPage = nextPage;
    }
}
