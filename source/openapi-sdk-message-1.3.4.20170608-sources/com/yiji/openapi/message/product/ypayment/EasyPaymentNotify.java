package com.yiji.openapi.message.product.ypayment;

import java.util.Date;
import java.util.List;

import com.yiji.openapi.message.product.ypayment.info.ItemInfoApi;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 * @since 2016-03-09 16:35.
 */
@OpenApiMessage(service = "easyPayment", type = ApiMessageType.Notify)
public class EasyPaymentNotify extends ApiNotify{

    /**
     * 缴费子订单号
     */
    @OpenApiField(desc = "缴费子订单号" , demo = "201505250005251553" , constraint = "")
    private String paymentOrderNo;

    /**
     * 外部订单号
     */
    @OpenApiField(desc = "外部订单号" , demo = "201505250005251553" , constraint = "")
    private String outBizNo;

    /**
     * 缴费状态
     */
    @OpenApiField(desc = "缴费状态" , demo = "INIT" , constraint = "")
    private String paymentStatus;

    /**
     * 用户编码（卡号）
     */
    @OpenApiField(desc = "用户编码" , demo = "201505250005251553" , constraint = "")
    private String userCode;

    /**
     * 用户姓名
     */
    @OpenApiField(desc = "用户姓名" , demo = "201505250005251553" , constraint = "")
    private String userName;

    /**
     * 资源编码
     */
    @OpenApiField(desc = "资源编码" , demo = "a1s5a1s5a1s5as" , constraint = "")
    private String resourceCode;

    /**
     * 资源名称
     */
    @OpenApiField(desc = "资源名称" , demo = "水费" , constraint = "")
    private String resourceName;

    /**
     * 用户地址
     */
    @OpenApiField(desc = "用户地址" , demo = "重庆市渝北区" , constraint = "")
    private String address;

    /**
     * 缴费类型
     */
    @OpenApiField(desc = "缴费类型" , demo = "WATER" , constraint = "")
    private String paymentType;

    /**
     * 缴费金额
     */
    @OpenApiField(desc = "缴费金额" , demo = "25888" , constraint = "")
    private Money paymentAmount = new Money(0);

    /**
     * 数量
     */
    @OpenApiField(desc = "数量" , demo = "25600" , constraint = "")
    private String count;

    /**
     * 开始数量
     */
    @OpenApiField(desc = "开始数量" , demo = "200" , constraint = "")
    private String startCount;

    /**
     * 结束数量
     */
    @OpenApiField(desc = "结束数量" , demo = "200" , constraint = "")
    private String endCount;

    /**
     * 缴费明细
     */
    @OpenApiField(desc = "缴费明细" , demo = "" , constraint = "")
    private List<ItemInfoApi> itemInfos;

    /**
     * 滞纳金
     */
    @OpenApiField(desc = "滞纳金" , demo = "25888" , constraint = "")
    private Money charge;

    /**
     * 月份
     */
    @OpenApiField(desc = "月份" , demo = "7" , constraint = "")
    private String month;

    /**
     * 开始时间
     */
    @OpenApiField(desc = "开始时间" , demo = "2015-05-23：11:25:12" , constraint = "")
    private Date startTime;

    /**
     * 结束时间
     */
    @OpenApiField(desc = "结束时间" , demo = "2015-05-23：11:25:12" , constraint = "")
    private Date endTime;

    /**
     * 错误信息
     */
    @OpenApiField(desc = "错误信息" , demo = "缴费错误" , constraint = "")
    private String errorMessage;

    /**
     * 备注信息
     */
    @OpenApiField(desc = "备注信息" , demo = "缴费失败" , constraint = "")
    private String memo;

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public String getOutBizNo() {
        return outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Money getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Money paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getStartCount() {
        return startCount;
    }

    public void setStartCount(String startCount) {
        this.startCount = startCount;
    }

    public String getEndCount() {
        return endCount;
    }

    public void setEndCount(String endCount) {
        this.endCount = endCount;
    }

    public List<ItemInfoApi> getItemInfos() {
        return itemInfos;
    }

    public void setItemInfos(List<ItemInfoApi> itemInfos) {
        this.itemInfos = itemInfos;
    }

    public Money getCharge() {
        return charge;
    }

    public void setCharge(Money charge) {
        this.charge = charge;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
