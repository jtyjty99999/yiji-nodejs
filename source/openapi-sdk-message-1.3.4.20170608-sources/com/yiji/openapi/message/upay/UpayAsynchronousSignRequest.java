/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-04 15:06 创建
 *
 */
package com.yiji.openapi.message.upay;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "upayAsynchronousSign", type = ApiMessageType.Request)
public class UpayAsynchronousSignRequest extends ApiRequest {
	/**
	 * 用户编号
	 */
	@OpenApiField(desc = "用户编号", constraint = "用户编号")
	protected String userId;
	/**
	 * 用户名
	 */
	@Size(min = 6, max = 32, message = "用户名长度为6-32字节")
	@OpenApiField(desc = "用户名", constraint = "用户名")
	protected String userName;
	/**
	 * [必填]真实姓名
	 */
	@Size(min = 1, max = 16, message = "真实姓名长度为1-16字节")
	@OpenApiField(desc = "真实姓名", constraint = "真实姓名")
	protected String realName;
	/**
	 * 性别
	 */
	@OpenApiField(desc = "性别", constraint = "性别")
	protected String gender;
	/**
	 * [必填]身份证号码
	 */
	@Size(min = 15, max = 18, message = "身份证号码必须为15-18位")
	@OpenApiField(desc = "身份证号码", constraint = "身份证号码")
	protected String idCard;
	/**
	 * [必填]身份证到期日(yyyyMMdd),默认，长期（1972年12月12日）
	 */
	@Size(min = 8, max = 8, message = "日期长度为8位")
	@OpenApiField(desc = "身份证到期日", constraint = "身份证到期日(格式yyyyMMdd)，默认长期（1972年12月12日）")
	protected String validity = "19721212";
	/**
	 * [必填]手机号码
	 */
	@NotBlank
	@OpenApiField(desc = "手机号码", constraint = "手机号码")
	protected String mobileNo;
	/**
	 * [必填]国籍
	 */
	@Size(min = 3)
	@OpenApiField(desc = "国籍", constraint = "国籍")
	protected String country;
	/**
	 * [必填]职业
	 */
	@Size(min = 2)
	@OpenApiField(desc = "职业", constraint = "职业")
	protected String profession;
	/**
	 * 地址
	 */
	@Size(min = 10)
	@OpenApiField(desc = "地址", constraint = "地址")
	protected String address;
	/**
	 * 银行编码
	 */
	@OpenApiField(desc = "银行编码", constraint = "银行编码")
	protected String bankCode;
	/**
	 * 银行名称
	 */
	@OpenApiField(desc = "银行名称", constraint = "银行名称")
	protected String bankName;
	/**
	 * [必填]银行卡号
	 */
	@NotBlank
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号")
	protected String bankCard;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getIdCard() {
		return idCard;
	}
	
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	public String getValidity() {
		return validity;
	}
	
	public void setValidity(String validity) {
		this.validity = validity;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCard() {
		return bankCard;
	}
	
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
}
