package com.yiji.openapi.message.product.ccp.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * Created by Administrator on 2016/3/25.
 */
public class AttachmentInfoDto {

    @OpenApiField(desc = "请求路径http格式",demo = "http://image.yiji.com/wewe/wewe/wew.jpg")
    private String webPath;

    @OpenApiField(desc = "附件类型",demo = "REAL_CERT_CERTIFY")
    private String type;

    @OpenApiField(desc = "附件标题",demo = "身份证正面原件")
    private String title;

    public String getWebPath() {
        return webPath;
    }

    public void setWebPath(String webPath) {
        this.webPath = webPath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


