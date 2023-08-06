// Математические вычисления и класс Math

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result = Math.abs(-13.5); // 13.5
        System.out.println("method abs: " + result + "\n");

        double result2 = Math.acos(1); // 0.0
        System.out.println("method acos: " + result2 + "\n");

        double res3 = Math.asin(1); // 1.5707963267948966
        System.out.println("method asin: " + res3 + "\n");

        double res4 = Math.atan(1); // 0.7853981633974483
        System.out.println("method atan: " + res4 + "\n");

        double result5 = Math.cbrt(27); // 3
        System.out.println("method cbrt: " + result5 + "\n");

        double result6 = Math.ceil(2.34); // 3
        System.out.println("method ceil: " + result6 + "\n");

        double result7 = Math.floor(2.56); // 2
        System.out.println("method floor: " + result7 + "\n");

        System.out.println("method floorDiv: ");
        System.out.println(Math.floorDiv(1, 2)); // 0
        System.out.println(Math.floorDiv(7, 2)); // 3
        System.out.println(Math.floorDiv(9, 2) + "\n"); // 4

        System.out.println("method rint: ");
        System.out.println(Math.rint(2)); // 2.0
        System.out.println(Math.rint(2.3)); // 2.0
        System.out.println(Math.rint(2.5)); // 2.0
        System.out.println(Math.rint(2.5001)); // 3.0
        System.out.println(Math.rint(2.8) + "\n"); // 3.0

        System.out.println("method round: ");
        System.out.println(Math.round(2.3)); // 2
        System.out.println(Math.round(2.5)); // 3
        System.out.println(Math.round(2.5001)); // 3
        System.out.println(Math.round(2.8) + "\n"); // 3

        System.out.println("method scalb: ");
        System.out.println(Math.scalb(5, 3)); // 5*2*2*2 = 40
        System.out.println(Math.scalb(3, 4) + "\n"); // 3*2*2*2*2 = 48

        System.out.println("method signum: ");
        System.out.println(Math.signum(2.3)); // 1
        System.out.println(Math.signum(-2.3) + "\n"); // -1

        System.out.println("method sqrt: ");
        double result8 = Math.sqrt(16); // 4
        System.out.println(result8 + "\n");

        System.out.println("methos toDegrees, toRadians: ");
        System.out.println(Math.toDegrees(3.14159)); // 180
        System.out.println(Math.toRadians(90) + "\n"); // 1,57079....

        Scanner in = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        int radius = in.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2)); // 314
        System.out.printf("Площадь круга с радиусом %d равна %d \n", radius, area);
    }
}