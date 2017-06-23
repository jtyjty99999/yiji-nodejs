package com.yiji.openapi.message.mpay.query;

import java.util.List;

import com.yiji.openapi.message.mpay.query.info.MpayBankQuoInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 查询支持的银行卡 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "querySupportBank", type = ApiMessageType.Response)
public class QuerySupportBankApiResponse extends ApiResponse {
	
	@OpenApiField(desc = "银行列表")
	private List<MpayBankQuoInfo> banks;
	
	@OpenApiField(desc = "银行个数",demo = "1")
	private int count;
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public List<MpayBankQuoInfo> getBanks() {
		return banks;
	}

	public void setBanks(List<MpayBankQuoInfo> banks) {
		this.banks = banks;
	}
}
