package com.yiji.openapi.message.common.oldtonew.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-25 10:23.
 */
public class PaymentExtParam {

    @OpenApiField(desc = "有线电视卡号类型",demo = "hdtv")
    private String CABLE_TV_CARD_TYPE;

    @OpenApiField(desc = "余额信息",demo = "free")
    private String BALANCE_INFO;

    public String getCABLE_TV_CARD_TYPE() {
        return CABLE_TV_CARD_TYPE;
    }

    public void setCABLE_TV_CARD_TYPE(String CABLE_TV_CARD_TYPE) {
        this.CABLE_TV_CARD_TYPE = CABLE_TV_CARD_TYPE;
    }

    public String getBALANCE_INFO() {
        return BALANCE_INFO;
    }

    public void setBALANCE_INFO(String BALANCE_INFO) {
        this.BALANCE_INFO = BALANCE_INFO;
    }
}
