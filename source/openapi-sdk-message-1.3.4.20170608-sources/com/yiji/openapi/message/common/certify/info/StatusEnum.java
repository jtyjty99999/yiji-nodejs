/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-28 10:55 创建
 *
 */
package com.yiji.openapi.message.common.certify.info;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiyang@yiji.com
 */
public enum StatusEnum {
	
	/** 未认证 */
	NOA("NOA", "未认证"),
	
	/** 认证中 */
	AUT("AUT", "认证中"),
	
	/** 认证通过 */
	ATP("ATP", "认证通过"),
	
	/** 认证失败 */
	ATN("ATN", "认证失败"),
	
	/** 升级失败 */
	UPF("UPF", "升级失败"),
	
	/** 更新有效期失败 */
	UCF("UCF", "更新有效期失败"),
	
	/** 更新有效期成功 */
	UCS("UCS", "更新有效期成功");
	
	/** 枚举值 */
	private final String code;
	
	/** 枚举描述 */
	private final String message;
	
	/**
	 * 构造一个<code>StatusEnum</code>枚举对象
	 *
	 * @param code
	 * @param message
	 */
	private StatusEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String code() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String message() {
		return message;
	}
	
	/**
	 * 通过枚举<code>code</code>获得枚举
	 *
	 * @param code
	 * @return StatusEnum
	 */
	public static StatusEnum getByCode(String code) {
		for (StatusEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 *
	 * @return List<StatusEnum>
	 */
	public List<StatusEnum> getAllEnum() {
		List<StatusEnum> list = new ArrayList<StatusEnum>();
		for (StatusEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 *
	 * @return List<String>
	 */
	public List<String> getAllEnumCode() {
		List<String> list = new ArrayList<String>();
		for (StatusEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
}