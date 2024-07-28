package JavaFeatures;

public class Address implements Cloneable{
    @Override
    public String toString() {
        return "Address{" +
                "postCode='" + postCode + '\'' +
                '}';
    }

     String postCode;

    public Address(String postCode){
        this.postCode = postCode;
    }

    public Object clone() throws CloneNotSupportedException {
     return super.clone();
    }


}
