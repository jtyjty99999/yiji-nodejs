package com.yiji.openapi.message.common.oldtonew.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-03 16:51.
 */
public class ApiAirTicketDetail {
    /** 外部订单明细编号(海渝订单明细编号) */
    @NotEmpty(message = "外部订单明细编号不能为空")
    @Length(max = 20, message = "外部订单明细编号长度不正确,不能超过20位")
    @OpenApiField(desc = "外部订单明细编号",demo = "132401681235")
    private String easyLifeOutOrderDetailNo;

    /** 商品价格 */
    @NotNull(message = "商品价格不能为空")
    @OpenApiField(desc = "商品价格",demo = "88.66")
    private Money productAmount;

    /** 诚意金 */
    @OpenApiField(desc = "诚意金",demo = "88.66")
    private Money warrantAmount;

    /** 支付金额（跟商品价格一致） */
    @NotNull(message = "支付金额不能为空")
    @OpenApiField(desc = "支付金额",demo = "88.66")
    private Money payAmount;

    /** 支付价格基数 */
    @NotNull(message = "支付价格基数不能为空")
    @OpenApiField(desc = "支付价格基数",demo = "88.66")
    private Money baseAmount;

    /** 详情(乘机人、承运人、航班号、航程、起降时间) */
    @NotEmpty(message = "详情不能为空")
    @Length(max = 2000, message = "详情长度不正确,长度不能超过2000")
    @OpenApiField(desc = "订单详情",demo = "订单详情")
    private String orderDetailDesc;

    public String checkExt() {
        String errorMessage = "";

        if (productAmount.compareTo(Money.zero()) < 1) {
            errorMessage = "商品价格必须大于0";
        }

        if (payAmount.compareTo(Money.zero()) < 1) {
            errorMessage = "支付金额必须大于0";
        }

        if (baseAmount.compareTo(Money.zero()) < 1) {
            errorMessage = "支付价格基数必须大于0";
        }

        return errorMessage;
    }

    public String getEasyLifeOutOrderDetailNo() {
        return easyLifeOutOrderDetailNo;
    }

    public void setEasyLifeOutOrderDetailNo(String easyLifeOutOrderDetailNo) {
        this.easyLifeOutOrderDetailNo = easyLifeOutOrderDetailNo;
    }

    public Money getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Money productAmount) {
        this.productAmount = productAmount;
    }

    public Money getWarrantAmount() {
        return warrantAmount;
    }

    public void setWarrantAmount(Money warrantAmount) {
        this.warrantAmount = warrantAmount;
    }

    public Money getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    public Money getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(Money baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getOrderDetailDesc() {
        return orderDetailDesc;
    }

    public void setOrderDetailDesc(String orderDetailDesc) {
        this.orderDetailDesc = orderDetailDesc;
    }
}
