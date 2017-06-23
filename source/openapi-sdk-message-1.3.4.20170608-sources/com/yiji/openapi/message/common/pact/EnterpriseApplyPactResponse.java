package com.yiji.openapi.message.common.pact;


import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com
 * Created on 2017/1/4 15:10.
 */
@OpenApiMessage(service = "enterpriseApplyPact", type = ApiMessageType.Response)
public class EnterpriseApplyPactResponse extends ApiResponse {

    /** 打开银联页面的表单 */
    @OpenApiField(desc = "银联页面的表单信息",demo = "<form><input name=nd></input></form>")
    private String formData;

    /** 短信倒计时剩余时间 */
    @OpenApiField(desc = "短信倒计时剩余时间",demo = "60")
    private String note;

    /** 签约流水号 */
    @OpenApiField(desc = "签约流水号",demo = "5125962520545124")
    private String pactNo;

    /** 签约状态 */
    @OpenApiField(desc = "签约状态",demo = "PAY_MONEY_APPLY_SUCCESS",constraint = "{\"data\":[\"PAY_MONEY_APPLY_SUCCESS:打款申请成功\",\"PACT_FAIL:签约失败\"],\"name\":\"签约状态\"}")
    private String pactStatus;

    public String getFormData() {
        return formData;
    }

    public void setFormData(String formData) {
        this.formData = formData;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getPactStatus() {
        return pactStatus;
    }

    public void setPactStatus(String pactStatus) {
        this.pactStatus = pactStatus;
    }
}
