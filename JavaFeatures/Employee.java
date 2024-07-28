package JavaFeatures;

public record Employee(int regNo, String name) {

    public int regNo(){
        System.out.println("Reg no : "+regNo);
        return regNo;
    }

    public String getName(){
        System.out.println("Name : "+name);
        return name;
    }

}
