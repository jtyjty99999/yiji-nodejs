package com.yiji.openapi.message.product.rewardloan;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "rewardloanLoanInfoQuery", type = ApiMessageType.Response)
public class RewardloanLoanInfoQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "是否有贷款")
	private boolean hasLoan;
	
	@OpenApiField(desc = "资格审核结果")
	private String prequisitesCheck;
	
	@OpenApiField(desc = "剩余信用额度")
	private Money remainCreditAmount;
	
	@OpenApiField(desc = "最小贷款额度")
	private Money minLoanAmount;
	
	/**
	 * 待还金额
	 */
	@OpenApiField(desc = "待还金额")
	private Money needpayAmount;
	
	/**
	 * 待还款笔数
	 */
	@OpenApiField(desc = "待还款笔数")
	private int needpayNum;
	
	/**
	 * 距离还款截止日期的天数
	 */
	@OpenApiField(desc = "距离还款截止日期的天数")
	private int latestDueDays;
	
	/**
	 * 待还款截止日期
	 */
	@OpenApiField(desc = "待还款截止日期")
	private String latestDueDate;
	
	/**
	 * 逾期贷款笔数
	 */
	@OpenApiField(desc = "逾期贷款笔数")
	private int overdueNum;
	
	/**
	 * 待还款的贷款信息
	 */
	@OpenApiField(desc = "待还款的贷款信息")
	private String needRepayLoans;
	
	/**
	 * 未放款的信息
	 */
	@OpenApiField(desc = "未放款的信息")
	private String grantingLoans;
	
	public boolean isHasLoan() {
		return hasLoan;
	}
	
	public void setHasLoan(boolean hasLoan) {
		this.hasLoan = hasLoan;
	}
	
	public String getPrequisitesCheck() {
		return prequisitesCheck;
	}
	
	public void setPrequisitesCheck(String prequisitesCheck) {
		this.prequisitesCheck = prequisitesCheck;
	}
	
	public Money getRemainCreditAmount() {
		return remainCreditAmount;
	}
	
	public void setRemainCreditAmount(Money remainCreditAmount) {
		this.remainCreditAmount = remainCreditAmount;
	}
	
	public Money getMinLoanAmount() {
		return minLoanAmount;
	}
	
	public void setMinLoanAmount(Money minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}
	
	public Money getNeedpayAmount() {
		return needpayAmount;
	}
	
	public void setNeedpayAmount(Money needpayAmount) {
		this.needpayAmount = needpayAmount;
	}
	
	public int getNeedpayNum() {
		return needpayNum;
	}
	
	public void setNeedpayNum(int needpayNum) {
		this.needpayNum = needpayNum;
	}
	
	public int getLatestDueDays() {
		return latestDueDays;
	}
	
	public void setLatestDueDays(int latestDueDays) {
		this.latestDueDays = latestDueDays;
	}
	
	public String getLatestDueDate() {
		return latestDueDate;
	}
	
	public void setLatestDueDate(String latestDueDate) {
		this.latestDueDate = latestDueDate;
	}
	
	public int getOverdueNum() {
		return overdueNum;
	}
	
	public void setOverdueNum(int overdueNum) {
		this.overdueNum = overdueNum;
	}
	
	public String getNeedRepayLoans() {
		return needRepayLoans;
	}
	
	public void setNeedRepayLoans(String needRepayLoans) {
		this.needRepayLoans = needRepayLoans;
	}
	
	public String getGrantingLoans() {
		return grantingLoans;
	}
	
	public void setGrantingLoans(String grantingLoans) {
		this.grantingLoans = grantingLoans;
	}
	
}
