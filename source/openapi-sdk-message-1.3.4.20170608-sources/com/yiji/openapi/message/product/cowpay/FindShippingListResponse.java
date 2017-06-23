package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.ShippingAddressInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/3/25.
 */
@OpenApiMessage(service = "findShippingListByUserId", type = ApiMessageType.Response)
public class FindShippingListResponse extends ApiResponse {
	
	@OpenApiField(desc = "收货地址列表")
	private List<ShippingAddressInfo> shippingAddressInfos;
	
	public List<ShippingAddressInfo> getShippingAddressInfos() {
		return shippingAddressInfos;
	}
	
	public void setShippingAddressInfos(List<ShippingAddressInfo> shippingAddressInfos) {
		this.shippingAddressInfos = shippingAddressInfos;
	}
}
