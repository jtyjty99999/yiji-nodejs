/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午6:19:49 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.common.oldtonew.info.PaymentOrderItemApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@Deprecated
@OpenApiMessage(service = "applyBillPaymentV2", type = ApiMessageType.Request)
public class ApplyBillPaymentV2Request extends ApiRequest {

	@OpenApiField(desc = "扩展字段", demo = "")
	private Map<String, String> orderSupport;

	@NotNull
	@OpenApiField(desc = "账单类型", demo = "RECHARGE")
	private String billType;

	@OpenApiField(desc = "时间段开始时间", demo = "2016/11/11",constraint = "格式：yyyy/mm/dd")
	private String startTime;

	@OpenApiField(desc = "时间段结束时间", demo = "2016/11/11",constraint = "格式：yyyy/mm/dd")
	private String endTime;

	@NotNull
	@OpenApiField(desc = "用户缴费金额", demo = "1.11")
	private Money paymentAmount;

	@NotEmpty
	@OpenApiField(desc = "缴费入参条目列表", demo = "")
	private List<PaymentOrderItemApiInfo> paymentOrderItemList;

	@NotEmpty
	@OpenApiField(desc = "缴费模型", demo = "PAYMENT")
	private String paymentModel;

	@OpenApiField(desc = "用户欠费金额", demo = "1.11")
	private Money payable;

	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "机构编码", demo = "012300002")
	private String agencyCode;

	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "用户编码", demo = "03650518")
	private String userCode;

	@NotBlank
	@OpenApiField(desc = "缴费类型",
			constraint = "{\"data\":[\"000010:水费\",\"000020:燃气费\",\"000030:电费\",\"000040:手机话费\",\"000050:有线电视基本费\",\"000060:垃圾费\",\"000070:固定电话费\",\"000080:宽带网络费\",\"000090:有线电视互动费\"],\"name\":\"缴费类型\"}",
			demo = "000010")
	private String paymentType;

	@NotBlank
	@OpenApiField(desc = "缴费时间戳", demo = "20130806110742")
	private String paymentTimeStamp;

	@OpenApiField(desc = "用户姓名", demo = "用户姓名")
	private String username;

	@OpenApiField(desc = "省", demo = "河南")
	private String province;

	@OpenApiField(desc = "市", demo = "深圳")
	private String city;

	@Length(min = 20, max = 20, message = "操作员ID长度不正确")
	@OpenApiField(desc = "操作员ID", demo = "201556321196571385")
	private String operatorId;

	@OpenApiField(desc = "操作人", demo = "201556321196571385")
	private String operatorName;

	@OpenApiField(desc = "错误通知地址", demo = "http://www.oschina.net")
	private String errorNotifyUrl;

	@NotBlank
	@Length(min = 5, max = 20)
	@OpenApiField(desc = "合作伙伴订单号", demo = "201556321196571385")
	private String outBizNo;

	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "购买者会员号", demo = "201556321196571385")
	private String buyerUserId;

	@OpenApiField(desc = "购买者真实姓名", demo = "法海")
	private String buyerUserRealName;

	@Length(min = 20, max = 20)
	@OpenApiField(desc = "支付者会员号", demo = "201556321196571385")
	private String payUserId;

	@Length(min = 20, max = 20)
	@OpenApiField(desc = "平台商会员号", demo = "201556321196571385")
	private String merchantUserId;

	public Map<String, String> getOrderSupport() {
		return this.orderSupport;
	}

	public void setOrderSupport(Map<String, String> orderSupport) {
		this.orderSupport = orderSupport;
	}

	public String getBillType() {
		return this.billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Money getPaymentAmount() {
		return this.paymentAmount;
	}

	public void setPaymentAmount(Money paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public List<PaymentOrderItemApiInfo> getPaymentOrderItemList() {
		return this.paymentOrderItemList;
	}

	public void setPaymentOrderItemList(List<PaymentOrderItemApiInfo> paymentOrderItemList) {
		this.paymentOrderItemList = paymentOrderItemList;
	}

	public String getPaymentModel() {
		return this.paymentModel;
	}

	public void setPaymentModel(String paymentModel) {
		this.paymentModel = paymentModel;
	}

	public Money getPayable() {
		return this.payable;
	}

	public void setPayable(Money payable) {
		this.payable = payable;
	}

	public String getAgencyCode() {
		return this.agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentTimeStamp() {
		return this.paymentTimeStamp;
	}

	public void setPaymentTimeStamp(String paymentTimeStamp) {
		this.paymentTimeStamp = paymentTimeStamp;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getErrorNotifyUrl() {
		return this.errorNotifyUrl;
	}

	public void setErrorNotifyUrl(String errorNotifyUrl) {
		this.errorNotifyUrl = errorNotifyUrl;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getBuyerUserRealName() {
		return this.buyerUserRealName;
	}

	public void setBuyerUserRealName(String buyerUserRealName) {
		this.buyerUserRealName = buyerUserRealName;
	}

	public String getPayUserId() {
		return this.payUserId;
	}

	public void setPayUserId(String payUserId) {
		this.payUserId = payUserId;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

}
