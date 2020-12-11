package com.github.rinaudosal.designpatterns.structural.proxy;

public interface TwitterService {
    String getTimeline(String username);

    void postToTimeline(String username, String message);
}
