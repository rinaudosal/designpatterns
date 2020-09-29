package ch.codeway.sirius.designpattern.behavioral.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
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
