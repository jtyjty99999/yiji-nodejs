/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-01 10:13 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author hgeshu@yiji.com
 */
public class PactResultInfo {

    /** 会员号 */
    @OpenApiField(desc = "会员号")
    private String userId;

    /** 分组号 */
    @OpenApiField(desc = "分组号")
    private String groupNo;

    /** 持卡人姓名 */
    @OpenApiField(desc = "持卡人姓名")
    private String cardName;

    /** 卡号 */
    @OpenApiField(desc = "银行卡号")
    private String cardNo;

    /** 卡类型，DEBIT 借记卡 CREDIT 贷记卡 */
    @OpenApiField(desc = "卡类型")
    private String cardType;

    /** 银行名称 */
    @OpenApiField(desc = "银行名称")
    private String bankName;

    /** 银行简称 */
    @OpenApiField(desc = "银行简称")
    private String bankCode;

    /** 支行 */
    @OpenApiField(desc = "支行")
    private String subbranch;

    /** 银行联行号 */
    @OpenApiField(desc = "银行联行号")
    private String cnaps;

    /** 省份 */
    @OpenApiField(desc = "省份")
    private String province;

    /** 市 */
    @OpenApiField(desc = "市")
    private String city;

    /** 证件号 */
    @OpenApiField(desc = "证件号")
    private String certNo;

    /**证件类型 */
    @OpenApiField(desc = "证件类型")
    private String certType;

    /** 手机号 */
    @OpenApiField(desc = "手机号")
    private String userPhoneNo;

    /** 签约类型 */
    @OpenApiField(desc = "签约类型")
    private String pactType;

    /** 对公对私，对私 PERSONAL 对公 CORPORATE */
    @OpenApiField(desc = "对公对私")
    private String personalCorporateType;

    /** 签约用途 */
    @OpenApiField(desc = "签约用途")
    private String purpose;

    /** 签约状态 */
    @OpenApiField(desc = "签约状态")
    private String status;

    /** 创建时间 */
    @OpenApiField(desc = "创建时间")
    private Date rowAddTime;

    /** 更新时间 */
    @OpenApiField(desc = "更新时间")
    private Date rowUpdateTime;

    /** 是否支持解约 */
    @OpenApiField(desc = "是否支持解约")
    private String unsignFlag;

    /** 外部订单号 */
    @OpenApiField(desc = "外部订单号")
    private String outOrderNo;

    /** 扩展字段 */
    @OpenApiField(desc = "扩展字段")
    private String extend;

    /** 描述信息 */
    @OpenApiField(desc = "描述信息")
    private String description;
    /**
     * 扩展对象
     */
    private Object extendInfo;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupNo() {
        return this.groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getCardName() {
        return this.cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        if (StringUtils.isBlank(cardNo)){
            this.cardNo = cardNo;
        }else {
            int length = cardNo.length();
            if (length>7){
                this.cardNo = cardNo.replace(cardNo.substring(4,length-3),"*********");
            }else {
                this.cardNo = cardNo;
            }
        }
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getSubbranch() {
        return this.subbranch;
    }

    public void setSubbranch(String subbranch) {
        this.subbranch = subbranch;
    }

    public String getCnaps() {
        return this.cnaps;
    }

    public void setCnaps(String cnaps) {
        this.cnaps = cnaps;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCertNo() {
        return this.certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertType() {
        return this.certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getUserPhoneNo() {
        return this.userPhoneNo;
    }

    public void setUserPhoneNo(String userPhoneNo) {
        if (StringUtils.isBlank(userPhoneNo)){
            this.userPhoneNo = userPhoneNo;
        }else {
            int length = userPhoneNo.length();
            if (length>7){
                this.userPhoneNo = userPhoneNo.replace(userPhoneNo.substring(4,length-3),"****");
            }else {
                this.userPhoneNo = userPhoneNo;
            }
        }
    }

    public String getPactType() {
        return this.pactType;
    }

    public void setPactType(String pactType) {
        this.pactType = pactType;
    }

    public String getPersonalCorporateType() {
        return this.personalCorporateType;
    }

    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.util.Date getRowAddTime() {
        return this.rowAddTime;
    }

    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }

    public java.util.Date getRowUpdateTime() {
        return this.rowUpdateTime;
    }

    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }

    public String getUnsignFlag() {
        return this.unsignFlag;
    }

    public void setUnsignFlag(String unsignFlag) {
        this.unsignFlag = unsignFlag;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public Object getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Object extendInfo) {
        this.extendInfo = extendInfo;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
