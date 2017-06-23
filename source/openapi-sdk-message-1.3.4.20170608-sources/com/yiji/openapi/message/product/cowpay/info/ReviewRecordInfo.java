/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:21:34 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class ReviewRecordInfo extends PaymentOrderInfo{
	private static final long serialVersionUID = 1L;

	/**
	 * 审核记录ID
	 */
	private Long reviewId;
	
	/**
	 * 审核记录状态
	 */
	private Integer reviewStatus;
	
	/**
	 * 审核记录状态描述
	 */
	private String reviewStatusDescribe;
	
	/**
	 * 审核人ID
	 */
	private String reviewUserId;
	
	/**
	 * 审核人操作员ID
	 */
	private String reviewOperatorId;
	
	/**
	 * 审核人名字
	 */
	private String reviewUserName;
	
	/**
	 * 审核描述
	 */
	private String reviewMemo;
	
	/**
	 * 审核时间
	 */
	private String reviewTime;
	
	public Long getReviewId() {
		return reviewId;
	}
	
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	
	public Integer getReviewStatus() {
		return reviewStatus;
	}
	
	public void setReviewStatus(Integer reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	
	public String getReviewStatusDescribe() {
		return reviewStatusDescribe;
	}
	
	public void setReviewStatusDescribe(String reviewStatusDescribe) {
		this.reviewStatusDescribe = reviewStatusDescribe;
	}
	
	public String getReviewUserId() {
		return reviewUserId;
	}
	
	public void setReviewUserId(String reviewUserId) {
		this.reviewUserId = reviewUserId;
	}
	
	public String getReviewOperatorId() {
		return reviewOperatorId;
	}
	
	public void setReviewOperatorId(String reviewOperatorId) {
		this.reviewOperatorId = reviewOperatorId;
	}
	
	public String getReviewUserName() {
		return reviewUserName;
	}
	
	public void setReviewUserName(String reviewUserName) {
		this.reviewUserName = reviewUserName;
	}
	
	public String getReviewMemo() {
		return reviewMemo;
	}
	
	public void setReviewMemo(String reviewMemo) {
		this.reviewMemo = reviewMemo;
	}
	
	public String getReviewTime() {
		return reviewTime;
	}
	
	public void setReviewTime(String reviewTime) {
		this.reviewTime = reviewTime;
	}
}

    