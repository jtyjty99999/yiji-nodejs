package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.common.oldtonew.info.ApiAirTicketDetail;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-27<br>
 */
@Deprecated
@OpenApiMessage(service = "complete_airticket", type = ApiMessageType.Request)
public class CompleteAirticketRequest extends ApiRequest{

	@NotNull
	@Length(max = 20, message = "易生活订单编号长度不正确,长度不能超过20位")
	@OpenApiField(desc = "易生活订单编号", constraint = "长度不能超过20位", demo = "23123123213")
	private String easyLifeOrderNo;

	@NotEmpty(message = "订单明细列表不能为空")
	@OpenApiField(desc = "订单明细列表", demo = "xxx")
	private List<ApiAirTicketDetail> airTicketDetailList;

	public String getEasyLifeOrderNo() {
		return easyLifeOrderNo;
	}

	public void setEasyLifeOrderNo(String easyLifeOrderNo) {
		this.easyLifeOrderNo = easyLifeOrderNo;
	}

	public List<ApiAirTicketDetail> getAirTicketDetailList() {
		return airTicketDetailList;
	}

	public void setAirTicketDetailList(List<ApiAirTicketDetail> airTicketDetailList) {
		this.airTicketDetailList = airTicketDetailList;
	}
}
