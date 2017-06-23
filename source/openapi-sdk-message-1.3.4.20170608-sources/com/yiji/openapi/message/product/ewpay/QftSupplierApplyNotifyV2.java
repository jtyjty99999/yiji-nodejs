/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-18 10:11 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-18
 */
@OpenApiMessage(service = "qftSupplierApply", type = ApiMessageType.Notify)
public class QftSupplierApplyNotifyV2 extends ApiNotify{
    @NotBlank
    @OpenApiField(desc = "平台商会员ID", constraint = "平台商会员ID", demo = "20150619010000072320")
    private String partnerShopId;

    @NotBlank
    @OpenApiField(desc = "企富通订单号", constraint = "企富通订单号", demo = "P145727545774737851")
    private String ewpayOrderNo;

    @OpenApiField(desc = "易极付用户ID", constraint = "易极付用户ID", demo = "20150619010000072320")
    private String userId;

    @NotBlank
    @OpenApiField(
            desc = "申请受理状态",
            constraint = "{\"data\":[\"WAIT_AUDIT:待处理\",\"REJECTED:驳回\",\"PASSED:已通过审核\",\"ALREADY_OPENED:已开户\"],\"name\":\"申请受理状态\"}",
            demo = "WAIT_AUDIT")
    private String acceptStatus;

    @OpenApiField(desc = "描述", constraint = "描述", demo = "通过审核")
    private String memo;

    @OpenApiField(desc = "用户姓名",demo = "张三")
    private String userName;

    @OpenApiField(desc = "平台会员公司名称",demo = "xxx有限公司")
    private String partnerShopName;

    @NotBlank
    @OpenApiField(desc = "用户类型", constraint = "{\"data\":[\"B:企业\",\"P:个人\"],\"name\":\"用户类型\"}", demo = "B")
    private String userType;

    public String getPartnerShopId() {
        return this.partnerShopId;
    }

    public void setPartnerShopId(String partnerShopId) {
        this.partnerShopId = partnerShopId;
    }

    public String getEwpayOrderNo() {
        return this.ewpayOrderNo;
    }

    public void setEwpayOrderNo(String ewpayOrderNo) {
        this.ewpayOrderNo = ewpayOrderNo;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAcceptStatus() {
        return this.acceptStatus;
    }

    public void setAcceptStatus(String acceptStatus) {
        this.acceptStatus = acceptStatus;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPartnerShopName() {
        return partnerShopName;
    }

    public void setPartnerShopName(String partnerShopName) {
        this.partnerShopName = partnerShopName;
    }
}

