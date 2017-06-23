/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.yiji.openapi.message.common.query.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @Filename TradeTypeEnum.java
 * @Description 交易类型
 * @Version 1.0
 * @Author tangwei
 * @Email tangwei@yiji.com
 * @History <li>Author: tangwei</li> <li>Date: 2012-8-30</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public enum TradeTypeEnum {

	/**
	 * 担保交易
	 */
	ESCROWTRADE("ESCROWTRADE", "担保交易"),

	/**
	 * 即时到账交易
	 */
	FASTPAYTRADE("FASTPAYTRADE", "即时到账交易"),

	/**
	 * 集资借款
	 */
	POOL("POOL", "集资借款"),

	/**
	 * 集资还款
	 */
	POOL_REVERSE("POOL_REVERSE", "集资还款"),

	/**
	 * 给力式集资
	 */
	POOL_TOGETHER("POOL_TOGETHER", "给力式集资"),

	/**
	 * 转账到卡
	 */
	TRANSFERTOBANK("transferTobank", "转账到卡"),

	/**
	 * 卡到卡
	 */
	BANKCARD_TO_BANKCARD("bankcardTransfer", "卡到卡"),

	/**
	 * 代扣充值
	 */
	DEDUCTDEPOISITAL("deductDepoisital", "代扣充值"),

	/**
	 * 站内转帐
	 */
	TRANSFER("transfer", "站内转帐"),

	/**
	 * 代充
	 */
	BEHALF_DEPOISIT("BEHALF_DEPOISIT", "代充"),

	/**
	 * 退款
	 */
	REFUND("REFUND", "退款"),

	/**
	 * 单笔购汇
	 */
	APPLY_PURCHASE("apply_purchase", "单笔购汇"),

	/**
	 * 集中购汇
	 */
	FOCUS_PURCHASE("focus_purchase", "集中购汇"),

	/**
	 * 批量结汇
	 */
	APPLY_SETTLEMENT("apply_settlement", "批量结汇"),

	/**
	 * 其他
	 */
	OTHER("OTHER", "其他");

	/**
	 * 枚举值
	 */
	private final String code;

	/**
	 * 枚举描述
	 */
	private final String message;

	/**
	 * 构造一个<code>LocalCacheEnum</code>枚举对象
	 *
	 * @param code
	 * @param message
	 */
	private TradeTypeEnum(String code, String message) {
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
	 * @return TradeTypeEnum
	 */
	public static TradeTypeEnum getByCode(String code) {
		for (TradeTypeEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}

	/**
	 * 获取全部枚举
	 *
	 * @return List<TradeTypeEnum>
	 */
	public static List<TradeTypeEnum> getAllEnum() {
		List<TradeTypeEnum> list = new ArrayList<TradeTypeEnum>();
		for (TradeTypeEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}

	/**
	 * 获取全部枚举值
	 *
	 * @return List<String>
	 */
	public static List<String> getAllEnumCode() {
		List<String> list = new ArrayList<String>();
		for (TradeTypeEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
}
