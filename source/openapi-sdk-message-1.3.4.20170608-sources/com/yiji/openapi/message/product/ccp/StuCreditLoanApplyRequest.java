package com.yiji.openapi.message.product.ccp;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "stuCreditLoanApply", type = ApiMessageType.Request)
public class StuCreditLoanApplyRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "易极付ID")
	private String borrowerId;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "申请流水号")
	private String creditAmountApplicationNo;
	
	@NotBlank
	@Length(min = 15, max = 18)
	@OpenApiField(desc = "申请者身份证号")
	private String applicantCertNo;
	
	@NotBlank
	@OpenApiField(desc = "开户行编码")
	private String bankCode;
	
	@Length(max = 50, min = 2)
	@OpenApiField(desc = "开户行省")
	private String bankProvince;
	
	@Length(max = 50)
	@OpenApiField(desc = "开户行所在市")
	private String bankCity;
	
	@OpenApiField(desc = "卡类型")
	private String cardType;
	
	@NotBlank
	@Length(min = 12, max = 32)
	@OpenApiField(desc = "银行卡号")
	private String bankCardNo;
	
	@NotBlank
	@OpenApiField(desc = "还款类型")
	private String repaymentType;
	
	@NotNull
	@OpenApiField(desc = "申请时间")
	private Date applyTime;
	
	@NotNull
	@OpenApiField(desc = "申请金额")
	private Money applyAmount;
	
	@OpenApiField(desc = "分期期数")
	private int installments;
	
	@NotBlank
	@OpenApiField(desc = "联系方式")
	private String tel;
	
	@OpenApiField(desc = "操作类型")
	private String actionType;
	
	@OpenApiField(desc = "提交人姓名（操作员姓名）")
	@Size(max = 32)
	private String opName;
	
	@OpenApiField(desc = "备注")
	@Size(min = 0, max = 128)
	private String comment;
	
	@NotNull
	@OpenApiField(desc = "业务ID")
	private List<String> busiId;
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getApplicantCertNo() {
		return applicantCertNo;
	}
	
	public void setApplicantCertNo(String applicantCertNo) {
		this.applicantCertNo = applicantCertNo;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankProvince() {
		return bankProvince;
	}
	
	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}
	
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getRepaymentType() {
		return repaymentType;
	}
	
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}
	
	public Date getApplyTime() {
		return applyTime;
	}
	
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	
	public int getInstallments() {
		return installments;
	}
	
	public void setInstallments(int installments) {
		this.installments = installments;
	}
	
	public String getBorrowerId() {
		return borrowerId;
	}
	
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	
	public String getCreditAmountApplicationNo() {
		return creditAmountApplicationNo;
	}
	
	public void setCreditAmountApplicationNo(String creditAmountApplicationNo) {
		this.creditAmountApplicationNo = creditAmountApplicationNo;
	}
	
	public String getBankCity() {
		return bankCity;
	}
	
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public Money getApplyAmount() {
		return applyAmount;
	}
	
	public void setApplyAmount(Money applyAmount) {
		this.applyAmount = applyAmount;
	}
	
	public String getActionType() {
		return actionType;
	}
	
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	public String getOpName() {
		return opName;
	}
	
	public void setOpName(String opName) {
		this.opName = opName;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public List<String> getBusiId() {
		return busiId;
	}
	
	public void setBusiId(List<String> busiId) {
		this.busiId = busiId;
	}
}
