package com.yiji.openapi.message.common.installment.info;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2015-11-26 18:19.
 */
public class InstallmentScheduleList {
    @OpenApiField(desc = "期数",demo = "5")
    private int time;

    @OpenApiField(desc = "还款总金额",demo = "88.66")
    private Money repayAmount;

    @OpenApiField(desc = "本金金额",demo = "88.66")
    private Money capitalAmount;

    @OpenApiField(desc = "利息金额",demo = "88.66")
    private Money interestAmount;

    @OpenApiField(desc = "其他金额",demo = "88.66")
    private Money otherAmount;

    @OpenApiField(desc = "滞纳金金额",demo = "88.66")
    private Money overdueFineAmount;

    @OpenApiField(desc = "预计还款日期",demo = "2015-06-05 12:12:12")
    private Date expectedRepayDate;

    @OpenApiField(desc = "实际还款时间",demo = "2015-06-05 12:12:12")
    private Date realRepayTime;

    @OpenApiField(desc = "还款状态",demo = "REPAY_SUCCESS")
    private String status;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Money getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(Money repayAmount) {
        this.repayAmount = repayAmount;
    }

    public Money getCapitalAmount() {
        return capitalAmount;
    }

    public void setCapitalAmount(Money capitalAmount) {
        this.capitalAmount = capitalAmount;
    }

    public Money getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Money interestAmount) {
        this.interestAmount = interestAmount;
    }

    public Money getOtherAmount() {
        return otherAmount;
    }

    public void setOtherAmount(Money otherAmount) {
        this.otherAmount = otherAmount;
    }

    public Money getOverdueFineAmount() {
        return overdueFineAmount;
    }

    public void setOverdueFineAmount(Money overdueFineAmount) {
        this.overdueFineAmount = overdueFineAmount;
    }

    public Date getExpectedRepayDate() {
        return expectedRepayDate;
    }

    public void setExpectedRepayDate(Date expectedRepayDate) {
        this.expectedRepayDate = expectedRepayDate;
    }

    public Date getRealRepayTime() {
        return realRepayTime;
    }

    public void setRealRepayTime(Date realRepayTime) {
        this.realRepayTime = realRepayTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
