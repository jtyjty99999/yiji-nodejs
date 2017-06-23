package com.yiji.openapi.message.product.yxt;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月22日
 */
@OpenApiMessage(service = "yxtDeductSignModify", type = ApiMessageType.Request)
public class YxtDeductSignModifyRequest extends ApiRequest {
	
	/**
	 * 签约合同号
	 */
	@NotEmpty
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	/**
	 * 操作类型
	 */
	@NotNull
	@OpenApiField(desc = "操作类型")
	private String operateType;
	
	/**
	 * 签约用户手机号
	 */
	@Size(min = 11, max = 11)
	@OpenApiField(desc = "签约用户手机号")
	private String mobileNo;
	
	/**
	 * 银行卡类型 DEBIT_CARD:借记卡 CREDIT_CARD:信用卡
	 */
	@OpenApiField(desc = "银行卡类型")
	private String bankCardType;
	
	/**
	 * 银行编码
	 */
	@Size(max = 16)
	@OpenApiField(desc = "银行编码")
	private String bankCode;
	
	/**
	 * 银行卡号
	 */
	@Size(max = 40)
	@OpenApiField(desc = "银行卡号")
	private String bankCardNo;
	
	/**
	 * 备用银行卡类型 DEBIT_CARD:借记卡 CREDIT_CARD:信用卡
	 */
	@OpenApiField(desc = "备用银行卡类型")
	private String standbyBankCardType;
	
	/**
	 * 备用银行编码
	 */
	@Size(max = 16)
	@OpenApiField(desc = "备用银行编码")
	private String standbyBankCode;
	
	/**
	 * 备用银行卡号
	 */
	@Size(max = 40)
	@OpenApiField(desc = "备用银行卡号")
	private String standbyBankCardNo;
	
	/**
	 * 银行卡照片，要求互联网可访问的链接
	 */
	@Size(max = 256)
	@OpenApiField(desc = "银行卡照片链接")
	private String bankCardImageUrl;
	
	/**
	 * 备用银行卡照片，要求互联网可访问的链接
	 */
	@Size(max = 256)
	@OpenApiField(desc = "备用银行卡照片链接")
	private String standbyBankCardImageUrl;
	
	/**
	 * 备注
	 */
	@Size(max = 1024)
	@OpenApiField(desc = "备注")
	private String memo;
	
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
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getBankCardType() {
		return bankCardType;
	}
	
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
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
	
	public String getBankCardImageUrl() {
		return bankCardImageUrl;
	}
	
	public void setBankCardImageUrl(String bankCardImageUrl) {
		this.bankCardImageUrl = bankCardImageUrl;
	}
	
	public String getStandbyBankCardImageUrl() {
		return standbyBankCardImageUrl;
	}
	
	public void setStandbyBankCardImageUrl(String standbyBankCardImageUrl) {
		this.standbyBankCardImageUrl = standbyBankCardImageUrl;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
