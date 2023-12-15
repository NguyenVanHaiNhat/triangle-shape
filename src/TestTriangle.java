import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle("red", false, 2.0, 3.0, 4.0);
        System.out.println(triangle);
    }
}
