package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "storeOrCancleGoods", type = ApiMessageType.Request)
public class StoreOrCancleGoodsRequest extends ApiRequest {
	
	@NotEmpty
	@OpenApiField(desc = "经销商userid")
	private String dealerUserId;
	
	@OpenApiField(desc = "商品基础编码,是取消收藏,且此没有传此字段,那么将取消所有收藏")
	private String productBasicCode;
	
	@OpenApiField(desc = "收藏或者取消收藏", constraint = "true:取消收藏,false:收藏")
	private boolean cancle = false;
	
	public String getDealerUserId() {
		return dealerUserId;
	}
	
	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}
	
	public String getProductBasicCode() {
		return productBasicCode;
	}
	
	public void setProductBasicCode(String productBasicCode) {
		this.productBasicCode = productBasicCode;
	}
	
	public boolean isCancle() {
		return cancle;
	}
	
	public void setCancle(boolean cancle) {
		this.cancle = cancle;
	}
	
}
