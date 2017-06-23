package com.yiji.openapi.message.product.fund;


import com.yiji.openapi.message.product.fund.infos.FundTradeApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

import java.util.List;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/12/28 10:31.
 */
@OpenApiMessage(service = "fundPageQuery", type = ApiMessageType.Response)
public class FundPageQueryResponse extends ApiResponse {

    @OpenApiField(desc = "基金交易明细")
    private List<FundTradeApiInfo> fundTradeInfos;

    @OpenApiField(desc = "总明细条数", demo = "102")
    private long totalCount;

    @OpenApiField(desc = "总页数", demo = "12")
    private int totalPage;

    @OpenApiField(desc = "当前页码", demo = "10")
    private int currentPage;

    public List<FundTradeApiInfo> getFundTradeInfos() {
        return fundTradeInfos;
    }

    public void setFundTradeInfos(List<FundTradeApiInfo> fundTradeInfos) {
        this.fundTradeInfos = fundTradeInfos;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
