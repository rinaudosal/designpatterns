package com.github.rinaudosal.designpatterns.behavioral.chain;

import com.github.rinaudosal.designpatterns.behavioral.chain.Request.RequestType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class to Test my chain of responsability
 * 2019/07/16
 *
 * @author Sirius
 */
public class ChainTest {

    private DirectorRoleHandler salvo;
    private VPRoleHandler vlad;

    @BeforeEach
    void setUp() {
        // In the company we have tre people with roles
        CEORoleHandler jeff = new CEORoleHandler();
        vlad = new VPRoleHandler();
        salvo = new DirectorRoleHandler();

        //Build the chain with the roles
        vlad.setSuccessor(jeff); //Jeff is the boss of vlad
        salvo.setSuccessor(vlad); // Vlad is the boss of Salvo

    }

    @Test
    void chainDontAcceptInvalidRequests() {
        assertThrows(NullPointerException.class, () -> {
            salvo.handleRequest(null);
        });
    }

    @Test
    void directorRoleAcceptOnlyConferences() {
        //DIrector accepts all conferences request
        assertThat(salvo.handleRequest(new Request(RequestType.CONFERENCE, 100000)))
                .isEqualTo("Director has Approved the request CONFERENCE with amount 100000.0");
    }

    @Test
    void nonConferenceIsNotManagedByDirector() {
        //Purchase request with amount<=1500 is managed by VP
        assertThat(salvo.handleRequest(new Request(RequestType.PURCHASE, 0)))
                .isEqualTo("VPs has Approved the request PURCHASE with amount 0.0");
        assertThat(salvo.handleRequest(new Request(RequestType.PURCHASE, 1500)))
                .isEqualTo("VPs has Approved the request PURCHASE with amount 1500.0");

        //Purchase request with amount>1500 is managed by VP
        assertThat(salvo.handleRequest(new Request(RequestType.PURCHASE, 1501)))
                .isEqualTo("CEO has Approved the request PURCHASE with amount 1501.0");

        //ALL remaining requests is managed by CEO
        assertThat(salvo.handleRequest(new Request(RequestType.PURCHASE, 10000)))
                .isEqualTo("CEO has Approved the request PURCHASE with amount 10000.0");
    }

    @Test
    void vpRoleCannotManageConferenceRequests() {
        assertThrows(UnsupportedOperationException.class, () -> {
            vlad.handleRequest(new Request(RequestType.CONFERENCE, 10000));
        });
    }


}
