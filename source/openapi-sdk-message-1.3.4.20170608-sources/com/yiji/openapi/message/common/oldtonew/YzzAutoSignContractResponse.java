package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/1/25.
 */
@OpenApiMessage(service = "yzzAutoSignContract", type = ApiMessageType.Response)
public class YzzAutoSignContractResponse extends ApiResponse {

    @OpenApiField(desc = "合作伙伴名称",constraint = "合作伙伴名称",demo = "XX商户")
    private String partnerName;

    @OpenApiField(desc = "会员ID",constraint = "会员号",demo = "20160125001111111111")
    private String userId;

    @OpenApiField(desc = "签约类型",constraint = "签约类型",demo = "0")
    private String pactType ="0";

    @OpenApiField(desc = "签约金额",constraint = "签约金额",demo = "68.50")
    private String pactAmount = "0";

    @OpenApiField(desc = "APP--手机端，PC --PC端，默认 PC ",constraint = "签约金额",demo = "PC")
    private String sources;

    @OpenApiField(desc = "按钮颜色",constraint = "按钮颜色",demo = "")
    private String btnColor;

    @OpenApiField(desc = "按钮颜色",constraint = "SAVE:表示签约, CANCEL:表示取消",demo = "SAVE")
    private String opType = "SAVE";

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPactType() {
        return pactType;
    }

    public void setPactType(String pactType) {
        this.pactType = pactType;
    }

    public String getPactAmount() {
        return pactAmount;
    }

    public void setPactAmount(String pactAmount) {
        this.pactAmount = pactAmount;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getBtnColor() {
        return btnColor;
    }

    public void setBtnColor(String btnColor) {
        this.btnColor = btnColor;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }
}
