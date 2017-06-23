package com.yiji.openapi.message.product.common;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.product.common.info.DataBizTypeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-08 10:16.
 */
@OpenApiMessage(service = "commonMerchantTradeInfosQuary", type = ApiMessageType.Request)
public class CommonMerchantTradeInfosQuaryRequest extends ApiRequest {

    /**
     * 处理状态
     * "HANDLING", "处理中",
     * "FINISH", "处理完成",
     * "LOSE", "处理失败",
     * "FAIL", "申请失败";
     */
    @OpenApiField(desc = "处理状态",demo = "{\"HANDLING\",\"FINISH\"}",constraint = "{\"date\":[\"HANDLING:处理中\",\"FINISH:处理完成\",\"LOSE:处理失败\",\"FAIL:申请失败\"],\"name\":\"处理状态\"}")
    private List<String> dataDisposeSchedule;

    @OpenApiField(desc = "易极付用户ID",demo = "231435126581268123465")
    @Length(max = 20, min = 20)
    private String userId;

    /** 账期
     * 格式为：yyyyMMdd
     * 例如：20160301
     * */
    @Max(value = 30000000,message = "账期格式错误，格式：yyyyMMdd")
    @Min(value = 10000000,message = "账期格式错误，格式：yyyyMMdd")
    @OpenApiField(desc = "账期",demo = "20160301",constraint = "格式：yyyyMMdd")
    private Integer accountDay;

    @NotNull
    @OpenApiField(desc = "开始时间",demo = "2016-08-14 14:23:45",constraint = "格式：YYYY-MM-DD HH:mm:ss")
    private Date beginCreateTime;

    @NotNull
    @OpenApiField(desc = "结束时间",demo = "2016-08-14 14:23:45",constraint = "格式：YYYY-MM-DD HH:mm:ss")
    private Date endCreateTime;

    /**
     * 每页记录最大数
     */
    @Max(value = 500)
    @Min(value = 1)
    @OpenApiField(desc = "每页记录数",demo = "10",constraint = "最小1，最大100，默认10")
    private long limit = 10;

    /**
     * 起始位置
     */
    @OpenApiField(desc = "起始位置",constraint = "默认0",demo = "0")
    private long start = 0;

    @OpenApiField(desc = "商户订单号",demo = "1324165320156")
    private String outOrderNo;

    /**
     * 交易类型
     * {@link com.yjf.core.silverbolt.facade.base.enums.DataBizTypeEnum}
     * */
    @OpenApiField(desc = "交易类型",demo = "WITHDRAW_SINGLE")
    private List<DataBizTypeInfo> dataBizTypeInfo;
    
    public List<DataBizTypeInfo> getDataBizTypeInfo() {
        return dataBizTypeInfo;
    }

    public void setDataBizTypeInfo(List<DataBizTypeInfo> dataBizTypeInfo) {
        this.dataBizTypeInfo = dataBizTypeInfo;
    }

    public List<String> getDataDisposeSchedule() {
        return dataDisposeSchedule;
    }

    public void setDataDisposeSchedule(List<String> dataDisposeSchedule) {
        this.dataDisposeSchedule = dataDisposeSchedule;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(Integer accountDay) {
        this.accountDay = accountDay;
    }

    public Date getBeginCreateTime() {
        return beginCreateTime;
    }

    public void setBeginCreateTime(Date beginCreateTime) {
        this.beginCreateTime = beginCreateTime;
    }

    public Date getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Date endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public long getLimit() {
        return limit;
    }

    public void setLimit(long limit) {
        this.limit = limit;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }
}
