package com.yiji.openapi.message.product.yxt;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;


/**
 * @author hgeshu@yiji.com
 * @since 2015-10-10 17:52.
 */
@OpenApiMessage(service = "yxtQuicklyRemittance", type = ApiMessageType.Notify)
public class YxtQuicklyRemittanceNotify extends ApiNotify {

    @OpenApiField(desc = "代发金额",demo = "88.66")
    private Money amount;

    @OpenApiField(desc = "商户订单号",demo = "123456789132")
    private String outOrderNo;

    @OpenApiField(desc = "签约合同号",demo = "132546798312")
    private String contractNo;

    @OpenApiField(desc = "手续费",demo = "88.66")
    private Money chargeAmount;

    @OpenApiField(desc = "客户真实姓名",demo = "易极付")
    private String realName;

    /**
     * 银行编码
     */
    @NotEmpty
    @OpenApiField(desc = "银行编码",demo = "ABC")
    private String bankCode;

    /**
     * 银行卡号
     */
    @NotEmpty
    @OpenApiField(desc = "银行卡号",demo = "31264578931245612")
    private String bankCardNo;

    @OpenApiField(desc = "状态",constraint = "REMITTANCE_DEALING：代发处理中</br>REMITTANCE_FAIL：代发失败</br>REMITTANCE_SUCCESS：代发成功</br>",demo = "")
    private String status;

    @OpenApiField(desc = "备注",demo = "备注")
    private String memo;

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Money getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Money chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
