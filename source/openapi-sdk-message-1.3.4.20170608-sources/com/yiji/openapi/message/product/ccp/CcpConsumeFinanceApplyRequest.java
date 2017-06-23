/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年8月26日 下午5:17:05 创建
 */
package com.yiji.openapi.message.product.ccp;

import java.util.List;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "ccpConsumeFinanceApply", type = ApiMessageType.Request)
public class CcpConsumeFinanceApplyRequest extends ApiRequest {

	//通用参数
	@NotBlank
	@OpenApiField(desc = "申请类型", constraint = "申请类型")
	private String consumeType;

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "真实姓名", constraint = "身份证上的姓名")
	private String realName;

	@NotBlank
	@Email
	@OpenApiField(desc = "邮箱", constraint = "申请人邮箱")
	private String email;

	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "联系电话", constraint = "申请人联系电话")
	private String tel;

	@NotNull
	@OpenApiField(desc = "商品价格", constraint = "单位：元")
	private Money goodsPrice;

	@NotNull
	@OpenApiField(desc = "首付金额", constraint = "单位：元")
	private Money firstPay;

	@NotNull
	@OpenApiField(desc = "本次贷款金额", constraint = "单位：元")
	private Money amount;

	@NotBlank
	@OpenApiField(desc = "证件类型", constraint = "证件类型")
	private String certType;

	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "证件号码", constraint = "证件号码")
	private String certNo;

	@NotBlank
	@OpenApiField(desc = "银行code", constraint = "银行编号")
	private String bindBank;

	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号")
	private String bindBankCardNo;

	@NotNull
	@OpenApiField(desc = "分期还款每期还款额", constraint = "单位：元")
	private Money periodAmount;

	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "商品类型", constraint = "商品类型")
	private String goodsType;

	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "商品名称", constraint = "商品名称")
	private String goodsName;

	@NotBlank
	@OpenApiField(desc = "还款扣款目标", constraint = "还款扣款目标：银行卡或者易极付账户")
	private String fromType;

	@Min(1)
	@OpenApiField(desc = "还款分期数", constraint = "还款分期数")
	private int period;

	@NotBlank
	@Length(max = 64, message = "交易流水号长度不能超过64位")
	@OpenApiField(desc = "外部系统交易标识", constraint = "外部系统交易标识")
	private String tradeId;

	@OpenApiField(desc = "业务id", constraint = "可为多个业务id")
	private List<String> busiId;

	@Length(max = 10)
	@OpenApiField(desc = "出生日期", constraint = "格式为yyyy-MM-dd")
	private String birthday;

	@OpenApiField(desc = "性别")
	private String sex;

	@Length(max = 16)
	@OpenApiField(desc = "民族", constraint = "民族")
	private String nation;

	@Length(max = 64)
	@OpenApiField(desc = "户籍所在地")
	private String censusRegister;

	@Length(max = 32)
	@OpenApiField(desc = "证件办法机构")
	private String certIssueAuthority;

	@Length(max = 64)
	@OpenApiField(desc = "证件地址")
	private String certAddress;

	@Length(max = 10)
	@OpenApiField(desc = "证件有效期", constraint = "格式为：yyyy-MM-dd")
	private String certExpireDate;

	@Length(max = 64)
	@OpenApiField(desc = "家庭住址")
	private String address;

	@Length(max = 32)
	@OpenApiField(desc = "qq号码")
	private String qq;

	@Length(max = 32)
	@OpenApiField(desc = "qq名称")
	private String qqName;

	@Length(max = 128)
	@OpenApiField(desc = "开户行地址")
	private String bindBankLoc;

	@Length(max = 64)
	@OpenApiField(desc = "还款指定银行卡号(还款到目标银行)")
	private String backBankCardNo;

	@OpenApiField(desc = "还款到指定银行的CODE", constraint = "银行编号")
	private String backBank;

	@OpenApiField(desc = "放款目标", constraint = "放款目标：银行卡或者易极付账户")
	private String toType;

	@OpenApiField(desc = "家庭收入")
	private Money familyIncome;

	@Length(max = 64)
	@OpenApiField(desc = "供货商家名称", constraint = "供货商家名称")
	private String supplyName;

	@Length(max = 32)
	@OpenApiField(desc = "供货商家电话", constraint = "供货商家电话")
	private String supplyTel;

	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "经办人ID", constraint = "经办人ID")
	private String managersCode;

	@Length(max = 64)
	@OpenApiField(desc = "经办人名称", constraint = "经办人名称")
	private String managersName;

	@Length(max = 64)
	@OpenApiField(desc = "经销商id")
	private String dealerCode;

	@Length(max = 64)
	@OpenApiField(desc = "经销商姓名")
	private String dealerName;

	@Length(max = 64)
	@OpenApiField(desc = "辅助联系人姓名")
	private String otherContactsName;

	@Length(max = 64)
	@OpenApiField(desc = "辅助联系人联系电话")
	private String otherContactsTel;

	//社会类申请参数
	@Length(max = 128)
	@OpenApiField(desc = "工作单位", constraint = "工作单位")
	private String company;

	@Length(max = 128)
	@OpenApiField(desc = "工作单位性质", constraint = "工作单位性质")
	private String companyType;

	@Length(max = 128)
	@OpenApiField(desc = "工作岗位", constraint = "工作岗位")
	private String jobs;

	@Length(max = 128)
	@OpenApiField(desc = "职务或级别", constraint = "职务或级别")
	private String groups;

	@OpenApiField(desc = "工作月收入", constraint = "申请人工作月收入")
	private Money workIncome;

	@OpenApiField(desc = "其他月收入", constraint = "申请人其他月收入")
	private Money otherIncome;

	@Length(max = 128)
	@OpenApiField(desc = "家庭月支出", constraint = "家庭月支出")
	private String familyOutlay;

	@Length(max = 128)
	@OpenApiField(desc = "工作单位地址", constraint = "工作单位地址")
	private String companyAddress;

	@Length(max = 64)
	@OpenApiField(desc = "工作单位电话", constraint = "工作单位电话")
	private String companyTel;

	@Length(max = 128)
	@OpenApiField(desc = "工作单位联系人", constraint = "工作单位联系人")
	private String companyContacts;

	@Length(max = 32)
	@OpenApiField(desc = "工作单位联系人电话", constraint = "工作单位联系人电话")
	private String companyContactsTel;

	@Length(max = 32)
	@OpenApiField(desc = "现在单位入职日期", constraint = "现在单位入职日期")
	private String companyEntry;

	@DecimalMax(value = "9999")
	@OpenApiField(desc = "总工作年限", constraint = "总工作年限")
	private int workingLife;

	@Length(max = 32)
	@OpenApiField(desc = "办公电话", constraint = "办公电话")
	private String workTel;

	@Length(max = 32)
	@OpenApiField(desc = "住宅电话", constraint = "住宅电话")
	private String homeTel;

	@Length(max = 32)
	@OpenApiField(desc = "手机号码", constraint = "手机号码")
	private String mobileNo;

	@Length(max = 128)
	@OpenApiField(desc = "教育程度", constraint = "教育程度")
	private String education;

	@OpenApiField(desc = "婚姻状况", constraint = "婚姻状况")
	private String marriage;

	@DecimalMax(value = "9999")
	@OpenApiField(desc = "子女数量", constraint = "子女数量")
	private int chiledrenNum;

	@Length(max = 128)
	@OpenApiField(desc = "配偶姓名", constraint = "配偶姓名")
	private String spouseName;

	@Length(max = 32)
	@OpenApiField(desc = "配偶电话", constraint = "配偶电话")
	private String spouseTel;

	@Length(max = 128)
	@OpenApiField(desc = "住房状况", constraint = "住房状况")
	private String houseState;

	@Length(max = 128)
	@OpenApiField(desc = "住房月花费", constraint = "住房月花费")
	private String houseCost;

	@Length(max = 128)
	@OpenApiField(desc = "家庭成员姓名", constraint = "家庭成员姓名")
	private String familyName;

	@Length(max = 32)
	@OpenApiField(desc = "家庭成员电话", constraint = "家庭成员电话长度不能超过32位")
	private String familyTel;

	@Length(max = 128)
	@OpenApiField(desc = "家庭成员关系", constraint = "家庭成员关系长度不能超过128位")
	private String familyRelation;

	@Length(max = 128)
	@OpenApiField(desc = "家庭成员地址", constraint = "家庭成员地址长度不能超过128位")
	private String familyAddress;

	@Length(max = 128)
	@OpenApiField(desc = "其他联系人工作单位", constraint = "其他联系人工作单位")
	private String otherContactsCompany;

	@Length(max = 128)
	@OpenApiField(desc = "其他联系人关系", constraint = "其他联系人关系")
	private String otherContactsRelation;

	//院校类申请参数
	@Length(max = 32)
	@OpenApiField(desc = "学校code")
	private String schoolCode;

	@Length(max = 64)
	@OpenApiField(desc = "学校名称")
	private String schoolName;

	@Length(max = 64)
	@OpenApiField(desc = "院系班级")
	private String schoolClass;

	@Length(max = 10)
	@OpenApiField(desc = "入学时间")
	private String startSchoolDate;

	@Length(max = 64)
	@OpenApiField(desc = "学号")
	private String studentNo;

	@Length(max = 64)
	@OpenApiField(desc = "宿舍编号")
	private String schoolDorm;

	@Length(max = 64)
	@OpenApiField(desc = "爱好")
	private String interest;

	@Length(max = 64)
	@OpenApiField(desc = "父亲名称")
	private String fatherName;

	@Length(max = 64)
	@OpenApiField(desc = "父亲工作单位")
	private String fatherWorkAddress;

	@Length(max = 32)
	@OpenApiField(desc = "父亲联系电话")
	private String fatherTel;

	@Length(max = 64)
	@OpenApiField(desc = "母亲名称")
	private String motherName;

	@Length(max = 64)
	@OpenApiField(desc = "母亲工作单位")
	private String motherWorkAddress;

	@Length(max = 32)
	@OpenApiField(desc = "母亲联系电话")
	private String motherTel;

	@Length(max = 64)
	@OpenApiField(desc = "辅助联系人院系及班级")
	private String otherContactsClass;

	@Length(max = 64)
	@OpenApiField(desc = "辅助联系人2姓名")
	private String otherContactsName2;

	@Length(max = 64)
	@OpenApiField(desc = "辅助联系人2院系及班级")
	private String otherContactsClass2;

	@Length(max = 64)
	@OpenApiField(desc = "辅助联系人2联系电话")
	private String otherContactsTel2;

	public String getConsumeType() {
		return this.consumeType;
	}

	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Money getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Money goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Money getFirstPay() {
		return this.firstPay;
	}

	public void setFirstPay(Money firstPay) {
		this.firstPay = firstPay;
	}

	public Money getAmount() {
		return this.amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getBindBank() {
		return this.bindBank;
	}

	public void setBindBank(String bindBank) {
		this.bindBank = bindBank;
	}

	public String getBindBankCardNo() {
		return this.bindBankCardNo;
	}

	public void setBindBankCardNo(String bindBankCardNo) {
		this.bindBankCardNo = bindBankCardNo;
	}

	public Money getPeriodAmount() {
		return this.periodAmount;
	}

	public void setPeriodAmount(Money periodAmount) {
		this.periodAmount = periodAmount;
	}

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getFromType() {
		return this.fromType;
	}

	public void setFromType(String fromType) {
		this.fromType = fromType;
	}

	public int getPeriod() {
		return this.period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public List<String> getBusiId() {
		return this.busiId;
	}

	public void setBusiId(List<String> busiId) {
		this.busiId = busiId;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getCensusRegister() {
		return this.censusRegister;
	}

	public void setCensusRegister(String censusRegister) {
		this.censusRegister = censusRegister;
	}

	public String getCertIssueAuthority() {
		return this.certIssueAuthority;
	}

	public void setCertIssueAuthority(String certIssueAuthority) {
		this.certIssueAuthority = certIssueAuthority;
	}

	public String getCertAddress() {
		return this.certAddress;
	}

	public void setCertAddress(String certAddress) {
		this.certAddress = certAddress;
	}

	public String getCertExpireDate() {
		return this.certExpireDate;
	}

	public void setCertExpireDate(String certExpireDate) {
		this.certExpireDate = certExpireDate;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getQqName() {
		return this.qqName;
	}

	public void setQqName(String qqName) {
		this.qqName = qqName;
	}

	public String getBindBankLoc() {
		return this.bindBankLoc;
	}

	public void setBindBankLoc(String bindBankLoc) {
		this.bindBankLoc = bindBankLoc;
	}

	public String getBackBank() {
		return this.backBank;
	}

	public void setBackBank(String backBank) {
		this.backBank = backBank;
	}

	public String getToType() {
		return this.toType;
	}

	public void setToType(String toType) {
		this.toType = toType;
	}

	public String getSupplyName() {
		return this.supplyName;
	}

	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}

	public String getSupplyTel() {
		return this.supplyTel;
	}

	public void setSupplyTel(String supplyTel) {
		this.supplyTel = supplyTel;
	}

	public String getManagersCode() {
		return this.managersCode;
	}

	public void setManagersCode(String managersCode) {
		this.managersCode = managersCode;
	}

	public String getManagersName() {
		return this.managersName;
	}

	public void setManagersName(String managersName) {
		this.managersName = managersName;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getJobs() {
		return this.jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	public String getGroups() {
		return this.groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyTel() {
		return this.companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	public String getCompanyContacts() {
		return this.companyContacts;
	}

	public void setCompanyContacts(String companyContacts) {
		this.companyContacts = companyContacts;
	}

	public String getCompanyContactsTel() {
		return this.companyContactsTel;
	}

	public void setCompanyContactsTel(String companyContactsTel) {
		this.companyContactsTel = companyContactsTel;
	}

	public String getCompanyEntry() {
		return this.companyEntry;
	}

	public void setCompanyEntry(String companyEntry) {
		this.companyEntry = companyEntry;
	}

	public int getWorkingLife() {
		return this.workingLife;
	}

	public void setWorkingLife(int workingLife) {
		this.workingLife = workingLife;
	}

	public String getWorkTel() {
		return this.workTel;
	}

	public void setWorkTel(String workTel) {
		this.workTel = workTel;
	}

	public String getHomeTel() {
		return this.homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMarriage() {
		return this.marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public int getChiledrenNum() {
		return this.chiledrenNum;
	}

	public void setChiledrenNum(int chiledrenNum) {
		this.chiledrenNum = chiledrenNum;
	}

	public String getSpouseName() {
		return this.spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseTel() {
		return this.spouseTel;
	}

	public void setSpouseTel(String spouseTel) {
		this.spouseTel = spouseTel;
	}

	public String getHouseState() {
		return this.houseState;
	}

	public void setHouseState(String houseState) {
		this.houseState = houseState;
	}

	public String getHouseCost() {
		return this.houseCost;
	}

	public void setHouseCost(String houseCost) {
		this.houseCost = houseCost;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getBackBankCardNo() {
		return this.backBankCardNo;
	}

	public void setBackBankCardNo(String backBankCardNo) {
		this.backBankCardNo = backBankCardNo;
	}

	public Money getFamilyIncome() {
		return this.familyIncome;
	}

	public void setFamilyIncome(Money familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getSchoolCode() {
		return this.schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolClass() {
		return this.schoolClass;
	}

	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}

	public String getStartSchoolDate() {
		return this.startSchoolDate;
	}

	public void setStartSchoolDate(String startSchoolDate) {
		this.startSchoolDate = startSchoolDate;
	}

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getSchoolDorm() {
		return this.schoolDorm;
	}

	public void setSchoolDorm(String schoolDorm) {
		this.schoolDorm = schoolDorm;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherWorkAddress() {
		return this.fatherWorkAddress;
	}

	public void setFatherWorkAddress(String fatherWorkAddress) {
		this.fatherWorkAddress = fatherWorkAddress;
	}

	public String getFatherTel() {
		return this.fatherTel;
	}

	public void setFatherTel(String fatherTel) {
		this.fatherTel = fatherTel;
	}

	public String getMotherName() {
		return this.motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherWorkAddress() {
		return this.motherWorkAddress;
	}

	public void setMotherWorkAddress(String motherWorkAddress) {
		this.motherWorkAddress = motherWorkAddress;
	}

	public String getMotherTel() {
		return this.motherTel;
	}

	public void setMotherTel(String motherTel) {
		this.motherTel = motherTel;
	}

	public String getOtherContactsName() {
		return this.otherContactsName;
	}

	public void setOtherContactsName(String otherContactsName) {
		this.otherContactsName = otherContactsName;
	}

	public String getOtherContactsClass() {
		return this.otherContactsClass;
	}

	public void setOtherContactsClass(String otherContactsClass) {
		this.otherContactsClass = otherContactsClass;
	}

	public String getOtherContactsTel() {
		return this.otherContactsTel;
	}

	public void setOtherContactsTel(String otherContactsTel) {
		this.otherContactsTel = otherContactsTel;
	}

	public String getOtherContactsName2() {
		return this.otherContactsName2;
	}

	public void setOtherContactsName2(String otherContactsName2) {
		this.otherContactsName2 = otherContactsName2;
	}

	public String getOtherContactsClass2() {
		return this.otherContactsClass2;
	}

	public void setOtherContactsClass2(String otherContactsClass2) {
		this.otherContactsClass2 = otherContactsClass2;
	}

	public String getOtherContactsTel2() {
		return this.otherContactsTel2;
	}

	public void setOtherContactsTel2(String otherContactsTel2) {
		this.otherContactsTel2 = otherContactsTel2;
	}

	public String getDealerCode() {
		return this.dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	public String getDealerName() {
		return this.dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Money getWorkIncome() {
		return this.workIncome;
	}

	public void setWorkIncome(Money workIncome) {
		this.workIncome = workIncome;
	}

	public Money getOtherIncome() {
		return this.otherIncome;
	}

	public void setOtherIncome(Money otherIncome) {
		this.otherIncome = otherIncome;
	}

	public String getFamilyOutlay() {
		return this.familyOutlay;
	}

	public void setFamilyOutlay(String familyOutlay) {
		this.familyOutlay = familyOutlay;
	}

	public String getFamilyTel() {
		return this.familyTel;
	}

	public void setFamilyTel(String familyTel) {
		this.familyTel = familyTel;
	}

	public String getFamilyRelation() {
		return this.familyRelation;
	}

	public void setFamilyRelation(String familyRelation) {
		this.familyRelation = familyRelation;
	}

	public String getFamilyAddress() {
		return this.familyAddress;
	}

	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}

	public String getOtherContactsCompany() {
		return this.otherContactsCompany;
	}

	public void setOtherContactsCompany(String otherContactsCompany) {
		this.otherContactsCompany = otherContactsCompany;
	}

	public String getOtherContactsRelation() {
		return this.otherContactsRelation;
	}

	public void setOtherContactsRelation(String otherContactsRelation) {
		this.otherContactsRelation = otherContactsRelation;
	}
}
