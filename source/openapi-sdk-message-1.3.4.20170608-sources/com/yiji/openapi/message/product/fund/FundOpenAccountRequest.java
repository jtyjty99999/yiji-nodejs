package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/12/26 15:13.
 */
@OpenApiMessage(service = "fundOpenAccount", type = ApiMessageType.Request)
public class FundOpenAccountRequest extends ApiRequest {

    /**
     * 易极付用户Id
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户Id",demo = "20165248596548562365")
    private String userId;

    /**
     * 基金产品编码
     */
    @NotBlank
    @OpenApiField(desc = "基金产品编码",demo = "000371")
    private String fundProductCode;

    @NotBlank
    @OpenApiField(desc = "银行卡号",demo = "62158485855469382")
    private String cardNo;

    /**
     * 风险问卷问题答案（个人用户不能填，企业用户必填）
     */
    @Pattern(regexp = "[A-E]{10}")
    @OpenApiField(desc = "风险问卷问题答案",demo = "AEDECBEACA",constraint = "企业用户必填，个人用户勿填;只能是A-E的一个10位字母组合")
    private String riskQuestionAnswers;

    /**
     * 经办人真实姓名（个人用户不能填，企业用户必填）
     */
    @OpenApiField(desc = "经办人真实姓名",demo = "张三",constraint = "企业用户必填，个人用户勿填")
    private String realName;

    /**
     * 经办人证件类型（个人用户不能填，企业用户必填）
     */
    @OpenApiField(desc = "经办人证件类型",demo = "Identity_Card",constraint = "企业用户必填，个人用户勿填")
    private String certType;

    /**
     * 经办人证件号（个人用户不能填，企业用户必填）
     */
    @OpenApiField(desc = "经办人证件号",demo = "52154859635154854",constraint = "企业用户必填，个人用户勿填")
    private String certNo;

    @Length(max = 40)
    @OpenApiField(desc = "子商户号",demo = "2016625468465324186415")
    private String submerchantId;

    @Length(max = 40)
    @OpenApiField(desc = "子商户渠道ID",demo = "14651464857456146584")
    private String submerchantChannelId;

    @OpenApiField(desc = "银行简称",demo = "ICBC",constraint = "企业开户必填")
    private String bankCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFundProductCode() {
        return fundProductCode;
    }

    public void setFundProductCode(String fundProductCode) {
        this.fundProductCode = fundProductCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getRiskQuestionAnswers() {
        return riskQuestionAnswers;
    }

    public void setRiskQuestionAnswers(String riskQuestionAnswers) {
        this.riskQuestionAnswers = riskQuestionAnswers;
    }

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

    public String getSubmerchantId() {
        return submerchantId;
    }

    public void setSubmerchantId(String submerchantId) {
        this.submerchantId = submerchantId;
    }

    public String getSubmerchantChannelId() {
        return submerchantChannelId;
    }

    public void setSubmerchantChannelId(String submerchantChannelId) {
        this.submerchantChannelId = submerchantChannelId;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
