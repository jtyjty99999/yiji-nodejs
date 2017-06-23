package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Administrator on 2017/1/4.
 * 跳转易极付验权
 */
@OpenApiMessage(service = "commonAuthorizationCheck", type = ApiMessageType.Response)
public class CommonAuthorizationCheckResponse extends ApiResponse {

    /**
     * 流水号
     */
    @NotBlank
    @OpenApiField(desc = "流水号")
    private String gid;

    /**
     * dubbo通知的组名
     */
    @OpenApiField(desc = "dubbo通知的组名")
    private String dubboGroup;

    /**
     * 版本号
     */
    @OpenApiField(desc = "版本号")
    private String dubboVersion;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

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
}
