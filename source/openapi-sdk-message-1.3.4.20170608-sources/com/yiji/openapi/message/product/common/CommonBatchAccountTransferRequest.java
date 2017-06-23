package com.yiji.openapi.message.product.common;

import com.yiji.openapi.message.product.common.info.BatchBehalfInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/10/31 11:16.
 */
@OpenApiMessage(service = "commonBatchAccountTransfer", type = ApiMessageType.Request)
public class CommonBatchAccountTransferRequest extends ApiRequest {

    /**
     * 商户真实名称
     */
    @NotBlank
    @OpenApiField(desc = "用户易极付ID",demo = "20160254845896358458")
    private String userId;

    /**
     * 商户真实名称
     */
    @NotBlank
    @OpenApiField(desc = "用户真实名称",demo = "重庆易行通科技有限公司")
    private String userRealName;

    /**
     * 备注
     */
    @NotBlank
    @Length(max = 500)
    @OpenApiField(desc = "备注",demo = "代发备注")
    private String memo;

    /**
     * 批次名称，用户录入，如未录入则使用文件名称
     */
    @NotNull
    @OpenApiField(desc = "代发总笔数",demo = "85")
    private int totalCount;

    /**
     * 批量代发名称  如：工资代发-201610
     */
    @NotBlank
    @Length(max = 20)
    @OpenApiField(desc = "批量代发名称",demo = "工资代发-201610")
    private String name;

    @NotEmpty
    @Size(max=10000,min=1)
    @OpenApiField(desc = "代发明细",demo = "")
    private List<BatchBehalfInfo> detailInfos;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BatchBehalfInfo> getDetailInfos() {
        return detailInfos;
    }

    public void setDetailInfos(List<BatchBehalfInfo> detailInfos) {
        this.detailInfos = detailInfos;
    }

}
