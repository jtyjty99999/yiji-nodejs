package com.yiji.openapi.message.product.fund;


import com.yiji.openapi.message.product.fund.infos.FundProfitRateInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

import java.util.List;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/9 16:28.
 */
@OpenApiMessage(service = "fundQueryProfitRateHistory", type = ApiMessageType.Response)
public class FundQueryProfitRateHistoryResponse extends ApiResponse {

    @OpenApiField(desc = "基金历史收益信息")
    private List<FundProfitRateInfo> profitRateInfos;

    @OpenApiField(desc = "总明细条数", demo = "102")
    private long totalCount;

    @OpenApiField(desc = "总页数", demo = "12")
    private long totalPage;

    @OpenApiField(desc = "当前页码", demo = "10")
    private int currentPage;

    public List<FundProfitRateInfo> getProfitRateInfos() {
        return profitRateInfos;
    }

    public void setProfitRateInfos(List<FundProfitRateInfo> profitRateInfos) {
        this.profitRateInfos = profitRateInfos;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
