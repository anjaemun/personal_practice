package prac1;


public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("김재문","010101-3322443");

        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println();

        Korean k2 = new Korean("박재문", "023232-1342545");

        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
}
