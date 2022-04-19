package Lesson1.Builder;

public class Run {
    public static void main(String[] args) {

        Director director = new Director();

        director.setBuilder(new OnePerson());
        Person person = director.buildPerson();
        System.out.println(person);

        System.out.println("=============================================");

        director.setBuilder(new TwoPerson());
        Person person2 = director.buildPerson();
        System.out.println(person2);


    }
}
