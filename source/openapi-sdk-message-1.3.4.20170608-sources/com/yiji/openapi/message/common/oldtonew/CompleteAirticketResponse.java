package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.AirTicketDetailStringInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-27<br>
 */
@Deprecated
@OpenApiMessage(service = "complete_airticket", type = ApiMessageType.Response)
public class CompleteAirticketResponse extends ApiResponse {

	@OpenApiField(desc = "易生活订单编号", demo = "123213213213213")
	private String easyLifeOrderNo;

	@OpenApiField(desc = "订单明细列表", demo = "xxx")
	private List<AirTicketDetailStringInfo> airTicketDetailInfoList;

	public String getEasyLifeOrderNo() {
		return easyLifeOrderNo;
	}

	public void setEasyLifeOrderNo(String easyLifeOrderNo) {
		this.easyLifeOrderNo = easyLifeOrderNo;
	}

	public List<AirTicketDetailStringInfo> getAirTicketDetailInfoList() {
		return airTicketDetailInfoList;
	}

	public void setAirTicketDetailInfoList(
			List<AirTicketDetailStringInfo> airTicketDetailInfoList) {
		this.airTicketDetailInfoList = airTicketDetailInfoList;
	}
}
