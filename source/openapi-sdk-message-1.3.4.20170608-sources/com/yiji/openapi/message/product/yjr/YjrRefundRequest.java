package com.yiji.openapi.message.product.yjr;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-02-29 16:34.
 */
@OpenApiMessage(service = "yjrRefund", type = ApiMessageType.Request)
public class YjrRefundRequest extends ApiRequest {

    /**
     * 原订单号
     */
    @NotBlank(message = "不能为空")
    @Length(min = 16, max = 32)
    @OpenApiField(desc = "原代收业务的商户订单号",demo = "123432186213541")
    private String originalOrderNo;

    /**
     * 退款金额
     */
    @NotNull(message = "不能为空")
    @OpenApiField(desc = "退款金额",demo = "88.66")
    private Money transAmt;
    /**
     * 退款原因
     */
    @OpenApiField(desc = "退款原因",demo = "退款")
    private String note;

    public String getOriginalOrderNo() {
        return originalOrderNo;
    }

    public void setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
    }

    public Money getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(Money transAmt) {
        this.transAmt = transAmt;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
