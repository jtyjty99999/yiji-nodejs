package com.yiji.openapi.message.common.bankcard;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/3/2 15:00.
 */
@OpenApiMessage(service = "bankCardThreeElementsBinding", type = ApiMessageType.Notify)
public class BankCardThreeElementsBindingNotify extends ApiNotify {

    /** 会员号 */
    @OpenApiField(desc = "会员号",demo = "20165848589685478521")
    private String userId;

    /** 流水号 */
    @OpenApiField(desc = "流水号",demo = "16513853219684")
    private String pactNo;

    /** 银行简称 */
    @OpenApiField(desc = "银行简称",demo = "ABC")
    private String bankCode;

    /** 银行名称 */
    @OpenApiField(desc = "银行名称",demo = "中国农业银行")
    private String bankName;

    /** 签约状态
     */
    @OpenApiField(desc = "签约状态", constraint = "{\"data\":[\"PACT:签约成功\",\"PACT_FAIL:签约失败\"],\"name\":\"签约状态\"}", demo = "PACT")
    private String pactStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
    }
}
