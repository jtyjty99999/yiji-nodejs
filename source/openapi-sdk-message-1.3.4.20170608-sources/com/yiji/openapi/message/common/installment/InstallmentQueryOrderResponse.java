package com.yiji.openapi.message.common.installment;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Jason Ma on 2015/2/8.
 */
@OpenApiMessage(service = "installmentQueryOrder", type = ApiMessageType.Response)
public class InstallmentQueryOrderResponse extends ApiResponse {
	
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "纸质签约合同号")
	private String paperContractNo;
	
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "期数")
	private int time;
	
	@OpenApiField(desc = "总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "本金金额")
	private Money capitalAmount;
	
	@OpenApiField(desc = "利率金额")
	private Money interestAmount;
	
	@OpenApiField(desc = "其他金额")
	private Money otherAmount;
	
	@OpenApiField(desc = "滞纳金金额")
	private Money overdueFineAmount;
	
	@OpenApiField(desc = "违约天数")
	private int overdueFineDay;
	
	@OpenApiField(desc = "违约减免天数")
	private int overdueRemitDay;
	
	@OpenApiField(desc = "预计还款日期")
	private Date expectedRepayDate;
	
	@OpenApiField(desc = "实际还款时间")
	private Date realRepayTime;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "备注")
	private String memo;
	
	@OpenApiField(desc = "分期订单号", constraint = "分期订单号")
	private String installmentOrderNo;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getPaperContractNo() {
		return paperContractNo;
	}
	
	public void setPaperContractNo(String paperContractNo) {
		this.paperContractNo = paperContractNo;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Money getCapitalAmount() {
		return capitalAmount;
	}
	
	public void setCapitalAmount(Money capitalAmount) {
		this.capitalAmount = capitalAmount;
	}
	
	public Money getInterestAmount() {
		return interestAmount;
	}
	
	public void setInterestAmount(Money interestAmount) {
		this.interestAmount = interestAmount;
	}
	
	public Money getOtherAmount() {
		return otherAmount;
	}
	
	public void setOtherAmount(Money otherAmount) {
		this.otherAmount = otherAmount;
	}
	
	public Money getOverdueFineAmount() {
		return overdueFineAmount;
	}
	
	public void setOverdueFineAmount(Money overdueFineAmount) {
		this.overdueFineAmount = overdueFineAmount;
	}
	
	public int getOverdueFineDay() {
		return overdueFineDay;
	}
	
	public void setOverdueFineDay(int overdueFineDay) {
		this.overdueFineDay = overdueFineDay;
	}
	
	public int getOverdueRemitDay() {
		return overdueRemitDay;
	}
	
	public void setOverdueRemitDay(int overdueRemitDay) {
		this.overdueRemitDay = overdueRemitDay;
	}
	
	public Date getExpectedRepayDate() {
		return expectedRepayDate;
	}
	
	public void setExpectedRepayDate(Date expectedRepayDate) {
		this.expectedRepayDate = expectedRepayDate;
	}
	
	public Date getRealRepayTime() {
		return realRepayTime;
	}
	
	public void setRealRepayTime(Date realRepayTime) {
		this.realRepayTime = realRepayTime;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getInstallmentOrderNo() {
		return installmentOrderNo;
	}
	
	public void setInstallmentOrderNo(String installmentOrderNo) {
		this.installmentOrderNo = installmentOrderNo;
	}
}
