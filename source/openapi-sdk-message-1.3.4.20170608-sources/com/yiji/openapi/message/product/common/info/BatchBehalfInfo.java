package com.yiji.openapi.message.product.common.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/10/31 11:49.
 */
public class BatchBehalfInfo {
    /**
     * 子订单号
     */
    @NotBlank
    @Length(max = 64)
    @OpenApiField(desc = "商户子业务订单号",demo = "13246515681265")
    private String subMerchOrderNo;

    /**
     * 金额
     */
    @NotNull
    @OpenApiField(desc = "金额",demo = "88.66")
    private Money amount;

    /**
     * 备注
     */
    @NotBlank
    @Length(max = 500)
    @OpenApiField(desc = "备注",demo = "子订单备注")
    private String memo;

    /**
     * 户主姓名
     */
    @NotBlank
    @Length(max = 64)
    @OpenApiField(desc = "户主真实姓名",demo = "张三")
    private String realName;

    /**
     * 银行账号
     */
    @NotBlank
    @Length(max = 35)
    @OpenApiField(desc = "银行账号",demo = "6215486595148526")
    private String cardNo;

    public String getSubMerchOrderNo() {
        return subMerchOrderNo;
    }

    public void setSubMerchOrderNo(String subMerchOrderNo) {
        this.subMerchOrderNo = subMerchOrderNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
