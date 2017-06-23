package com.yiji.openapi.message.product.ccp;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "stuCreditAmountApply", type = ApiMessageType.Request)
public class StuCreditAmountApplyRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "借款人ID")
	private String borrowerId;
	
	@NotBlank
	@OpenApiField(desc = "性别")
	private String gender;
	
	@NotBlank
	@Length(max = 40)
	@OpenApiField(desc = "申请者真实姓名")
	private String applicantName;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "学生学号")
	private String studentNo;
	
	@NotBlank
	@Length(min = 1, max = 20)
	@OpenApiField(desc = "学校名称")
	private String schoolFullChineseName;
	
	@Min(value = 1)
	@Max(value = 12)
	@OpenApiField(desc = "所在年级")
	private int grade;
	
	@NotBlank
	@Length(min = 15, max = 18)
	@OpenApiField(desc = "申请者身份证号")
	private String applicantCertNo;
	
	@Email
	@Length(min = 5, max = 60)
	@OpenApiField(desc = "申请者电子邮件")
	private String applicantEmail;
	
	@NotNull
	@OpenApiField(desc = "申请时间")
	private Date applyTime;
	
	@NotNull
	@OpenApiField(desc = "申请金额")
	private Money applyAmount;
	
	@OpenApiField(desc = "学生月均消费金额")
	private Money monthlyAverageConsumeAmount;
	
	@OpenApiField(desc = "学生月均充值金额")
	private Money monthlyAverageRechargeAmount;
	
	@URL
	@NotBlank
	@OpenApiField(desc = "身份证正面图片地址")
	private String idCardFrontCopyUrl;
	
	@URL
	@NotBlank
	@OpenApiField(desc = "身份证背面图片地址")
	private String idCardBackCopyUrl;
	
	@NotBlank
	@OpenApiField(desc = "联系方式")
	private String tel;
	
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
	
	public String getBorrowerId() {
		return borrowerId;
	}
	
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getApplicantName() {
		return applicantName;
	}
	
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
	public String getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getSchoolFullChineseName() {
		return schoolFullChineseName;
	}
	
	public void setSchoolFullChineseName(String schoolFullChineseName) {
		this.schoolFullChineseName = schoolFullChineseName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getApplicantCertNo() {
		return applicantCertNo;
	}
	
	public void setApplicantCertNo(String applicantCertNo) {
		this.applicantCertNo = applicantCertNo;
	}
	
	public String getApplicantEmail() {
		return applicantEmail;
	}
	
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	
	public Date getApplyTime() {
		return applyTime;
	}
	
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	
	public Money getMonthlyAverageConsumeAmount() {
		return monthlyAverageConsumeAmount;
	}
	
	public void setMonthlyAverageConsumeAmount(Money monthlyAverageConsumeAmount) {
		this.monthlyAverageConsumeAmount = monthlyAverageConsumeAmount;
	}
	
	public Money getMonthlyAverageRechargeAmount() {
		return monthlyAverageRechargeAmount;
	}
	
	public void setMonthlyAverageRechargeAmount(Money monthlyAverageRechargeAmount) {
		this.monthlyAverageRechargeAmount = monthlyAverageRechargeAmount;
	}
	
	public String getIdCardFrontCopyUrl() {
		return idCardFrontCopyUrl;
	}
	
	public void setIdCardFrontCopyUrl(String idCardFrontCopyUrl) {
		this.idCardFrontCopyUrl = idCardFrontCopyUrl;
	}
	
	public String getIdCardBackCopyUrl() {
		return idCardBackCopyUrl;
	}
	
	public void setIdCardBackCopyUrl(String idCardBackCopyUrl) {
		this.idCardBackCopyUrl = idCardBackCopyUrl;
	}
	
	public Money getApplyAmount() {
		return applyAmount;
	}
	
	public void setApplyAmount(Money applyAmount) {
		this.applyAmount = applyAmount;
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
