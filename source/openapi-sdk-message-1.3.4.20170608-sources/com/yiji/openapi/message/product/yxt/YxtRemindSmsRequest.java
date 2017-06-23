package com.yiji.openapi.message.product.yxt;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-07 15:57.
 */
@OpenApiMessage(service = "yxtRemindSms", type = ApiMessageType.Request)
public class YxtRemindSmsRequest extends ApiRequest {

    /**
     * 签约合同号
     */
    @NotBlank
    @OpenApiField(desc = "签约合同号",demo = "21346516541")
    private String contractNo;
    /**
     * 还款金额
     */
    @NotNull
    @OpenApiField(desc = "还款金额",demo = "88.66")
    private Money repayAmount;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Money getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(Money repayAmount) {
        this.repayAmount = repayAmount;
    }
}
