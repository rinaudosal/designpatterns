package com.github.rinaudosal.designpatterns.creational.factory;

import java.util.Arrays;

public class BlogWebsite extends Website {
    @Override
    protected void createWebsite() {
        this.setSiteName("Blog");
        this.setPages(Arrays.asList("about", "post", "contact"));
    }
}
