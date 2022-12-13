package uz.pdp.enums.equals_hashcode;

import java.util.Objects;

public class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null) {
//            return false;
//        }
//        if (!(o instanceof Person)) {
//            return false;
//        }
//        Person person = (Person) o;
//        if (!this.name.equals(person.name)) {
//            return false;
//        }
//        if (this.age != person.age) {
//            return false;
//        }
//        return true;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return Objects.equals(name, person.name);
    }


//    @Override
//    public int hashCode() {
//        return age * name.hashCode();
//    }


//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 31 * hash + age;
//        hash = 31 * hash + (name == null ? 0 : name.hashCode());
//        return hash;
//    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
