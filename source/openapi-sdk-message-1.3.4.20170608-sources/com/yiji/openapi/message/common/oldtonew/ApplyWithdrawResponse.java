package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;
import java.util.Map;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-11 14:30.
 */
@OpenApiMessage(service = "applyWithdraw", type = ApiMessageType.Response)
public class ApplyWithdrawResponse extends ApiResponse {

    /** 主键，提现流水，系统间应以此作为交互凭证 */
    @OpenApiField(desc = "提现流水",demo = "165413241685")
    private String withdrawId;

    /** 业务请求者身份标识码 */
    @OpenApiField(desc = "业务请求者身份标识码",demo = "23156")
    protected String bizIdentity;

    /** 外部订单号 */
    @OpenApiField(desc = "外部订单号",demo = "12456132456")
    private String outBizNo;

    /** 外部上下文 */
    @OpenApiField(desc = "外部上下文",demo = "")
    private Map<String, String> outBizContext;

    /** 账务冻结码 */
    @OpenApiField(desc = "账务冻结码",demo = "TRANSFER_FREEZE")
    private String freezeType;

    /** 回执产品层的通知地址 */
    @OpenApiField(desc = "回执产品层的通知地址",demo = "http://www.yiji.com")
    private String receiptUrl;

    /** 回执优先级 */
    @OpenApiField(desc = "回执优先级",demo = "1")
    private String priority;

    /** 子协议代码 */
    @OpenApiField(desc = "子协议代码",demo = "ASYNC_WITHDRAW_CONTRACT")
    private String subContractCode;

    /** 指令状态 */
    @OpenApiField(desc = "指令状态",demo = "SUBMIT_SETTLED")
    private String status;

    /** 提现类型 */
    @OpenApiField(desc = "提现类型",demo = "WITHDRAW_SINGLE")
    private String withdrawType;

    /** 应付额币种 */
    @OpenApiField(desc = "币种",demo = "CNY")
    private String payAmountCurrency;

    /** 应付额 */
    @OpenApiField(desc = "金额",demo = "88.66")
    private Money payAmount = Money.zero();

    /** 应付实收额 */
    @OpenApiField(desc = "实收金额",demo = "88.66")
    private Money payAmountIn = Money.zero();

    /** 账户账号 */
    @OpenApiField(desc = "账号",demo = "321654685")
    private String accountNo;

    /** 账户名 */
    @OpenApiField(desc = "账户名",demo = "张三")
    private String accountName;

    /** 账户类别 */
    @OpenApiField(desc = "账户类别",demo = "PERSONAL")
    private String accountType;

    /** 用户银行账号 */
    @OpenApiField(desc = "用户银行账号",demo = "12651324568")
    private String bankAccountNo;

    /** 用户开户名 */
    @OpenApiField(desc = "用户开户名",demo = "张三")
    private String bankAccountName;

    /** 银行代码 */
    @OpenApiField(desc = "银行代码",demo = "ABC")
    private String bankCode;

    /** 银行联号 */
    @OpenApiField(desc = "银行联号",demo = "12653325456")
    private String bankCnapsNo;

    /** 银行名称 */
    @OpenApiField(desc = "银行名称",demo = "农业银行")
    private String bankName;

    /** 银行地址 */
    @OpenApiField(desc = "银行地址",demo = "重庆市")
    private String bankAddress;

    /** 备注 */
    @OpenApiField(desc = "备注",demo = "备注")
    private String memo;

    @OpenApiField(desc = "添加时间",demo = "2016-02-12 12:14:45",constraint = "YYYY-MM-DD HH:mm:ss")
    private Date rawAddTime;

    @OpenApiField(desc = "更新时间",demo = "2016-02-12 12:14:45",constraint = "YYYY-MM-DD HH:mm:ss")
    private Date rawUpdateTime;

    public String getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId;
    }

    public String getBizIdentity() {
        return bizIdentity;
    }

    public void setBizIdentity(String bizIdentity) {
        this.bizIdentity = bizIdentity;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public Map<String, String> getOutBizContext() {
        return outBizContext;
    }

    public void setOutBizContext(Map<String, String> outBizContext) {
        this.outBizContext = outBizContext;
    }

    public String getFreezeType() {
        return freezeType;
    }

    public void setFreezeType(String freezeType) {
        this.freezeType = freezeType;
    }

    public String getReceiptUrl() {
        return receiptUrl;
    }

    public void setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSubContractCode() {
        return subContractCode;
    }

    public void setSubContractCode(String subContractCode) {
        this.subContractCode = subContractCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWithdrawType() {
        return withdrawType;
    }

    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType;
    }

    public String getPayAmountCurrency() {
        return payAmountCurrency;
    }

    public void setPayAmountCurrency(String payAmountCurrency) {
        this.payAmountCurrency = payAmountCurrency;
    }

    public Money getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    public Money getPayAmountIn() {
        return payAmountIn;
    }

    public void setPayAmountIn(Money payAmountIn) {
        this.payAmountIn = payAmountIn;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCnapsNo() {
        return bankCnapsNo;
    }

    public void setBankCnapsNo(String bankCnapsNo) {
        this.bankCnapsNo = bankCnapsNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }
}
