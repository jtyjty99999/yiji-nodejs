package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com on 2016/8/31.
 */
@OpenApiMessage(service = "redirectAirBindCard", type = ApiMessageType.Request)
public class RedirectAirBindCardRequest extends ApiRequest {

    @Length(max = 64)
    @NotBlank
    @OpenApiField(desc = "外部用户id", demo = "142534521655621515")
    private String outUserId;

    @OpenApiField(desc = "对公对私类型", demo = "CORPORATE")
    private String personalCorporateType;

    @Length(max = 64)
    @OpenApiField(desc = "真实姓名", demo = "张三", constraint = "仅供对私签约使用")
    private String realName;

    @Length(max = 64)
    @OpenApiField(desc = "身份证号码", demo = "3851244685126216511567", constraint = "仅供对私签约使用")
    private String certNo;

    @Length(max = 11)
    @OpenApiField(desc = "手机号码", demo = "10086100801")
    private String mobile;

    @Length(max = 32)
    @OpenApiField(desc = "银行卡号", demo = "10086100801")
    private String cardNo;

    @OpenApiField(desc = "用户终端类型", demo = "PC", constraint = "为空则取userAgent")
    private String userTerminalType;

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
    }

    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserTerminalType() {
        return userTerminalType;
    }

    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
