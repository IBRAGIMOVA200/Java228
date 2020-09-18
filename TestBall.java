package Lab3;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball( 50, 70);
        Ball b2 = new Ball( 100, 90);
        Ball b3 = new Ball( 150, 80);
        Ball b4 = new Ball( 160, 100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move(10, 30);
        b2.move(15, 40);
        b3.move(19, 20);
        b4.move(30, 37);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
