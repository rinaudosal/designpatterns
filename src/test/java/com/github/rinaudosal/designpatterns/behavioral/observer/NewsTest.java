package com.github.rinaudosal.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NewsTest {

    @Test
    void iCanSendATopicInTwoChannel() {
        MessageTopic newsToComunicate = new MessageTopic(); //Observable
        NewsChannel twitter = new NewsChannel(); //Observer
        NewsChannel facebook = new NewsChannel(); //Observer

        newsToComunicate.addPropertyChangeListener(twitter);
        newsToComunicate.addPropertyChangeListener(facebook);
        newsToComunicate.sendTopicNews("Hey, Salvo have a great news!");

        assertThat(twitter.getNews()).isEqualTo("Hey, Salvo have a great news!");
        assertThat(facebook.getNews()).isEqualTo("Hey, Salvo have a great news!");
    }

    @Test
    void ifIRemoveTheTopicNothingMessagesAreSent() {
        MessageTopic newsToComunicate = new MessageTopic(); //Observable
        NewsChannel twitter = new NewsChannel(); //Observer
        NewsChannel facebook = new NewsChannel(); //Observer

        newsToComunicate.addPropertyChangeListener(twitter);
        newsToComunicate.addPropertyChangeListener(facebook);
        newsToComunicate.sendTopicNews("Hey, Salvo have a great news!");

        assertThat(twitter.getNews()).isEqualTo("Hey, Salvo have a great news!");
        assertThat(facebook.getNews()).isEqualTo("Hey, Salvo have a great news!");

        newsToComunicate.removePropertyChangeListener(facebook);
        newsToComunicate.sendTopicNews("Well, done!");

        assertThat(twitter.getNews()).isEqualTo("Well, done!");
        assertThat(facebook.getNews()).isEqualTo("Hey, Salvo have a great news!");

    }
}
