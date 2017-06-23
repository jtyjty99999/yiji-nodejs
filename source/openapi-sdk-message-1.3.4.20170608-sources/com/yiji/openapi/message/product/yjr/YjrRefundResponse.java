package com.yiji.openapi.message.product.yjr;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-02-29 16:34.
 */
@OpenApiMessage(service = "yjrRefund", type = ApiMessageType.Response)
public class YjrRefundResponse extends ApiResponse {

    /**
     * 易极付交易流水号
     */
    @OpenApiField(desc = "易极付交易流水号",demo = "12354712685215")
    private String transNo;
    /**
     * 交易接收处理时间
     */
    @OpenApiField(desc = "交易接收处理时间",demo = "2016-02-25 12:45:41",constraint = "格式：YYYY-MM-DD HH:mm:ss")
    private Date dealDate;
    /**
     * 清算完成时间
     */
    @OpenApiField(desc = "清算完成时间",demo = "2016-02-25 12:45:41",constraint = "格式：YYYY-MM-DD HH:mm:ss")
    private Date settleDate;
    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money transAmt;

    /**
     * 交易码
     */
    @OpenApiField(desc = "交易码", constraint = "交易码")
    private String transCode;

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }

    public Money getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(Money transAmt) {
        this.transAmt = transAmt;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }
}
