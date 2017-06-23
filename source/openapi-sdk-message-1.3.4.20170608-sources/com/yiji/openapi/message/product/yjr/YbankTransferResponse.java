package com.yiji.openapi.message.product.yjr;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-11 16:04.
 */
@OpenApiMessage(service = "ybankTransfer", type = ApiMessageType.Response)
public class YbankTransferResponse extends ApiResponse {
    /**
     * 商户原交易订单号
     */
    @OpenApiField(desc = "商户订单号",demo = "123456789123")
    private String outOrderNo;
    /**
     * 易极付交易流水号
     */
    @OpenApiField(desc = "易极付交易流水号",demo = "126545328915654")
    private String transNo;
    /**
     * 交易码
     */
    @OpenApiField(desc = "交易码",demo = "605")
    private String transCode;
    /**
     * 交易接收处理时间
     */
    @OpenApiField(desc = "交易接收处理时间",demo = "2015-12-12 12:12:12")
    private Date dealDate;
    /**
     * 清算完成时间
     */
    @OpenApiField(desc = "清算完成时间",demo = "2015-12-12 12:12:12")
    private Date settleDate;
    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money transAmt;

    @OpenApiField(desc = "交易状态",demo = "SUCCESS")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
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
}
