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
 * @since 2016-01-19<br>
 */
@OpenApiMessage(service = "signmaybankquery", type = ApiMessageType.Request)
public class SignMaybankQueryRequest extends ApiRequest {

	@NotNull
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "12345679801324567890")
	private String userId;

	@OpenApiField(
			desc = "签约状态",
			constraint = "{\"data\":"
						 + "[\"INIT:初始状态\","
						 + "\"APPLY:签约申请中\","
						 + "\"SYN_CUSTOMER_FAIL:同步会员失败\","
						 + "\"SYN_PROCESS:签约处理中\","
						 + "\"SYN_REALNAME_FAIL:同步实名失败\","
						 + "\"PACT:签约成功\","
						 + "\"PACT_FAIL:签约失败\","
						 + "\"UN_PACT:解约成功\","
						 + "\"BANK_UN_PACT_APPLY:银行端解约申请中\","
						 + "\"BANK_UN_PACT_SUCCESS:银行端解约成功\","
						 + "\"INVALID:失效\","
						 + "\"SYSTEM_MAN_MADE:系统人为状态\","
						 + "\"USER_MAN_MADE:用户人为状态\","
						 + "\"DEDUCT_APPLY:扣款申请\","
						 + "\"DEDUCT_SUCCESS:扣款成功\","
						 + "\"DEDUCT_FAIL:扣款失败\","
						 + "\"DEDUCT_VERIFY_FAIL:扣款验证失败\","
						 + "\"PAY_MONEY_APPLY_SUCCESS:打款申请成功\","
						 + "\"PAY_MONEY_APPLY_FAIL:打款申请失败\","
						 + "\"PAY_MONEY_SUCCESS:打款成功\","
						 + "\"PAY_MONEY_FAIL:打款失败\","
						 + "\"PACT_TIME_OUT:签约超时\","
						 + "\"DROP_SIGN:放弃签约\","
						 + "\"RECHARGE:充值\""
						 + "],\"name\":\"签约状态\"}",
			demo = "PACT")
	private String afterStatus;

	@OpenApiField(
			desc = "签约目的,默认DEDUCT",
			constraint = "{\"name\":\"签约目的\",\"data\":"
						 + "[\"WITHDRAW:提现\","
						 + "\"DEDUCT:快捷支付\","
						 + "\"IDENTIFICATION:实名认证\","
						 + "\"REALNAMEDEDUCT:实名代扣\","
						 + "\"UNIONCERTPUR:银联认证\""
						 + "]}",
			demo = "WITHDRAW")
	private String purpose;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAfterStatus() {
		return afterStatus;
	}

	public void setAfterStatus(String afterStatus) {
		this.afterStatus = afterStatus;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}
