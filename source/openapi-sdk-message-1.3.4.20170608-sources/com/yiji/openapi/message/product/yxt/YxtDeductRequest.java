package com.yiji.openapi.message.product.yxt;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月22日
 */
@OpenApiMessage(service = "yxtDeduct", type = ApiMessageType.Request)
public class YxtDeductRequest extends ApiRequest {
	
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
	 * 金额组成表:例如租金:100，管理费:10
	 */
	@NotEmpty
	@OpenApiField(desc = "金额组成表")
	private String costComposition;
	
	@Size(max = 1024)
	@OpenApiField(desc = "备注")
	private String memo;
	
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
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getCostComposition() {
		return costComposition;
	}
	
	public void setCostComposition(String costComposition) {
		this.costComposition = costComposition;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
