package com.yiji.openapi.message.common.installment;

import java.util.Date;
import java.util.List;

import com.yiji.openapi.message.common.installment.info.InstallmentScheduleList;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Jason Ma on 2015/2/8.
 */
@OpenApiMessage(service = "installmentQuerySign", type = ApiMessageType.Response)
public class InstallmentQuerySignResponse extends ApiResponse {
	
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "产品名称")
	private String productName;
	
	@OpenApiField(desc = "产品价格")
	private Money productPrice;
	
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "手机号")
	private String mobileNo;
	
	@OpenApiField(desc = "身份证号")
	private String certNo;
	
	@OpenApiField(desc = "银行名称")
	private String bankName;
	
	@OpenApiField(desc = "银行卡类型")
	private String bankCardType;
	
	@OpenApiField(desc = "银行卡号")
	private String bankCardNo;
	
	@OpenApiField(desc = "纸质合同号")
	private String paperContractNo;
	
	@OpenApiField(desc = "总期数")
	private int totalTimes;
	
	@OpenApiField(desc = "首付款金额")
	private Money downPaymentAmount;
	
	@OpenApiField(desc = "本金总金额")
	private Money totalCapitalAmount;
	
	@OpenApiField(desc = "利率")
	private double interestRate;
	
	@OpenApiField(desc = "其他利率")
	private double otherRate;
	
	@OpenApiField(desc = "首次还款日期")
	private Date firstRepayDate;
	
	@OpenApiField(desc = "分期策略")
	private String installmentPolicy;
	
	@OpenApiField(desc = "纸质签约合同照片地址")
	private String imageUrl1;
	
	@OpenApiField(desc = "身份证照片地址")
	private String imageUrl2;
	
	@OpenApiField(desc = "银行卡照片地址")
	private String imageUrl3;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "备注")
	private String memo;

	@OpenApiField(desc = "还款计划")
	private List<InstallmentScheduleList> scheduleList;

	@OpenApiField(desc = "客户实名状态",demo = "NORMAL")
	private String customerStatus;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Money getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(Money productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCardType() {
		return bankCardType;
	}
	
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getPaperContractNo() {
		return paperContractNo;
	}
	
	public void setPaperContractNo(String paperContractNo) {
		this.paperContractNo = paperContractNo;
	}
	
	public int getTotalTimes() {
		return totalTimes;
	}
	
	public void setTotalTimes(int totalTimes) {
		this.totalTimes = totalTimes;
	}
	
	public Money getDownPaymentAmount() {
		return downPaymentAmount;
	}
	
	public void setDownPaymentAmount(Money downPaymentAmount) {
		this.downPaymentAmount = downPaymentAmount;
	}
	
	public Money getTotalCapitalAmount() {
		return totalCapitalAmount;
	}
	
	public void setTotalCapitalAmount(Money totalCapitalAmount) {
		this.totalCapitalAmount = totalCapitalAmount;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getOtherRate() {
		return otherRate;
	}
	
	public void setOtherRate(double otherRate) {
		this.otherRate = otherRate;
	}
	
	public Date getFirstRepayDate() {
		return firstRepayDate;
	}
	
	public void setFirstRepayDate(Date firstRepayDate) {
		this.firstRepayDate = firstRepayDate;
	}
	
	public String getInstallmentPolicy() {
		return installmentPolicy;
	}
	
	public void setInstallmentPolicy(String installmentPolicy) {
		this.installmentPolicy = installmentPolicy;
	}
	
	public String getImageUrl1() {
		return imageUrl1;
	}
	
	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}
	
	public String getImageUrl2() {
		return imageUrl2;
	}
	
	public void setImageUrl2(String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}
	
	public String getImageUrl3() {
		return imageUrl3;
	}
	
	public void setImageUrl3(String imageUrl3) {
		this.imageUrl3 = imageUrl3;
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

	public List<InstallmentScheduleList> getScheduleList() {
		return scheduleList;
	}

	public void setScheduleList(List<InstallmentScheduleList> scheduleList) {
		this.scheduleList = scheduleList;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
}
