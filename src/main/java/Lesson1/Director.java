package Lesson1;

public class Director {

    BuilderPerson builder;

    public void setBuilder(BuilderPerson builder) {
        this.builder = builder;
    }

    Person buildPerson() {
        builder.createPerson();
        builder.buildFirstName();
        builder.buildLastName();
        builder.buildMiddleName();
        builder.buildCountry();
        builder.buildAddress();
        builder.buildPhone();
        builder.buildAge();
        builder.buildGender();

        Person person = builder.getPerson();

        return person;
    }
}
