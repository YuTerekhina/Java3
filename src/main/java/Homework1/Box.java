package Homework1;

import java.util.ArrayList;
import java.util.List;

class Box<V extends Fruits> {

    private List<V> list = new ArrayList<>();

    public Box() {
    }

    public void add(V fruit) {
        list.add(fruit);
    }

    public void moveFruits(Box<V> anotherBox) {
        for (V fruit : anotherBox.list) {
            list.add(fruit);
        }
        anotherBox.list.clear();
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public double getWeight() {
        double sum = 0.0;
        for (V fruit : list) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void infoFruits() {

        if (list.size() < 1) {
            System.out.println("Из запрошенной коробки все фрукты были переложены в другую коробку.");
            return;
        }
        String name = list.get(0).getName();
        double weight = list.get(0).getWeight();
        double totalWeight = weight * list.size();
        System.out.println("В коробке " + name + ", количество " + list.size() + " шт. Общий вес: " + totalWeight + " кг.");
    }
}
