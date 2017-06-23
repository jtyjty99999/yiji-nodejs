/**
 * 
 */
package com.yiji.openapi.message.common.query;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;
//import com.yjf.payengine.deposit.service.enums.String;

/**
 * @author mayansen
 * @date 20140807
 *
 */
@OpenApiMessage(service = "depositQuery", type = ApiMessageType.Response)
public class DepositQueryResponse extends ApiResponse {
	
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
	
	@NotBlank
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
	@Length(max = 20)
	@OpenApiField(desc = "子业务类型")
	private String apiAccess;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "充值金额")
	private Money amount;
	
	@NotBlank
	@OpenApiField(desc = "手续费")
	private Money charge;
	
	@NotBlank
	@OpenApiField(desc = "总金额")
	private Money totoalAmount;
	
	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "充值状态")
	private String status;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "备注")
	private String memo;
	
	/**
	 * 
	 */
	public DepositQueryResponse() {
		super();
	}
	
	/**
	 * @param payTime
	 * @param userId
	 * @param payNo
	 * @param outBizNo
	 * @param accountNo
	 * @param accountName
	 * @param bankName
	 * @param bankAccountNo
	 * @param apiAccess
	 * @param amount
	 * @param charge
	 * @param totoalAmount
	 * @param status
	 * @param memo
	 */
	public DepositQueryResponse(Date payTime, String userId, String payNo, String outBizNo, String accountNo,
								String accountName, String bankName, String bankAccountNo, String apiAccess,
								Money amount, Money charge, Money totoalAmount, String status, String memo) {
		super();
		this.payTime = payTime;
		this.userId = userId;
		this.payNo = payNo;
		this.outBizNo = outBizNo;
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.bankName = bankName;
		this.bankAccountNo = bankAccountNo;
		this.apiAccess = apiAccess;
		this.amount = amount;
		this.charge = charge;
		this.totoalAmount = totoalAmount;
		this.status = status;
		this.memo = memo;
	}
	
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
		return "**" + bankAccountNo.substring(bankAccountNo.length() - 4, bankAccountNo.length());
	}
	
	/**
	 * @param bankAccountNo the bankAccountNo to set
	 */
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	/**
	 * @return the apiAccess
	 */
	public String getApiAccess() {
		return apiAccess;
	}
	
	/**
	 * @param payToolAccessEnum the apiAccess to set
	 */
	public void setApiAccess(String payToolAccessEnum) {
		this.apiAccess = payToolAccessEnum;
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
	 * @return the totoalAmount
	 */
	public Money getTotoalAmount() {
		return totoalAmount;
	}
	
	/**
	 * @param totoalAmount the totoalAmount to set
	 */
	public void setTotoalAmount(Money totoalAmount) {
		this.totoalAmount = totoalAmount;
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * @param depositStatusEnum the status to set
	 */
	public void setStatus(String depositStatusEnum) {
		this.status = depositStatusEnum;
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
