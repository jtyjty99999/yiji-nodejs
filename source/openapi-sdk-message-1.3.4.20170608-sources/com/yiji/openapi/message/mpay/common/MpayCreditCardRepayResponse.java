package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/20 14:08.
 */
@OpenApiMessage(service = "mpayCreditCardRepay", type = ApiMessageType.Response)
public class MpayCreditCardRepayResponse extends ApiResponse {

    @NotBlank
    @OpenApiField(desc = "真是姓名",demo = "张三")
    private String realName;

    @NotBlank
    @OpenApiField(desc = "信用卡号",demo = "5187485965845854785")
    private String cardNo;

    @OpenApiField(desc = "还款金额",demo = "88.66")
    private Money amount;

    @OpenApiField(desc = "gid")
    private String gid;

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

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }
}
