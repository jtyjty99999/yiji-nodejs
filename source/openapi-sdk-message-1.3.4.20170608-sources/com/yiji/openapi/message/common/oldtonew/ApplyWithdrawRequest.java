package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-11 14:30.
 */
@OpenApiMessage(service = "applyWithdraw", type = ApiMessageType.Request)
public class ApplyWithdrawRequest extends ApiRequest {

    /** 银行简称 **/
    @NotNull
    @OpenApiField(desc = "银行简称",demo = "ABC")
    private String bankCode;

    /** 充值账户(会员)、默认人名币账户会员 */
    @NotNull
    @OpenApiField(desc = "易极付用户ID",demo = "12456654213564135")
    private String userId;

    /** 交易发生金额 >0 */
    @NotNull
    @OpenApiField(desc = "金额",demo = "88.66")
    private Money amount;

    /** 交易发生币种 (若为换汇,则是持有币种） */
    @OpenApiField(desc = "币种",demo = "CNY")
    protected String currency;

    /** 手续费金额,此处接口忽略 */
    @OpenApiField(desc = "手续费",demo = "8.66")
    private Money charge;

    /** 冻结解冻选项 */
    @OpenApiField(desc = "冻结解冻选项",demo = "TRANSFER_FREEZE")
    protected String freezeType;

    /** 提现类型 */
    @OpenApiField(desc = "提现类型",demo = "WITHDRAW_SINGLE")
    private String withdrawType;

    /** 业务请求者身份标识码 */
    @NotBlank
    @OpenApiField(desc = "业务请求者身份标识码",demo = "23156")
    protected String bizIdentity;

    /** 业务号 */
    @NotBlank
    @Size(min = 1)
    @OpenApiField(desc = "业务号",demo = "21651651.25")
    protected String bizNo;

    /** 外部订单号 ,系统交互会话流水号 */
    @NotBlank
    @Size(min = 1, max = 32)
    @OpenApiField(desc = "外部订单号",demo = "32645218621")
    protected String outBizNo;

    /** 银行开户账户号(卡号) */
    @NotBlank
    @Size(min = 1)
    @OpenApiField(desc = "银行开户账户号",demo = "165810651236")
    private String bankAccountNo;

    /** 银行账户开户名(卡户名) */
    @NotBlank
    @OpenApiField(desc = "银行账户开户名",demo = "张三")
    private String bankAccountName;

    /** 银行卡开户行地址 */
    @OpenApiField(desc = "银行卡开户行地址",demo = "重庆市")
    private String bankAddress;

    /** 银行联行号 */
    @OpenApiField(desc = "银行联行号",demo = "15234")
    private String bankCnapsNo;

    /** 是否自动处理 */
    @OpenApiField(desc = "是否自动处理",demo = "true")
    private boolean autoProcess = true;

    /** 通道选择策略码可空,如为空则为此产品挑选默认策略 */
    @OpenApiField(desc = "通道选择策略码",demo = "channel")
    private String strategy;

    /** 延迟处理时间，以小时为单位;0表示立即报送清算 */
    @OpenApiField(desc = "延迟处理时间",demo = "0",constraint = "单位小时")
    private int delay = 0;

    /**
     * yyyy-mm-dd
     */
    @OpenApiField(desc = "业务请求时间",demo = "2016-12-12",constraint = "格式：yyyy-mm-dd")
    private String bizApplyTime;

    /** 余额 */
    @OpenApiField(desc = "余额",demo = "88.66")
    private Money balance;

    /** 真实姓名 */
    @NotNull
    @OpenApiField(desc = "真实姓名",demo = "张三")
    private String realName;

    /** 银行省名 */
    @OpenApiField(desc = "银行省名",demo = "重庆")
    private String provName;

    /** 银行市名 */
    @OpenApiField(desc = "银行市名",demo = "重庆")
    private String cityName;

    /** 收付费选项(表示 手续费是否包含在交易额中 NY暂时没用) */
    @OpenApiField(desc = "收付费选项",demo = "Y")
    protected String chargeOption;

    /** 备注 */
    @OpenApiField(desc = "备注",demo = "备注")
    protected String memo;

    /** q账户userId,貌似现在没用了 */
    @OpenApiField(desc = "q账户ID",demo = "13452168132")
    private String qUserId;

    @OpenApiField(desc = "扩展参数1",demo = "45631321456")
    private String reserved1;

    @OpenApiField(desc = "扩展参数2",demo = "24516531654")
    private String reserved2;

    @OpenApiField(desc = "平台商ID",demo = "32165165812361354")
    private String tradeMerchantId;

    @OpenApiField(desc = "参与者ID",demo = "12534654981654")
    private String tradePartnerId;

    @OpenApiField(desc = "二期收费交易业务产品编号key",demo = "5261321574456")
    private String tradeBizProductCode;

    @OpenApiField(desc = "支付渠道",demo = "payChannelApi")
    private String payChannelApi;

    @OpenApiField(desc = "业务编码",demo = "15631")
    private String owner;

    @OpenApiField(desc = "子业务编码",demo = "132545")
    private String subOwner;

    @OpenApiField(desc = "对公标志",demo = "Y",constraint = "Y:对公，其他对私")
    private String publicTag;

    @OpenApiField(desc = "银行卡类型",demo = "DEBIT_CARD",constraint = "默认借记卡（DEBIT_CARD），信用卡传CREDIT_CARD")
    private String cardType = "DEBIT_CARD";

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Money getCharge() {
        return charge;
    }

    public void setCharge(Money charge) {
        this.charge = charge;
    }

    public String getFreezeType() {
        return freezeType;
    }

    public void setFreezeType(String freezeType) {
        this.freezeType = freezeType;
    }

    public String getWithdrawType() {
        return withdrawType;
    }

    public void setWithdrawType(String withdrawType) {
        this.withdrawType = withdrawType;
    }

    public String getBizIdentity() {
        return bizIdentity;
    }

    public void setBizIdentity(String bizIdentity) {
        this.bizIdentity = bizIdentity;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
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

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankCnapsNo() {
        return bankCnapsNo;
    }

    public void setBankCnapsNo(String bankCnapsNo) {
        this.bankCnapsNo = bankCnapsNo;
    }

    public boolean isAutoProcess() {
        return autoProcess;
    }

    public void setAutoProcess(boolean autoProcess) {
        this.autoProcess = autoProcess;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public String getBizApplyTime() {
        return bizApplyTime;
    }

    public void setBizApplyTime(String bizApplyTime) {
        this.bizApplyTime = bizApplyTime;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getChargeOption() {
        return chargeOption;
    }

    public void setChargeOption(String chargeOption) {
        this.chargeOption = chargeOption;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getqUserId() {
        return qUserId;
    }

    public void setqUserId(String qUserId) {
        this.qUserId = qUserId;
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getTradeMerchantId() {
        return tradeMerchantId;
    }

    public void setTradeMerchantId(String tradeMerchantId) {
        this.tradeMerchantId = tradeMerchantId;
    }

    public String getTradePartnerId() {
        return tradePartnerId;
    }

    public void setTradePartnerId(String tradePartnerId) {
        this.tradePartnerId = tradePartnerId;
    }

    public String getTradeBizProductCode() {
        return tradeBizProductCode;
    }

    public void setTradeBizProductCode(String tradeBizProductCode) {
        this.tradeBizProductCode = tradeBizProductCode;
    }

    public String getPayChannelApi() {
        return payChannelApi;
    }

    public void setPayChannelApi(String payChannelApi) {
        this.payChannelApi = payChannelApi;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSubOwner() {
        return subOwner;
    }

    public void setSubOwner(String subOwner) {
        this.subOwner = subOwner;
    }

    public String getPublicTag() {
        return publicTag;
    }

    public void setPublicTag(String publicTag) {
        this.publicTag = publicTag;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
