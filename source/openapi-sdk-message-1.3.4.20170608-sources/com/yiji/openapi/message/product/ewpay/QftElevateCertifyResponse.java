package com.yiji.openapi.message.product.ewpay;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-11-17 11:12.
 */
@OpenApiMessage(service = "qftElevateCertify", type = ApiMessageType.Response)
public class QftElevateCertifyResponse extends ApiResponse {

    @OpenApiField(desc = "易极付用户ID")
    private String userId;

    @OpenApiField(desc = "商户平台用户ID")
    private String partnerShopId;

    @OpenApiField(desc = "终端类型")
    private String clientType;

    @OpenApiField(desc = "gid")
    private String gid;

    @OpenApiField(desc = "请求时间" ,demo = "20160232143022")
    private Date requestDate=new Date();

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPartnerShopId() {
        return partnerShopId;
    }

    public void setPartnerShopId(String partnerShopId) {
        this.partnerShopId = partnerShopId;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

}
