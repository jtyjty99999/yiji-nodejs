package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/28 16:19.
 */
@OpenApiMessage(service = "creditCardPact", type = ApiMessageType.Request)
public class CreditCardPactRequest extends ApiRequest {

    /**
     * 用户ID/外部用户ID
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户ID", demo = "201612589658451485965848")
    private String userId;

    /**
     * 持卡人真实姓名
     */
    @OpenApiField(desc = "真实姓名", demo = "张三")
    private String realName;

    /**
     * 用户证件号
     */
    @OpenApiField(desc = "用户证件号", demo = "2541596858485859623")
    private String certNo;

    /**
     * 用户证件类型，默认身份证
     */
    @OpenApiField(desc = "用户证件类型", demo = "Identity_Card", constraint = "默认身份证")
    private String certType = "ID";

    /**
     * 卡号
     **/
    @NotBlank(message = "卡号不能为空")
    @OpenApiField(desc = "信用卡卡号", demo = "625845859658475854")
    private String cardNo;

    /**
     * 手机号
     */
    @NotBlank(message = "预留手机号不能为空")
    @OpenApiField(desc = "银行预留手机号", demo = "10086100101")
    private String mobileNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }
}
