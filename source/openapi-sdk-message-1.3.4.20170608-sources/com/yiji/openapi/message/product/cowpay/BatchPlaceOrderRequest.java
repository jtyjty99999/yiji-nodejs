package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.cowpay.info.FaProdOrderDetail;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Jason Ma on 2015/1/20.
 */
@OpenApiMessage(service = "batchPlaceOrder", type = ApiMessageType.Request)
public class BatchPlaceOrderRequest extends ApiRequest {
	
	@NotEmpty(message = "用户不能为空")
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@NotEmpty(message = "商品集不能为空")
	@OpenApiField(desc = "商品集")
	private List<FaProdOrderDetail> faProdOrderDetailList;
	
	@OpenApiField(desc = "发货地址")
	private String deliveryAddress;
	
	@OpenApiField(desc = "结算账户,en 表示企业，pr表示个人")
	private String settlementAccount = "en";
	
	@OpenApiField(desc = "自定义金额")
	private Money abMoney;
	
	@OpenApiField(desc = "备注")
	@Length(max = 1024)
	private String memo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public List<FaProdOrderDetail> getFaProdOrderDetailList() {
		return faProdOrderDetailList;
	}
	
	public void setFaProdOrderDetailList(List<FaProdOrderDetail> faProdOrderDetailList) {
		this.faProdOrderDetailList = faProdOrderDetailList;
	}
	
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	public String getSettlementAccount() {
		return settlementAccount;
	}
	
	public void setSettlementAccount(String settlementAccount) {
		this.settlementAccount = settlementAccount;
	}
	
	public Money getAbMoney() {
		return abMoney;
	}
	
	public void setAbMoney(Money abMoney) {
		this.abMoney = abMoney;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
