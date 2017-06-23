package com.yiji.openapi.message.common.cashier;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.cashier.info.TradeGoodsInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.exception.ApiServerException;

/**
 * Created by Administrator on 2016/3/14.
 */
@OpenApiMessage(service = "freePayGateway", type = ApiMessageType.Request)
public class FreePayGatewayRequest extends ApiRequest {
    /**
     * 收银台字段
     */
    @OpenApiField(desc = "业务来源",demo = "NORMAL",constraint = "单笔付款:NORMAL<br>多笔合并付款:MERGE<br>公路局:HIGHWAY_ADMIN<br>默认NORMAL")
    private String payFrom = "NORMAL";

    @OpenApiField(desc = "收费扩展标志",demo = "0",constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP")
    private String chargeExtend;
    /**
     * 交易系统字段
     */

    @NotNull
    @Size(min = 1, max = 40)
    @OpenApiField(desc = "商品信息列表")
    private List<TradeGoodsInfo> prodInfoList;

    @Length(max = 20, min = 20)
    @OpenApiField(desc = "买家id",demo = "20140814010000052219")
    private String buyerUserId;

    @NotBlank
    @OpenApiField(desc = "外部订单号",demo = "123456789123456")
    private String mergeOrderNo;

    /** 币种（默认人民币） */
    @OpenApiField(desc = "币种",demo = "CNY")
    private String currency;

    @Override
    public void check() {
        if (!"NORMAL".equals(payFrom) && !"MERGE".equals(payFrom) && !"HIGHWAY_ADMIN".equals(payFrom)) {
            throw new ApiServerException("PARAMETER_ERROR", "业务来源只能为NORMAL、MERGE或HIGHWAY_ADMIN");
        }
    }

    public List<TradeGoodsInfo> getProdInfoList() {
        return prodInfoList;
    }

    public void setProdInfoList(List<TradeGoodsInfo> prodInfoList) {
        this.prodInfoList = prodInfoList;
    }

    public String getBuyerUserId() {
        return this.buyerUserId;
    }

    public void setBuyerUserId(String buyerUserId) {
        this.buyerUserId = buyerUserId;
    }

    public String getMergeOrderNo() {
        return mergeOrderNo;
    }

    public void setMergeOrderNo(String mergeOrderNo) {
        this.mergeOrderNo = mergeOrderNo;
    }

    public String getPayFrom() {
        return payFrom;
    }

    public void setPayFrom(String payFrom) {
        this.payFrom = payFrom;
    }


    public String getChargeExtend() {
        return chargeExtend;
    }

    public void setChargeExtend(String chargeExtend) {
        this.chargeExtend = chargeExtend;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
