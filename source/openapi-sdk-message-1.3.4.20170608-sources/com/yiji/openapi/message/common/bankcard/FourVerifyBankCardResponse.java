/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-04 10:16 创建
 *
 */
package com.yiji.openapi.message.common.bankcard;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-04
 */
@OpenApiMessage(service = "fourVerifyBankCard", type = ApiMessageType.Response)
public class FourVerifyBankCardResponse extends ApiResponse {

    @NotBlank
    @Length(max = 32)
    @OpenApiField(desc = "用户真实姓名", demo = "熊本熊" , constraint = "")
    private String realName;

    @NotBlank
    @Length(max = 64)
    @OpenApiField(desc = "证件号", demo = "52210119900241215" , constraint = "对应证件类型的证件号")
    private String certNo;

    @NotBlank
    @OpenApiField(desc = "gid", demo = "20150012021202a" , constraint = "")
    private String gid;

    @NotBlank
    @OpenApiField(desc = "入口", demo = "01" , constraint = "")
    private String inlet;

    @OpenApiField(desc = "组名", demo = "openapi" , constraint = "")
    private String dubboGroup;

    @OpenApiField(desc = "版本", demo = "1.5" , constraint = "")
    private String dubboVersion;

    public String getDubboGroup() {
        return dubboGroup;
    }

    public void setDubboGroup(String dubboGroup) {
        this.dubboGroup = dubboGroup;
    }

    public String getDubboVersion() {
        return dubboVersion;
    }

    public void setDubboVersion(String dubboVersion) {
        this.dubboVersion = dubboVersion;
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

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }
}
