package com.github.rinaudosal.designpatterns.behavioral.chain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class to Test my chain of responsability
 * 2019/07/16
 *
 * @author Sirius
 */
public class ChainTest {

    private HandlerRole target;

    @BeforeEach
    public void setUp() {
        // construct my chain to test
        CEORole jeff = new CEORole(null);
        VPRole crystal = new VPRole(jeff);
        target = new DirectorRole(crystal);
    }

    @Test
    public void chainNotAcceptEmptyRequest() {
        assertThrows(NullPointerException.class, () -> {
            target.handleRequest(null);
        });
    }

    @Test
    public void chainAcceptAllRequestTypeAndEmptyAmount() {
        Assertions.assertThat(target.handleRequest(new Request(RequestType.CONFERENCE, 100000)))
                .isExactlyInstanceOf(DirectorRole.class);

        Assertions.assertThat(target.handleRequest(new Request(RequestType.PURCHASE, 0)))
                .isExactlyInstanceOf(VPRole.class);

        Assertions.assertThat(target.handleRequest(new Request(RequestType.PURCHASE, 10000)))
                .isExactlyInstanceOf(CEORole.class);

    }

}
