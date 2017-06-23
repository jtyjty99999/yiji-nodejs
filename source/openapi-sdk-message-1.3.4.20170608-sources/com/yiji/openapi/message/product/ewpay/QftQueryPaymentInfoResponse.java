package com.yiji.openapi.message.product.ewpay;

import java.util.List;

import com.yiji.openapi.message.product.ewpay.info.EwpayPaymentRelationShip;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-24 14:45.
 */
@OpenApiMessage(service = "qftQueryPaymentInfo", type = ApiMessageType.Response)
public class QftQueryPaymentInfoResponse extends ApiResponse {

    @OpenApiField(desc = "收款用户信息")
    private List<EwpayPaymentRelationShip> PaymentRelationshipInfoList;

    public List<EwpayPaymentRelationShip> getPaymentRelationshipInfoList() {
        return PaymentRelationshipInfoList;
    }

    public void setPaymentRelationshipInfoList(List<EwpayPaymentRelationShip> paymentRelationshipInfoList) {
        PaymentRelationshipInfoList = paymentRelationshipInfoList;
    }
}
