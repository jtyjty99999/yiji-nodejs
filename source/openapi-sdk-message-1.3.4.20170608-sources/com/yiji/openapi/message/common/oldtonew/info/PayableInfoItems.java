package com.yiji.openapi.message.common.oldtonew.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-18 18:14.
 */
public class PayableInfoItems {
    /** 业务名称 */
    @OpenApiField(desc = "业务名称",demo = "交易")
    private String				name;

    /** 数量 */
    @OpenApiField(desc = "数量",demo = "4")
    private String				count;

    /** 应付款  （已包含滞纳金）*/
    @OpenApiField(desc = "应付款",demo = "88.66",constraint = "已包含滞纳金")
    private Money payables;

    /** 滞纳金 */
    @OpenApiField(desc = "滞纳金",demo = "88.66")
    private Money				charge;

    @OpenApiField(desc = "类型",demo = "trade")
    private String				type;

    @OpenApiField(desc = "月份",demo = "4")
    private String				month;

    /** 缴费渠道号，缴费时传入此号，以保证查询与缴费所用的渠道为同一个 */
    @OpenApiField(desc = "缴费渠道号",demo = "api")
    private String				channelCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Money getPayables() {
        return payables;
    }

    public void setPayables(Money payables) {
        this.payables = payables;
    }

    public Money getCharge() {
        return charge;
    }

    public void setCharge(Money charge) {
        this.charge = charge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
}
