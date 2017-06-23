package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/20 14:07.
 */
@OpenApiMessage(service = "mpayCreditCardRepay", type = ApiMessageType.Request)
public class MpayCreditCardRepayRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "真是姓名",demo = "张三")
    private String realName;

    @NotBlank
    @OpenApiField(desc = "信用卡号",demo = "5187485965845854785")
    private String cardNo;

    @NotNull
    @OpenApiField(desc = "还款金额",demo = "88.66")
    private Money amount;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
