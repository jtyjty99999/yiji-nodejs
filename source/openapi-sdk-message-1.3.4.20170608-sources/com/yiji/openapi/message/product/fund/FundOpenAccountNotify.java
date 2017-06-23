package com.yiji.openapi.message.product.fund;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by hgeshu@yiji.com
 * Created on 2016/12/30 17:02.
 */
@OpenApiMessage(service = "fundOpenAccount", type = ApiMessageType.Notify)
public class FundOpenAccountNotify extends ApiNotify {

    /**
     * 易极付用户Id
     */
    @NotBlank
    @OpenApiField(desc = "易极付用户Id",demo = "20165248596548562365")
    private String userId;

    /**
     * 基金产品编码
     */
    @OpenApiField(desc = "基金产品编码",demo = "000371")
    private String fundProductCode;

    @OpenApiField(desc = "开户状态",constraint = "{\"data\":[\"SUCCESS:开户成功\",\"FAIL:开户失败\"],\"name\":\"开户状态\"}",demo = "SUCCESS")
    private String status;

    /**
     * 基金专户userId
     */
    @OpenApiField(desc = "基金专户userId",demo = "201652845965845869")
    private String fundSpecialAccountUserId;

    /**
     * 基金专户cardNo
     */
    @OpenApiField(desc = "基金专户cardNo",demo = "201652845965845864")
    private String fundSpecialAccountCardNo;

    /**
     * 基金专户accountNo
     */
    @OpenApiField(desc = "基金专户cardNo",demo = "201652845965845862")
    private String fundSpecialAccountAccountNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFundProductCode() {
        return fundProductCode;
    }

    public void setFundProductCode(String fundProductCode) {
        this.fundProductCode = fundProductCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFundSpecialAccountUserId() {
        return fundSpecialAccountUserId;
    }

    public void setFundSpecialAccountUserId(String fundSpecialAccountUserId) {
        this.fundSpecialAccountUserId = fundSpecialAccountUserId;
    }

    public String getFundSpecialAccountCardNo() {
        return fundSpecialAccountCardNo;
    }

    public void setFundSpecialAccountCardNo(String fundSpecialAccountCardNo) {
        this.fundSpecialAccountCardNo = fundSpecialAccountCardNo;
    }

    public String getFundSpecialAccountAccountNo() {
        return fundSpecialAccountAccountNo;
    }

    public void setFundSpecialAccountAccountNo(String fundSpecialAccountAccountNo) {
        this.fundSpecialAccountAccountNo = fundSpecialAccountAccountNo;
    }
}
