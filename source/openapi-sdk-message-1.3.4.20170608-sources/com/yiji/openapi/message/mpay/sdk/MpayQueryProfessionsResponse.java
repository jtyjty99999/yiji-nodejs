package com.yiji.openapi.message.mpay.sdk;

import java.util.List;

import com.yiji.openapi.message.mpay.sdk.info.MpayProfession;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
@OpenApiMessage(service = "mpayQueryProfessions", type = ApiMessageType.Response)
public class MpayQueryProfessionsResponse extends ApiResponse {

    @OpenApiField(desc = "职业列表")
    private List<MpayProfession> professions;

    public List<MpayProfession> getProfessions() {
        return professions;
    }

    public void setProfessions(List<MpayProfession> professions) {
        this.professions = professions;
    }
}
