package com.yiji.openapi.message.product.fund;


import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by qianli on 2016/12/28.
 * 查询基金交易订单详情，入参为公共参数
 */
@OpenApiMessage(service = "fundTradeOrderDetails", type = ApiMessageType.Request)
public class FundTradeOrderDetailsRequest extends ApiRequest {

}
