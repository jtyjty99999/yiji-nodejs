package com.yiji.openapi.message.product.yjh.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * Created by hgeshu@yiji.com on 2016/7/15.
 */
public class yjhOrderItem {
    /**
     * 商品编号
     */
    @OpenApiField(desc = "商品编号",demo = "38176878572",constraint = "销售平台商品唯一标识")
    private String platformItemNo;
    /**
     * 销售数量
     */
    @NotNull
    @OpenApiField(desc = "销售数量",demo = "3")
    private Integer quantity;
    /**
     * 商品名称
     */
    @NotBlank
    @OpenApiField(desc = "商品名称",demo = "8x Universal Motorcycle Motorbike Black LED Turn Signal Indicator Blinker Light")
    private String itemTitle;

    public String getPlatformItemNo() {
        return platformItemNo;
    }

    public void setPlatformItemNo(String platformItemNo) {
        this.platformItemNo = platformItemNo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
}
