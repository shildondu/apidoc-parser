package com.shildon.apidoc.model;

import java.util.List;

/**
 * 文档模型
 */
public class Document {
    private String title;
    private String description;
    private List<Interface> interfaces;

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", interfaces=" + interfaces +
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

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }
}
