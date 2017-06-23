package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/4/14 11:41.
 */
@OpenApiMessage(service = "creditCardRedirectPact", type = ApiMessageType.Response)
public class CreditCardRedirectPactResponse extends ApiResponse {

    @OpenApiField(desc = "易极付用户ID", demo = "20165284596325148")
    private String userId;

    @OpenApiField(desc = "gid",demo = "")
    private String gid;

    @OpenApiField(desc = "持卡人姓名",demo = "张三")
    private String cardName;

    @OpenApiField(desc = "身份证号码",demo = "5002416952361521652")
    private String certNo;

    @OpenApiField(desc = "银行卡号",demo = "62145689658745")
    private String cardNo;

    @OpenApiField(desc = "预留手机号",demo = "1354852xxxx")
    private String userPhoneNo;

    @OpenApiField(desc = "银行简称",demo = "ABC")
    private String bankCode;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
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

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo = userPhoneNo;
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
