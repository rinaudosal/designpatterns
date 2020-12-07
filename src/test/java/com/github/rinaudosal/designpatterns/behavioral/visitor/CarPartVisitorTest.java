package com.github.rinaudosal.designpatterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarPartVisitorTest {

    @Test
    void shouldVisitCorrectly() {
        MultipleCarParts order = new MultipleCarParts();
        order.addPart(new WheelPart());
        order.addPart(new PortPart());
        order.addPart(new OilPart());

        ShippingCostVisitor shippingCostVisitor = new ShippingCostVisitor();
        order.accept(shippingCostVisitor);

        assertThat(shippingCostVisitor.getTotalShippingCost()).isEqualTo(43.0);
    }

    @Test
    void shouldVisitForTwoOrder() {
        MultipleCarParts order = new MultipleCarParts();
        order.addPart(new WheelPart());
        order.addPart(new PortPart());

        ShippingCostVisitor shippingCostVisitor = new ShippingCostVisitor();
        order.accept(shippingCostVisitor);

        assertThat(shippingCostVisitor.getTotalShippingCost()).isEqualTo(45.0);
    }
}
