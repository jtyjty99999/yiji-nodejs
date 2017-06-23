package com.yiji.openapi.message.product.easyexchange;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "espOrderQuery", type = ApiMessageType.Request)
public class EspOrderQueryRequest extends ApiRequest {
	
	@Length(max = 40)
	@OpenApiField(desc = "外部商户订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "最小金额")
	private Money amountLocMin;
	
	@OpenApiField(desc = "最大金额")
	private Money amountLocMax;
	
	@Length(min = 10, max = 10)
	@OpenApiField(desc = "起始时间,格式:yyyy-MM-dd")
	private String beginTime;
	
	@Length(min = 10, max = 10)
	@OpenApiField(desc = "结束时间,格式:yyyy-MM-dd")
	private String endTime;
	
	@OpenApiField(
			desc = "交易状态",
			constraint = "pay_wait等待付款;pay_success付款成功;pay_fail付款失败;authorize_success授权成功;authoriz_applying预授权申请中;3d_paying3D付款中;cancel_success撤销成功;refunding退款中;refund_success退款成功;refund_fail退款失败;rejecting拒付中;reject_success拒付成功;reject_fail拒付失败")
	private String orderStatus;
	
	@OpenApiField(
			desc = "卡类型",
			constraint = "Visa;MasterCard;America_Express;Discover;Diners_Club;Carte_Blanche;JCB;EnRoute;JAL;UK_Domestic;Delta;Visa_Electron;Dankort;Laser;Carte_Bleue;Carta_Si;Encoded_account;UATP;Maestro;GE_Money_UK_card;Style;")
	private String cardType;
	
	@NotNull
	@OpenApiField(desc = "页码")
	private Integer pageNo;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public Money getAmountLocMin() {
		return amountLocMin;
	}
	
	public void setAmountLocMin(Money amountLocMin) {
		this.amountLocMin = amountLocMin;
	}
	
	public Money getAmountLocMax() {
		return amountLocMax;
	}
	
	public void setAmountLocMax(Money amountLocMax) {
		this.amountLocMax = amountLocMax;
	}
	
	public String getBeginTime() {
		return beginTime;
	}
	
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public Integer getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	
}