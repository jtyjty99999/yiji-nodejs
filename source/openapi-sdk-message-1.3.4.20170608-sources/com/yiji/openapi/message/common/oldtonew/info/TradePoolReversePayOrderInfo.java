package com.yiji.openapi.message.common.oldtonew.info;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 易周转还款跳转收银台转化order,防止json转化时候money出现
 * 
 * @Filename TradePoolReversePayOrderInfo.java
 *
 * @Description
 *
 * @Version 1.0
 *
 * @Author zhangshuai
 *
 * @Email zhangshuai@yiji.com
 * 
 * @History <li>Author: zhangshuai</li> <li>Date: 2013-11-20</li> <li>Version:
 * 1.0</li> <li>Content: create</li>
 *
 */
public class TradePoolReversePayOrderInfo {
	
	/** Comment for <code>serialVersionUID</code> */
	
	List<TradePoolSubTansferInfo> subOrders = new ArrayList<TradePoolSubTansferInfo>();
	
	public List<TradePoolSubTansferInfo> getSubOrders() {
		return subOrders;
	}
	
	public void setSubOrders(List<TradePoolSubTansferInfo> subOrders) {
		this.subOrders = subOrders;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
}
