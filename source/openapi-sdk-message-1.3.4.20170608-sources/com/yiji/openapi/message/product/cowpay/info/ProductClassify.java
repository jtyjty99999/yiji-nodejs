/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:38:04 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import java.util.List;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月9日
 */

public class ProductClassify {
	// 分类id
	private Long id;
	// 所属供应商
	private String providerUserId;
	// 分类名称
	private String name;
	// 父分类
	private ProductClassify parent;
	// 子分类
	private List<ProductClassify> children;
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getProviderUserId() {
		return this.providerUserId;
	}
	
	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ProductClassify getParent() {
		return this.parent;
	}
	
	public void setParent(ProductClassify parent) {
		this.parent = parent;
	}
	
	public List<ProductClassify> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<ProductClassify> children) {
		this.children = children;
	}
}
