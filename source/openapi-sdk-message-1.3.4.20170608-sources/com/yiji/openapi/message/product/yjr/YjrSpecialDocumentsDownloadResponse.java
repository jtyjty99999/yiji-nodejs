package com.yiji.openapi.message.product.yjr;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/27 17:00.
 */
@OpenApiMessage(service = "yjrSpecialDocumentsDownload", type = ApiMessageType.Response)
public class YjrSpecialDocumentsDownloadResponse extends ApiResponse {

    @OpenApiField(desc = "对账文件提取地址", constraint = "对账文件提取地址")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
