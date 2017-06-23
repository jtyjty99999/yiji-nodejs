package com.yiji.openapi.message.common.installment;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月10日
 */
@OpenApiMessage(service = "installmentRemittance", type = ApiMessageType.Notify)
public class InstallmentRemittanceNotify extends ApiNotify {
	@OpenApiField(desc = "合约号")
	private String contractNo;
	
	@OpenApiField(desc = "外部订单号")
	private String externalOrderNo;
	
	@OpenApiField(desc = "代发金额")
	private Money amount;
	
	@OpenApiField(desc = "手续费")
	private Money chargeAmount;
	
	@OpenApiField(desc = "用户姓名")
	private String customerRealName;
	
	@OpenApiField(desc = "银行编码")
	private String bankCode;
	
	@OpenApiField(desc = "银行卡号")
	private String bankCardNo;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "备注")
	private String memo;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Money getChargeAmount() {
		return chargeAmount;
	}
	
	public void setChargeAmount(Money chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	
	public String getCustomerRealName() {
		return customerRealName;
	}
	
	public void setCustomerRealName(String customerRealName) {
		this.customerRealName = customerRealName;
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
}
