package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.oldtonew.info.PaymentExtParam;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 * @since 2015-12-28 13:59.
 */
@Deprecated
@OpenApiMessage(service = "queryBillPayableAmountV2", type = ApiMessageType.Request)
public class QueryBillPayableAmountV2Request extends ApiRequest {

    private final static String startDate = " 00:00:00";
    private final static String endDate = " 23:59:59";

	/** 机构编码 */
    @NotBlank(message = "机构编码不能为空")
	@Length(max = 32)
    @OpenApiField(desc = "机构编码",demo = "002300002")
	private String agencyCode;
	
	/** 用户编码 */
	@NotBlank(message = "用户编码不能为空")
	@Length(max = 32)
    @OpenApiField(desc = "用户编码",demo = "02664807")
	private String userCode;
	
	/** 请求类型 */
	@NotBlank(message = "请求类型不能为空")
	@Length(max = 32)
    @OpenApiField(desc = "请求类型",demo = "000010")
	private String queryType;
	
	/** 查询时间段开始时间 */
    @OpenApiField(desc = "查询开始时间",constraint = "格式：yyyy-MM-dd",demo = "2015-12-12")
	private String startTime;
    private Date starttime;
	
	/** 查询时间段结束时间 */
    @OpenApiField(desc = "查询结束时间",constraint = "格式：yyyy-MM-dd",demo = "2015-12-12")
	private String endTime;
    private Date endtime;
	
	/** 调用者UserID */
    @NotBlank(message = "调用者UserID不能为空")
	@Length(max = 20, min = 20, message = "会员号长度不合法")
    @OpenApiField(desc = "调用者UserID",demo = "1264579801135467890")
	private String callerUserId;
	
	/**
	 * 缴费模型 ，表示缴费的业务流程 PAYMENT 表示先查询欠费再缴费，缴费金额=欠费金额 RECHARGE 表示直接充值，缴费金额和欠费金额无关
	 * STORED 表示先查询欠费再充值（查询结果可以确认欠费金额），缴费金额>=欠费金额
	 * */
    @OpenApiField(desc = "缴费模型",demo = "PAYMENT")
	private String paymentModel;

    @OpenApiField(desc = "扩展参数",demo = "{\"VIP\":\"1\"}")
    private PaymentExtParam extParames;

    public static String getStartDate() {
        return startDate;
    }

    public static String getEndDate() {
        return endDate;
    }

    public String getAgencyCode() {
        return agencyCode;
    }

    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getCallerUserId() {
        return callerUserId;
    }

    public void setCallerUserId(String callerUserId) {
        this.callerUserId = callerUserId;
    }

    public String getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(String paymentModel) {
        this.paymentModel = paymentModel;
    }

    public PaymentExtParam getExtParames() {
        return extParames;
    }

    public void setExtParames(PaymentExtParam extParames) {
        this.extParames = extParames;
    }
}
