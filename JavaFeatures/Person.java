package JavaFeatures;

public class Person implements Cloneable {
     String name;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

     Address address;

    public Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.address = (Address) address.clone();
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
