package com.github.rinaudosal.designpatterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteFactoryTest {

    @Test
    void factoryInstanceReturnsBlogDataCorrectly() {
        Website blog = WebsiteFactory.getWebsite(WebsiteEnum.BLOG);

        assertThat(blog.getSiteName()).isEqualTo("Blog");
        assertThat(blog.getPages()).hasSize(3);
        assertThat(blog.getPages()).containsExactly("about", "post", "contact");

    }

    @Test
    void factoryInstanceReturnsShopDataCorrectly() {
        Website blog = WebsiteFactory.getWebsite(WebsiteEnum.SHOP);

        assertThat(blog.getSiteName()).isEqualTo("Shop");
        assertThat(blog.getPages()).hasSize(3);
        assertThat(blog.getPages()).containsExactly("cart", "search", "contact");
    }

    @Test
    void factoryInstanceReturnsNullData() {
        assertThat(WebsiteFactory.getWebsite(null)).isNull();
    }


}
