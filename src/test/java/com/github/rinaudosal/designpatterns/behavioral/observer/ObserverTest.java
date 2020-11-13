package com.github.rinaudosal.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ObserverTest {

    @Spy
    PhoneClient phoneClient;

    @Spy
    TabletClient tabletClient;

    @Test
    public void observerWorks() {
        // create a concrete subject
        Subject subject = new MessageStream();

        // register two client to subject
        phoneClient.subscribe(subject);
        tabletClient.subscribe(subject);

        //add message to single client and verify that call two update
        phoneClient.addMessage("Here is a new message!");

        // verify that two registered client are called
        Mockito.verify(phoneClient).update();
        Mockito.verify(tabletClient).update();

//        Mockito.verify(phoneClient.update()).
//            Assertions.assertThat(phoneClient.update()).;
//
//        tabletClient.addMessage("Another new message!");
    }

}
