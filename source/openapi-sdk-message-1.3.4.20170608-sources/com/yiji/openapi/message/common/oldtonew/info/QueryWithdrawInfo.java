package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;
import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-02-16<br>
 */
public class QueryWithdrawInfo implements Serializable {

	private static final long serialVersionUID = -6885352710555185019L;

	/** 交易时间 创建时间 yyyyMMDDHHMMSS */
	@OpenApiField(desc = "交易时间", demo = "20160214000000")
	private Date payTime;

	/** 交易完成时间 **/
	@OpenApiField(desc = "交易完成时间", demo = "20160214120000")
	private Date payUpdateTime;

	/** 银行上账时间 **/
	@OpenApiField(desc = "银行上账时间", demo = "20160214110000")
	private Date settleDate;

	/** 账期 */
	@OpenApiField(desc = "账期", demo = "xxx")
	private String accountDay;

	/** 提现来源(系统标识) */
	@OpenApiField(desc = "提现来源", demo = "xxx")
	private String bizIdentity;

	/** 真实名字 */
	@OpenApiField(desc = "真实名字", demo = "张三")
	private String realName;

	/** 提现账户名 */
	@OpenApiField(desc = "提现账户名", demo = "李四")
	private String accountName;

	/** 用户id 会员id */
	@OpenApiField(desc = "用户id", demo = "21298728910827482718")
	private String userId;

	/** 资金账号 */
	@OpenApiField(desc = "资金账号", demo = "398191029837372816458")
	private String accountNo;

	/** 外部订单号 */
	@OpenApiField(desc = "外部订单号", demo = "2139808BJKJ")
	private String outBizNo;

	/** 支付流水 */
	@OpenApiField(desc = "支付流水", demo = "xxx")
	private String payNo;

	/** 账务流水 */
	@OpenApiField(desc = "账务流水", demo = "xxx")
	private String accBizNo;

	/** 清算流水 银行流水 */
	@OpenApiField(desc = "清算流水", demo = "xxx")
	private String settleBizNo;

	/** 清算api */
	@OpenApiField(desc = "清算api", demo = "xxx")
	private String settleChannelApi;

	/** 银行名称 资金渠道 */
	@OpenApiField(desc = "银行名称", demo = "招商银行")
	private String bankName;

	/** 银行账号 卡号 */
	@OpenApiField(desc = "银行账号", demo = "622908714980****9176")
	private String bankAccountNo;

	/** 交易币种 **/
	@OpenApiField(desc = "交易币种", demo = "CNY")
	private String currency;

	/** 提现金额 本金 */
	@OpenApiField(desc = "提现金额", demo = "100.00")
	private Money amout;

	/** 手续费 */
	@OpenApiField(desc = "手续费", demo = "0.10")
	private Money charge;

	/** 提现总金额 本金+手续费 */
	@OpenApiField(desc = "提现总金额", demo = "100.10")
	private Money amountIn;

	/** 提现后余额(废弃,提现后账户余额请查询账务系统) */
	@Deprecated
	@OpenApiField(desc = "提现后余额", demo = "xxx")
	private Money balance;

	/** 提现状态 */
	@OpenApiField(desc = "提现状态", demo = "SUCCESS")
	private String status;

	/** 清算原因，银行原因 */
	@OpenApiField(desc = "清算原因", demo = "xxx")
	private String settleReason;

	/** 备注 原因 */
	@OpenApiField(desc = "备注", demo = "xxx")
	private String memo;

	/** 商户会员ID **/
	@OpenApiField(desc = "商户会员ID", demo = "xxx")
	private String merchantUserId;

	/** 商户卡号 **/
	@OpenApiField(desc = "商户卡号", demo = "xxx")
	private String merchantCardNo;

	/** 商户资金账号 **/
	@OpenApiField(desc = "商户资金账号", demo = "xxx")
	private String merchantAccNo;

	/** 商户外部订单号 **/
	@OpenApiField(desc = "商户外部订单号", demo = "xxx")
	private String merchantOrderBizNo;

	/** 入口编码 **/
	@OpenApiField(desc = "入口编码", demo = "xxx")
	private String inlet;

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getPayUpdateTime() {
		return payUpdateTime;
	}

	public void setPayUpdateTime(Date payUpdateTime) {
		this.payUpdateTime = payUpdateTime;
	}

	public Date getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}

	public String getAccountDay() {
		return accountDay;
	}

	public void setAccountDay(String accountDay) {
		this.accountDay = accountDay;
	}

	public String getBizIdentity() {
		return bizIdentity;
	}

	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOutBizNo() {
		return outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getAccBizNo() {
		return accBizNo;
	}

	public void setAccBizNo(String accBizNo) {
		this.accBizNo = accBizNo;
	}

	public String getSettleBizNo() {
		return settleBizNo;
	}

	public void setSettleBizNo(String settleBizNo) {
		this.settleBizNo = settleBizNo;
	}

	public String getSettleChannelApi() {
		return settleChannelApi;
	}

	public void setSettleChannelApi(String settleChannelApi) {
		this.settleChannelApi = settleChannelApi;
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

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Money getAmout() {
		return amout;
	}

	public void setAmout(Money amout) {
		this.amout = amout;
	}

	public Money getCharge() {
		return charge;
	}

	public void setCharge(Money charge) {
		this.charge = charge;
	}

	public Money getAmountIn() {
		return amountIn;
	}

	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}

	public Money getBalance() {
		return balance;
	}

	public void setBalance(Money balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSettleReason() {
		return settleReason;
	}

	public void setSettleReason(String settleReason) {
		this.settleReason = settleReason;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantUserId() {
		return merchantUserId;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMerchantCardNo() {
		return merchantCardNo;
	}

	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}

	public String getMerchantAccNo() {
		return merchantAccNo;
	}

	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}

	public String getMerchantOrderBizNo() {
		return merchantOrderBizNo;
	}

	public void setMerchantOrderBizNo(String merchantOrderBizNo) {
		this.merchantOrderBizNo = merchantOrderBizNo;
	}

	public String getInlet() {
		return inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
}
