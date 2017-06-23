package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.CreatTradeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

import java.util.List;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "commandPayTradeCreatePay", type = ApiMessageType.Response)
public class CommandPayTradeCreatePayResponse extends ApiResponse {

    @OpenApiField(desc = "gid")
    private String gid;

    @OpenApiField(desc = "买家ID")
    private String buyerUserId;

    @OpenApiField(desc = "买家ID")
    private String userId;

    @OpenApiField(desc = "交易号")
    private String bizNo;

    @OpenApiField(desc = "交易号")
    private String tradeNo;

    @OpenApiField(desc = "银行简称",demo = "ABC" ,constraint = "")
    private String bankCode;

    @OpenApiField(desc = "对公对私",demo = "PERSONAL" ,constraint = "")
    private String personalCorporateType;

    @OpenApiField(desc = "银行卡类型",demo = "DEBIT" ,constraint = "")
    private String debitCreditType;

    @OpenApiField(desc = "支付方式")
    private String methodType;

    @OpenApiField(desc = "入口")
    private String inlet;

    /** 公众号用户标示 是微信公众号和用户加起来生成的一个标识 */
    @OpenApiField(desc = "公众号用户标示",demo = "12346216312",constraint = "微信公众号与用户生成的一个标识,移动专属参数，paymentType = PAYMENT_TYPE_WECHAT时，此参数必填")
    private String openId;

    @OpenApiField(desc = "是否为合并付款")
    private boolean mergePayment;

    @OpenApiField(desc = "支付类型",
            constraint = "{\"data\":[\"BALANCE:余额支付（仅供PC使用）\",\"QUICKPAY:快捷支付（仅供PC使用）\",\"ONLINEBANK:网银支付（仅供PC使用）\",\"THIRDSCANPAY:微信扫码支付(仅支持单笔，仅供PC使用)\",\"OFFLINEPAY:线下支付（仅供PC使用）\",\"PAYMENT_TYPE_SUPER:聚合支付（仅供MOBILE使用）\",\"PAYMENT_TYPE_YJ:易手富支付（仅供MOBILE使用）\",\"PAYMENT_TYPE_WECHAT:微信支付（仅供MOBILE使用）\",\"PAYMENT_TYPE_UPMP:银联支付（仅供MOBILE使用）\"],\"name\":\"支付类型\"}",
            demo = "BALANCE")
    private String paymentType;
    /**
     * 仅供异常传递结果
     */
    @OpenApiField(desc = "创建结果")
    private List<CreatTradeInfo> creatTradeResult;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public List<CreatTradeInfo> getCreatTradeResult() {
        return creatTradeResult;
    }

    public void setCreatTradeResult(List<CreatTradeInfo> creatTradeResult) {
        this.creatTradeResult = creatTradeResult;
    }

    public String getInlet() {
        return inlet;
    }

    public void setInlet(String inlet) {
        this.inlet = inlet;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public boolean getMergePayment() {
        return mergePayment;
    }

    public void setMergePayment(boolean mergePayment) {
        this.mergePayment = mergePayment;
    }

    public boolean isMergePayment() {
        return mergePayment;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
