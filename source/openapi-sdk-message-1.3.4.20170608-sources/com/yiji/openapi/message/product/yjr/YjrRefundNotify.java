package com.yiji.openapi.message.product.yjr;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2016-02-29 16:34.
 */
@OpenApiMessage(service = "yjrRefund", type = ApiMessageType.Notify)
public class YjrRefundNotify extends ApiNotify {
    /**
     * 易极付交易流水号
     */
    @OpenApiField(desc = "交易流水号", constraint = "易极付交易流水号",demo = "135216542")
    private String transNo;
    /**
     * 交易码
     */
    @OpenApiField(desc = "交易码", constraint = "交易码",demo = "xxx")
    private String transCode;
    /**
     * 交易接收处理时间
     */
    @OpenApiField(desc = "交易处理时间", constraint = "格式：YYYY-MM-DD HH:mm:ss",demo = "2016-02-23 00:51:21")
    private String dealDate;
    /**
     * 清算完成时间
     */
    @OpenApiField(desc = "清算完成时间", constraint = "格式：YYYY-MM-DD HH:mm:ss",demo = "2016-02-23 00:51:21")
    private String settleDate;
    /**
     * 交易金额
     */
    @OpenApiField(desc = "交易金额", constraint = "交易金额",demo = "88.66")
    private String transAmt;

    /** 结果状态 */
    @OpenApiField(desc = "状态", constraint = "交易结果状态",demo = "SUCCESS")
    protected String status;

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

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
