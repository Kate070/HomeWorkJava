package task1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int a = 2;
        int b = a++ * (--a * a);
        System.out.println(b);

        int c = 4;
        int d = c >> 1;
        System.out.println(d);
    }
}
