package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;
import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.MultiPayChannelApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-01 11:33.
 */
@OpenApiMessage(service = "queryPayChannelApi", type = ApiMessageType.Response)
public class QueryPayChannelApiResponse extends ApiResponse {

    @OpenApiField(demo = "",desc = "渠道列表")
    private List<MultiPayChannelApiInfo> apis;

    @OpenApiField(demo = "2016-01-15 23:41:25",desc = "通知时间")
    private Date notifyTime;

    @OpenApiField(demo = "123564812356412",desc = "交易号")
    private String tradeNo;

    public List<MultiPayChannelApiInfo> getApis() {
        return apis;
    }

    public void setApis(List<MultiPayChannelApiInfo> apis) {
        this.apis = apis;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
