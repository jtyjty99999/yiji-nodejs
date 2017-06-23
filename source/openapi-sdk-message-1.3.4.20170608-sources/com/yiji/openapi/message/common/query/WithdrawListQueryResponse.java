package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.message.common.query.info.WithdrawQueryInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "withdrawListQuery", type = ApiMessageType.Response)
public class WithdrawListQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "页码")
	private int pageNo;
	
	@OpenApiField(desc = "每页大小")
	private int pageSize;
	
	@OpenApiField(desc = "总记录数")
	private long count;
	
	@OpenApiField(desc = "本金总额")
	private Money amount;
	
	@OpenApiField(desc = "手续费总额")
	private Money charges;
	
	@OpenApiField(desc = "提现列表")
	private List<WithdrawQueryInfo> withdrawInfos;
	
	public int getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public long getCount() {
		return count;
	}
	
	public void setCount(long count) {
		this.count = count;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Money getCharges() {
		return charges;
	}
	
	public void setCharges(Money charges) {
		this.charges = charges;
	}
	
	public List<WithdrawQueryInfo> getWithdrawInfos() {
		return withdrawInfos;
	}
	
	public void setWithdrawInfos(List<WithdrawQueryInfo> withdrawInfos) {
		this.withdrawInfos = withdrawInfos;
	}
	
}
