package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.FastPayInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hgeshu@yiji.com on 2016/8/22.
 */
@OpenApiMessage(service = "fastPayTradeMergePay", type = ApiMessageType.Request)
public class FastPayTradeMergePayRequest extends ApiRequest {

    /**
     * 外部会员号
     */
    @Length(min = 1, max = 64)
    @OpenApiField(desc = "外部会员id",demo = "651654153")
    private String outUserId;

    /**
     * 买家会员号
     */
    @Length(max = 20, min = 20)
    @OpenApiField(desc = "买家(易极付)用户id",demo = "20165489625847153698")
    private String buyerUserId;

    /**
     * 买家真实姓名
     */
    @Length(max = 64, min = 1)
    @OpenApiField(desc = "买家真实姓名",demo = "张三")
    private String buyerRealName;

    @Size(max = 100)
    @Valid
    @OpenApiField(desc = "交易信息",demo = "",constraint = "tradeInfo与tradeNo不能同时为空，也不能都传")
    private List<FastPayInfo> tradeInfo;

    @OpenApiField(desc = "交易号",demo = "324342523sfdaf,14232343425",constraint = "多笔请用“，”隔开，tradeInfo与tradeNo不能同时为空，也不能都传")
    private String tradeNo;


    @OpenApiField(desc = "支付类型",
            constraint = "{\"data\":[\"BALANCE:余额支付（仅供PC使用）\",\"QUICKPAY:快捷支付（仅供PC使用）\",\"ONLINEBANK:网银支付（仅供PC使用）\",\"THIRDSCANPAY:扫码支付(仅支持单笔，仅供PC使用)\",\"OFFLINEPAY:线下支付（仅供PC使用）\",\"PAYMENT_TYPE_SUPER:聚合支付（仅供MOBILE使用）\",\"PAYMENT_TYPE_YJ:易手富支付（仅供MOBILE使用）\",\"PAYMENT_TYPE_WECHAT:微信支付（仅供MOBILE使用）\",\"PAYMENT_TYPE_UPMP:银联支付（仅供MOBILE使用）\"],\"name\":\"支付类型\"}",
            demo = "BALANCE")
    private String paymentType;

    @OpenApiField(desc = "银行简称",demo = "ABC" ,constraint = "PC专属参数，微信扫码请传入WEIXIN，支付宝扫码请传入ALIPAY")
    private String bankCode;

    @OpenApiField(desc = "对公对私",demo = "PERSONAL" ,constraint = "PC专属参数")
    private String personalCorporateType;

    @OpenApiField(desc = "银行卡类型",demo = "DEBIT" ,constraint = "PC专属参数")
    private String cardType;

    /** 公众号用户标示 是微信公众号和用户加起来生成的一个标识 */
    @OpenApiField(desc = "公众号用户标示",demo = "12346216312",constraint = "微信公众号与用户生成的一个标识,移动专属参数，paymentType = PAYMENT_TYPE_WECHAT时，此参数必填")
    private String openid;
    /**
     * 终端类型
     */
    @OpenApiField(desc = "终端类型" , demo = "MOBILE" , constraint = "默认为MOBILE")
    private String userTerminalType;

    @OpenApiField(desc = "买家机构名",demo = "猪八戒科技有限公司")
    private String buyerOrgName;

    /**
     * 场景识别行为
     */
    @Length(max = 256)
    @OpenApiField(desc = "场景识别行为",demo = "xxx",constraint = "仅限于特殊业务场景使用，比如付款到中间账户，具体传值请联系易极付")
    private String behavior;

    public String getOutUserId() {
        return outUserId;
    }

    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId;
    }

    public String getBuyerUserId() {
        return buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getBuyerRealName() {
        return buyerRealName;
    }

    public void setBuyerRealName(String buyerRealName) {
        this.buyerRealName = buyerRealName;
    }

    public List<FastPayInfo> getTradeInfo() {
        return tradeInfo;
    }

    public void setTradeInfo(List<FastPayInfo> tradeInfo) {
        this.tradeInfo = tradeInfo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getBuyerOrgName() {
        return buyerOrgName;
    }

    public void setBuyerOrgName(String buyerOrgName) {
        this.buyerOrgName = buyerOrgName;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getPersonalCorporateType() {
        return personalCorporateType;
    }

    public void setPersonalCorporateType(String personalCorporateType) {
        this.personalCorporateType = personalCorporateType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getUserTerminalType() {
        return userTerminalType;
    }

    public void setUserTerminalType(String userTerminalType) {
        this.userTerminalType = userTerminalType;
    }
}
