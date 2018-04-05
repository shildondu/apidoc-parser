package com.shildon.apidoc.model;

import java.util.List;

/**
 * 接口模型
 */
public class Interface {
    private String title;
    private String description;
    private String protocol;
    private String url;
    private String method;
    private List<Param> requestParams;
    private List<Param> responseParams;

    @Override
    public String toString() {
        return "Interface{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", protocol='" + protocol + '\'' +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", requestParams=" + requestParams +
                ", responseParams=" + responseParams +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Param> getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(List<Param> requestParams) {
        this.requestParams = requestParams;
    }

    public List<Param> getResponseParams() {
        return responseParams;
    }

    public void setResponseParams(List<Param> responseParams) {
        this.responseParams = responseParams;
    }
}
