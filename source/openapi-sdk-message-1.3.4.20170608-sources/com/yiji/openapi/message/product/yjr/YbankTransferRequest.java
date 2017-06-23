package com.yiji.openapi.message.product.yjr;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.yjr.infos.ApiAdditionalInfo;
import com.yiji.openapi.message.product.yjr.infos.YbankCardInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-11 16:04.
 */
@OpenApiMessage(service = "ybankTransfer", type = ApiMessageType.Request)
public class YbankTransferRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "商户订单号",demo = "123456789123")
    private String outOrderNo;
    /**
     * 交易日期
     */
    @NotNull(message = "不能为空")
    @OpenApiField(desc = "交易日期",demo = "2015-12-12 12:12:12")
    private Date transDate;
    /**
     * 交易金额
     */
    @NotNull(message = "不能为空")
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money transAmt;
    /**
     * 转出方卡信息
     */
    @NotNull(message = "不能为空")
    @OpenApiField(desc = "转出方卡信息")
    private YbankCardInfo fromCard;
    /**
     * 转入方卡信息
     */
    @NotNull(message = "不能为空")
    @OpenApiField(desc = "转入方卡信息")
    private YbankCardInfo toCard;
    /**
     * 备注
     */
    @OpenApiField(desc = "备注",demo = "购买笔记本")
    private String note;
    /**
     * 交易附加信息
     */
    @OpenApiField(desc = "交易附加信息")
    private ApiAdditionalInfo additionalInfo;

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Money getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(Money transAmt) {
        this.transAmt = transAmt;
    }

    public YbankCardInfo getFromCard() {
        return fromCard;
    }

    public void setFromCard(YbankCardInfo fromCard) {
        this.fromCard = fromCard;
    }

    public YbankCardInfo getToCard() {
        return toCard;
    }

    public void setToCard(YbankCardInfo toCard) {
        this.toCard = toCard;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ApiAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(ApiAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
