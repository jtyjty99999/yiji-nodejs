/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:36:31 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class SpecificationInfo {

	// 规格id
	@NotNull
	private Long specId;
	// 规格名称
	private String specName;
	// 规格值，查询商品基础信息时，返回多个值。查询商品详细信息时，传入和返回都只有一个值
	@NotEmpty
	private List<String> specValues;
	
	public Long getSpecId() {
		return this.specId;
	}
	
	public void setSpecId(Long specId) {
		this.specId = specId;
	}
	
	public String getSpecName() {
		return this.specName;
	}
	
	public void setSpecName(String specName) {
		this.specName = specName;
	}
	
	public List<String> getSpecValues() {
		return this.specValues;
	}
	
	public void setSpecValues(List<String> specValues) {
		this.specValues = specValues;
	}
}

    