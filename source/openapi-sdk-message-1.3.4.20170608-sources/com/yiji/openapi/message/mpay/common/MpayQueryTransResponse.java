package com.yiji.openapi.message.mpay.common;

import java.util.List;

import com.yiji.openapi.message.mpay.common.info.OpenApiTransaction;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

@OpenApiMessage(service = "mpayQueryTransaction", type = ApiMessageType.Response)
public class MpayQueryTransResponse extends ApiResponse {
	
	@OpenApiField(desc = "总行数",constraint="总行数",demo="100")
	private int totalRows;
	
	@OpenApiField(desc = "是否所有数据已返回",constraint="是否所有数据已返回",demo="false")
	private boolean isTruncated;
	
	@OpenApiField(desc = "查询结果,JSON数组,transaction结构定义",constraint="查询结果,JSON数组,transaction结构定义",demo="[{\"amount\":100000.00,\"applyTime\":\"2015-10-16 09:43:48\",\"bankCard\":\"6216613200019254854\",\"bankCode\":\"BOC\",\"pactNo\":\"20150708000000467986\",\"remark\":\"提现成功\",\"status\":\"WITHDRAW_SUCCESS\",\"tradeNo\":\"20151016094348411000\",\"transTime\":\"2015-10-16 09:45:54\",\"transactionType\":\"WITHDRAW\",\"userId\":\"20130310bj9307411593\"}]")
	private List<OpenApiTransaction> transactions;
	
	public int getTotalRows() {
		return totalRows;
	}
	
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	
	public boolean isTruncated() {
		return isTruncated;
	}
	
	public void setTruncated(boolean isTruncated) {
		this.isTruncated = isTruncated;
	}
	
	public List<OpenApiTransaction> getTransactions() {
		return transactions;
	}
	
	public void setTransactions(List<OpenApiTransaction> transactions) {
		this.transactions = transactions;
	}
	
}
