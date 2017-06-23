/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午11:12:37 创建
*/

package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */

public class PaymentNGResultApiInfo implements Serializable {

	private static final long serialVersionUID = -2595590148414618722L;

	@OpenApiField(desc = "缴费项流水号", demo = "12345679809876543210")
	private String itemNo;

	@OpenApiField(desc = "缴费项外部流水号", demo = "12345679809876543210")
	private String itemOutSerialNo;

	@OpenApiField(desc = "缴费结果状态 ", demo = "SUCCESS")
	private String status;

	@OpenApiField(desc = "结果码", demo = "TRADE_CREATE_FAIL")
	private String resultCode;

	@OpenApiField(desc = "机构编码", demo = "12345")
	private String agencyCode;

	@OpenApiField(desc = "用户编码", demo = "20151111111111111111")
	private String userCode;

	@OpenApiField(desc = "用户姓名", demo = "法海")
	private String username;

	@OpenApiField(desc = "用户地址", demo = "西湖")
	private String address;

	@OpenApiField(desc = "如果缴费状态不正常的错误信息", demo = "渠道不存在")
	private String memo;

	@OpenApiField(desc = "缴费金额", demo = "1.11")
	private Money money;

	@OpenApiField(desc = "数量", demo = "11")
	private String count;

	@OpenApiField(desc = "开始数量", demo = "11")
	private String startCount;

	@OpenApiField(desc = "结束数量", demo = "11")
	private String endCount;

	@OpenApiField(desc = "业务名称", demo = "水电费")
	private String bizName;

	@OpenApiField(desc = "滞纳金", demo = "1.11")
	private Money charge;

	@OpenApiField(desc = "单价", demo = "1.11")
	private Money price;

	@OpenApiField(desc = "月份", demo = "11")
	private String month;

	@OpenApiField(desc = "错误信息 ", demo = "渠道不存在")
	private String errorMessage;

	@OpenApiField(desc = "缴费类型 ", demo = "")
	private String type;

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemOutSerialNo() {
		return this.itemOutSerialNo;
	}

	public void setItemOutSerialNo(String itemOutSerialNo) {
		this.itemOutSerialNo = itemOutSerialNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Money getMoney() {
		return this.money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public String getCount() {
		return this.count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getStartCount() {
		return this.startCount;
	}

	public void setStartCount(String startCount) {
		this.startCount = startCount;
	}

	public String getEndCount() {
		return this.endCount;
	}

	public void setEndCount(String endCount) {
		this.endCount = endCount;
	}

	public String getBizName() {
		return this.bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public Money getCharge() {
		return this.charge;
	}

	public void setCharge(Money charge) {
		this.charge = charge;
	}

	public Money getPrice() {
		return this.price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
