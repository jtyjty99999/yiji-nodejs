package com.yiji.openapi.message.mpay.sdk.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * Created by hgeshu@yiji.com on 2016/7/14.
 */
public class MpayProfession {

    /**
     * 职业代码
     */
    @OpenApiField(desc = "职业代码",demo = "123")
    private String professionCode;
    /**
     * 职业名称
     */
    @OpenApiField(desc = "职业名称",demo = "公务员")
    private String professionName;
    /**
     * 是否为默认职业:0否、1是
     */
    @OpenApiField(desc = "是否为默认职业",demo = "0",constraint = "{\"data\":[\"0:否\",\"1:是\"],\"name\":\"是否为默认职业\"}")
    private String selected = "0";

    public String getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(String professionCode) {
        this.professionCode = professionCode;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }
}
