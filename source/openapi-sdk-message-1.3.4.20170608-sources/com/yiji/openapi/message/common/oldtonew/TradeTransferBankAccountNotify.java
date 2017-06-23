package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-14 16:05.
 */
@OpenApiMessage(service = "mobileBind", type = ApiMessageType.Notify)
public class TradeTransferBankAccountNotify extends ApiNotify {

    @OpenApiField(desc = "币种",demo = "CNY")
    private String currency;

    @OpenApiField(desc = "执行状态",demo = "SUCCESS")
    private String executeStatus;

    @OpenApiField(desc = "付款人账号",demo = "62157348561352154")
    private String payeeBankAccountNo;

    @OpenApiField(desc = "付款人姓名",demo = "张三")
    private String payeeRealName;

    @OpenApiField(desc = "付款人用户ID",demo = "2134567980123456789")
    private String payerUserId;

    @OpenApiField(desc = "成功时间",demo = "2013-08-14 16:43:35")
    private String successDate;

    @OpenApiField(desc = "交易金额",demo = "200.00")
    private String tradeAmount;

    @OpenApiField(desc = "提现金额",demo = "199.00")
    private String withdrawAmount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
    }

    public String getPayeeBankAccountNo() {
        return payeeBankAccountNo;
    }

    public void setPayeeBankAccountNo(String payeeBankAccountNo) {
        this.payeeBankAccountNo = payeeBankAccountNo;
    }

    public String getPayeeRealName() {
        return payeeRealName;
    }

    public void setPayeeRealName(String payeeRealName) {
        this.payeeRealName = payeeRealName;
    }

    public String getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(String payerUserId) {
        this.payerUserId = payerUserId;
    }

    public String getSuccessDate() {
        return successDate;
    }

    public void setSuccessDate(String successDate) {
        this.successDate = successDate;
    }

    public String getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(String withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
