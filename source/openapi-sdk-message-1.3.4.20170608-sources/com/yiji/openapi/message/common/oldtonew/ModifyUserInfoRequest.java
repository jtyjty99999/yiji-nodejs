package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by tyongfu@yiji.com on 2016/1/22.
 */
@Deprecated
@OpenApiMessage(service = "modifyUserInfo", type = ApiMessageType.Request)
public class ModifyUserInfoRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(constraint = "只能为20位", desc = "会员ID", demo = "20160122001111111111")
	private String userId;
	
	@OpenApiField(constraint = "用户名", desc = "用户名", demo = "zhangsan@126.com")
	@Length(max = 128)
	private String userName;
	
	@OpenApiField(constraint = "真实姓名", desc = "真实姓名", demo = "张三")
	@Length(max = 50)
	private String realName;
	
	@OpenApiField(constraint = "电子邮箱", desc = "电子邮箱", demo = "zhangsan@yiji.com")
	@Length(max = 50)
	private String email;
	
	@OpenApiField(constraint = "国家", desc = "国籍", demo = "中国")
	@Length(max = 50)
	private String country;
	
	@OpenApiField(constraint = "省份", desc = "省份", demo = "重庆")
	private String province;
	
	@OpenApiField(constraint = "城市", desc = "城市", demo = "重庆市")
	private String city;
	
	@OpenApiField(constraint = "详细地址", desc = "详细地址", demo = "两江新区")
	private String address;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
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
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
