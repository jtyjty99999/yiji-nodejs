package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/4 15:10.
 */
@OpenApiMessage(service = "enterpriseApplyPact", type = ApiMessageType.Request)
public class EnterpriseApplyPactRequest extends ApiRequest {

    @NotBlank
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "易极付用户ID", demo = "20165284596325148")
    private String userId;

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "银行卡号",demo = "6251584596584587")
    private String cardNo;

    @OpenApiField(desc = "手机号码",demo = "13888888888",constraint = "如果不为空则发送绑卡结果短信")
    private String mobileNo;

    @NotBlank
    @OpenApiField(desc = "银行简称",demo = "ABC")
    private String bankCode;

    @OpenApiField(desc = "绑卡资金帐号",demo = "201652845263695421",constraint = "需要使用多个资金账户时使用")
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
