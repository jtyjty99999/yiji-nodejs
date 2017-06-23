package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/4 10:23.
 */
@OpenApiMessage(service = "commonOfflineRecharge", type = ApiMessageType.Request)
public class CommonOfflineRechargeRequest extends ApiRequest {

    @NotBlank
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "易极付用户ID", demo = "20165284596325148")
    private String userId;


    /**
     * 申请转账银行卡号
     */
    @NotNull(message = "申请转账银行卡号不能为空")
    @Length(max = 35, message = "申请转账银行卡号不能超长")
    @OpenApiField(desc = "申请转账银行卡号", demo = "6251854969585241")
    private String cardNo;

    /**
     * 申请转账人姓名
     */
    @NotNull(message = "申请转账人姓名不能为空")
    @OpenApiField(desc = "申请转账人姓名", demo = "张三")
    private String realName;

    /**
     * 申请充值金额
     */
    @NotNull(message = "申请充值金额不能为空")
    @OpenApiField(desc = "充值金额", demo = "88.66")
    private Money amount;

    /**
     * 上账的易极付资金账号
     */
    @Length(max = 32, message = "上账的易极付资金账号不能超长")
    @OpenApiField(desc = "易极付资金账号", demo = "20165284596325148",constraint = "不传则上账到userId默认资金账号")
    private String accountNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
