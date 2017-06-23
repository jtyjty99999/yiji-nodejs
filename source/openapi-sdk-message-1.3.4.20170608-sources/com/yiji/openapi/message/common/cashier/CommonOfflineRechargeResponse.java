package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/4 10:24.
 */
@OpenApiMessage(service = "commonOfflineRecharge", type = ApiMessageType.Response)
public class CommonOfflineRechargeResponse extends ApiResponse {

    /** 充值码 */
    @OpenApiField(desc = "充值码",demo = "52156216215634",constraint = "线下充值时必须填写此信息")
    private String depositCode;

    /** 付款总金额 */
    @OpenApiField(desc = "付款总金额",demo = "88.66",constraint = "包含手续费")
    private Money totalAmount;

    /** 收款银行名称 */
    @OpenApiField(desc = "银行名称",demo = "中国银行")
    private String bankName;

    /** 收款银行账号 */
    @OpenApiField(desc = "收款银行账号",demo = "62159584524563",security = true,constraint = "此字段需要解密后才能得到真实值")
    private String yjfCardNo;

    /** 收款银行账户名称 */
    @OpenApiField(desc = "收款银行账户名称",demo = "重庆易极付科技有限公司（客户备付金）",security = true,constraint = "此字段需要解密后才能得到真实值")
    private String yjfCardName;

    public String getDepositCode() {
        return depositCode;
    }

    public void setDepositCode(String depositCode) {
        this.depositCode = depositCode;
    }

    public Money getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Money totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getYjfCardNo() {
        return yjfCardNo;
    }

    public void setYjfCardNo(String yjfCardNo) {
        this.yjfCardNo = yjfCardNo;
    }

    public String getYjfCardName() {
        return yjfCardName;
    }

    public void setYjfCardName(String yjfCardName) {
        this.yjfCardName = yjfCardName;
    }
}
