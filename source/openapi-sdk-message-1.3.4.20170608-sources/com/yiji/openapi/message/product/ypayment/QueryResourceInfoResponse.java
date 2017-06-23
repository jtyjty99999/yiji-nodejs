/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-03 08:58 创建
 *
 */
package com.yiji.openapi.message.product.ypayment;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.ypayment.info.PayresourceInfos;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-03
 */
@OpenApiMessage(service = "queryResourceInfo", type = ApiMessageType.Response)
public class QueryResourceInfoResponse extends ApiResponse {

    @NotBlank
    @OpenApiField(desc = "资源列表信息",demo = "///")
    private  List<PayresourceInfos> resourceInfos;

    public List<PayresourceInfos> getResourceInfos() {
        return resourceInfos;
    }

    public void setResourceInfos(List<PayresourceInfos> resourceInfos) {
        this.resourceInfos = resourceInfos;
    }
}
