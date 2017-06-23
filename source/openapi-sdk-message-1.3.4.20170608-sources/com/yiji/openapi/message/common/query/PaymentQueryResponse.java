/**
 * 
 */
package com.yiji.openapi.message.common.query;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.query.enums.TradeTypeEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author mayansen
 * @date 20140806
 *
 */
@OpenApiMessage(service = "tradeInfoQuery", type = ApiMessageType.Response)
public class PaymentQueryResponse extends ApiResponse {
	
	@NotBlank
	@OpenApiField(desc = "交易号", constraint = "交易号", demo = "2016031012012712586232470")
	private String tradeNo;
	
	@NotBlank
	@OpenApiField(desc = "外部交易订单号", constraint = "外部交易订单号", demo = "2016031012012712586232470")
	private String outOrderNo;
	
	@NotNull
	@OpenApiField(desc = "交易类型", constraint = "交易类型", demo = "ESCROWTRADE")
	private TradeTypeEnum tradeType;
	
	@OpenApiField(desc = "交易名称", constraint = "交易名称", demo = "金交宝分润")
	private String tradeName;
	
	@NotNull
	@OpenApiField(desc = "交易金额", constraint = "交易金额", demo = "66.66")
	private Money tradeAmount;
	
	@OpenApiField(desc = "交易备注", constraint = "交易备注", demo = "成功")
	private String memo;
	
	@NotBlank
	@OpenApiField(desc = "买方id", constraint = "买方id", demo = "20150508020005316018")
	private String buyerId;
	
	@OpenApiField(desc = "买方真实姓名", constraint = "买方真实姓名", demo = "张三")
	private String buyerRealName;
	
	@NotBlank
	@OpenApiField(desc = "卖方id", constraint = "卖方id", demo = "20150508020005316018")
	private String sellerId;
	
	@OpenApiField(desc = "卖方真实姓名", constraint = "卖方真实姓名", demo = "李四")
	private String sellerRealName;
	
	@NotBlank
	@OpenApiField(desc = "付款方id", constraint = "付款方id", demo = "20150508020005316018")
	private String payerUserId;
	
	@OpenApiField(desc = "付款方真实姓名", constraint = "付款方真实姓名", demo = "王五")
	private String payerRealName;
	
	@NotBlank
	@OpenApiField(desc = "创建时间", constraint = "创建时间", demo = "2099-12-30 23:59:59")
	private String createTime;
	
	@NotBlank
	@OpenApiField(desc = "更新时间", constraint = "更新时间", demo = "2099-12-30 23:59:59")
	private String updateTime;
	
	@NotNull
	@OpenApiField(desc = "交易状态", constraint = "交易状态", demo = "create_trade")
	private String tradeStatus;
	
	/**
	 * 
	 */
	public PaymentQueryResponse() {
		super();
	}
	
	/**
	 * @param tradeNo
	 * @param outOrderNo
	 * @param tradeType
	 * @param tradeName
	 * @param tradeAmount
	 * @param actuallyPaidAmount
	 * @param refundAmount
	 * @param memo
	 * @param buyerId
	 * @param buyerRealName
	 * @param sellerId
	 * @param sellerRealName
	 * @param payerUserId
	 * @param payerRealName
	 * @param createTime
	 * @param updateTime
	 * @param tradeStatus
	 */
	public PaymentQueryResponse(String tradeNo, String outOrderNo, TradeTypeEnum tradeType, String tradeName,
								Money tradeAmount, Money actuallyPaidAmount, Money refundAmount, String memo,
								String buyerId, String buyerRealName, String sellerId, String sellerRealName,
								String payerUserId, String payerRealName, String createTime, String updateTime,
								String tradeStatus) {
		super();
		this.tradeNo = tradeNo;
		this.outOrderNo = outOrderNo;
		this.tradeType = tradeType;
		this.tradeName = tradeName;
		this.tradeAmount = tradeAmount;
		this.memo = memo;
		this.buyerId = buyerId;
		this.buyerRealName = buyerRealName;
		this.sellerId = sellerId;
		this.sellerRealName = sellerRealName;
		this.payerUserId = payerUserId;
		this.payerRealName = payerRealName;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.tradeStatus = tradeStatus;
	}
	
	/**
	 * @return the tradeNo
	 */
	public String getTradeNo() {
		return tradeNo;
	}
	
	/**
	 * @param tradeNo the tradeNo to set
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	/**
	 * @return the outOrderNo
	 */
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	/**
	 * @param outOrderNo the outOrderNo to set
	 */
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	/**
	 * @return the tradeType
	 */
	public TradeTypeEnum getTradeType() {
		return tradeType;
	}
	
	/**
	 * @param tradeTypeEnum the tradeType to set
	 */
	public void setTradeType(TradeTypeEnum tradeTypeEnum) {
		this.tradeType = tradeTypeEnum;
	}
	
	/**
	 * @return the tradeName
	 */
	public String getTradeName() {
		return tradeName;
	}
	
	/**
	 * @param tradeName the tradeName to set
	 */
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	/**
	 * @return the tradeAmount
	 */
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	/**
	 * @param tradeAmount the tradeAmount to set
	 */
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}
	
	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	/**
	 * @return the buyerId
	 */
	public String getBuyerId() {
		return buyerId;
	}
	
	/**
	 * @param buyerId the buyerId to set
	 */
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	
	/**
	 * @return the buyerRealName
	 */
	public String getBuyerRealName() {
		
		return buyerRealName;
	}
	
	/**
	 * @param buyerRealName the buyerRealName to set
	 */
	public void setBuyerRealName(String buyerRealName) {
		
		this.buyerRealName = buyerRealName.replaceFirst(String.valueOf(buyerRealName.charAt(0)), "*");
	}
	
	/**
	 * @return the sellerId
	 */
	public String getSellerId() {
		return sellerId;
	}
	
	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	/**
	 * @return the sellerRealName
	 */
	public String getSellerRealName() {
		return sellerRealName;
	}
	
	/**
	 * @param sellerRealName the sellerRealName to set
	 */
	public void setSellerRealName(String sellerRealName) {
		
		this.sellerRealName = sellerRealName.replaceFirst(String.valueOf(sellerRealName.charAt(0)), "*");
	}
	
	/**
	 * @return the payerUserId
	 */
	public String getPayerId() {
		return payerUserId;
	}
	
	/**
	 * @param payerUserId the payerUserId to set
	 */
	public void setPayerId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	/**
	 * @return the payerRealName
	 */
	public String getPayerRealName() {
		return payerRealName;
	}
	
	/**
	 * @param payerRealName the payerRealName to set
	 */
	public void setPayerRealName(String payerRealName) {
		
		this.payerRealName = payerRealName.replaceFirst(String.valueOf(payerRealName.charAt(0)), "*");
	}
	
	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}
	
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	/**
	 * @return the updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	/**
	 * @return the tradeStatus
	 */
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	/**
	 * @param tradeStatusEnum the tradeStatus to set
	 */
	public void setTradeStatus(String tradeStatusEnum) {
		this.tradeStatus = tradeStatusEnum;
	}
	
}
