package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import org.hibernate.validator.constraints.Length;

/**
 * Created by hgeshu@yiji.com on 2016/8/31.
 */
@OpenApiMessage(service = "redirectAirBindCard", type = ApiMessageType.Notify)
public class RedirectAirBindCardNotify extends ApiNotify {


    @Length(max = 32)
    @OpenApiField(desc = "签约流水号")
    private String pactNo;

    @Length(max = 64)
    @OpenApiField(desc = "外部用户id",demo = "142534521655621515")
    private String outUserId;

    @OpenApiField(desc = "签约状态",constraint = "PACT为签约成功，其他值均为签约失败")
    private String pactStatus;

    @OpenApiField(desc = "银行卡号",demo = "10086100801")
    private String cardNo;

    @OpenApiField(desc = "账户户名",demo = "张三")
    private String realName;

    @OpenApiField(desc = "身份证号码",demo = "3851244685126216511567")
    private String certNo;

    @OpenApiField(desc = "手机号码",demo = "10086100801")
    private String mobile;

    @OpenApiField(desc = "银行名称",demo = "中国工商银行")
    private String bankName;

    @OpenApiField(desc = "卡类型",demo = "DEBIT",constraint = "CREDIT:贷记卡;DEBIT:借记卡")
    private String cardType;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
    }

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
