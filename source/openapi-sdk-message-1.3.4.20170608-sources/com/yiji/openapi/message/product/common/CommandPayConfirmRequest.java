package com.yiji.openapi.message.product.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 * Created by hgeshu@yiji.com on 2016/8/26.
 */
@OpenApiMessage(service = "commandPayConfirm", type = ApiMessageType.Request)
public class CommandPayConfirmRequest extends ApiRequest {

    /**
     * 用户客户端ip
     */
    @Size(max = 128)
    @OpenApiField(desc = "用户终端ip",demo = "192.168.49.56")
    private String userEndIp;

    @NotBlank
    @OpenApiField(desc = "交易号",demo = "324342523sfdaf",constraint = "")
    private String tradeNo;

    @OpenApiField(desc = "分润信息",constraint = "分润最多支持10笔,单笔分润格式:userId1~amount1~memo1^userId2~amount2~memo2",demo = "2012658947952258175214~88.66~分润^45631541323241~65.21~fenrun")
    private String shareProfits;

    @OpenApiField(desc = "打款金额")
    private Money confirmPayAmount;

    public String getUserEndIp() {
        return userEndIp;
    }

    public void setUserEndIp(String userEndIp) {
        this.userEndIp = userEndIp;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getShareProfits() {
        return shareProfits;
    }

    public void setShareProfits(String shareProfits) {
        this.shareProfits = shareProfits;
    }

    public Money getConfirmPayAmount() {
        return confirmPayAmount;
    }

    public void setConfirmPayAmount(Money confirmPayAmount) {
        this.confirmPayAmount = confirmPayAmount;
    }
}
