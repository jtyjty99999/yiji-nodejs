package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/15.
 */
@OpenApiMessage(service = "", type = ApiMessageType.Response)
public class ChargeCodeByPartnerIdResponse extends ApiResponse {
	
	private int totalCount;
	
	private int totalPageCount;
	
	private int currentPageNo;
	
	private List<?> recordsList;
	
	public int getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public int getTotalPageCount() {
		return totalPageCount;
	}
	
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	
	public List<?> getRecordsList() {
		return recordsList;
	}
	
	public void setRecordsList(List<?> recordsList) {
		this.recordsList = recordsList;
	}
}
