/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-19 18:43 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.mpay.common.info.BindCardDtoInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-19
 */
@OpenApiMessage(service = "queryMpayUserBindCardList", type = ApiMessageType.Response)
public class QueryMpayUserBindCardListResponse extends ApiResponse {

    /**
     * 签约流水号
     */
    @OpenApiField(desc = "签约流水号" , demo = "000k00201fuuftgb9400" , constraint = "")
    private String defaultPactNo;

    /**
     * 易极付会员编号
     */
    @NotBlank
    @OpenApiField(desc = "易极付会员编号" , demo = "20140709010000825596" , constraint = "")
    private String userId;

    /**
     * 绑卡列表
     */
    @OpenApiField(desc = "绑卡列表" , demo = "" , constraint = "")
    private List<BindCardDtoInfo> cardList;

    public String getDefaultPactNo() {
        return defaultPactNo;
    }

    public void setDefaultPactNo(String defaultPactNo) {
        this.defaultPactNo = defaultPactNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<BindCardDtoInfo> getCardList() {
        return cardList;
    }

    public void setCardList(List<BindCardDtoInfo> cardList) {
        this.cardList = cardList;
    }
}
