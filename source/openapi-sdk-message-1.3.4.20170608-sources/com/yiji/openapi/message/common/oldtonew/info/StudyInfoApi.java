/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-21 17:01 创建
 *
 */
package com.yiji.openapi.message.common.oldtonew.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-06-21
 */
public class StudyInfoApi {

    /**学校所在国家*/
    @OpenApiField(desc = "学校所在国家", demo = "中国")
    private String				schoolCountry;

    /**学校名称*/
    @Length(max = 128)
    @NotBlank
    @OpenApiField(desc = "学校名称", demo = "重庆邮电大学")
    private String				schoolName;

    /**留学凭证*/
    @NotNull
    @OpenApiField(desc = "留学凭证", demo = "NOTICE")
    private String studyVoucher;

    /**凭证编号*/
    @NotBlank
    @OpenApiField(desc = "凭证编号", demo = "20152025612551454")
    private String	voucherNumber;

    public String getSchoolCountry() {
        return schoolCountry;
    }

    public void setSchoolCountry(String schoolCountry) {
        this.schoolCountry = schoolCountry;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudyVoucher() {
        return studyVoucher;
    }

    public void setStudyVoucher(String studyVoucher) {
        this.studyVoucher = studyVoucher;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }
}
