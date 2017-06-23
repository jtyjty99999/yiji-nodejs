package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/4/14 11:40.
 */
@OpenApiMessage(service = "creditCardRedirectPact", type = ApiMessageType.Request)
public class CreditCardRedirectPactRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "易极付用户ID", demo = "20165284596325148")
    private String userId;

    @NotBlank
    @OpenApiField(desc = "持卡人姓名",demo = "张三",security = true,constraint = "需要加密后传输")
    private String realName;

    @NotBlank
    @OpenApiField(desc = "身份证号码",demo = "5002416952361521652",security = true,constraint = "需要加密后传输")
    private String certNo;

    @NotBlank
    @OpenApiField(desc = "银行卡号",demo = "62145689658745",security = true,constraint = "需要加密后传输")
    private String cardNo;

    @NotBlank
    @OpenApiField(desc = "预留手机号",demo = "1354852xxxx",security = true,constraint = "需要加密后传输")
    private String mobileNo;

    @NotBlank
    @OpenApiField(desc = "银行简称",demo = "ABC")
    private String bankCode;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
