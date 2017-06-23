package com.yiji.openapi.message.mpay.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 查询支持的银行卡 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "querySupportBank", type = ApiMessageType.Request)
public class QuerySupportBankApiRequest extends ApiRequest {
	
	@OpenApiField(desc = "银行卡号",demo = "12312654981657231")
	private String bankAccountNo;
	
	@OpenApiField(desc = "图片版本",demo = "1.0")
	private String imageVersion;
	
	@OpenApiField(desc = "业务类型",constraint = "\"1\"充值，  \"2\" 提现",demo = "1")
	private String transactionType;
	
	public String getTransactionType() {
		return transactionType;
	}
	
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public String getImageVersion() {
		return imageVersion;
	}
	
	public void setImageVersion(String imageVersion) {
		this.imageVersion = imageVersion;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
}
