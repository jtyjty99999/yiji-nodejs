/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-24 10:01 创建
 *
 */
package com.yiji.openapi.message.mpay.product;

import java.util.List;

import com.yiji.openapi.message.mpay.product.info.SupportBankDtoInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-24
 */
@OpenApiMessage(service = "mpaySupportBankCardList", type = ApiMessageType.Response)
public class MpaySupportBankCardListResponse extends ApiResponse {

    /**
     * 支持的银行卡列表
     */
    @OpenApiField(desc = "支持的银行卡列表" , demo = "" , constraint = "")
    private List<SupportBankDtoInfo> cardList;

    public List<SupportBankDtoInfo> getCardList() {
        return cardList;
    }

    public void setCardList(List<SupportBankDtoInfo> cardList) {
        this.cardList = cardList;
    }
}
