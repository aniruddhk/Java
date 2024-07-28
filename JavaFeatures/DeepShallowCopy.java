package JavaFeatures;

public class DeepShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address add = new Address("str1");
        Person person = new Person("name1", add);

        Person person1 = (Person)person.clone();
        System.out.println("Person 1: "+person);
        System.out.println("Person 2: "+person1);

        person1.address.postCode = "postCode;";
        System.out.println("After modification...");
        System.out.println("Person 1: "+person);
        System.out.println("Person 2: "+person1);
    }
}
