package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.message.product.cowpay.info.ProductBasicInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "queryProductBasic", type = ApiMessageType.Response)
public class QueryProductBasicResponse extends ApiResponse {
	
	@OpenApiField(desc = "商品基础信息")
	private ProductBasicInfo productBasicInfo;
	
	@OpenApiField(desc = "是否已收藏")
	private boolean stored;
	
	public ProductBasicInfo getProductBasicInfo() {
		return productBasicInfo;
	}
	
	public void setProductBasicInfo(ProductBasicInfo productBasicInfo) {
		this.productBasicInfo = productBasicInfo;
	}
	
	public boolean isStored() {
		return stored;
	}
	
	public void setStored(boolean stored) {
		this.stored = stored;
	}
	
}
