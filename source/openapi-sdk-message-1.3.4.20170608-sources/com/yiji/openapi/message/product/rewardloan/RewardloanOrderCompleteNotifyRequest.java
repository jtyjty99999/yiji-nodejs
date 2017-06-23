package com.yiji.openapi.message.product.rewardloan;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "rewardloanOrderCompleteNotify", type = ApiMessageType.Request)
public class RewardloanOrderCompleteNotifyRequest extends ApiRequest {
	
	/**
	 * 序列号
	 */
	@NotBlank(message = "序列号不能为空")
	@OpenApiField(desc = "序列号")
	private String serialNumber;
	
	/**
	 * 订单号
	 */
	@NotBlank(message = "订单号不能为空")
	@OpenApiField(desc = "订单号")
	private String outOrderNo;
	
	/**
	 * 订单状态
	 */
	@NotBlank(message = "订单状态不能为空")
	@OpenApiField(desc = "订单状态")
	private String status;
	
	/**
	 * 订单金额
	 */
	@NotNull
	@OpenApiField(desc = "订单金额")
	private Money money;
	
	/**
	 * 订单完成时间
	 */
	@NotBlank
	@OpenApiField(desc = "订单完成时间")
	private String time;
	
	/**
	 * 用户姓名
	 */
	@OpenApiField(desc = "合作伙伴用户ID")
	@NotBlank(message = "用户姓名")
	private String username;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Money getMoney() {
		return money;
	}
	
	public void setMoney(Money money) {
		this.money = money;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
}
