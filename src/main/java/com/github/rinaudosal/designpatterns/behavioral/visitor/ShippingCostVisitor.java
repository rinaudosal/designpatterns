package com.github.rinaudosal.designpatterns.behavioral.visitor;

import java.util.List;

public class ShippingCostVisitor implements CarPartVisitor {
    private double totalShippingCost;

    public double getTotalShippingCost() {
        return totalShippingCost;
    }

    @Override
    public void visit(OilPart oilPart) {
        totalShippingCost += 3;
    }

    @Override
    public void visit(PortPart portPart) {
        totalShippingCost += 30;
    }

    @Override
    public void visit(WheelPart wheelPart) {
        totalShippingCost += 15;
    }

    @Override
    public void visit(MultipleCarParts multipleCarParts) {
        List<CarPart> parts = multipleCarParts.getCarPartList();
        if (parts.size() >= 3) {
            totalShippingCost -= 5;
        }
    }
}
