package Lesson1.Builder;

public class TwoPerson extends BuilderPerson {

    @Override
    void buildFirstName() {
        person.setFirstName("Антонов");
    }

    @Override
    void buildLastName() {
        person.setLastName("Антон");

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
        person.setAddress("Yekaterinburg, Malysheva street");

    }

    @Override
    void buildPhone() {
        person.setPhone("89050505505");

    }

    @Override
    void buildAge() {
        person.setAge(30);

    }

    @Override
    void buildGender() {
        person.setGender("M");

    }

}
