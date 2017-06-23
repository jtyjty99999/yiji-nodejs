package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.CustomerBankCardApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by tyongfu@yiji.com on 2016/1/27.
 */
@OpenApiMessage(service = "bankCodeBindingQuery", type = ApiMessageType.Response)
public class BankCodeBindingQueryResponse extends ApiResponse {
    @OpenApiField(desc = "数量",demo = "3")
    private int count;

    @OpenApiField(desc = "银行卡信息列表",demo = "[卡1，卡2]")
    private List<CustomerBankCardApiInfo> BankCardInfo;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<CustomerBankCardApiInfo> getBankCardInfo() {
        return BankCardInfo;
    }

    public void setBankCardInfo(List<CustomerBankCardApiInfo> bankCardInfo) {
        BankCardInfo = bankCardInfo;
    }
}
