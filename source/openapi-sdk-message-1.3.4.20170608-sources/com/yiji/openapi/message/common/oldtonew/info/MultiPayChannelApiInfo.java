package com.yiji.openapi.message.common.oldtonew.info;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-01 14:57.
 */
public class MultiPayChannelApiInfo {

    /** 支付渠道api */
    @OpenApiField(desc = "支付渠道api",demo = "abc1111")
	private String payChannelApi;

	/** 清算规则 **/
    @OpenApiField(desc = "清算规则",demo = "T+0")
	private String settleChannelApiRule;

	/** 银行简码 */
    @OpenApiField(desc = "银行编码",demo = "ABC")
	private String bankCode;

	/** 银行名称 */
    @OpenApiField(desc = "银行名称",demo = "农业银行")
	private String bankName;

	/** 渠道号 */
    @OpenApiField(desc = "渠道号",demo = "DEPOSIT_B2C")
	private String channelNo;

	/** 卡类型 */
    @OpenApiField(desc = "卡类型",demo = "DEBIT_CARD")
	private String cardType;

	/** 对公对私 */
    @OpenApiField(desc = "对公对私",demo = "Y")
	private String publicTag;

	/** 环境 */
    @OpenApiField(desc = "环境",demo = "ONLINE")
	private String env;

	/** 是否批量 */
    @OpenApiField(desc = "是否批量",demo = "Y")
	private String batch;

	/** api类型 */
    @OpenApiField(desc = "api类型",demo = "DEPOSIT_EBANK")
	private String apiType;

	/** 支付类型 */
    @OpenApiField(desc = "支付类型",demo = "DEPOSIT")
	private String payType;

	/** 银行链接地址 */
    @OpenApiField(desc = "银行链接地址",demo = "www.yiji.com")
	private String logoUrl;

	/** 所属产品 */
    @OpenApiField(desc = "所属产品",demo = "DEFAULT")
	private String owner;

	/** 产品子集 */
    @OpenApiField(desc = "产品子集",demo = "yjf")
	private String subOwner;

	/** 优先级 */
    @OpenApiField(desc = "优先级",demo = "0")
	private int priority;

	/** 同步异步支持标志 */
    @OpenApiField(desc = "同步异步支持标志",demo = "Y")
	private String syncFlag;

	/** 用户类型标识 */
    @OpenApiField(desc = "用户类型标识",demo = "Y")
	private String userFlag;

	/** 用户级别标志 */
    @OpenApiField(desc = "用户级别标志",demo = "3")
	private int userLevel;

	/** 限额 */
    @OpenApiField(desc = "限额",demo = "88.66")
	private Money amountLimit;

	/** 手续费限额 */
    @OpenApiField(desc = "手续费限额",demo = "88.66")
	private Money chargeLimit;

	/** 过期时间[Null 永不过期] */
    @OpenApiField(desc = "过期时间",demo = "2017-12-31 23:59:59")
	private Date expireTime;

	/** 渠道备注 */
    @OpenApiField(desc = "渠道备注",demo = "备注")
	private String memo;

    public String getPayChannelApi() {
        return payChannelApi;
    }

    public void setPayChannelApi(String payChannelApi) {
        this.payChannelApi = payChannelApi;
    }

    public String getSettleChannelApiRule() {
        return settleChannelApiRule;
    }

    public void setSettleChannelApiRule(String settleChannelApiRule) {
        this.settleChannelApiRule = settleChannelApiRule;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPublicTag() {
        return publicTag;
    }

    public void setPublicTag(String publicTag) {
        this.publicTag = publicTag;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getSyncFlag() {
        return syncFlag;
    }

    public void setSyncFlag(String syncFlag) {
        this.syncFlag = syncFlag;
    }

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public Money getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(Money amountLimit) {
        this.amountLimit = amountLimit;
    }

    public Money getChargeLimit() {
        return chargeLimit;
    }

    public void setChargeLimit(Money chargeLimit) {
        this.chargeLimit = chargeLimit;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
