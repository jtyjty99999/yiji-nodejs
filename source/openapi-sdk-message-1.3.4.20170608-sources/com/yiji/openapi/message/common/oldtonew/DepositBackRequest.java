package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by tyongfu@yiji.com on 2016/1/22.
 */
@OpenApiMessage(service = "depositBack", type = ApiMessageType.Request)
public class DepositBackRequest extends ApiRequest {

    //FIXME 暂停，等商户切换
    @NotBlank
    @Length(max = 20,min = 20)
    @OpenApiField(constraint = "充值流水号",desc = "充值流水号",demo = "20160122001111111111")
    private String depositId;

    @NotNull
    @OpenApiField(constraint = "只能是数字",desc = "充退金额",demo = "78.50")
    private Money amount;

    @NotNull
    @Size(min = 1, max = 32)
    @OpenApiField(constraint = "外部单据号",desc = "外部单据号",demo = "123456")
    private String outBizNo;

//    @Size(min = 1, max = 17)
    @OpenApiField(constraint = "收费金额",desc = "收费金额",demo = "1.50")
    private Money charge;

    @OpenApiField(desc = "收费规则",demo = "chargeV2")
    private String chargeRule;

    @OpenApiField(desc = "交易产品编码",demo = "trade")
    private String tradeBizProductCode;

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public Money getCharge() {
        return charge;
    }

    public void setCharge(Money charge) {
        this.charge = charge;
    }

    public String getChargeRule() {
        return chargeRule;
    }

    public void setChargeRule(String chargeRule) {
        this.chargeRule = chargeRule;
    }

    public String getTradeBizProductCode() {
        return tradeBizProductCode;
    }

    public void setTradeBizProductCode(String tradeBizProductCode) {
        this.tradeBizProductCode = tradeBizProductCode;
    }
}
