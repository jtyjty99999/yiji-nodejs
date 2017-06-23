package com.yiji.openapi.message.common.query.info;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

public class WithdrawQueryInfo {

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "交易时间")
	private Date payTime;

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "易极付用户id")
	private String userId;

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "支付流水号")
	private String payNo;

	@Length(max = 128)
	@OpenApiField(desc = "外部订单号")
	private String outBizNo;

	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "充值账号")
	private String accountNo;

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "充值账户名")
	private String accountName;

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "银行名称")
	private String bankName;

	@NotBlank
	@Length(min = 16, max = 20)
	@OpenApiField(desc = "银行卡号")
	private String bankAccountNo;

	@NotBlank
	@OpenApiField(desc = "提现金额")
	private Money amount;

	@NotBlank
	@OpenApiField(desc = "手续费")
	private Money charge;

	@NotBlank
	@OpenApiField(desc = "余额")
	private Money balance;

	@NotBlank
	@OpenApiField(desc = "总金额")
	private Money totalAmount;

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "充值状态")
	private String status;

	@NotBlank
	@Length(max = 1024)
	@OpenApiField(desc = "备注")
	private String memo;

	/**
	 * @return the payTime
	 */
	public Date getPayTime() {
		return payTime;
	}

	/**
	 * @param payTime the payTime to set
	 */
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the payNo
	 */
	public String getPayNo() {
		return payNo;
	}

	/**
	 * @param payNo the payNo to set
	 */
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	/**
	 * @return the outBizNo
	 */
	public String getOutBizNo() {
		return outBizNo;
	}

	/**
	 * @param outBizNo the outBizNo to set
	 */
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the bankAccountNo
	 */
	public String getBankAccountNo() {
		return bankAccountNo;
	}

	/**
	 * @param bankAccountNo the bankAccountNo to set
	 */
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	/**
	 * @return the amount
	 */
	public Money getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}

	/**
	 * @return the charge
	 */
	public Money getCharge() {
		return charge;
	}

	/**
	 * @param charge the charge to set
	 */
	public void setCharge(Money charge) {
		this.charge = charge;
	}

	/**
	 * @return the balance
	 */
	public Money getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Money balance) {
		this.balance = balance;
	}

	public Money getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param withdrawStatusEnum the status to set
	 */
	public void setStatus(String withdrawStatusEnum) {
		this.status = withdrawStatusEnum;
	}

	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
