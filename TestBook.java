package Lab2;
import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book d1 = new Book("Американские Боги", "Н.Гейман", 560, 700);
        Book d2 = new Book("Божественная Комедия","А.Данте", 400,400);
        Book d3 = new Book("Код да Винчи","Т.Эгеланн", 600,500);
        System.out.println(d1);
        d1.getprice();
        d2.getprice();
        d3.getprice();
    }
}
