package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/3/24 9:19.
 */
@OpenApiMessage(service = "trustPact", type = ApiMessageType.Request)
public class TrustPactRequest extends ApiRequest {

    /**
     * 空中签约，此参数为协议号（外部会员号）
     */
    @OpenApiField(desc = "外部会员号",constraint = "空中签约时使用，如不传则随机生成",demo = "201583214683541")
    private String outUserId;
    /**
     * 卡号，农行对公绑卡时，需加上银行前缀
     **/
    @NotBlank(message = "卡号不能为空")
    @OpenApiField(desc = "银行卡号",demo = "625184157248",security = true,constraint = "此参数需加密后在传输，农行对公绑卡时，需加上银行前缀")
    private String cardNo;

    /**
     * 真实姓名
     **/
    @NotBlank
    @OpenApiField(desc = "持卡人真实姓名",demo = "张三",security = true,constraint = "此参数需加密后在传输")
    private String realName;

    /**
     * 银行简称
     **/
    @OpenApiField(desc = "银行简称",demo = "ABC",constraint = "对公签约必填")
    private String bankCode;

    /**
     * 卡类型
     **/
    @OpenApiField(desc = "银行卡类型",demo = "DEBIT")
    private String cardType;

    /**
     * 对公对私
     */
    @OpenApiField(desc = "对公对私",demo = "PERSONAL",constraint = "默认对私")
    private String personalCorporateType;

    /**
     * 证件号
     **/
    @NotBlank
    @OpenApiField(desc = "证件号",demo = "500110198812121238",security = true,constraint = "参数需加密后传输")
    private String certNo;

    /**
     * 证件类型
     **/
    @OpenApiField(desc = "证件类型",demo = "Identity_Card")
    private String certType;

    /**
     * 手机号
     */
    @OpenApiField(desc = "手机号",demo = "1380238123X",constraint = "参数需加密后传输",security = true)
    private String mobileNo;

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
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

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }
}
