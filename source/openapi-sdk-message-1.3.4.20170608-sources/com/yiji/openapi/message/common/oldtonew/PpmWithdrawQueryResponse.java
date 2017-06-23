/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-03-01 14:34 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/3/1
 */
@OpenApiMessage(service = "ppmWithdrawQuery", type = ApiMessageType.Response)
public class PpmWithdrawQueryResponse extends ApiResponse {
    @OpenApiField(desc = "管理员ID", demo = "20150519020005491913")
    private String userId;

    @OpenApiField(desc = "操作员ID", demo = "20150519020005491913")
    private String operatorId;

    @OpenApiField(desc = "操作员姓名", demo = "xx@yiji.com")
    private String operatorName;

    @OpenApiField(desc = "key", demo = "OPENAPI")
    private String key = "OPENAPI";

    @OpenApiField(desc = "gid", demo = "000f000006000000000160428160957000a")
    private String gid;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}
    
}
