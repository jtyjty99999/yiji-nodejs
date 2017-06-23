package com.yiji.openapi.message.product.common.info;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-08 11:23.
 */
public class AccountLogInfo {

    /** 可能为交易流水号，支付引擎流水号，收费流水号 */
    @OpenApiField(desc = "业务流水号",demo = "10325461468",constraint = "可能为交易流水号，支付引擎流水号，收费流水号")
    private String tradeNo;

    /** 外部订单号 */
    @OpenApiField(desc = "外部订单号",demo = "354681651235812456")
    private String outOrderNo;

    /** 用户ID */
    @OpenApiField(desc = "易极付ID",demo = "1234567890123456123")
    private String userId;

    /** 交易金额 */
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money tradeAmount;

    /** 数据业务类型 */
    @OpenApiField(desc = "数据业务类型",demo = "TRADE",constraint = "{\"name\":\"数据业务类型\",\"data\":[\"TRADE:交易\", \"TRADE_REFUND:交易退款\", \"TRADE_SHARE:交易分润\", \"TRADE_SHARE_REFUND:交易分润退款\", \"TRADE_FLUSHES_FILLACCOUNTS:交易冲正补账\", \"TRADE_FLUSHES_WRITEOFF:交易冲正销账\", \"DEPOSIT:充值\", \"DEPOSIT_FLUSHES_FILLACCOUNTS:充值冲正补账\", \"DEPOSIT_FLUSHES_WRITEOFF:充值冲正销账\", \"WITHDRAW:提现\", \"WITHDRAW_FLUSHES_FILLACCOUNTS:提现冲正补账\", \"WITHDRAW_FLUSHES_WRITEOFF:提现冲正销账\", \"DEPOSITBACK:充退\", \"DEPOSITBACK_FLUSHES_FILLACCOUNTS:充退补计\", \"DEPOSITBACK_FLUSHES_WRITEOFF:充退销账\", \"DISHONOUR:退票\", \"DISHONOUR_FLUSHES_FILLACCOUNTS:退票补计\", \"DISHONOUR_FLUSHES_WRITEOFF:退票销账\", \"CARDPAY_TRANS_APPLY:卡收单支付申请\", \"CARDPAY_TRANS_ACCOUNT:卡收单支付上账\", \"CARDPAY_TRANS_DISHONOUR:卡收单支付拒付\", \"CARDPAY_TRANS_REVOCATION:卡收单支付撤销\", \"CARDPAY_TRANS_REFUND:卡收单支付退款\", \"CARDPAY_EXCHG_CURRENCY:卡支付、跨境支付换汇\", \"CARDPAY_PAY_FOREIGN:卡支付、跨境支付付汇\", \"CARDPAY_EXCHANGE_PURCHASE:卡支付、跨境支付购汇\", \"CARDPAY_EXCHANGE_SETTLEMENT:卡支付、跨境支付结汇\", \"CHARGE:收费\", \"CHARGE_FLUSHES_FILLACCOUNTS:收费冲正补账\", \"CHARGE_FLUSHES_WRITEOFF:收费冲正销账\", \"CHARGE_REFUND:收费退费\", \"LOGIN:登录\", \"EDIT_PASSWORD:修改密码\", \"GENERAL_PRODUCT:通用产品\", \"GENERAL_PRODUCT_CANCEL:通用产品取消\", \"SIGNED:签约\", \"SIGNED_CANCEL:签约取消\"]}")
    private String event;

    /** 交易备注 */
    @OpenApiField(desc = "交易备注",demo = "交易")
    private String tradeMemo;

    /** 交易创建时间 */
    @OpenApiField(desc = "交易创建时间",demo = "2016-05-15 23:14:45",constraint = "格式：YYYY-MM-DD HH:mm:ss")
    private Date createTime;

    /** 交易完成时间 */
    @OpenApiField(desc = "交易完成时间",demo = "2016-05-15 23:14:45",constraint = "格式：YYYY-MM-DD HH:mm:ss")
    private Date finishedTime;

    /** 交易商品名称 */
    @OpenApiField(desc = "交易商品名称",demo = "电脑")
    private String tradeName;

    /** 手续费 */
    @OpenApiField(desc = "手续费",demo = "88.66")
    private Money fee;

    /** 收支方向 */
    @OpenApiField(desc = "收支方向",demo = "IN")
    private String direction;

    /** 银行名称 */
    @OpenApiField(desc = "银行名称",demo = "农业银行")
    private String bankName;

    /** 银行账号 */
    @OpenApiField(desc = "银行账号",demo = "16521652165121")
    private String bankAccountNo;

    /** 银行账户名称 */
    @OpenApiField(desc = "银行账户名称",demo = "张三")
    private String bankAccountName;

    /** 买家ID */
    @OpenApiField(desc = "买家用户ID",demo = "1234652316821")
    private String buyerUserId;

    /** 买家名称 */
    @OpenApiField(desc = "买家用户名",demo = "张三")
    private String buyerUserName;

    /** 卖家ID */
    @OpenApiField(desc = "卖家用户ID",demo = "12345612658126542")
    private String selleruserId;

    /** 卖家名称 */
    @OpenApiField(desc = "卖家用户名",demo = "李四")
    private String selleruserName;

    /** 币种 */
    @OpenApiField(desc = "币种",demo = "CNY")
    private String currency;

    /** 状态 */
    @OpenApiField(desc = "状态",demo = "FINISH")
    private String state;

    /** 交易后余额 */
    @OpenApiField(desc = "交易后余额",demo = "88.66")
    private Money balance;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTradeMemo() {
        return tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }
    public String getBankAccountName() {
        return bankAccountName;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getBuyerUserName() {
        return buyerUserName;
    }

    public void setBuyerUserName(String buyerUserName) {
        this.buyerUserName = buyerUserName;
    }

    public String getSelleruserId() {
        return selleruserId;
    }

    public void setSelleruserId(String selleruserId) {
        this.selleruserId = selleruserId;
    }

    public String getSelleruserName() {
        return selleruserName;
    }

    public void setSelleruserName(String selleruserName) {
        this.selleruserName = selleruserName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }
}
