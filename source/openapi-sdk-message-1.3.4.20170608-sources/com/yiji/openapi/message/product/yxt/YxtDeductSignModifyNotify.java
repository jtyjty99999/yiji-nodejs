package com.yiji.openapi.message.product.yxt;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月22日
 */
@OpenApiMessage(service = "yxtDeductSignModify", type = ApiMessageType.Notify)
public class YxtDeductSignModifyNotify extends ApiNotify {
	
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "代扣合同号")
	private String withholdContractNo;
	
	@OpenApiField(desc = "备注")
	private String memo;
	
	@OpenApiField(desc = "修改签约状态")
	private String status;
	
	@OpenApiField(desc = "操作类型")
	private String operateType;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getWithholdContractNo() {
		return withholdContractNo;
	}
	
	public void setWithholdContractNo(String withholdContractNo) {
		this.withholdContractNo = withholdContractNo;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getOperateType() {
		return this.operateType;
	}
	
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
}
