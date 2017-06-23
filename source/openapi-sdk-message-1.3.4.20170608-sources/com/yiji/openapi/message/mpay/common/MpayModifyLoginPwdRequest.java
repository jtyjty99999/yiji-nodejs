package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-08 14:32.
 */
@OpenApiMessage(service = "mpayModifyLoginPwd", type = ApiMessageType.Request)
public class MpayModifyLoginPwdRequest extends ApiRequest {

    @NotBlank
    @OpenApiField(desc = "外部订单号",demo = "1235464786125")
    private String outOrderNo;

    @NotBlank
    @OpenApiField(desc = "用户ID",constraint = "用户登录易极付ID",demo = "1234569780132456978")
    private String userId;

    @OpenApiField(desc = "是否显示标题",constraint = "1:显示标题<br>0:不显示标题<br>默认显示",demo = "1")
    private int title = 1;

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

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }
}
