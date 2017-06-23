package com.yiji.openapi.message.common.oldtonew;

import java.util.ArrayList;
import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.QueryWithdrawInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-26<br>
 */
@OpenApiMessage(service = "withdraw.query", type = ApiMessageType.Response)
public class WithdrawQueryResponse extends ApiResponse {

	@OpenApiField(desc = "当前页", demo = "1")
	private int currPage;

	@OpenApiField(desc = "总记录数", demo = "100")
	private long count;

	@OpenApiField(desc = "本金总金额", demo = "1000.00")
	private Money amounts;

	@OpenApiField(desc = "总金额 本金+手续费", demo = "1001.00")
	private Money amountsIn;

	@OpenApiField(desc = "手续费总金额", demo = "1.00")
	private Money charges;

	@OpenApiField(desc = "提现记录", demo = "xxx")
	private List<QueryWithdrawInfo> withdrawInfos = new ArrayList<QueryWithdrawInfo>();

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Money getAmounts() {
		return amounts;
	}

	public void setAmounts(Money amounts) {
		this.amounts = amounts;
	}

	public Money getAmountsIn() {
		return amountsIn;
	}

	public void setAmountsIn(Money amountsIn) {
		this.amountsIn = amountsIn;
	}

	public Money getCharges() {
		return charges;
	}

	public void setCharges(Money charges) {
		this.charges = charges;
	}

	public List<QueryWithdrawInfo> getWithdrawInfos() {
		return withdrawInfos;
	}

	public void setWithdrawInfos(List<QueryWithdrawInfo> withdrawInfos) {
		this.withdrawInfos = withdrawInfos;
	}
}
