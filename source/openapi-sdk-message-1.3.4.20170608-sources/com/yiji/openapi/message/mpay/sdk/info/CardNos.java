/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-08 18:22 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author zhike@yiji.com
 */
public class CardNos {

    @OpenApiField(desc = "银行卡号", constraint = "银行卡号", demo = "621776849881425")
    private String cardNo;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
