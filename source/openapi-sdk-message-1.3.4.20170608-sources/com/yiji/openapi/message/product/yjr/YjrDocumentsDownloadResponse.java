/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-06 13:55 创建
 *
 */
package com.yiji.openapi.message.product.yjr;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yjrDocumentsDownload", type = ApiMessageType.Response)
public class YjrDocumentsDownloadResponse extends ApiResponse {

    @OpenApiField(desc = "对账文件提取地址", constraint = "对账文件提取地址")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
