package functionalprg;

public class FinderImpl {
    public static void main(String[] args) {
        Finder finder = String::indexOf;
        Finder finder1 = (s1, s2) -> s1.indexOf(s2);
        int i = finder.find("abc", "a");
        int i1 = finder1.find("abc", "c");
        System.out.println("index = "+i);
        System.out.println("index = "+i1);


        Finder1 finder11 = String::length;
        System.out.println("Length : "+finder11.find("string"));
    }
}
