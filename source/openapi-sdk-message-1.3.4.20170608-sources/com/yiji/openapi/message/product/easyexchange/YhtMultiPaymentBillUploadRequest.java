package com.yiji.openapi.message.product.easyexchange;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.easyexchange.infos.PatmentBillOrderInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@OpenApiMessage(service = "yhtMultiPaymentBillUpload", type = ApiMessageType.Request)
public class YhtMultiPaymentBillUploadRequest extends ApiRequest {
	
	@OpenApiField(desc = "电商类型",constraint = "A：特殊类型<br>B：一般类型<br>默认B",demo = "B")
	private String eshopType = "B";
	
	@NotBlank
	@Size(max = 20, message = "the max length is 20")
	@OpenApiField(desc = "电商企业代码 ",demo = "654832")
	private String eshopEntCode;
	
	@NotBlank
	@Size(max = 100, message = "the max length is 100")
	@OpenApiField(desc = "电商企业名称",demo = "易极付")
	private String eshopEntName;
	
	@Size(max = 255, message = "the max length is 255")
	@OpenApiField(desc = "备注",demo = "跨境交易")
	private String memo;
	
	@NotNull
	@Size(min = 1)
	@OpenApiField(desc = "订单列表")
	private List<PatmentBillOrderInfo> vosList;
	
	public String getEshopEntCode() {
		return eshopEntCode;
	}
	
	public void setEshopEntCode(String eshopEntCode) {
		this.eshopEntCode = eshopEntCode;
	}
	
	public String getEshopEntName() {
		return eshopEntName;
	}
	
	public void setEshopEntName(String eshopEntName) {
		this.eshopEntName = eshopEntName;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<PatmentBillOrderInfo> getVosList() {
		return vosList;
	}

	public void setVosList(List<PatmentBillOrderInfo> vosList) {
		this.vosList = vosList;
	}

	public String getEshopType() {
		return eshopType;
	}
	
	public void setEshopType(String eshopType) {
		this.eshopType = eshopType;
	}
	
}