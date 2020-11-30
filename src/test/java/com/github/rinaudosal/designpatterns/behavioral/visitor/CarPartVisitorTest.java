package com.github.rinaudosal.designpatterns.behavioral.visitor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarPartVisitorTest {
    @Test
    void shouldVisitCorrectly() {
        MultipleCarParts order = new MultipleCarParts();
        order.addPart(new WheelPart());
        order.addPart(new PortPart());
        order.addPart(new OilPart());

        ShippingCostVisitor shippingCostVisitor = new ShippingCostVisitor();
        order.accept(shippingCostVisitor);

        Assertions.assertThat(shippingCostVisitor.getTotalShippingCost()).isEqualTo(43.0);
    }
}
