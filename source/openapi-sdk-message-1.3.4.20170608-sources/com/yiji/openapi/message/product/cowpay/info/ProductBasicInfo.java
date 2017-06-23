/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:35:58 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import java.util.List;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class ProductBasicInfo extends ProductOverviewInfo{
	// 所有规格id，名称及规格值
		private List<SpecificationInfo> specifications;
		// 起订数量(默认为 1)
		private int moq = 1;
		
		public List<SpecificationInfo> getSpecifications() {
			return this.specifications;
		}
		
		public void setSpecifications(List<SpecificationInfo> specifications) {
			this.specifications = specifications;
		}
		
		public int getMoq() {
			return this.moq;
		}
		
		public void setMoq(int moq) {
			this.moq = moq;
		}
}

    