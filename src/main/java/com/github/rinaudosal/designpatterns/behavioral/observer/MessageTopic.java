package com.github.rinaudosal.designpatterns.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Observable
 */
public class MessageTopic {
    private String news;

    private PropertyChangeSupport support;

    public MessageTopic() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void sendTopicNews(String news) {
        support.firePropertyChange("news", this.news, news);
        this.news = news;
    }
}
