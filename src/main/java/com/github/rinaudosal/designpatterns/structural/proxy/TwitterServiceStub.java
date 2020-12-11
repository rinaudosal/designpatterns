package com.github.rinaudosal.designpatterns.structural.proxy;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String username) {
        return "My " + username + " timeline";
    }

    @Override
    public void postToTimeline(String username, String message) {
        // Nothing to do
    }

}
