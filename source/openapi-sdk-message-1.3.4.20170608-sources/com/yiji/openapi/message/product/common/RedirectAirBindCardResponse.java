package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import org.hibernate.validator.constraints.Length;

/**
 * Created by hgeshu@yiji.com on 2016/8/31.
 */
@OpenApiMessage(service = "redirectAirBindCard", type = ApiMessageType.Response)
public class RedirectAirBindCardResponse extends ApiResponse {

    @Length(max = 64)
    @OpenApiField(desc = "外部用户id", demo = "142534521655621515")
    private String outUserId;

    @OpenApiField(desc = "对公对私类型", demo = "CORPORATE")
    private String personalCorporateType;

    @OpenApiField(desc = "gid", demo = "")
    private String gid;

    @OpenApiField(desc = "入口", demo = "")
    private String inlet;

    @Length(max = 64)
    @OpenApiField(desc = "真实姓名", demo = "张三")
    private String realName;

    @Length(max = 64)
    @OpenApiField(desc = "身份证号码", demo = "3851244685126216511567")
    private String certNo;

    @Length(max = 11)
    @OpenApiField(desc = "手机号码", demo = "10086100801")
    private String userPhoneNo;

    @OpenApiField(desc = "是否可用信用卡签约", demo = "true")
    private boolean creditUsable;

    @Length(max = 32)
    @OpenApiField(desc = "银行卡号", demo = "10086100801")
    private String cardNo;

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

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
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

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo = userPhoneNo;
    }

    public boolean isCreditUsable() {
        return creditUsable;
    }

    public void setCreditUsable(boolean creditUsable) {
        this.creditUsable = creditUsable;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
