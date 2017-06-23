package com.yiji.openapi.message.mpay.query;

import java.util.List;

import com.yiji.openapi.message.mpay.query.info.MpayBindCardInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 易手富 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "queryBindCard", type = ApiMessageType.Response)
public class QueryBindCardApiResponse extends ApiResponse {
	
	@OpenApiField(desc = "银行名称",demo = "中国银行")
	private String bankName;
	
	@OpenApiField(desc = "卡类型",demo = "DEBIT_CARD")
	private String cardType;
	
	@OpenApiField(desc = "银行卡号",demo = "213564789123321")
	private String bankAccountNo;
	
	@OpenApiField(desc = "手机号码",demo = "10086100101")
	private String mobileNo;
	
	@OpenApiField(desc = "银行列表")
	private List<MpayBindCardInfo> bankCards;

	@OpenApiField(desc = "银行个数",demo = "5")
	private int count;

	public List<MpayBindCardInfo> getBankCards() {
		return bankCards;
	}

	public void setBankCards(List<MpayBindCardInfo> bankCards) {
		this.bankCards = bankCards;
	}

	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
