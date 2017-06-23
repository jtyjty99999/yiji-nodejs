package com.yiji.openapi.message.product.easyexchange;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.easyexchange.infos.OpenapiCrossBorderRemittranceDetailInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "corderRemittanceSynOrder", type = ApiMessageType.Request)
public class CorderRemittanceSynOrderRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "跨境付款批次号")
    private String remittranceBatchNo;

    @NotNull
    @OpenApiField(desc = "明细列表")
    private List<OpenapiCrossBorderRemittranceDetailInfo> details;

    /**
     * @return the remittranceBatchNo
     */
    public String getRemittranceBatchNo() {
        return remittranceBatchNo;
    }

    /**
     * @param remittranceBatchNo the remittranceBatchNo to set
     */
    public void setRemittranceBatchNo(String remittranceBatchNo) {
        this.remittranceBatchNo = remittranceBatchNo;
    }

    /**
     * @return the details
     */
    public List<OpenapiCrossBorderRemittranceDetailInfo> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(List<OpenapiCrossBorderRemittranceDetailInfo> details) {
        this.details = details;
    }

}
