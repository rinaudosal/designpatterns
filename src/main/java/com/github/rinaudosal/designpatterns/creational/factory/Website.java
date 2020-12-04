package com.github.rinaudosal.designpatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    private String siteName;
    private List<String> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public List<String> getPages() {
        return pages;
    }

    public void setPages(List<String> pages) {
        this.pages = pages;
    }
}

