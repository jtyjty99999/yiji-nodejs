package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.TradeSimpleStringInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/1/19.
 */
@OpenApiMessage(service = "yzzTradeTransfer", type = ApiMessageType.Response)
public class YzzTradeTransferResponse extends ApiResponse {

    @OpenApiField(desc = "交易号",constraint = "只能为20位",demo = "20160119801234567980")
    private String tradeNo;

    @OpenApiField(desc = "子交易号",constraint = "子交易号",demo = "20160119801234567980")
    private String subTradeNo;

    @OpenApiField(desc = "信息",constraint = "信息",demo = "")
    private List<TradeSimpleStringInfo>  info;

    @OpenApiField(desc = "结果数据",constraint = "结果数据",demo = "")
    private String resultData;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getSubTradeNo() {
        return subTradeNo;
    }

    public void setSubTradeNo(String subTradeNo) {
        this.subTradeNo = subTradeNo;
    }

    public List<TradeSimpleStringInfo> getInfo() {
        return info;
    }

    public void setInfo(List<TradeSimpleStringInfo> info) {
        this.info = info;
    }

    public String getResultData() {
        return resultData;
    }

    public void setResultData(String resultData) {
        this.resultData = resultData;
    }
}
