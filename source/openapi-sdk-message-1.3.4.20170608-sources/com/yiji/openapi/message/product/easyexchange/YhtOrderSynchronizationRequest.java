/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-07-05 14:58 创建
 *
 */
package com.yiji.openapi.message.product.easyexchange;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-07-05
 */
@OpenApiMessage(service = "yhtOrderSynchronization", type = ApiMessageType.Request)
public class YhtOrderSynchronizationRequest extends ApiRequest {

    /** 文件批处理方式
     *  暂时只支持默认处理方式
     * */
    @NotBlank
    @OpenApiField(desc = "文件批处理方式" , demo = "DEFAULT_WAY" , constraint = "默认DEFAULT_WAY")
    private String processMode;

    /** 请求时间 */
    @NotNull
    @OpenApiField(desc = "请求时间" , demo = "yyyy-MM-dd HH:mm:ss" , constraint = "")
    private String requestDate;

    /** 文件名  */
    @NotBlank
    @OpenApiField(desc = "文件名" , demo = "文件" , constraint = "")
    private String fetchFileName;

    /** 文件在ftp上面的目录 */
    @NotBlank
    @OpenApiField(desc = "文件在ftp上面的目录" , demo = "C:\\Users\\Public\\Documents" , constraint = "")
    private String fetchFilePath;

    /** 文件MD5码　*/
    @NotBlank
    @OpenApiField(desc = "文件MD5码" , demo = "ada41d5as6d145as6d15as614d5as6d" , constraint = "")
    private String fetchFileMD5;

    /**付款号 */
    @NotBlank
    @OpenApiField(desc = "付款号" , demo = "021505105002100041212" , constraint = "")
    private String crossPayNo;

    public String getProcessMode() {
        return processMode;
    }

    public void setProcessMode(String processMode) {
        this.processMode = processMode;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getFetchFileName() {
        return fetchFileName;
    }

    public void setFetchFileName(String fetchFileName) {
        this.fetchFileName = fetchFileName;
    }

    public String getFetchFilePath() {
        return fetchFilePath;
    }

    public void setFetchFilePath(String fetchFilePath) {
        this.fetchFilePath = fetchFilePath;
    }

    public String getFetchFileMD5() {
        return fetchFileMD5;
    }

    public void setFetchFileMD5(String fetchFileMD5) {
        this.fetchFileMD5 = fetchFileMD5;
    }

    public String getCrossPayNo() {
        return crossPayNo;
    }

    public void setCrossPayNo(String crossPayNo) {
        this.crossPayNo = crossPayNo;
    }
}
