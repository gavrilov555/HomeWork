package Lesson2;

import java.util.ArrayList;

public class ArrayListRun {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        ArrayList planes = new ArrayList();

        cars.add("Audi");
        cars.add("BMW");
        cars.add("KIA");
        cars.add("Nissan");
        cars.add("Mitsubishi");
        cars.add("Citroen");
        cars.remove(5);
        cars.set(2,"Porsche");

        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.isEmpty());
        System.out.println(cars.size());

        cars.add("Audi");
        System.out.println("Сравнение ArrayList: " + cars.equals(planes));

    }
}
