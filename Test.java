import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 8 primitive types
        boolean bool = false;   // 1 bit
        byte b = 0;     // 8 bits
        short sh = 0;   // 16 bits
        char c = 0;     // 16 bits
        int i = 0;      // 32 bits
        float f = 0.0f;    // 32 bits
        long l = 0;     // 64 bits
        double d = 0.0;   // 64 bits


        // rest - reference type - default value is null
        String myString = "hello";
        Scanner str = new Scanner("hello.txt");

        int[] arrOfInt = new int[10];

        Test2 point1 = new Test2();
        Test2 point2 = new Test2();
        System.out.println(point1 == point2);


    }
}
