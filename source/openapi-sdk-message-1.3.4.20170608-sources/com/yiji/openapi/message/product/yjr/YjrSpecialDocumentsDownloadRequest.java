package com.yiji.openapi.message.product.yjr;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/2/27 17:00.
 */
@OpenApiMessage(service = "yjrSpecialDocumentsDownload", type = ApiMessageType.Request)
public class YjrSpecialDocumentsDownloadRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "日期", constraint = "查询账单的日期")
    private String accountDate;

    @NotBlank
    @Length(min = 20, max = 32)
    @OpenApiField(desc = "商户ID")
    private String merchantId;

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
}
