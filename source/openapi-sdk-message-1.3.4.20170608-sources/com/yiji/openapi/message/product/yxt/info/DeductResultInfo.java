package com.yiji.openapi.message.product.yxt.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月23日
 */
public class DeductResultInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@OpenApiField(desc = "订单号")
	private String orderNo;
	
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "代扣合同号")
	private String withholdContractNo;
	
	@OpenApiField(desc = "外部订单号")
	private String externalOrderNo;
	
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "费用组成")
	private String costComposition;
	
	@OpenApiField(desc = "代扣时间")
	private String withholdTime;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "备注")
	private String memo;
	
	public String getOrderNo() {
		return this.orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getWithholdContractNo() {
		return withholdContractNo;
	}
	
	public void setWithholdContractNo(String withholdContractNo) {
		this.withholdContractNo = withholdContractNo;
	}
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
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
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getWithholdTime() {
		return this.withholdTime;
	}
	
	public void setWithholdTime(String withholdTime) {
		this.withholdTime = withholdTime;
	}
	
}
