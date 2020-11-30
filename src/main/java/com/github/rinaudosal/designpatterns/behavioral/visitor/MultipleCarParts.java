package com.github.rinaudosal.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class MultipleCarParts implements CarPart {
    private final List<CarPart> carPartList = new ArrayList<>();

    public void addPart(CarPart carPart) {
        carPartList.add(carPart);
    }

    public List<CarPart> getCarPartList() {
        return unmodifiableList(carPartList);
    }

    @Override
    public void accept(CarPartVisitor carPartVisitor) {
        carPartList.forEach(element -> element.accept(carPartVisitor));

        carPartVisitor.visit(this);
    }
}
