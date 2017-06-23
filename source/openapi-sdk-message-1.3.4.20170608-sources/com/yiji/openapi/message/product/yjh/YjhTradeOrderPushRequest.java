package com.yiji.openapi.message.product.yjh;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.yjh.info.yjhOrderItem;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by hgeshu@yiji.com on 2016/7/15.
 */
@OpenApiMessage(service = "yjhTradeOrderPush", type = ApiMessageType.Request)
public class YjhTradeOrderPushRequest extends ApiRequest {

    /**
     * 请求订单号
     */
    @NotBlank
    @Size(max = 64, message = "请求订单号（每次订单推送请求的唯一编号，由外部推送平台生成），长度不能超过64")
    @OpenApiField(desc = "商户订单号",demo = "2016010618033973605")
    private String outOrderNo;
    /**
     * 易结汇用户订单推送唯一编号
     */
    @NotBlank
    @Size(max = 80,message="易结汇用户订单推送唯一编号 (易结汇系统用户唯一标识，用于区分该条订单所属的易结汇客户),长度不能超过80")
    @OpenApiField(desc = "易结汇用户ID",demo = "20150902300007583295")
    private String userId;
    /**
     * 贸易类型
     */
    @NotBlank
    @Size(max = 30, message = "贸易类型，长度不能超过30")
    @OpenApiField(desc = "贸易类型",demo = "GOODS",constraint = "{\"data\":[\"GOODS：货物贸易\",\"SERVICES：服务贸易\"],\"name\":\"贸易类型\"}")
    private String tradeType;
    /**
     * 订单总价值
     */
    @NotNull
    @OpenApiField(desc = "订单总价值",demo = "12.59")
    private Money orderTotal;
    /**
     * 订单币种
     */
    @NotBlank
    @OpenApiField(desc = "币种",demo = "CNY")
    private String currency;
    /**
     * 销售平台
     */
    @NotBlank
    @OpenApiField(desc = "销售平台",demo = "EBAY")
    private String tradePlatform;

    @OpenApiField(desc = "销售平台站点",demo = "www.ebay.co.uk",constraint = "如果tradePlatform填写的other，则必填；其他情况下非必填（按真实交易站点填写）")
    private String tradePlatformSite;
    /**
     * 销售平台卖家账号
     */
    @NotBlank
    @Size(max = 30, message = "销售平台卖家账号，长度不能超过30")
    @OpenApiField(desc = "销售平台卖家账号",demo = "liuming@gmail.com")
    private String platformSellerAccount;
    /**
     * 销售平台卖家姓名
     */
    @NotBlank
    @Size(max = 30, message = "销售平台卖家姓名，长度不能超过30")
    @OpenApiField(desc = "销售平台卖家姓名",demo = "张三")
    private String platformSellerName;
    /**
     * 销售平台订单号
     */
    @NotBlank
    @Size(max = 64, message = "销售平台订单号（同一销售平台订单号不可重复），长度不能超过64")
    @OpenApiField(desc = "销售平台订单号",demo = "989983000000",constraint = "同一销售平台订单号不可重复")
    private String platformOrderNo;

    /**
     * 卖家内部订单号
     */
    @OpenApiField(desc = "卖家内部订单号",demo = "201606270001")
    private String customOrderNo;
    /**
     * 销售时间
     */
    @NotNull
    //@Size(max = 30, message = "销售时间，长度不能超过30")
    @OpenApiField(desc = "销售时间",demo = "2016-05-30 13:01:00",constraint = "时间格式yyyy-MM-dd hh:mm:ss")
    private Date sellTime;
    /**
     * 支付平台
     */
    @NotBlank
    @Size(max = 30, message = "支付平台，长度不能超过30")
    @OpenApiField(desc = "支付平台",demo = "PayPal",constraint = "填写订单的实际支付方式（例如：PayPal、Credit Card等）")
    private String paymentPlatform;
    /**
     * 支付平台交易号
     */
    @NotBlank
    @Size(max = 64, message = "支付平台交易号，长度不能超过64")
    @OpenApiField(desc = "支付平台交易号",demo = "1FE55757TW022362B",constraint = "填写支付方式所对应的交易标识（例如PayPal平台的PayPal TransactionId）")
    private String paymentTransactionId;
    /**
     * 支付时间
     */
    @NotNull
    //@Size(max = 30, message = "支付时间，长度不能超过30")
    @OpenApiField(desc = "支付时间",demo = "2016-05-30 13:04:00",constraint = "时间格式yyyy-MM-dd hh:mm:ss")
    private Date paymentTime;
    /**
     * 物流承运商
     */
    @NotBlank
    @Size(max = 30, message = "物流承运商，长度不能超过30")
    @OpenApiField(desc = "物流承运商",demo = "USPS")
    private String shippingCarrier;
    /**
     * 物流类型
     */
    @OpenApiField(desc = "物流类型",demo = "Priority Mail Express International",constraint = "承运商物流服务类型")
    private String shippingType;
    /**
     * 物流运单号
     */
    @NotBlank
    @Size(max = 64, message = "物流运单号，长度不能超过64")
    @OpenApiField(desc = "物流运单号",demo = "9400100100009000888812")
    private String trackingNo;
    /**
     * 发货城市
     */
    @OpenApiField(desc = "发货城市",demo = "Guangzhou")
    private String shippingCity;
    /**
     * 发货时间
     */
    @NotNull
    //@Size(max = 30, message = "发货时间，长度不能超过30")
    @OpenApiField(desc = "发货时间",demo = "2016-06-02 10:05:10",constraint = "时间格式yyyy-MM-dd hh:mm:ss")
    private Date shippingTime;
    /**
     * 签收时间
     */
    @NotNull
    //@Size(max = 30, message = "签收时间，长度不能超过30")
    @OpenApiField(desc = "签收时间",demo = "2016-06-08 22:11:56",constraint = "时间格式yyyy-MM-dd hh:mm:ss")
    private Date deliveryTime;
    /**
     * 买家姓名
     */
    @NotBlank
    @Size(max = 30, message = "买家姓名，长度不能超过30")
    @OpenApiField(desc = "买家姓名",demo = "zhangsan")
    private String buyerName;
    /**
     * 买家邮箱
     */
    @OpenApiField(desc = "买家邮箱",demo = "james.kk@gmail.com")
    private String buyerEmail;
    /**
     * 买家地址第一行
     */
    @NotBlank
    @Size(max = 256, message = "买家地址第一行，长度不能超过256")
    @OpenApiField(desc = "买家地址第一行",demo = "1417 Armacost Ave")
    private String addrLine1;
    /**
     * 买家地址第二行
     */
    @OpenApiField(desc = "买家地址第二行",demo = "Apt 14")
    private String addrLine2;
    /**
     * 买家所在城市
     */
    @NotBlank
    @Size(max = 30, message = "买家所在城市，长度不能超过30")
    @OpenApiField(desc = "买家所在城市",demo = "Los Angeles")
    private String city;
    /**
     * 买家所在州/省
     */
    @NotBlank
    @Size(max = 30, message = "买家所在州/省，长度不能超过30")
    @OpenApiField(desc = "买家所在州/省",demo = "CA")
    private String state;
    /**
     * 买家所在国家
     */
    @NotBlank
    @Size(max = 50, message = "买家所在国家，长度不能超过50")
    @OpenApiField(desc = "买家所在国家",demo = "United States")
    private String country;
    /**
     * 买家邮编
     */
    @NotBlank
    @Size(max = 30, message = "买家邮编，长度不能超过30")
    @OpenApiField(desc = "买家邮编",demo = "90025-2233")
    private String postalCode;
    /**
     * 商品信息列表
     */
    @NotNull
    @OpenApiField(desc = "商品信息列表")
    private List<yjhOrderItem> orderItemList;

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Money getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Money orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTradePlatform() {
        return tradePlatform;
    }

    public void setTradePlatform(String tradePlatform) {
        this.tradePlatform = tradePlatform;
    }

    public String getTradePlatformSite() {
        return tradePlatformSite;
    }

    public void setTradePlatformSite(String tradePlatformSite) {
        this.tradePlatformSite = tradePlatformSite;
    }

    public String getPlatformSellerAccount() {
        return platformSellerAccount;
    }

    public void setPlatformSellerAccount(String platformSellerAccount) {
        this.platformSellerAccount = platformSellerAccount;
    }

    public String getPlatformSellerName() {
        return platformSellerName;
    }

    public void setPlatformSellerName(String platformSellerName) {
        this.platformSellerName = platformSellerName;
    }

    public String getPlatformOrderNo() {
        return platformOrderNo;
    }

    public void setPlatformOrderNo(String platformOrderNo) {
        this.platformOrderNo = platformOrderNo;
    }

    public String getCustomOrderNo() {
        return customOrderNo;
    }

    public void setCustomOrderNo(String customOrderNo) {
        this.customOrderNo = customOrderNo;
    }

    public Date getSellTime() {
        return sellTime;
    }

    public void setSellTime(Date sellTime) {
        this.sellTime = sellTime;
    }

    public String getPaymentPlatform() {
        return paymentPlatform;
    }

    public void setPaymentPlatform(String paymentPlatform) {
        this.paymentPlatform = paymentPlatform;
    }

    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getShippingCarrier() {
        return shippingCarrier;
    }

    public void setShippingCarrier(String shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public Date getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<yjhOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<yjhOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
