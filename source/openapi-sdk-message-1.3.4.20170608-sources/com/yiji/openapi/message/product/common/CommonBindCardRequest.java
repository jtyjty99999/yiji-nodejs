package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-11 11:03.
 */
@OpenApiMessage(service = "commonBindCard", type = ApiMessageType.Request)
public class CommonBindCardRequest extends ApiRequest {

    /**
     *  协议号 大概表示是用户。 用户第一次申请时可以不填，而用户后期想绑定卡在同一个用户下， 必须填写这个相同的值，不然产生多个用户
     *
     * */
    @OpenApiField(desc = "签约协议号",demo = "15632165432",constraint = "用户第一次申请时可以不填，如果用户后期想绑定卡在同一个用户下， 必须填写这个相同的值，不然将产生多个用户")
    private String protocolNo;

    /**
     * 卡号
     */
    @NotBlank(message = "卡号不能为空")
    @OpenApiField(desc = "银行卡号",demo = "621548745825664")
    private String cardNo;

    /**
     * 证件号
     */
    @OpenApiField(desc = "证件号码",demo = "15612651105612351")
    @NotBlank(message = "证件号不能为空")
    private String certNo;
    /**
     * 持卡人姓名
     */
    @NotBlank(message = "持卡人姓名不能为空")
    @OpenApiField(desc = "持卡人姓名",demo = "张三")
    private String cardName;

    /**
     * 四要素验证时必填
     */
    @OpenApiField(desc = "银行预留手机号",demo = "10086100101",constraint = "四要素验证时必填")
    private String mobileNo;
    /** 签约类型 */
    @OpenApiField(desc = "签约类型" , demo = "CORPORATEPLAYMONEY" , constraint = "默认是：企业打款签约")
    private String pactType;
    /** 银行简称 */
    @OpenApiField(desc = "银行简称" , demo = "ABC" , constraint = "")
    private String bankCode;
    /** 支行 */
    @OpenApiField(desc = "支行" , demo = "中国银行大龙山支行" , constraint = "")
    private String subbranch;
    /** 省 */
    @OpenApiField(desc = "省" , demo = "重庆市" , constraint = "")
    private String province;
    /** 市 */
    @OpenApiField(desc = "市" , demo = "重庆市" , constraint = "")
    private String city;
    /** 银行联行号 */
    @OpenApiField(desc = "银行联行号" , demo = "2016051215121051425" , constraint = "")
    private String cnaps;

    /** 对公对私 */
    @OpenApiField(desc = "对公对私" , demo = "PERSONAL" , constraint = "默认对私")
    private String personalCorporateType;

    /** 来源， 默认是即时收款 */
    @OpenApiField(desc = "市" , demo = "重庆市" , constraint = "默认是-FASTTRADE：1、FASTTRADE，2：CASHIER")
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPactType() {
        return pactType;
    }

    public void setPactType(String pactType) {
        this.pactType = pactType;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getSubbranch() {
        return subbranch;
    }

    public void setSubbranch(String subbranch) {
        this.subbranch = subbranch;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCnaps() {
        return cnaps;
    }

    public void setCnaps(String cnaps) {
        this.cnaps = cnaps;
    }

    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType;
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
