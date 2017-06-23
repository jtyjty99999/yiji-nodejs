package com.yiji.openapi.message.product.yxt.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月23日
 */
public class CreateFailOrderInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "外部订单号")
	private String externalOrderNo;
	
	@OpenApiField(desc = "描述")
	private String description;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
