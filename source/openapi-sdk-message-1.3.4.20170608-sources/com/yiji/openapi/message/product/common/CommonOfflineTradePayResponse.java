package com.yiji.openapi.message.product.common;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/5 14:18.
 */
@OpenApiMessage(service = "commonOfflineTradePay", type = ApiMessageType.Response)
public class CommonOfflineTradePayResponse extends ApiResponse {
    /**
     * 支付流水号
     */
    @OpenApiField(desc = "支付流水号" , demo = "201500515252525625" , constraint = "")
    private String tradeNo;

    /**
     * 付款总金额
     */
    @OpenApiField(desc = "付款总金额" , demo = "258888" , constraint = "")
    private Money payAmount;

    /**
     * 买家手续费
     */
    @OpenApiField(desc = "买家手续费" , demo = "258888" , constraint = "")
    private Money buyerFee;

    /**
     * 业务状态
     */
    @OpenApiField(desc = "业务状态" , demo = "PAY_PROCESSING" , constraint = "{\"data\":[\"FINISHED:交易成功\",\"CLOSE:交易失败\",\"PAY_PROCESSING:付款处理中\",\"WAIT_PAY:等待付款\"],\"name\":\"业务状态\"}")
    private String fastPayStatus;

    /**
     * 线下付款识别码
     */
    @OpenApiField(desc = "线下付款识别码",demo = "1234611654")
    private String offlinePayCode;

    /**
     * 联名卡户名/卖家户名
     */
    @OpenApiField(desc = "卖家户名",demo = "张三",constraint = "此参数需要解密使用",security = true)
    private String sellerCardName;

    /**
     * 联名卡号
     */
    @OpenApiField(desc = "卖家银行卡号",demo = "6251845963652451",security = true,constraint = "此参数需要解密使用")
    private String sellerCardNo;

    /**
     * 线下支付bankCode
     */
    @OpenApiField(desc = "线下支付银行简称",demo = "ICBC")
    private String offlinePayBankCode;

    /**
     * 线下支付bankName
     */
    @OpenApiField(desc = "线下支付开户行名称",demo = "中国工商银行股份有限公司前海分行")
    private String offlinePayBankName;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Money getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Money payAmount) {
        this.payAmount = payAmount;
    }

    public Money getBuyerFee() {
        return buyerFee;
    }

    public void setBuyerFee(Money buyerFee) {
        this.buyerFee = buyerFee;
    }

    public String getFastPayStatus() {
        return fastPayStatus;
    }

    public void setFastPayStatus(String fastPayStatus) {
        this.fastPayStatus = fastPayStatus;
    }

    public String getOfflinePayCode() {
        return offlinePayCode;
    }

    public void setOfflinePayCode(String offlinePayCode) {
        this.offlinePayCode = offlinePayCode;
    }

    public String getSellerCardName() {
        return sellerCardName;
    }

    public void setSellerCardName(String sellerCardName) {
        this.sellerCardName = sellerCardName;
    }

    public String getSellerCardNo() {
        return sellerCardNo;
    }

    public void setSellerCardNo(String sellerCardNo) {
        this.sellerCardNo = sellerCardNo;
    }

    public String getOfflinePayBankCode() {
        return offlinePayBankCode;
    }

    public void setOfflinePayBankCode(String offlinePayBankCode) {
        this.offlinePayBankCode = offlinePayBankCode;
    }

    public String getOfflinePayBankName() {
        return offlinePayBankName;
    }

    public void setOfflinePayBankName(String offlinePayBankName) {
        this.offlinePayBankName = offlinePayBankName;
    }
}
