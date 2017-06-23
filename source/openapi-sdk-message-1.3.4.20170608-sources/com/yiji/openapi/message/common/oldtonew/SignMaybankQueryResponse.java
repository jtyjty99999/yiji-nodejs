package com.yiji.openapi.message.common.oldtonew;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.yiji.openapi.message.common.oldtonew.info.PactQueryInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-19<br>
 */
@OpenApiMessage(service = "signmaybankquery", type = ApiMessageType.Response)
public class SignMaybankQueryResponse extends ApiResponse {

	@OpenApiField(desc = "易周转签约银行卡查询结果", demo="xxx")
	private List<PactQueryInfo> list;

	@OpenApiField(desc = "返回params", demo="xxx")
	protected Map<Object, Object> params = new LinkedHashMap<Object, Object>();

	public List<PactQueryInfo> getList() {
		return list;
	}

	public void setList(List<PactQueryInfo> list) {
		this.list = list;
	}

	public Map<Object, Object> getParams() {
		return params;
	}

	public void setParams(Map<Object, Object> params) {
		this.params = params;
	}
}
