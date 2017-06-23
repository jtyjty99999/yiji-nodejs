package com.yiji.openapi.message.product.yjr.infos;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-11 16:39.
 */
public class YbankCardInfo {
    /**
     * 账户名
     */
    @NotBlank(message = "不能为空")
    @Length(min = 2, max = 64)
    @OpenApiField(desc = "银行卡真实姓名",demo = "易极付")
    private String accName;
    /**
     * 账号
     */
    @NotBlank(message = "不能为空")
    @Length(min = 6, max = 64)
    @OpenApiField(desc = "银行卡号",demo = "12345678901234567890")
    private String accNum;
    /**
     * 客户银行代码
     */
    @NotBlank(message = "不能为空")
    @OpenApiField(desc = "银行代码",demo = "ICBC")
    private String bankCode;
    /**
     * 账户类型
     */
    @OpenApiField(desc = "账户类型",constraint = "默认个人借记卡DEBIT",demo = "DEBIT")
    private String accType;
    /**
     * 证件类型
     * <br>
     * 如果是转出方，且accType不为CORPORATE时，必填
     */
    @OpenApiField(desc = "证件类型",constraint = "默认身份证",demo = "Identity_Card")
    private String certType;
    /**
     * 证件号
     * <br>
     * 如果如果是转出方，且accType不为CORPORATE时，必填
     */
    @Length(max = 32, message = "非法的证件号")
    @OpenApiField(desc = "证件号码",constraint = "转出方必填",demo = "123456879123456789123456")
    private String certNo;
    /**
     * 账户银行预留手机号
     */
    @Length(max = 15, message = "非法的手机号")
    @OpenApiField(desc = "银行预留手机号",demo = "10086100101")
    private String accPhoneNum;
    /**
     * 客户银行省
     */
    @OpenApiField(desc = "银行卡开户地所在省",demo = "重庆市")
    private String bankProvince;
    /**
     * 客户银行市
     */
    @OpenApiField(desc = "银行卡开户地所在市",demo = "重庆市")
    private String bankCity;
    /**
     * 客户银行联行号
     */
    @OpenApiField(desc = "银行卡对应的联行号",demo = "2134568")
    private String unionBankNo;

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getAccPhoneNum() {
        return accPhoneNum;
    }

    public void setAccPhoneNum(String accPhoneNum) {
        this.accPhoneNum = accPhoneNum;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getUnionBankNo() {
        return unionBankNo;
    }

    public void setUnionBankNo(String unionBankNo) {
        this.unionBankNo = unionBankNo;
    }
}
