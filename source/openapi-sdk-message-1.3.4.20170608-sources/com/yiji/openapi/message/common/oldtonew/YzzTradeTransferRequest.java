package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by tyongfu@yiji.com on 2016/1/19.
 */
@OpenApiMessage(service = "yzzTradeTransfer", type = ApiMessageType.Request)
public class YzzTradeTransferRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "转出方ID", constraint = "只能为20位", demo = "12346579801234567980")
	private String buyerUserId;
	
	@Length(max = 32, min = 1)
	@OpenApiField(
			desc = "转账类型",
			constraint = "{\"data\":[\"NORMAL:正常\",\"UN_FREEZE_TRANSFER:解冻转账\",\"TRANSFER_FREEZE:转账冻结\",\"UN_FREEZE_TRANSFER_FREEZE:解冻转账并冻结\"],\"name\":\"转账类型\"}",
			demo = "NORMAL")
	private String transferAction = "NORMAL";
	
	@Length(max = 64, min = 1)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "12346579801234567980")
	private String outBizNo;
	
	@OpenApiField(desc = "解冻金额", constraint = "只能是数字", demo = "100")
	private Money unfreezeAmount;
	
	@OpenApiField(desc = "冻结金额", constraint = "只能是数字", demo = "100")
	private Money freezeAmount;
	
	@OpenApiField(desc = "交易名称", constraint = "不能太长", demo = "羽毛球购买")
	private String tradeName;
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "转入方ID", constraint = "只能为20位", demo = "12346579801234567980")
	private String sellerUserId;
	
	@Length(max = 256)
	@OpenApiField(desc = "买方备注", constraint = "买方备注", demo = "12346579801234567980")
	private String buyerMarkerMemo;
	
	@Length(max = 256)
	@OpenApiField(desc = "卖方备注", constraint = "卖方备注", demo = "12346579801234567980")
	private String sellerMarkerMemo;
	
	@Length(max = 64)
	@OpenApiField(desc = "业务产品码", constraint = "业务产品码", demo = "yzztransfer")
	private String tradeBizProductCode;
	
	@NotNull
	@OpenApiField(desc = "交易金额", constraint = "交易金额", demo = "100")
	private Money tradeAmount;
	
	@Length(max = 256)
	@OpenApiField(desc = "交易备注", constraint = "交易备注", demo = "需要实时到账的交易")
	private String tradeMemo;
	
	@OpenApiField(desc = " 解冻类型", constraint = "解冻类型,默认值：TRANSFER_FREEZE", demo = "TRANSFER_FREEZE")
	private String unFreezeType;
	
	@OpenApiField(desc = "冻结类型", constraint = "冻结类型，默认值：TRANSFER_FREEZE", demo = "TRANSFER_FREEZE")
	private String freezeType;
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getTransferAction() {
		return transferAction;
	}
	
	public void setTransferAction(String transferAction) {
		this.transferAction = transferAction;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public Money getUnfreezeAmount() {
		return unfreezeAmount;
	}
	
	public void setUnfreezeAmount(Money unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}
	
	public Money getFreezeAmount() {
		return freezeAmount;
	}
	
	public void setFreezeAmount(Money freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public String getBuyerMarkerMemo() {
		return buyerMarkerMemo;
	}
	
	public void setBuyerMarkerMemo(String buyerMarkerMemo) {
		this.buyerMarkerMemo = buyerMarkerMemo;
	}
	
	public String getSellerMarkerMemo() {
		return sellerMarkerMemo;
	}
	
	public void setSellerMarkerMemo(String sellerMarkerMemo) {
		this.sellerMarkerMemo = sellerMarkerMemo;
	}
	
	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public String getUnFreezeType() {
		return this.unFreezeType;
	}
	
	public void setUnFreezeType(String unFreezeType) {
		this.unFreezeType = unFreezeType;
	}
	
	public String getFreezeType() {
		return this.freezeType;
	}
	
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}
}
