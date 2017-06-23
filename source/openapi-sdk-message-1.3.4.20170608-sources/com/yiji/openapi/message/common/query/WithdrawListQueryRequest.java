package com.yiji.openapi.message.common.query;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@OpenApiMessage(service = "withdrawListQuery", type = ApiMessageType.Request)
public class WithdrawListQueryRequest extends ApiRequest {

	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "易极付用户ID")
	private String userId;

	@Length(max = 20)
	@OpenApiField(desc = "支付流水")
	private String payNo;

	@NotNull
	@OpenApiField(desc = "起始时间")
	private Date startTime;

	@NotNull
	@OpenApiField(desc = "结束时间")
	private Date endTime;

	@OpenApiField(desc = "提现类型")
	private List<String> withdrawTypeList;

	@OpenApiField(desc = "银行账号")
	private String bankAccountNo;

	@Min(value = 1)
	@Max(value = 50)
	@OpenApiField(desc = "每页大小")
	private Long pageSize = new Long(10);

	@Min(value = 1)
	@OpenApiField(desc = "页码")
	private Long pageNo = new Long(1);

	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public List<String> getWithdrawTypeList() {
		return withdrawTypeList;
	}

	public void setWithdrawTypeList(List<String> withdrawTypeList) {
		this.withdrawTypeList = withdrawTypeList;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public Long getPageSize() {
		return pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNo() {
		return pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}