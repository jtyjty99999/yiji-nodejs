package com.yiji.openapi.message.product.ypos;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yfbTradeQueryByPayNo", type = ApiMessageType.Response)
public class YfbTradeQueryByPayNoResponse extends ApiResponse {
	
	@OpenApiField(desc = "银行处理成功的时间")
	private Date bankDate;
	
	@OpenApiField(desc = "银行流水")
	private String bankSerialNo;
	
	@OpenApiField(desc = "金额")
	private Money amount;
	
	@OpenApiField(desc = "手续费")
	private Money fee;
	
	@OpenApiField(desc = "账户号")
	private String accNo;
	
	@OpenApiField(desc = "账户名")
	private String accName;
	
	@OpenApiField(desc = "银行简称")
	private String bankId;
	
	@OpenApiField(desc = "是否当日退款")
	private String isTodayRefund;
	
	@OpenApiField(desc = "备注")
	private String remark;
	
	public Date getBankDate() {
		return bankDate;
	}
	
	public void setBankDate(Date bankDate) {
		this.bankDate = bankDate;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Money getFee() {
		return fee;
	}
	
	public void setFee(Money fee) {
		this.fee = fee;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public String getBankId() {
		return bankId;
	}
	
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	
	public String getIsTodayRefund() {
		return isTodayRefund;
	}
	
	public void setIsTodayRefund(String isTodayRefund) {
		this.isTodayRefund = isTodayRefund;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getBankSerialNo() {
		return bankSerialNo;
	}
	
	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}
}
