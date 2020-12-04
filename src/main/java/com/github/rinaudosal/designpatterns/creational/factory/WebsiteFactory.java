package com.github.rinaudosal.designpatterns.creational.factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteEnum websiteEnum) {
        if (websiteEnum == WebsiteEnum.BLOG) {
            return new BlogWebsite();
        }
        if (websiteEnum == WebsiteEnum.SHOP) {
            return new ShopWebsite();
        }

        return null;
    }
}
