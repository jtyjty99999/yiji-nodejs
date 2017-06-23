package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.FastPayInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "fastPayMergeCreateTrade", type = ApiMessageType.Request)
public class FastPayMergeCreateTradeRequest extends ApiRequest {
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
    @NotEmpty
    @OpenApiField(desc = "交易信息",demo = "")
    private List<FastPayInfo> tradeInfo;

    @OpenApiField(desc = "买家机构名",demo = "猪八戒科技有限公司")
    private String buyerOrgName;

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

    public String getBuyerOrgName() {
        return buyerOrgName;
    }

    public void setBuyerOrgName(String buyerOrgName) {
        this.buyerOrgName = buyerOrgName;
    }
}
