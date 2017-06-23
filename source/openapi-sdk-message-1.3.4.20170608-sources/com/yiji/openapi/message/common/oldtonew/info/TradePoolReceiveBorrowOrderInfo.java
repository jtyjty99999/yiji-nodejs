package com.yiji.openapi.message.common.oldtonew.info;

import java.util.ArrayList;
import java.util.List;

/**
 * 易周转流标付款跳转收银台转化order,防止json转化时候money出现异常
 * 
 * @Filename TradePoolReceiveBorrowOrderInfo.java
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
public class TradePoolReceiveBorrowOrderInfo {
	
	/** Comment for <code>serialVersionUID</code> */

	List<TradePoolSubTansferInfo> tradePoolSubTansferOrders = new ArrayList<TradePoolSubTansferInfo>();
	
	public List<TradePoolSubTansferInfo> getTradePoolSubTansferOrders() {
		return tradePoolSubTansferOrders;
	}
	
	public void setTradePoolSubTansferOrders(List<TradePoolSubTansferInfo> tradePoolSubTansferOrders) {
		this.tradePoolSubTansferOrders = tradePoolSubTansferOrders;
	}
	
}
