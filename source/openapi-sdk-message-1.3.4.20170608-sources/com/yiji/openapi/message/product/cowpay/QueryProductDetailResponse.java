package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.message.product.cowpay.info.ProdDetailInfoCowpay;
import com.yiji.openapi.message.product.cowpay.info.ProductDiscountInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "queryProductDetail", type = ApiMessageType.Response)
public class QueryProductDetailResponse extends ApiResponse {
	
	@OpenApiField(desc = "商品详细")
	private ProdDetailInfoCowpay prodDetail;
	
	@OpenApiField(desc = "折扣信息")
	private ProductDiscountInfo productDiscount;
	
	public ProdDetailInfoCowpay getProdDetail() {
		return prodDetail;
	}
	
	public void setProdDetail(ProdDetailInfoCowpay prodDetail) {
		this.prodDetail = prodDetail;
	}
	
	public ProductDiscountInfo getProductDiscount() {
		return productDiscount;
	}
	
	public void setProductDiscount(ProductDiscountInfo productDiscount) {
		this.productDiscount = productDiscount;
	}
	
}
