package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.cowpay.info.FaSupplierOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/20.
 */
@OpenApiMessage(service = "findSupplierListByUserId", type = ApiMessageType.Response)
public class FindSupplierListByUserIdResponse extends ApiResponse {
	
	@NotEmpty
	@Length(max = 20)
	@OpenApiField(desc = "供应商信息集合")
	private List<FaSupplierOrder> supplierOrderList;
	
	public List<FaSupplierOrder> getSupplierOrderList() {
		return supplierOrderList;
	}
	
	public void setSupplierOrderList(List<FaSupplierOrder> supplierOrderList) {
		this.supplierOrderList = supplierOrderList;
	}
}
