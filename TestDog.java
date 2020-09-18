package Lab1;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("ОРТУР", 2);
        Dog d2 = new Dog("Лёлик", 3);
        Dog d3 = new Dog("Кузя");
        d3.setAge(4);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
