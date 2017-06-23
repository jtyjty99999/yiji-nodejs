package com.yiji.openapi.message.product.ccp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;


@OpenApiMessage(service = "ccpConsumeFinanceApply", type = ApiMessageType.Notify)
public class CcpConsumerFinanceNotify extends ApiNotify {
	
	@Length(max = 128)
	@OpenApiField(desc = "节点名称")
	private String pointName;
	
	@Length(max = 128)
	@OpenApiField(desc = "结果")
	private String result;
	
	@Length(max = 128)
	@OpenApiField(desc = "节点code")
	private String pointCode;
	
	@Length(max = 128)
	@OpenApiField(desc = "建议")
	private String suggest;
	
	@Length(max = 128)
	@OpenApiField(desc = "融资订单号")
	private String bizNo;
	
	/** [必填]申请类型 */
	@NotNull(message = "申请类型不能为空")
	@OpenApiField(desc = "申请类型")
	private String consumeType;
	
	/** [必填]交易流水号 */
	@NotBlank
	@Size(max = 64, message = "交易流水号长度不能超过64位")
	@OpenApiField(desc = "交易流水号")
	private String tradeId;
	
	/** [必填]申请人姓名 */
	@NotNull(message = "申请人姓名不能为空")
	@Size(max = 20, message = "申请人姓名长度不能超过20位")
	@OpenApiField(desc = "申请人姓名")
	private String realName;
	
	/** [必填]商品价格 */
	@NotNull(message = "商品价格不能为空")
	@OpenApiField(desc = "价格")
	private String goodsPrice;
	
	/** [必填]首付金额 */
	@NotNull(message = "首付金额不能为空")
	@OpenApiField(desc = "首付金额")
	private String firstPay;
	
	/** [必填]本次贷款金额 */
	@NotNull(message = "本次贷款金额不能为空")
	@OpenApiField(desc = "贷款金额")
	private String amount;
	
	/** [必填]证件类型 */
	@NotNull(message = "证件类型不能为空")
	@OpenApiField(desc = "证件类型")
	private String certType;
	
	/** [必填]证件号 */
	@NotNull(message = "证件号不能为空")
	@OpenApiField(desc = "证件号")
	@Size(max = 64, message = "证件号长度不能超过64位")
	private String certNo;
	
	/** [必填]银行 */
	@NotNull(message = "银行不能为空")
	@OpenApiField(desc = "银行")
	private String bindBank;
	
	/** [必填]本人银行卡号 */
	@NotNull(message = "银行卡号不能为空")
	@Size(max = 64, message = "银行卡号长度不能超过64位")
	@OpenApiField(desc = "银行卡号")
	private String bindBankCardNo;
	
	/** [必填]每期金额 */
	@NotNull(message = "分期每期金额还款金额不能为空")
	@OpenApiField(desc = "分期金额")
	private String periodAmount;
	
	/** [必填]商品种类 */
	@NotNull(message = "商品种类不能为空")
	@Size(max = 64, message = "商品种类长度不能超过64位")
	@OpenApiField(desc = "商品种类")
	private String goodsType;
	
	/** [必填]商品名称 */
	@NotNull(message = "商品名称不能为空")
	@Size(max = 64, message = "商品名称长度不能超过64位")
	@OpenApiField(desc = "商品名称")
	private String goodsName;
	
	/** [必填]还款扣款目标 */
	@NotNull(message = "还款扣款目标不能为空")
	@OpenApiField(desc = "扣款目标")
	private String fromType;
	
	/** [必填]分期期数 */
	@NotNull(message = "分期期数不能为空")
	@OpenApiField(desc = "期数")
	private Integer period;
	
	/** [必填]EMAIL */
	@NotNull(message = "EMAIL不能为空")
	@OpenApiField(desc = "email")
	@Size(max = 64, message = "EMAIL不能超过64位")
	private String email;
	
	/** [选填]出生日期 */
	@OpenApiField(desc = "生日")
	private String birthday;
	
	/** [选填]性别 */
	@OpenApiField(desc = "")
	private String sex;
	
	/** [选填]民族 */
	@OpenApiField(desc = "")
	@Size(max = 16, message = "民族长度不能超过16位")
	private String nation;
	
	/** [选填]户籍所在地 */
	@Size(max = 64, message = "户籍所在地长度不能超过64位")
	@OpenApiField(desc = "")
	private String censusRegister;
	
	/** [选填]证件颁发机构 */
	@Size(max = 32, message = "证件颁发机构长度不能超过32位")
	@OpenApiField(desc = "")
	private String certIssueAuthority;
	
	/** [选填]证件地址 */
	@Size(max = 64, message = "证件地址长度不能超过64位")
	@OpenApiField(desc = "")
	private String certAddress;
	
	/** [选填]证件有效期 */
	@OpenApiField(desc = "")
	private String certExpireDate;
	
	/** [选填]家庭地址 */
	@Size(max = 64, message = "家庭地址长度不能超过64位")
	@OpenApiField(desc = "")
	private String address;
	
	/** [选填]QQ号 */
	@Size(max = 32, message = "QQ号长度不能超过32位")
	@OpenApiField(desc = "")
	private String qq;
	
	/** [选填]QQ昵称 */
	@Size(max = 32, message = "QQ昵称长度不能超过32位")
	@OpenApiField(desc = "qq名称")
	private String qqName;
	
	/** [选填]开户行支行地址 */
	@Size(max = 128, message = "开户行支行地址长度不能超过128位")
	@OpenApiField(desc = "开户行地址")
	private String bindBankLoc;
	
	/** [选填]还款指定银行卡号(还款到目标银行) */
	@Size(max = 64, message = "还款指定银行卡号长度不能超过64位")
	@OpenApiField(desc = "还款银行卡号")
	private String backBankCardNo;
	
	/** [选填]还款到指定银行的CODE */
	@OpenApiField(desc = "银行code")
	private String backBank;
	
	/** [选填]放款目标 */
	@OpenApiField(desc = "放款目标")
	private String toType;
	
	/** [选填]家庭收入 */
	@OpenApiField(desc = "家庭收入")
	private String familyIncome;
	
	/** [选填]供货商家名称 */
	@Size(max = 64, message = "供货商家名称长度不能超过64位")
	@OpenApiField(desc = "供货商家名称")
	private String supplyName;
	
	/** [选填]供货商家电话 */
	@Size(max = 32, message = "供货商家电话长度不能超过32位")
	@OpenApiField(desc = "供货商电话")
	private String supplyTel;
	
	/** [选填]经办人ID */
	@Size(max = 32, message = "经办人ID长度不能超过32位")
	@OpenApiField(desc = "经办人id")
	private String managersCode;
	
	/** [选填]经办人名称 */
	@Size(max = 64, message = "经办人名称长度不能超过64位")
	@OpenApiField(desc = "经办人名称")
	private String managersName;
	
	/** [选填]经办人电话 */
	@Size(max = 32, message = "经办人电话长度不能超过32位")
	@OpenApiField(desc = "经办人电话")
	private String managersTel;
	
	/** [选填]经销商code */
	@Size(max = 64, message = "经销商code不能超过64位")
	@OpenApiField(desc = "经销商code")
	private String dealerCode;
	/** [选填]经销商姓名 */
	@Size(max = 64, message = "经销商姓名不能超过64位")
	@OpenApiField(desc = "经销商姓名")
	private String dealerName;
	
	/** [选填]其他联系人姓名 */
	@OpenApiField(desc = "其他联系人姓名")
	@Size(max = 128, message = "其他联系人姓名长度不能超过128位")
	private String otherContactsName;
	
	/** [选填]辅助联系人联系电话 */
	@OpenApiField(desc = "辅助联系电话")
	@Size(max = 128, message = "]辅助联系人联系电话长度不能超过32位")
	private String otherContactsTel;
	
	//社会类申请信息
	/** [选填]工作单位 */
	@OpenApiField(desc = "工作单位")
	@Size(max = 128, message = "工作单位长度不能超过128位")
	private String company;
	
	/** [选填]工作单位性质 */
	@OpenApiField(desc = "单位性质")
	@Size(max = 128, message = "工作单位性质长度不能超过128位")
	private String companyType;
	
	/** [选填]工作岗位 */
	@OpenApiField(desc = "工作岗位")
	@Size(max = 128, message = "工作岗位长度不能超过128位")
	private String jobs;
	
	/** [选填]职务或级别 */
	@OpenApiField(desc = "职务")
	@Size(max = 128, message = "职务或级别长度不能超过128位")
	private String groups;
	
	/** [选填]工作单位地址 */
	@OpenApiField(desc = "工作单位地址")
	@Size(max = 128, message = "工作单位地址长度不能超过128位")
	private String companyAddress;
	
	/** [选填]工作单位电话 */
	@OpenApiField(desc = "工作单位电话")
	@Size(max = 128, message = "工作单位电话长度不能超过128位")
	private String companyTel;
	
	/** [选填]工作单位联系人 */
	@OpenApiField(desc = "工作单位联系人")
	@Size(max = 128, message = "工作单位联系人长度不能超过128位")
	private String companyContacts;
	
	/** [选填]工作单位联系人电话 */
	@OpenApiField(desc = "工作单位联系人电话")
	@Size(max = 32, message = "工作单位联系人电话长度不能超过32位")
	private String companyContactsTel;
	
	/** [选填]现在单位入职日期(YYYY-MM-DD) */
	@OpenApiField(desc = "入职日期")
	private String companyEntry;
	
	/** [选填]总工作年限 */
	@OpenApiField(desc = "工作年限")
	@Size(max = 32, message = "总工作年限长度不能超过32位")
	private String workingLife;
	
	/** [选填]办公电话 */
	@OpenApiField(desc = "办公电话")
	@Size(max = 32, message = "办公电话长度不能超过32位")
	private String workTel;
	
	/** [选填]住宅电话 */
	@OpenApiField(desc = "住宅电话")
	@Size(max = 32, message = "住宅电话长度不能超过32位")
	private String homeTel;
	
	/** [选填]手机电话 */
	@OpenApiField(desc = "手机号码")
	@Size(max = 32, message = "手机电话长度不能超过32位")
	private String mobileNo;
	
	/** [选填]教育程度 */
	@OpenApiField(desc = "教育程度")
	@Size(max = 128, message = "教育程度长度不能超过128位")
	private String education;
	
	/** [选填]婚姻状况 */
	@OpenApiField(desc = "婚姻状况")
	private String marriage;
	
	/** [选填]子女数量 */
	@OpenApiField(desc = "子女数量")
	@Size(max = 128, message = "子女数量长度不能超过128位")
	private String chiledrenNum;
	
	/** [选填]配偶姓名 */
	@OpenApiField(desc = "配偶姓名")
	@Size(max = 128, message = "配偶姓名长度不能超过128位")
	private String spouseName;
	
	/** [选填]配偶电话 */
	@OpenApiField(desc = "配偶电话")
	@Size(max = 32, message = "配偶电话 长度不能超过32位")
	private String spouseTel;
	
	/** [选填]住房状况 */
	@OpenApiField(desc = "住房状况")
	@Size(max = 128, message = "住房状况长度不能超过128位")
	private String houseState;
	
	/** [选填]住房月花费（范围） */
	@OpenApiField(desc = "住房月花费")
	@Size(max = 128, message = "住房月花费长度不能超过128位")
	private String houseCost;
	
	/** [选填]家庭成员姓名 */
	@OpenApiField(desc = "家庭成员姓名")
	@Size(max = 128, message = "家庭成员姓名长度不能超过128位")
	private String familyName;
	
	/** [选填]家庭成员电话 */
	@OpenApiField(desc = "家庭成员电话")
	@Size(max = 32, message = "家庭成员电话长度不能超过32位")
	private String familyTel;
	
	/** [选填]家庭成员关系 */
	@OpenApiField(desc = "家庭成员关系")
	@Size(max = 128, message = "家庭成员关系长度不能超过128位")
	private String familyRelation;
	
	/** [选填]家庭成员地址 */
	@OpenApiField(desc = "家庭成员地址")
	@Size(max = 128, message = "家庭成员地址长度不能超过128位")
	private String familyAddress;
	
	/** [选填]工作月收入 */
	@OpenApiField(desc = "工作月收入")
	private String workIncome;
	
	/** [选填]其他月收入 */
	@OpenApiField(desc = "其他收入")
	private String otherIncome;
	
	/** [选填]家庭月支出(可以支持范围输入) */
	@OpenApiField(desc = "月支出")
	@Size(max = 128, message = "家庭月支出长度不能超过128位")
	private String familyOutlay;
	
	/** [选填]其他联系人工作单位 */
	@OpenApiField(desc = "其他联系人单位")
	@Size(max = 128, message = "其他联系人工作单位长度不能超过128位")
	private String otherContactsCompany;
	
	/** [选填]其他联系人关系 */
	@OpenApiField(desc = "其他联系人关系")
	@Size(max = 128, message = "其他联系人关系长度不能超过128位")
	private String otherContactsRelation;
	
	//院校类申请信息
	
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
	
	public CcpConsumerFinanceNotify() {
		super();
	}
	
	/**
	 * @return the pointName
	 */
	public String getPointName() {
		return pointName;
	}
	
	/**
	 * @param pointName the pointName to set
	 */
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	
	/**
	 * @return the pointCode
	 */
	public String getPointCode() {
		return pointCode;
	}
	
	/**
	 * @param pointCode the pointCode to set
	 */
	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
	}
	
	/**
	 * @return the suggest
	 */
	public String getSuggest() {
		return suggest;
	}
	
	/**
	 * @param suggest the suggest to set
	 */
	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
	
	/**
	 * @return the bizNo
	 */
	public String getBizNo() {
		return bizNo;
	}
	
	/**
	 * @param bizNo the bizNo to set
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	/**
	 * @return the consumeType
	 */
	public String getConsumeType() {
		return consumeType;
	}
	
	/**
	 * @param consumeType the consumeType to set
	 */
	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}
	
	/**
	 * @return the tradeId
	 */
	public String getTradeId() {
		return tradeId;
	}
	
	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	/**
	 * @return the goodsPrice
	 */
	public String getGoodsPrice() {
		return goodsPrice;
	}
	
	/**
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	/**
	 * @return the firstPay
	 */
	public String getFirstPay() {
		return firstPay;
	}
	
	/**
	 * @param firstPay the firstPay to set
	 */
	public void setFirstPay(String firstPay) {
		this.firstPay = firstPay;
	}
	
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the certType
	 */
	public String getCertType() {
		return certType;
	}
	
	/**
	 * @param certType the certType to set
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	/**
	 * @return the certNo
	 */
	public String getCertNo() {
		return certNo;
	}
	
	/**
	 * @param certNo the certNo to set
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	/**
	 * @return the bindBank
	 */
	public String getBindBank() {
		return bindBank;
	}
	
	/**
	 * @param bindBank the bindBank to set
	 */
	public void setBindBank(String bindBank) {
		this.bindBank = bindBank;
	}
	
	/**
	 * @return the bindBankCardNo
	 */
	public String getBindBankCardNo() {
		return bindBankCardNo;
	}
	
	/**
	 * @param bindBankCardNo the bindBankCardNo to set
	 */
	public void setBindBankCardNo(String bindBankCardNo) {
		this.bindBankCardNo = bindBankCardNo;
	}
	
	/**
	 * @return the periodAmount
	 */
	public String getPeriodAmount() {
		return periodAmount;
	}
	
	/**
	 * @param periodAmount the periodAmount to set
	 */
	public void setPeriodAmount(String periodAmount) {
		this.periodAmount = periodAmount;
	}
	
	/**
	 * @return the goodsType
	 */
	public String getGoodsType() {
		return goodsType;
	}
	
	/**
	 * @param goodsType the goodsType to set
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	/**
	 * @return the fromType
	 */
	public String getFromType() {
		return fromType;
	}
	
	/**
	 * @param fromType the fromType to set
	 */
	public void setFromType(String fromType) {
		this.fromType = fromType;
	}
	
	/**
	 * @return the period
	 */
	public Integer getPeriod() {
		return period;
	}
	
	/**
	 * @param period the period to set
	 */
	public void setPeriod(Integer period) {
		this.period = period;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * @return the nation
	 */
	public String getNation() {
		return nation;
	}
	
	/**
	 * @param nation the nation to set
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	/**
	 * @return the censusRegister
	 */
	public String getCensusRegister() {
		return censusRegister;
	}
	
	/**
	 * @param censusRegister the censusRegister to set
	 */
	public void setCensusRegister(String censusRegister) {
		this.censusRegister = censusRegister;
	}
	
	/**
	 * @return the certIssueAuthority
	 */
	public String getCertIssueAuthority() {
		return certIssueAuthority;
	}
	
	/**
	 * @param certIssueAuthority the certIssueAuthority to set
	 */
	public void setCertIssueAuthority(String certIssueAuthority) {
		this.certIssueAuthority = certIssueAuthority;
	}
	
	/**
	 * @return the certAddress
	 */
	public String getCertAddress() {
		return certAddress;
	}
	
	/**
	 * @param certAddress the certAddress to set
	 */
	public void setCertAddress(String certAddress) {
		this.certAddress = certAddress;
	}
	
	/**
	 * @return the certExpireDate
	 */
	public String getCertExpireDate() {
		return certExpireDate;
	}
	
	/**
	 * @param certExpireDate the certExpireDate to set
	 */
	public void setCertExpireDate(String certExpireDate) {
		this.certExpireDate = certExpireDate;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the qq
	 */
	public String getQq() {
		return qq;
	}
	
	/**
	 * @param qq the qq to set
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}
	
	/**
	 * @return the qqName
	 */
	public String getQqName() {
		return qqName;
	}
	
	/**
	 * @param qqName the qqName to set
	 */
	public void setQqName(String qqName) {
		this.qqName = qqName;
	}
	
	/**
	 * @return the bindBankLoc
	 */
	public String getBindBankLoc() {
		return bindBankLoc;
	}
	
	/**
	 * @param bindBankLoc the bindBankLoc to set
	 */
	public void setBindBankLoc(String bindBankLoc) {
		this.bindBankLoc = bindBankLoc;
	}
	
	/**
	 * @return the backBankCardNo
	 */
	public String getBackBankCardNo() {
		return backBankCardNo;
	}
	
	/**
	 * @param backBankCardNo the backBankCardNo to set
	 */
	public void setBackBankCardNo(String backBankCardNo) {
		this.backBankCardNo = backBankCardNo;
	}
	
	/**
	 * @return the backBank
	 */
	public String getBackBank() {
		return backBank;
	}
	
	/**
	 * @param backBank the backBank to set
	 */
	public void setBackBank(String backBank) {
		this.backBank = backBank;
	}
	
	/**
	 * @return the toType
	 */
	public String getToType() {
		return toType;
	}
	
	/**
	 * @param toType the toType to set
	 */
	public void setToType(String toType) {
		this.toType = toType;
	}
	
	/**
	 * @return the familyIncome
	 */
	public String getFamilyIncome() {
		return familyIncome;
	}
	
	/**
	 * @param familyIncome the familyIncome to set
	 */
	public void setFamilyIncome(String familyIncome) {
		this.familyIncome = familyIncome;
	}
	
	/**
	 * @return the supplyName
	 */
	public String getSupplyName() {
		return supplyName;
	}
	
	/**
	 * @param supplyName the supplyName to set
	 */
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
	
	/**
	 * @return the supplyTel
	 */
	public String getSupplyTel() {
		return supplyTel;
	}
	
	/**
	 * @param supplyTel the supplyTel to set
	 */
	public void setSupplyTel(String supplyTel) {
		this.supplyTel = supplyTel;
	}
	
	/**
	 * @return the managersCode
	 */
	public String getManagersCode() {
		return managersCode;
	}
	
	/**
	 * @param managersCode the managersCode to set
	 */
	public void setManagersCode(String managersCode) {
		this.managersCode = managersCode;
	}
	
	/**
	 * @return the managersName
	 */
	public String getManagersName() {
		return managersName;
	}
	
	/**
	 * @param managersName the managersName to set
	 */
	public void setManagersName(String managersName) {
		this.managersName = managersName;
	}
	
	/**
	 * @return the managersTel
	 */
	public String getManagersTel() {
		return managersTel;
	}
	
	/**
	 * @param managersTel the managersTel to set
	 */
	public void setManagersTel(String managersTel) {
		this.managersTel = managersTel;
	}
	
	/**
	 * @return the dealerCode
	 */
	public String getDealerCode() {
		return dealerCode;
	}
	
	/**
	 * @param dealerCode the dealerCode to set
	 */
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}
	
	/**
	 * @return the dealerName
	 */
	public String getDealerName() {
		return dealerName;
	}
	
	/**
	 * @param dealerName the dealerName to set
	 */
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	
	/**
	 * @return the companyType
	 */
	public String getCompanyType() {
		return companyType;
	}
	
	/**
	 * @param companyType the companyType to set
	 */
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	
	/**
	 * @return the jobs
	 */
	public String getJobs() {
		return jobs;
	}
	
	/**
	 * @param jobs the jobs to set
	 */
	public void setJobs(String jobs) {
		this.jobs = jobs;
	}
	
	/**
	 * @return the groups
	 */
	public String getGroups() {
		return groups;
	}
	
	/**
	 * @param groups the groups to set
	 */
	public void setGroups(String groups) {
		this.groups = groups;
	}
	
	/**
	 * @return the companyAddress
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}
	
	/**
	 * @param companyAddress the companyAddress to set
	 */
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	/**
	 * @return the companyTel
	 */
	public String getCompanyTel() {
		return companyTel;
	}
	
	/**
	 * @param companyTel the companyTel to set
	 */
	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}
	
	/**
	 * @return the companyContacts
	 */
	public String getCompanyContacts() {
		return companyContacts;
	}
	
	/**
	 * @param companyContacts the companyContacts to set
	 */
	public void setCompanyContacts(String companyContacts) {
		this.companyContacts = companyContacts;
	}
	
	/**
	 * @return the companyContactsTel
	 */
	public String getCompanyContactsTel() {
		return companyContactsTel;
	}
	
	/**
	 * @param companyContactsTel the companyContactsTel to set
	 */
	public void setCompanyContactsTel(String companyContactsTel) {
		this.companyContactsTel = companyContactsTel;
	}
	
	/**
	 * @return the companyEntry
	 */
	public String getCompanyEntry() {
		return companyEntry;
	}
	
	/**
	 * @param companyEntry the companyEntry to set
	 */
	public void setCompanyEntry(String companyEntry) {
		this.companyEntry = companyEntry;
	}
	
	/**
	 * @return the workingLife
	 */
	public String getWorkingLife() {
		return workingLife;
	}
	
	/**
	 * @param workingLife the workingLife to set
	 */
	public void setWorkingLife(String workingLife) {
		this.workingLife = workingLife;
	}
	
	/**
	 * @return the workTel
	 */
	public String getWorkTel() {
		return workTel;
	}
	
	/**
	 * @param workTel the workTel to set
	 */
	public void setWorkTel(String workTel) {
		this.workTel = workTel;
	}
	
	/**
	 * @return the homeTel
	 */
	public String getHomeTel() {
		return homeTel;
	}
	
	/**
	 * @param homeTel the homeTel to set
	 */
	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}
	
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	
	/**
	 * @return the marriage
	 */
	public String getMarriage() {
		return marriage;
	}
	
	/**
	 * @param marriage the marriage to set
	 */
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	
	/**
	 * @return the chiledrenNum
	 */
	public String getChiledrenNum() {
		return chiledrenNum;
	}
	
	/**
	 * @param chiledrenNum the chiledrenNum to set
	 */
	public void setChiledrenNum(String chiledrenNum) {
		this.chiledrenNum = chiledrenNum;
	}
	
	/**
	 * @return the spouseName
	 */
	public String getSpouseName() {
		return spouseName;
	}
	
	/**
	 * @param spouseName the spouseName to set
	 */
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	
	/**
	 * @return the spouseTel
	 */
	public String getSpouseTel() {
		return spouseTel;
	}
	
	/**
	 * @param spouseTel the spouseTel to set
	 */
	public void setSpouseTel(String spouseTel) {
		this.spouseTel = spouseTel;
	}
	
	/**
	 * @return the houseState
	 */
	public String getHouseState() {
		return houseState;
	}
	
	/**
	 * @param houseState the houseState to set
	 */
	public void setHouseState(String houseState) {
		this.houseState = houseState;
	}
	
	/**
	 * @return the houseCost
	 */
	public String getHouseCost() {
		return houseCost;
	}
	
	/**
	 * @param houseCost the houseCost to set
	 */
	public void setHouseCost(String houseCost) {
		this.houseCost = houseCost;
	}
	
	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	
	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/**
	 * @return the familyTel
	 */
	public String getFamilyTel() {
		return familyTel;
	}
	
	/**
	 * @param familyTel the familyTel to set
	 */
	public void setFamilyTel(String familyTel) {
		this.familyTel = familyTel;
	}
	
	/**
	 * @return the familyRelation
	 */
	public String getFamilyRelation() {
		return familyRelation;
	}
	
	/**
	 * @param familyRelation the familyRelation to set
	 */
	public void setFamilyRelation(String familyRelation) {
		this.familyRelation = familyRelation;
	}
	
	/**
	 * @return the familyAddress
	 */
	public String getFamilyAddress() {
		return familyAddress;
	}
	
	/**
	 * @param familyAddress the familyAddress to set
	 */
	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}
	
	/**
	 * @return the workIncome
	 */
	public String getWorkIncome() {
		return workIncome;
	}
	
	/**
	 * @param workIncome the workIncome to set
	 */
	public void setWorkIncome(String workIncome) {
		this.workIncome = workIncome;
	}
	
	/**
	 * @return the otherIncome
	 */
	public String getOtherIncome() {
		return otherIncome;
	}
	
	/**
	 * @param otherIncome the otherIncome to set
	 */
	public void setOtherIncome(String otherIncome) {
		this.otherIncome = otherIncome;
	}
	
	/**
	 * @return the familyOutlay
	 */
	public String getFamilyOutlay() {
		return familyOutlay;
	}
	
	/**
	 * @param familyOutlay the familyOutlay to set
	 */
	public void setFamilyOutlay(String familyOutlay) {
		this.familyOutlay = familyOutlay;
	}
	
	/**
	 * @return the otherContactsName
	 */
	public String getOtherContactsName() {
		return otherContactsName;
	}
	
	/**
	 * @param otherContactsName the otherContactsName to set
	 */
	public void setOtherContactsName(String otherContactsName) {
		this.otherContactsName = otherContactsName;
	}
	
	/**
	 * @return the otherContactsCompany
	 */
	public String getOtherContactsCompany() {
		return otherContactsCompany;
	}
	
	/**
	 * @param otherContactsCompany the otherContactsCompany to set
	 */
	public void setOtherContactsCompany(String otherContactsCompany) {
		this.otherContactsCompany = otherContactsCompany;
	}
	
	/**
	 * @return the otherContactsTel
	 */
	public String getOtherContactsTel() {
		return otherContactsTel;
	}
	
	/**
	 * @param otherContactsTel the otherContactsTel to set
	 */
	public void setOtherContactsTel(String otherContactsTel) {
		this.otherContactsTel = otherContactsTel;
	}
	
	/**
	 * @return the otherContactsRelation
	 */
	public String getOtherContactsRelation() {
		return otherContactsRelation;
	}
	
	/**
	 * @param otherContactsRelation the otherContactsRelation to set
	 */
	public void setOtherContactsRelation(String otherContactsRelation) {
		this.otherContactsRelation = otherContactsRelation;
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
	
	public String getOtherContactsClass() {
		return this.otherContactsClass;
	}
	
	public void setOtherContactsClass(String otherContactsClass) {
		this.otherContactsClass = otherContactsClass;
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
	
}
