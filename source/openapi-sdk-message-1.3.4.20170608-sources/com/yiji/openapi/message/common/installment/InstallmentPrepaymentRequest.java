package com.yiji.openapi.message.common.installment;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by sky on 2015/5/19.
 */
@OpenApiMessage(service = "installmentPrepayment", type = ApiMessageType.Request)
public class InstallmentPrepaymentRequest extends ApiRequest {
	/**
	 * 签约合同号
	 */
	@NotBlank
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号")
	private String externalOrderNo;
	
	/**
	 * 提前还款金额
	 */
	@NotNull
	@OpenApiField(desc = "提前还款金额")
	private Money prepaymentAmount;
	
	/**
	 * 提前还款截止期数
	 */
	@Min(1)
	@OpenApiField(desc = "提前还款截止期数")
	private Integer prepaymentEndTime;
	
	/**
	 * 下次预计还款日期。部分提前还款时必填，用于以此日期为基准，自动调整余下期数的还款日期
	 */
	@OpenApiField(desc = "预计还款日期")
	private Date nextExpectedRepayDate;
	
	public Integer getPrepaymentEndTime() {
		return prepaymentEndTime;
	}
	
	public void setPrepaymentEndTime(Integer prepaymentEndTime) {
		this.prepaymentEndTime = prepaymentEndTime;
	}
	
	public Date getNextExpectedRepayDate() {
		return nextExpectedRepayDate;
	}
	
	public void setNextExpectedRepayDate(Date nextExpectedRepayDate) {
		this.nextExpectedRepayDate = nextExpectedRepayDate;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getContractNo() {
		return this.contractNo;
	}
	
	public void setPrepaymentAmount(Money prepaymentAmount) {
		this.prepaymentAmount = prepaymentAmount;
	}
	
	public Money getPrepaymentAmount() {
		return this.prepaymentAmount;
	}
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	

	public void check() {
		if (prepaymentEndTime == null) {
			throw new IllegalArgumentException("提前还款截止期数不能为空");
		}
	}
}
