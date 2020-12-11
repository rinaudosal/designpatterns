package com.github.rinaudosal.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProxyTest {

    @Test
    void twitterServiceWithoutProxyShouldWorks() {
        TwitterService service = new TwitterServiceStub();
        assertThat(service.getTimeline("pippo")).isEqualTo("My pippo timeline");
        assertDoesNotThrow(() -> service.postToTimeline("svfdvd", "dfvfdv"));
    }

    @Test
    void twitterServiceWithProxyShouldWorks() {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        assertThat(service.getTimeline("pippo")).isEqualTo("My pippo timeline");
        assertThrows(RuntimeException.class, () -> service.postToTimeline("svfdvd", "dfvfdv"));
    }
}
