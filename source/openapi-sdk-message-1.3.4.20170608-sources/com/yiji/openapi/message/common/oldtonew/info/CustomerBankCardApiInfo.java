package com.yiji.openapi.message.common.oldtonew.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * Created by tyongfu@yiji.com on 2016/1/27.
 */
public class CustomerBankCardApiInfo {

    /** 用户ID */
    @OpenApiField(desc = "易极付用户ID",demo = "20163452567823466734")
    private String					userId;
    /** 银行卡号 */
    @OpenApiField(desc = "银行卡号",demo = "6239534585632943")
    private String					bankCardNo;
    /**联行号 */
    @OpenApiField(desc = "联行号",demo = "342")
    private String					bankKey;
    /** 银行类型 */
    @OpenApiField(desc = "银行类型",demo = "")
    private String					bankType;
    /** 银行卡类型 */
    @OpenApiField(desc = "银行卡类型",demo = "DEBIT_CARD")
    private String bankCardType;
    /** 银行账户类型 */
    @OpenApiField(desc = "银行账户类型",demo = "PUBLIC")
    private String bankAccountType;
    /** 快捷签约*/
    @OpenApiField(desc = "快捷签约",demo = "SHORTCUT")
    protected String shortcut;
    /** 快捷签约号*/
    @OpenApiField(desc = "快捷签约号",demo = "yjf3432234")
    protected String				signNo;
    /** 开户人姓名 */
    @OpenApiField(desc = "开户人姓名",demo = "易极付")
    private String					name;
    /** 开户人证件类型 */
    @OpenApiField(desc = "开户人证件类型",demo = "ID")
    private String					certType;
    /** 证件号 */
    @OpenApiField(desc = "证件号",demo = "549852459823498234")
    private String					certNo;
    /** 性别 */
    @OpenApiField(desc = "性别",demo = "MALE")
    private String gender;
    /** 省份 */
    @OpenApiField(desc = "省份",demo = "重庆市")
    private String					province;
    /** 城市 */
    @OpenApiField(desc = "城市",demo = "重庆市")
    private String					city;
    /** 详细地址 */
    @OpenApiField(desc = "详细地址",demo = "重庆市渝北区黄山大道中段9号")
    private String					address;

    /** 默认绑定*/
    @OpenApiField(desc = "默认绑定",demo = "DEFAULTBIND")
    private String bindDefault;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankKey() {
        return bankKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setBankKey(String bankKey) {
        this.bankKey = bankKey;

    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getSignNo() {
        return signNo;
    }

    public void setSignNo(String signNo) {
        this.signNo = signNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBindDefault() {
        return bindDefault;
    }

    public void setBindDefault(String bindDefault) {
        this.bindDefault = bindDefault;
    }
}
