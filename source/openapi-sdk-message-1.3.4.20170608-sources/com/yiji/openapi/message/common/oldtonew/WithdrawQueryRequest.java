package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-26<br>
 */
@OpenApiMessage(service = "withdraw.query", type = ApiMessageType.Request)
public class WithdrawQueryRequest extends ApiRequest{

	@NotNull
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户ID", demo = "20130812020055285248")
	private String userId;

	@OpenApiField(desc = "外部订单号", demo = "1234567898123")
	private String outBizNo;

	@OpenApiField(desc = "当前页", demo = "1")
	private String currPage;

	@OpenApiField(desc = "每页大小", demo = "10")
	private String pageSize;

	@OpenApiField(desc = "起始时间,业务发生时间;格式：YYYY-MM-DD HH:mm", demo = "2015-12-13 00:00")
	private String startTime;

	@OpenApiField(desc = "终止时间,业务发生时间;格式：YYYY-MM-DD HH:mm", demo = "2015-12-19 00:00")
	private String endTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOutBizNo() {
		return outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getCurrPage() {
		return currPage;
	}

	public void setCurrPage(String currPage) {
		this.currPage = currPage;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
