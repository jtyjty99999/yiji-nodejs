package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xinqing@yiji.com
 *
 * Data： 2015年6月17日
 */
@OpenApiMessage(service = "realNameQuery", type = ApiMessageType.Response)
public class RealNameQueryResponse extends ApiResponse {
	/**
	 * 查询返回结果枚举
	 */
	@OpenApiField(desc = "查询返回结果枚举")
	private String realNameQueryResult;
	
	public String getRealNameQueryResult() {
		return realNameQueryResult;
	}
	
	public void setRealNameQueryResult(String realNameQueryResult) {
		this.realNameQueryResult = realNameQueryResult;
	}
}
