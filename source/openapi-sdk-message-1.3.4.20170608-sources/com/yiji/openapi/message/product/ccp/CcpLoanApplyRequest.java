package com.yiji.openapi.message.product.ccp;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.ccp.info.AttachmentInfoDto;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Administrator on 2016/3/21.
 */
@OpenApiMessage(service = "ccpLoanApply", type = ApiMessageType.Request)
public class CcpLoanApplyRequest extends ApiRequest {
	@NotNull
	@OpenApiField(desc = "申请贷款金额", demo = "5000000")
	private Money applyAmount;
	
	@NotBlank
	@OpenApiField(desc = "运营人员姓名", demo = "张三")
	private String operationName;
	
	@NotBlank
	@OpenApiField(desc = "运营人员电话", demo = "1388888888")
	private String operationMobile;
	
	@NotBlank
	@OpenApiField(desc = "易房保交易号", demo = "201603080111111")
	private String tradeNo;
	
	@OpenApiField(desc = "买方姓名", demo = "李四")
	private String buyerName;
	
	@OpenApiField(desc = "卖方姓名", demo = "王五")
	private String sellerName;
	
	@NotEmpty
	@OpenApiField(desc = "贷款申请需要的附件资料")
	private List<AttachmentInfoDto> attachments;
	
	@NotBlank
	@OpenApiField(desc = "平台id，易融通为外部商户分配")
	private String platformId;
	
	@NotBlank
	@OpenApiField(desc = "外部商户订单号", demo = "201603080111111")
	private String outOrderNo;
	
	@OpenApiField(desc = "操作类型", demo = "NEW_AND_AUD")
	private String actionType;
	
	/**
	 * [选填]业务ID
	 */
	@OpenApiField(desc = "业务ID", demo = "[\"18\"]")
	private List<String> busiId;
	
	@Length(max = 64)
	@OpenApiField(desc = "申请单号", constraint = "订单修改的时候需要将申请成功时返回的融资单号再次提交", demo = "201603084545487")
	private String orderCode;
	
	public List<String> getBusiId() {
		return busiId;
	}
	
	public void setBusiId(List<String> busiId) {
		this.busiId = busiId;
	}
	
	public String getOperationName() {
		return operationName;
	}
	
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	
	public String getOperationMobile() {
		return operationMobile;
	}
	
	public void setOperationMobile(String operationMobile) {
		this.operationMobile = operationMobile;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getBuyerName() {
		return buyerName;
	}
	
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	public String getSellerName() {
		return sellerName;
	}
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	public List<AttachmentInfoDto> getAttachments() {
		return attachments;
	}
	
	public void setAttachments(List<AttachmentInfoDto> attachments) {
		this.attachments = attachments;
	}
	
	public String getPlatformId() {
		return platformId;
	}
	
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getActionType() {
		return actionType;
	}
	
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	public Money getApplyAmount() {
		return applyAmount;
	}
	
	public void setApplyAmount(Money applyAmount) {
		this.applyAmount = applyAmount;
	}
	
	public String getOrderCode() {
		return this.orderCode;
	}
	
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	
}
