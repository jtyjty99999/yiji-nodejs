/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:50:39 创建
 */
package com.yiji.openapi.message.product.easyexchange.infos;

import org.hibernate.validator.constraints.NotBlank;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class LogisticInfo {
	/** 物流机构 */
	@NotBlank
	private String logisticsCompany;
	
	/** 运输单号 */
	@NotBlank
	private String transportNumber;
	
	/** 外部订单号 */
	private String outOrderNo;

	/** 收货人姓名 */
	@NotBlank
	private String consigneeName ;
	
	/**收货人地址*/
	@NotBlank
    private String consigneeAddress;
    
    /**收货人联系方式*/
    private String consigneeContact;
	
	public String getConsigneeAddress() {
		return consigneeAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}
	public String getConsigneeContact() {
		return consigneeContact;
	}

	public void setConsigneeContact(String consigneeContact) {
		this.consigneeContact = consigneeContact;
	}
	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}


	public String getLogisticsCompany() {
		return logisticsCompany;
	}


	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}


	public String getTransportNumber() {
		return transportNumber;
	}


	public void setTransportNumber(String transportNumber) {
		this.transportNumber = transportNumber;
	}


	public String getOutOrderNo() {
		return outOrderNo;
	}


	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}

    