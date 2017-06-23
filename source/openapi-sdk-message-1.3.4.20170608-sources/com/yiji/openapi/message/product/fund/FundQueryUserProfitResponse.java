package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.message.product.fund.infos.FundProfitInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

import java.util.List;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/3 14:40.
 */
@OpenApiMessage(service = "fundQueryUserProfit", type = ApiMessageType.Response)
public class FundQueryUserProfitResponse extends ApiResponse {

    @OpenApiField(desc = "基金交易明细")
    private List<FundProfitInfo> fundTradeInfos;

    @OpenApiField(desc = "总收益",demo = "888.66")
    private Money sumFundProfit;

    @OpenApiField(desc = "总明细条数",demo = "102")
    private long totalCount;

    @OpenApiField(desc = "总页数",demo = "12")
    private int totalPage;

    @OpenApiField(desc = "当前页码",demo = "10")
    private int currentPage;

    public List<FundProfitInfo> getFundTradeInfos() {
        return fundTradeInfos;
    }

    public void setFundTradeInfos(List<FundProfitInfo> fundTradeInfos) {
        this.fundTradeInfos = fundTradeInfos;
    }

    public Money getSumFundProfit() {
        return sumFundProfit;
    }

    public void setSumFundProfit(Money sumFundProfit) {
        this.sumFundProfit = sumFundProfit;
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
