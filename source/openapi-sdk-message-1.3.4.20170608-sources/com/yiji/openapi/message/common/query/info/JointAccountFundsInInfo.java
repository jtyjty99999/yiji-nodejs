/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-09 11:01 创建
 *
 */
package com.yiji.openapi.message.common.query.info;
import java.util.Date;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
public class JointAccountFundsInInfo {
    /**
     *入金流水号
     */
    private String fundInBizNo;

    /**
     *记录状态
     */
    private String status;

    /**
     * 充值流水号
     */
    private String depositId;

    //////////交易信息/////////
    /**
     * 银行流水号
     */
    private String bankSerialNo;

    /**
     * 交易金额
     */
    private Money amount;

    /**
     * 汇款时间
     */
    private Date transDate;

    /**
     * 业务描述
     */
    private String description;

    //////////用户信息/////////

    /**
     *联名卡号
     */
    private String jointAccountNo;

    /**
     *用途
     */
    private String useFor;

    /**
     * 启用状态:0代表未启用,1代表启用,(因为int类型默认值为0,方便设计)
     */
    private int enable;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户真实姓名
     */
    private String userRealName;

    //////////参与者信息/////////
    //备付金
    /**
     * 银行编码
     */
    private String bankCode;

    //联名卡
    /**
     * 银行侧联名账户名称
     */
    private String jointAccountName;

    /**
     * 联名账户银行编码
     */

    private String jointAccountBankCode;

    /**
     * 联名账户银行联行号
     */
    private String jointAccountBankIBKN;

    //付款人
    /**
     * 付款人银行编码
     */
    private String payerBankSwiftCode;

    /**
     * 付款人银行名字
     */
    private String payerBankName;

    /**
     * 付款人银行账号
     */
    private String payerBankAccountNo;

    /**
     * 付款人名称
     */
    private String payerName;

    //////////操作信息/////////
    /**
     * 操作描述
     */
    private String memo;

    /**
     * 记录新增时间
     */
    private Date rawAddTime;

    /**
     * 记录最后更新时间
     */
    private Date rawUpdateTime;

    public String getFundInBizNo() {
        return fundInBizNo;
    }

    public void setFundInBizNo(String fundInBizNo) {
        this.fundInBizNo = fundInBizNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
    }

    public String getBankSerialNo() {
        return bankSerialNo;
    }

    public void setBankSerialNo(String bankSerialNo) {
        this.bankSerialNo = bankSerialNo;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJointAccountNo() {
        return jointAccountNo;
    }

    public void setJointAccountNo(String jointAccountNo) {
        this.jointAccountNo = jointAccountNo;
    }

    public String getUseFor() {
        return useFor;
    }

    public void setUseFor(String useFor) {
        this.useFor = useFor;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getJointAccountName() {
        return jointAccountName;
    }

    public void setJointAccountName(String jointAccountName) {
        this.jointAccountName = jointAccountName;
    }

    public String getJointAccountBankCode() {
        return jointAccountBankCode;
    }

    public void setJointAccountBankCode(String jointAccountBankCode) {
        this.jointAccountBankCode = jointAccountBankCode;
    }

    public String getJointAccountBankIBKN() {
        return jointAccountBankIBKN;
    }

    public void setJointAccountBankIBKN(String jointAccountBankIBKN) {
        this.jointAccountBankIBKN = jointAccountBankIBKN;
    }

    public String getPayerBankSwiftCode() {
        return payerBankSwiftCode;
    }

    public void setPayerBankSwiftCode(String payerBankSwiftCode) {
        this.payerBankSwiftCode = payerBankSwiftCode;
    }

    public String getPayerBankName() {
        return payerBankName;
    }

    public void setPayerBankName(String payerBankName) {
        this.payerBankName = payerBankName;
    }

    public String getPayerBankAccountNo() {
        return payerBankAccountNo;
    }

    public void setPayerBankAccountNo(String payerBankAccountNo) {
        this.payerBankAccountNo = payerBankAccountNo;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }
}
