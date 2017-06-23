package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

/**
 * Created by tyongfu@yiji.com on 2016/1/28.
 */
public class BasicForwardInfo implements Serializable {

    private String openApiService;

    private String service;

    private String forwardUrl;

    private String key;

    private String systemFrom;

    public String getOpenApiService() {
        return openApiService;
    }

    public void setOpenApiService(String openApiService) {
        this.openApiService = openApiService;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getForwardUrl() {
        return forwardUrl;
    }

    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSystemFrom() {
        return systemFrom;
    }

    public void setSystemFrom(String systemFrom) {
        this.systemFrom = systemFrom;
    }
}
