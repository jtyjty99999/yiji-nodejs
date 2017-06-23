package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-10-12 9:40.
 */
@OpenApiMessage(service = "commonPactQueryByCardNo", type = ApiMessageType.Request)
public class CommonPactQueryByCardNoRequest extends ApiRequest {

    /** 银行卡号 */
    @NotBlank(message = "银行卡号不能为空")
    @OpenApiField(desc = "银行卡号",demo = "123564798012456789")
    private String cardNo;

    /** 用户ID */
    @NotBlank(message = "用户ID不能为空")
    @OpenApiField(desc = "用户ID",demo = "12345679801234567890")
    private String userId;

    /** 签约目的 */
    @NotBlank(message = "签约目的不能为空")
    @OpenApiField(desc = "签约目的",demo = "WITHDRAW")
    private String purpose;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
