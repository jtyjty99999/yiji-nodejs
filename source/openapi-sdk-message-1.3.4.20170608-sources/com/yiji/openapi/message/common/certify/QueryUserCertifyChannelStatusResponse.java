package com.yiji.openapi.message.common.certify;

import com.yiji.openapi.message.common.certify.info.CertifyInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

import java.util.List;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/20 14:37.
 */
@OpenApiMessage(service = "queryUserCertifyChannelStatus", type = ApiMessageType.Response)
public class QueryUserCertifyChannelStatusResponse extends ApiResponse {

    /**
     * 用户通过验证的渠道数
     */
    @OpenApiField(desc = "用户已通过认证的渠道总数")
    private int passNum;

    /**
     * 通过验证的渠道校验详情列表
     */
    @OpenApiField(desc = "认证通过的渠道列表")
    private List<CertifyInfo> certifyInfos;

    public int getPassNum() {
        return passNum;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }

    public List<CertifyInfo> getCertifyInfos() {
        return certifyInfos;
    }

    public void setCertifyInfos(List<CertifyInfo> certifyInfos) {
        this.certifyInfos = certifyInfos;
    }
}
