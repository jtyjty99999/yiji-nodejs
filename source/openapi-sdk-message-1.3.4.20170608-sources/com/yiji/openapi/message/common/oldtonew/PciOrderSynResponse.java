package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-20<br>
 */
@OpenApiMessage(service = "pci_order_syn", type = ApiMessageType.Response)
public class PciOrderSynResponse extends ApiResponse {

	@OpenApiField(desc = "统一流水号", demo = "123123123123213")
	private String gid;

	@OpenApiField(desc = "xxx", demo = "xxx")
	private String espCashierType;

	@OpenApiField(desc = "外部订单号", demo = "xxx")
	private String tradeNo;

	@OpenApiField(desc = "支付类型", demo = "moto_edc")
	private String orderType;

	@OpenApiField(desc = "入口", demo = "01")
	private String inlet;

	@OpenApiField(desc = "商户卡号", demo = "xxx")
	private String merchantCardNo;

	@OpenApiField(desc = "商户账户号", demo = "xxx")
	private String merchantAccNo;

	@OpenApiField(desc = "商户用户id", demo = "xxx")
	private String merchantUserId;

	@OpenApiField(desc = "商户外部订单号", demo = "xxx")
	private String merchantOrderBizNo;

	@OpenApiField(desc = "渠道id", demo = "openapi")
	private String channelId;

	@OpenApiField(desc = "请求是否成功", demo = "true")
	private String isSuccess;

	@OpenApiField(desc = "错误码", demo = "SAVEFAIL")
	private String errorCode;

	@OpenApiField(desc = "错误描述", demo = "处理失败")
	private String errorMessage;

	@OpenApiField(desc = "错误原因", demo = "xxx")
	private String uniqueness;

	@OpenApiField(desc = "易极付订单号", demo = "xxx")
	private String orderNumber;

	@OpenApiField(desc = "外部商户订单号", demo = "xxx")
	private String transactionFlow;

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getEspCashierType() {
		return espCashierType;
	}

	public void setEspCashierType(String espCashierType) {
		this.espCashierType = espCashierType;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getInlet() {
		return inlet;
	}

	public void setInlet(String inlet) {
		this.inlet = inlet;
	}

	public String getMerchantCardNo() {
		return merchantCardNo;
	}

	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}

	public String getMerchantAccNo() {
		return merchantAccNo;
	}

	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}

	public String getMerchantUserId() {
		return merchantUserId;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMerchantOrderBizNo() {
		return merchantOrderBizNo;
	}

	public void setMerchantOrderBizNo(String merchantOrderBizNo) {
		this.merchantOrderBizNo = merchantOrderBizNo;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getUniqueness() {
		return uniqueness;
	}

	public void setUniqueness(String uniqueness) {
		this.uniqueness = uniqueness;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getTransactionFlow() {
		return transactionFlow;
	}

	public void setTransactionFlow(String transactionFlow) {
		this.transactionFlow = transactionFlow;
	}
}
