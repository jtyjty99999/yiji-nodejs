package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.ProductClassify;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "queryProductClassifyTree", type = ApiMessageType.Response)
public class QueryProductClassifyTreeResponse extends ApiResponse {
	
	@OpenApiField(desc = "分类树(分类树有多棵)")
	private List<ProductClassify> classifyTrees;
	
	public List<ProductClassify> getClassifyTrees() {
		return classifyTrees;
	}
	
	public void setClassifyTrees(List<ProductClassify> classifyTrees) {
		this.classifyTrees = classifyTrees;
	}
	
}
