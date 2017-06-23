package com.yiji.openapi.message.common.oldtonew.info;

import java.util.List;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author hgeshu@yiji.com
 * @since 2016-01-18 17:34.
 */
public class PayableInfos {
    /** 机构编码 */
    @OpenApiField(desc = "机构编码",demo = "1465135436")
    private String agencyCode;

    /** 用户编码 */
    @OpenApiField(desc = "用户编码",demo = "165412658")
    private String userCode;

    /** 用户姓名 */
    @OpenApiField(desc = "用户姓名",demo = "易极付")
    private String username;

    /** 用户地址 */
    @OpenApiField(desc = "用户地址",demo = "重庆市黄山大道")
    private String address;

    /** 查询结果项目 */
    @OpenApiField(desc = "查询结果项目",demo = "xxx")
    private List<PayableInfoItems> items;

    /** 查询结果状态是否正常 */
    @OpenApiField(desc = "查询结果状态是否正常",demo = "true",constraint = "true/false")
    private boolean isSuccess;

    @OpenApiField(desc = "扩展信息",demo = "扩展信息")
    private String extendInfo;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<PayableInfoItems> getItems() {
        return items;
    }

    public void setItems(List<PayableInfoItems> items) {
        this.items = items;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }
}
