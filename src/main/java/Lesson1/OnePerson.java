package Lesson1;

public class OnePerson extends BuilderPerson {

    @Override
    void buildFirstName() {
        person.setFirstName("Иванов");
    }

    @Override
    void buildLastName() {
        person.setLastName("Иван");

    }

    @Override
    void buildMiddleName() {
        person.setMiddleName("Иванович");

    }

    @Override
    void buildCountry() {
        person.setCountry("Russia");

    }

    @Override
    void buildAddress() {
        person.setAddress("Moscow, Kutuzovsky Prospekt");

    }

    @Override
    void buildPhone() {
        person.setPhone("89090099909");

    }

    @Override
    void buildAge() {
        person.setAge(25);

    }

    @Override
    void buildGender() {
        person.setGender("M");

    }

}
