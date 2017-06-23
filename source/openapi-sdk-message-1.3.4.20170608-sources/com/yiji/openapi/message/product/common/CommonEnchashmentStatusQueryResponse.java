package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.EnchashmentInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

import java.util.List;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/27 14:06.
 */
@OpenApiMessage(service = "commonEnchashmentStatusQuery", type = ApiMessageType.Response)
public class CommonEnchashmentStatusQueryResponse extends ApiResponse {

    @OpenApiField(desc = "取现订单信息")
    private List<EnchashmentInfo> enchashmentInfos;

    public List<EnchashmentInfo> getEnchashmentInfos() {
        return enchashmentInfos;
    }

    public void setEnchashmentInfos(List<EnchashmentInfo> enchashmentInfos) {
        this.enchashmentInfos = enchashmentInfos;
    }
}
