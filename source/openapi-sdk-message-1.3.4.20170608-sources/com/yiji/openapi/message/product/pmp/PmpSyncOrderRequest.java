package com.yiji.openapi.message.product.pmp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-13 17:12.
 */
@OpenApiMessage(service = "pmpSyncOrder", type = ApiMessageType.Request)
public class PmpSyncOrderRequest extends ApiRequest {
    @NotBlank
    @Size( max = 20)
    @OpenApiField(desc = "商户订单号", constraint = "订单号不超过20字节",demo = "31256478901234567890")
    private String outOrderId;

    @NotBlank
    @OpenApiField(desc = "交易类型", constraint = "TR：消费交易<br>CA：交易取消<br>RE：退货",demo = "CA")
    private String transType;

    @NotBlank
    @Size( max = 512,message = "长度不超过512字节")
    @OpenApiField(desc = "终端号", constraint = "支持多个终端号，用“,”隔开",demo = "POS213456")
    private String terminalId;

    @NotNull
    @OpenApiField(desc = "交易金额",demo = "88.66")
    private Money amount;

    @NotBlank
    @Size(max = 20)
    @OpenApiField(desc = "银联商户号",demo = "2134568791234")
    private String merchantId;

    @Size(max = 32)
    @OpenApiField(desc = "用户名",demo = "POSPMP")
    private String userName;

    @Size(max = 512)
    @OpenApiField(desc = "备注",demo = "订单同步")
    private String memo;

    @NotBlank
    @Size( max = 20,message = "标识必须小于20字节")
    @OpenApiField(desc = "机构介入识别标识",demo = "pmp")
    private String orgAccId;
    
    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOrgAccId() {
        return orgAccId;
    }

    public void setOrgAccId(String orgAccId) {
        this.orgAccId = orgAccId;
    }
}
