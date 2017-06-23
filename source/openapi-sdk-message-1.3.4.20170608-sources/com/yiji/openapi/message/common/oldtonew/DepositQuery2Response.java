/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月28日 下午5:54:53 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.message.common.oldtonew.info.ErrCodeContext;
import com.yiji.openapi.message.common.oldtonew.info.OpenApiQueryDepositInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

import java.util.*;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月28日
 */
@OpenApiMessage(service = "deposit.query", type = ApiMessageType.Response)
public class DepositQuery2Response extends ApiResponse{
	
	/** 当前页 */
	@OpenApiField(desc="当前页 ",constraint="当前页 ",demo="1")
	private int currPage;
	
	/** 总记录数 */
	@OpenApiField(desc="总记录数",constraint="总记录数 ",demo="100")
	private long count;
	
	/** 本金总金额 */
	@OpenApiField(desc="本金总金额",constraint="本金总金额 ",demo="6666.66")
	private Money amounts;
	
	/** 总金额 本金+手续费 */
	@OpenApiField(desc="总金额 本金+手续费",constraint="总金额 本金+手续费",demo="6666.66")
	private Money amountsIn;
	
	/** 手续费总金额 */
	@OpenApiField(desc="手续费总金额",constraint="手续费总金额",demo="6666.66")
	private Money charges;
	
	@OpenApiField(desc="充值信息",constraint="充值信息",demo="")
	private List<OpenApiQueryDepositInfo> depositInfos = new ArrayList<OpenApiQueryDepositInfo>();
	
	@OpenApiField(desc="同步异步方式",constraint="key取自PayKeyFacadeContext.RESULT_SYNC_FLAG],Y同步,异步",demo="[Y=同步]")
	protected Map<String, Object> resultCtx = new HashMap<String, Object>();
	
	/** 结果状态 */
	@OpenApiField(desc="结果状态",constraint="结果状态",demo="SUCCESS")
	protected String status;
	
	/** 结果二级码 业务结果具体描述 */
	@OpenApiField(desc="结果二级码 业务结果具体描述",constraint="结果二级码 业务结果具体描述态",demo="\"errCodeCtx\":{\"message\":\"\",\"memo\":\"\",\"code\":\"\"}")
	protected ErrCodeContext errCodeCtx = new ErrCodeContext();
	
	/** 参数map */
	@OpenApiField(desc="参数map",constraint="参数map",demo="\"params\" : {}")
	protected Map<Object, Object> params = new LinkedHashMap<Object, Object>();

	@OpenApiField(desc="错误码改造-兼容性参数",constraint="错误码改造-兼容性参数",demo="充值记录查询成功")
	private String message;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ErrCodeContext getErrCodeCtx() {
		return this.errCodeCtx;
	}

	public void setErrCodeCtx(ErrCodeContext errCodeCtx) {
		this.errCodeCtx = errCodeCtx;
	}

	public Map<Object, Object> getParams() {
		return this.params;
	}

	public void setParams(Map<Object, Object> params) {
		this.params = params;
	}

	public Map<String, Object> getResultCtx() {
		return this.resultCtx;
	}

	public void setResultCtx(Map<String, Object> resultCtx) {
		this.resultCtx = resultCtx;
	}

	public int getCurrPage() {
		return this.currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public long getCount() {
		return this.count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Money getAmounts() {
		return this.amounts;
	}

	public void setAmounts(Money amounts) {
		this.amounts = amounts;
	}

	public Money getAmountsIn() {
		return this.amountsIn;
	}

	public void setAmountsIn(Money amountsIn) {
		this.amountsIn = amountsIn;
	}

	public Money getCharges() {
		return this.charges;
	}

	public void setCharges(Money charges) {
		this.charges = charges;
	}

	public List<OpenApiQueryDepositInfo> getDepositInfos() {
		return this.depositInfos;
	}

	public void setDepositInfos(List<OpenApiQueryDepositInfo> depositInfos) {
		this.depositInfos = depositInfos;
	}
}

    