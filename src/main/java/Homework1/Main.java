package Homework1;

public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        orangeBox.infoFruits();
        appleBox.infoFruits();

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.moveFruits(orangeBox);
        orangeBox1.infoFruits();
        orangeBox.infoFruits();

        System.out.println("Вес коробки апельсинов " + orangeBox1.getWeight() + " кг. и коробки яблок " + appleBox.getWeight() + " кг. " + orangeBox.compare(appleBox));
    }

}
