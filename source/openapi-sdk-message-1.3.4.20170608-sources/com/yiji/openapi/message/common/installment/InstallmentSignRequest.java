package com.yiji.openapi.message.common.installment;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Jason Ma on 2015/2/5.
 */
@OpenApiMessage(service = "installmentSign", type = ApiMessageType.Request)
public class InstallmentSignRequest extends ApiRequest {
	
	/**
	 * 真实姓名
	 */
	@NotBlank
	@OpenApiField(desc = "真实姓名")
	@Length(max = 16)
	private String realName;
	
	/**
	 * 身份证号
	 */
	@NotBlank
	@OpenApiField(desc = "身份证号")
	@Length(max = 18)
	private String certNo;
	
	/**
	 * 手机号
	 */
	
	@NotBlank
	@OpenApiField(desc = "手机号")
	@Length(min = 11, max = 11)
	private String mobileNo;
	
	/**
	 * 卡类型 DEBIT_CARD:借记卡 CREDIT_CARD:信用卡
	 */
	@NotNull
	@OpenApiField(desc = "银行卡类型")
	private String bankCardType;
	
	/**
	 * 银行名称
	 */
	@NotBlank
	@OpenApiField(desc = "银行编码")
	@Length(max = 16)
	private String bankCode;
	
	/**
	 * 银行卡号
	 */
	@NotBlank
	@OpenApiField(desc = "银行卡号")
	@Length(max = 40)
	private String bankCardNo;
	
	/**
	 * 商品名称
	 */
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "商品名称")
	private String productName;
	
	/**
	 * 产品价格
	 */
	@NotNull
	@OpenApiField(desc = "产品价格")
	private Money productPrice;
	
	/**
	 * 首付款金额
	 */
	@NotNull
	@OpenApiField(desc = "首付款金额")
	private Money downPaymentAmount;
	
	/**
	 * 纸质合同号
	 */
	@NotBlank
	@Length(max = 40)
	@OpenApiField(desc = "纸质合同号")
	private String paperContractNo;
	
	/**
	 * 本金总金额
	 */
	@NotNull
	@OpenApiField(desc = "本金总金额")
	private Money totalCapitalAmount;
	
	/**
	 * 利率
	 */
	@Range(min = 0, max = 100)
	@OpenApiField(desc = "利率")
	private double interestRate = 0.00;
	
	/**
	 * 其他利率
	 */
	@OpenApiField(desc = "其他利率")
	@Range(min = 0, max = 100)
	private double otherRate;
	
	/**
	 * 总期数
	 */
	@OpenApiField(desc = "总期数")
	@Range(min = 1, max = 36)
	private int totalTimes;
	
	@NotNull
	@OpenApiField(desc = "已还期数")
	private Integer repaidTime;
	/**
	 * 总次还款时间
	 */
	@OpenApiField(desc = "首次还款时间")
	@NotBlank
	private String firstRepayDate;
	
	/**
	 * 分期策略
	 */
	@OpenApiField(desc = "分期策略")
	private String installmentPolicy;
	
	@NotEmpty
	@OpenApiField(desc = "每期还款总金额列表")
	private List<Money> eachTotalAmount;
	
	/**
	 * 每期本金金额列表，作用同上
	 */
	@NotEmpty
	@OpenApiField(desc = "每期本金金额列表")
	private List<Money> eachCapitalAmount;
	
	/**
	 * 每期利息金额列表，作用同上
	 */
	@NotEmpty
	@OpenApiField(desc = "每期利息金额列表")
	private List<Money> eachInterestAmount;
	
	/**
	 * 每期其他金额列表，作用同上
	 */
	@NotEmpty
	@OpenApiField(desc = "每期其他金额列表")
	private List<Money> eachOtherAmount;
	
	/**
	 * 签约场景照片，要求互联网可访问的图片链接
	 */
	@NotBlank
	@OpenApiField(desc = "纸质签约合同照片")
	@Length(max = 256)
	private String imageUrl1;
	
	/**
	 * 身份证照片，要求互联网可访问的图片链接
	 */
	@NotBlank
	@OpenApiField(desc = "身份证照片地址")
	@Length(max = 256)
	private String imageUrl2;
	
	/**
	 * 银行卡照片，要求互联网可访问的图片链接
	 */
	@NotBlank
	@OpenApiField(desc = "银行卡照片地址")
	@Length(max = 256)
	private String imageUrl3;
	
	/**
	 * 备注
	 */
	@NotBlank
	@OpenApiField(desc = "备注")
	@Length(max = 1024)
	private String memo;
	
	@OpenApiField(desc = "签约合同号，修改时必填")
	private String contractNo;
	
	@OpenApiField(desc = "操作类型")
	private String operateType;
	
	@OpenApiField(desc = "还款方式")
	private String repayType;
	
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "目标结算账户UserId")
	private String settleDestUserId;
	
	@Range(min = 0, max = 100)
	@OpenApiField(desc = "结算比例")
	private double settleRate = 0.0D;
	
	//	@NotNull TODO 兼容升级
	@OpenApiField(desc = "身份证到期时间")
	private Integer certValidTime = 0;
	
	@NotBlank
	@Size(max = 128)
	@OpenApiField(desc = "职业", constraint = "职业的中文名")
	private String profession;
	
	@NotBlank
	@Size(max = 256)
	@OpenApiField(desc = "联系地址")
	private String address;
	
	/**
	 * 备用银行卡类型 DEBIT_CARD:借记卡 CREDIT_CARD:信用卡
	 */
	@OpenApiField(desc = "备用银行卡类型")
	private String standbyBankCardType;
	
	/**
	 * 备用银行编码
	 */
	@Size(max = 16)
	@OpenApiField(desc = "备用银行卡简称")
	private String standbyBankCode;
	
	/**
	 * 备用银行卡号
	 */
	@Size(max = 40)
	@OpenApiField(desc = "备用银行卡号")
	private String standbyBankCardNo;
	
	/**
	 * 身份证反面照片，要求互联网可访问的图片链接
	 */
	//	@NotEmpty TODO 兼容升级
	@Size(max = 256)
	@OpenApiField(desc = "身份证反面照片")
	private String certBackImageUrl;
	
	/**
	 * 备用银行卡照片，要求互联网可访问的图片链接。有备用银行卡时必填
	 */
	@Size(max = 256)
	@OpenApiField(desc = "备用银行卡照片")
	private String standbyBankCardImageUrl;
	
	public String getSettleDestUserId() {
		return settleDestUserId;
	}
	
	public void setSettleDestUserId(String settleDestUserId) {
		this.settleDestUserId = settleDestUserId;
	}
	
	public String getRepayType() {
		return repayType;
	}
	
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}
	
	public double getSettleRate() {
		return settleRate;
	}
	
	public void setSettleRate(double settleRate) {
		this.settleRate = settleRate;
	}
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getOperateType() {
		return operateType;
	}
	
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getBankCardTw1ype() {
		return bankCardType;
	}
	
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	
	public String getBankCardType() {
		return bankCardType;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
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
	
	public Money getDownPaymentAmount() {
		return downPaymentAmount;
	}
	
	public void setDownPaymentAmount(Money downPaymentAmount) {
		this.downPaymentAmount = downPaymentAmount;
	}
	
	public String getPaperContractNo() {
		return paperContractNo;
	}
	
	public void setPaperContractNo(String paperContractNo) {
		this.paperContractNo = paperContractNo;
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
	
	public int getTotalTimes() {
		return totalTimes;
	}
	
	public void setTotalTimes(int totalTimes) {
		this.totalTimes = totalTimes;
	}
	
	public String getFirstRepayDate() {
		return firstRepayDate;
	}
	
	public void setFirstRepayDate(String firstRepayDate) {
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
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Integer getRepaidTime() {
		return repaidTime;
	}
	
	public void setRepaidTime(Integer repaidTime) {
		this.repaidTime = repaidTime;
	}
	
	public List<Money> getEachTotalAmount() {
		return eachTotalAmount;
	}
	
	public void setEachTotalAmount(List<Money> eachTotalAmount) {
		this.eachTotalAmount = eachTotalAmount;
	}
	
	public List<Money> getEachCapitalAmount() {
		return eachCapitalAmount;
	}
	
	public void setEachCapitalAmount(List<Money> eachCapitalAmount) {
		this.eachCapitalAmount = eachCapitalAmount;
	}
	
	public List<Money> getEachInterestAmount() {
		return eachInterestAmount;
	}
	
	public void setEachInterestAmount(List<Money> eachInterestAmount) {
		this.eachInterestAmount = eachInterestAmount;
	}
	
	public List<Money> getEachOtherAmount() {
		return eachOtherAmount;
	}
	
	public void setEachOtherAmount(List<Money> eachOtherAmount) {
		this.eachOtherAmount = eachOtherAmount;
	}
	
	public Integer getCertValidTime() {
		return certValidTime;
	}
	
	public void setCertValidTime(Integer certValidTime) {
		this.certValidTime = certValidTime;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStandbyBankCardType() {
		return standbyBankCardType;
	}
	
	public void setStandbyBankCardType(String standbyBankCardType) {
		this.standbyBankCardType = standbyBankCardType;
	}
	
	public String getStandbyBankCode() {
		return standbyBankCode;
	}
	
	public void setStandbyBankCode(String standbyBankCode) {
		this.standbyBankCode = standbyBankCode;
	}
	
	public String getStandbyBankCardNo() {
		return standbyBankCardNo;
	}
	
	public void setStandbyBankCardNo(String standbyBankCardNo) {
		this.standbyBankCardNo = standbyBankCardNo;
	}
	
	public String getCertBackImageUrl() {
		return certBackImageUrl;
	}
	
	public void setCertBackImageUrl(String certBackImageUrl) {
		this.certBackImageUrl = certBackImageUrl;
	}
	
	public String getStandbyBankCardImageUrl() {
		return standbyBankCardImageUrl;
	}
	
	public void setStandbyBankCardImageUrl(String standbyBankCardImageUrl) {
		this.standbyBankCardImageUrl = standbyBankCardImageUrl;
	}
	

	public void check() {
		if (operateType.equals("MODIFY_SIGN")) {
			if (StringUtils.isBlank(contractNo)) {
				throw new IllegalArgumentException("作修改时，签约合同编号不能为空");
			}
		}
		if (settleRate > 0.0D) {
			if (StringUtils.isEmpty(settleDestUserId)) {
				throw new IllegalArgumentException("结算比例大于0时，目标账户不能为空");
			}
		}
		if (String.valueOf(certValidTime).length() > 8) {
			throw new IllegalArgumentException("有效期位数不能超过8");
		}
	}
}
