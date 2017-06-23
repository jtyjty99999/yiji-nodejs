/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-06-27 14:07 创建
 *
 */
package com.yiji.openapi.message.product.easyexchange.infos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author zhike@yiji.com
 */
public class OpenapiGoodsClause implements Serializable {
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -268455931006163862L;

    /**
     * 商品的外部ID
     */
    @Length(max = 32)
    private String outId;

    /**
     * 商品名称
     */
    @Length(max = 256, min = 1)
    private String name;

    /**
     * 商品详情
     */
    @Length(max = 512)
    private String memo;

    /**
     * 商品单价
     */
    @NotNull
    private Money price = Money.zero();

    /**
     * 商品数量
     */
    @NotNull
    private int quantity;

    /**
     * 商品其它费用
     */
    private Money otherFee = Money.zero();

    /**
     * 商品单位
     */
    @Length(max = 8)
    private String unit;

    /**
     * 商品描述网址
     */
    @Length(max = 256)
    private String detailUrl;

    /**
     * 商品来源网址
     */
    @Length(max = 256)
    private String referUrl;

    /**
     * 商品类目
     */
    @Length(max = 16)
    @NotBlank
    private String category;

    /**
     * 币种
     */
    @Length(max = 20)
    private String currency = "CNY";



    /**
     * 学校名称
     */
    @Length(max = 128)
    @OpenApiField(desc = "学校名称", demo = "一中", constraint = "学校名称")
    private String schoolName;

    /**
     * 入学通知书编号
     */
    @Length(max = 50)
    @OpenApiField(desc = "入学通知书编号", demo = "WER332323", constraint = "入学通知书编号")
    private String admissionNoticeNo;

    /**
     * 学生证号
     */
    @Length(max = 50)
    @OpenApiField(desc = "学生证号", demo = "WER332323", constraint = "学生证号")
    private String studentNo;

    /**
     * 卖方名称
     */
    @Length(max = 50)
    @OpenApiField(desc = "卖方名称", demo = "京东", constraint = "卖方名称")
    private String sellerName;

    /**
     * 卖方国家
     */
    @Length(max = 50)
    @OpenApiField(desc = "卖方国家", demo = "中国", constraint = "卖方国家")
    private String sellerCountry;

    public String getAdmissionNoticeNo() {
        return admissionNoticeNo;
    }

    public void setAdmissionNoticeNo(String admissionNoticeNo) {
        this.admissionNoticeNo = admissionNoticeNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSellerCountry() {
        return sellerCountry;
    }

    public void setSellerCountry(String sellerCountry) {
        this.sellerCountry = sellerCountry;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Money getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Money otherFee) {
        this.otherFee = otherFee;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getReferUrl() {
        return referUrl;
    }

    public void setReferUrl(String referUrl) {
        this.referUrl = referUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
