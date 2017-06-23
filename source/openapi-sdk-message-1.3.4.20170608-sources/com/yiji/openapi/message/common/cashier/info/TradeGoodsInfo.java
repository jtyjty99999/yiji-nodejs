package com.yiji.openapi.message.common.cashier.info;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import com.yiji.openapi.message.common.trade.info.ExtInfoClause;
import com.yiji.openapi.message.common.trade.info.GoodsClause;
import com.yiji.openapi.message.common.trade.info.IncidentalFeeClause;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-12 13:48.
 */
public class TradeGoodsInfo {
    /** 订单号 */
    @Size(min = 1, max = 64)
    @NotBlank
    @OpenApiField(desc = "外部订单号",demo = "13431268512346")
    private String outOrderNo;

    /** 交易名称 */
    @Size(max = 64)
    @OpenApiField(desc = "交易名称",demo = "交易")
    private String tradeName;

    /** 卖家 */
    @NotBlank
    @OpenApiField(desc = "卖家ID",demo = "12365478901234567890",constraint = "卖家的易极付ID")
    private String sellerUserId;

    /** 交易额 */
    @NotNull
    @OpenApiField(desc = "交易额",demo = "88.66")
    private Money tradeAmount;

    /** 交易子类型 */
    @NotNull
    @OpenApiField(desc = "交易类型",demo = "GOODS_BUY")
    private String gatheringType;

    /** 商品条款 */
    @NotNull
    @OpenApiField(desc = "商品信息")
    private List<GoodsClause> goodsClauses;

    /** 扩展信息 */
    @OpenApiField(desc = "扩展信息")
    private ExtInfoClause extInfoClause;

    /** 交易备注 */
    @OpenApiField(desc = "交易备注",demo = "交易")
    @Length(max = 1024)
    private String tradeMemo;

    /** 明细地址,此笔交易的来源 */
    @URL
    @Length(max = 256)
    @OpenApiField(desc = "明细地址",demo = "http://www.yiji.com")
    private String detailUrl;

    /** 附带费用(如邮费、税费) */
    @OpenApiField(desc = "附带费用")
    private List<IncidentalFeeClause> incidentalFeeClauses;

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getSellerUserId() {
        return sellerUserId;
    }

    public void setSellerUserId(String sellerUserId) {
        this.sellerUserId = sellerUserId;
    }

    public Money getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Money tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getGatheringType() {
        return gatheringType;
    }

    public void setGatheringType(String gatheringType) {
        this.gatheringType = gatheringType;
    }

    public List<GoodsClause> getGoodsClauses() {
        return goodsClauses;
    }

    public void setGoodsClauses(List<GoodsClause> goodsClauses) {
        this.goodsClauses = goodsClauses;
    }

    public ExtInfoClause getExtInfoClause() {
        return extInfoClause;
    }

    public void setExtInfoClause(ExtInfoClause extInfoClause) {
        this.extInfoClause = extInfoClause;
    }

    public String getTradeMemo() {
        return tradeMemo;
    }

    public void setTradeMemo(String tradeMemo) {
        this.tradeMemo = tradeMemo;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public List<IncidentalFeeClause> getIncidentalFeeClauses() {
        return incidentalFeeClauses;
    }

    public void setIncidentalFeeClauses(List<IncidentalFeeClause> incidentalFeeClauses) {
        this.incidentalFeeClauses = incidentalFeeClauses;
    }
}
