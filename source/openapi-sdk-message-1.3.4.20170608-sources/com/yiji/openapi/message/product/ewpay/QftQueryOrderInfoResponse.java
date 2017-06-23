package com.yiji.openapi.message.product.ewpay;

import java.util.List;

import com.yiji.openapi.message.product.ewpay.info.EwpayTradeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-23 17:04.
 */
@OpenApiMessage(service = "qftQueryOrderInfo", type = ApiMessageType.Response)
public class QftQueryOrderInfoResponse extends ApiResponse {

    /** 查询页数 */
    @OpenApiField(desc = "查询页数",demo = "1")
    private int pageNum;

    /** 每页查询数量 */
    @OpenApiField(desc = "每页查询数量", demo = "10")
    private int pageSize;

    @OpenApiField(desc = "交易信息列表")
    private List<EwpayTradeInfo> tradeInfoList;

    public List<EwpayTradeInfo> getTradeInfoList() {
        return tradeInfoList;
    }

    public void setTradeInfoList(List<EwpayTradeInfo> tradeInfoList) {
        this.tradeInfoList = tradeInfoList;
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
