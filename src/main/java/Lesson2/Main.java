package Lesson2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();

        cars.add("Mitsubishi");
        cars.add("BMW");
        cars.add("KIA");
        cars.add("Alfa Romeo");
        cars.add("Citroen");
        cars.add("Porsche");
        cars.addFirst("Audi");
        cars.addLast("ZAZ");
        cars.removeFirst();
        cars.removeLast();
        cars.set(1,"Mitsubishi-Nissan");
        //System.out.println(cars.removeFirst());
        System.out.println(cars);
        System.out.println("Update: " + cars);

    }

}
