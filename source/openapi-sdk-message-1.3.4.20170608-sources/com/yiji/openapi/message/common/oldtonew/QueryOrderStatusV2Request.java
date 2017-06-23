/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 14:16 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@Deprecated
@OpenApiMessage(service = "queryOrderStatusV2", type = ApiMessageType.Request)
public class QueryOrderStatusV2Request extends ApiRequest {

    @OpenApiField(desc = "易生活订单号",demo ="20150701000006873776")
    private String easyLifeOrderNo;

    @OpenApiField(desc = "机构编码",demo ="002301107")
    private String agencyCode;

    @OpenApiField(desc = "用户编码",demo ="2007191078")
    private String userCode;

    @NotNull
    @OpenApiField(desc = "查询条件",demo ="OUT_BIZ_NO")
    private String queryBy;

    @OpenApiField(desc = "查询类型",demo ="000020")
    private String queryType;

    @OpenApiField(desc = "外部流水号",demo ="15070117520315695")
    private String outBizNo;

    public String getEasyLifeOrderNo() {
        return easyLifeOrderNo;
    }

    public void setEasyLifeOrderNo(String easyLifeOrderNo) {
        this.easyLifeOrderNo = easyLifeOrderNo;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getQueryBy() {
        return queryBy;
    }

    public void setQueryBy(String queryBy) {
        this.queryBy = queryBy;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }
}
