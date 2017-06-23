package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-16 10:15.
 */
@OpenApiMessage(service = "depositBack", type = ApiMessageType.Notify)
public class DepositBackNotify extends ApiNotify {

    /** 支付流水号 */
    @OpenApiField(desc = "支付流水号",demo = "20160316034053633971")
    private String payNo;

    /** 支付类型 */
    @OpenApiField(desc = "支付类型",demo = "DEPOSITBACK")
    private String payType;

    /** 支付金额 */
    @OpenApiField(desc = "支付金额",demo = "8.66")
    private Money amount;

    /** 账期 */
    @OpenApiField(desc = "账期",demo = "20160316",constraint = "格式：YYYY-MM-DD")
    private String accountDay;

    /** 业务请求者身份标识码 */
    @OpenApiField(desc = "业务请求者身份标识",demo = "SPECIAL_MERCHANT")
    private String bizIdentity;

    /** 外部业务单据号，属于产品码所对应的业务流水号 */
    @OpenApiField(desc = "外部订单号",demo = "2016031600000179")
    private String outBizNo;

    /** 结果二级码 业务结果具体描述 */
    @OpenApiField(desc = "错误编码",demo = "error")
    protected String errCodeCtxCode;

    @OpenApiField(desc = "错误描述",demo = "error")
    private String errCodeCtxMessage;

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(String accountDay) {
        this.accountDay = accountDay;
    }

    public String getBizIdentity() {
        return bizIdentity;
    }

    public void setBizIdentity(String bizIdentity) {
        this.bizIdentity = bizIdentity;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getErrCodeCtxCode() {
        return errCodeCtxCode;
    }

    public void setErrCodeCtxCode(String errCodeCtxCode) {
        this.errCodeCtxCode = errCodeCtxCode;
    }

    public String getErrCodeCtxMessage() {
        return errCodeCtxMessage;
    }

    public void setErrCodeCtxMessage(String errCodeCtxMessage) {
        this.errCodeCtxMessage = errCodeCtxMessage;
    }
}
