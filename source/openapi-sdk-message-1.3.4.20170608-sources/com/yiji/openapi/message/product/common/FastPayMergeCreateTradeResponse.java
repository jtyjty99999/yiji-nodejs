package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.CreatTradeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

import java.util.List;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "fastPayMergeCreateTrade", type = ApiMessageType.Response)
public class FastPayMergeCreateTradeResponse extends ApiResponse {

    @OpenApiField(desc = "创建结果")
    private List<CreatTradeInfo> creatTradeResult;

    public List<CreatTradeInfo> getCreatTradeResult() {
        return creatTradeResult;
    }

    public void setCreatTradeResult(List<CreatTradeInfo> creatTradeResult) {
        this.creatTradeResult = creatTradeResult;
    }
}
