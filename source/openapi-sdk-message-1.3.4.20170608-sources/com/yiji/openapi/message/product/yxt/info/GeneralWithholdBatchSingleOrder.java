package com.yiji.openapi.message.product.yxt.info;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */

public class GeneralWithholdBatchSingleOrder {
	
	/**
	 * 签约合同号
	 */
	@NotEmpty
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	/**
	 * 外部订单号
	 */
	@NotEmpty
	@Size(max = 40)
	@OpenApiField(desc = "外部订单号")
	private String externalOrderNo;
	
	/**
	 * 总金额
	 */
	@NotNull
	@OpenApiField(desc = "总金额")
	private Money totalAmount;
	
	/**
	 * 金额组成,json格式字符串例如:{"管理费":"100","租金":"100"}
	 */
	@NotEmpty
	@OpenApiField(desc = "金额组成")
	private String costComposition;
	
	public String getContractNo() {
		return this.contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getExternalOrderNo() {
		return this.externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public Money getTotalAmount() {
		return this.totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getCostComposition() {
		return this.costComposition;
	}
	
	public void setCostComposition(String costComposition) {
		this.costComposition = costComposition;
	}
}
