package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/4 15:10.
 */
@OpenApiMessage(service = "enterpriseApplyPact", type = ApiMessageType.Notify)
public class EnterpriseApplyPactNotify extends ApiNotify {

    /** 签约流水号 */
    @OpenApiField(desc = "签约流水号",demo = "5125962520545124")
    private String pactNo;

    @NotBlank
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "会员号", demo = "20165284596325148")
    private String userId;

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "银行卡号",demo = "6251584596584587")
    private String cardNo;

    @NotBlank
    @OpenApiField(desc = "银行简称",demo = "ABC")
    private String bankCode;

    @OpenApiField(desc = "银行名称",demo = "ABC")
    private String bankName;

    /** 签约状态 */
    @OpenApiField(desc = "签约状态",demo = "PAY_MONEY_APPLY_SUCCESS",constraint = "{\"data\":[\"PACT_SUCCESS:签约成功\",\"其它状态:签约失败\"],\"name\":\"签约状态\"}")
    private String pactStatus;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

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
