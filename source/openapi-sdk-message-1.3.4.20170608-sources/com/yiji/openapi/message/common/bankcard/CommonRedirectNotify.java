package com.yiji.openapi.message.common.bankcard;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * Created by Jason Ma on 2015/4/15.
 */
@OpenApiMessage(service = "commonRedirectBindCard", type = ApiMessageType.Notify)
public class CommonRedirectNotify extends ApiNotify {
	
	@OpenApiField(desc = "签约流水号",demo = "123456498")
	private String pactNo;
	
	@OpenApiField(desc = "签约状态",demo = "SUCCESS")
	private String pactStatus;
	
	@OpenApiField(desc = "签约信息",demo = "成功")
	private String message;

	@OpenApiField(desc = "用户id",demo = "20140909010000052206")
	private String userId;

	@OpenApiField(desc = "银行卡号",demo = "2134562356")
	private String cardNo;

	@OpenApiField(desc = "银行卡类型",demo = "DEBIT")
	private String cardType;

	@OpenApiField(desc = "银行卡类型名称",demo = "借记卡")
	private String cardTypeName;

	@OpenApiField(desc = "银行简称",demo = "ABC")
	private String bankCode;

	@OpenApiField(desc = "银行名称",demo = "中国银行")
	private String bankName;

	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public String getPactStatus() {
		return pactStatus;
	}
	
	public void setPactStatus(String pactStatus) {
		this.pactStatus = pactStatus;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardTypeName() {
		return cardTypeName;
	}

	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
