package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.cowpay.info.SpeciValueInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "queryProductDetail", type = ApiMessageType.Request)
public class QueryProductDetailRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 128)
	@OpenApiField(desc = "商品基础编码")
	private String productBasicCode;
	
	@NotEmpty
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "经销商ID")
	private String dealerUserId;
	
	@NotNull
	@OpenApiField(desc = "规格列表")
	private List<SpeciValueInfo> speciValues;
	
	public String getProductBasicCode() {
		return productBasicCode;
	}
	
	public void setProductBasicCode(String productBasicCode) {
		this.productBasicCode = productBasicCode;
	}
	
	public List<SpeciValueInfo> getSpeciValues() {
		return speciValues;
	}
	
	public void setSpeciValues(List<SpeciValueInfo> speciValues) {
		this.speciValues = speciValues;
	}
	
	public String getDealerUserId() {
		return dealerUserId;
	}
	
	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}
	
}
