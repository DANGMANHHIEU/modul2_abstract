package ex2;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ComparableCircle[] circle = new ComparableCircle[3];
        circle[0] = new ComparableCircle(2.0);
        circle[1] = new ComparableCircle();
        circle[2] = new ComparableCircle("blue", true, 5.0);

        System.out.println("chua sap xep");
        for (int i = 0; i < circle.length; i++) {
            System.out.println(circle[i]);
        }

        System.out.println("sap xep lai:");
        Arrays.sort(circle);
        for (int i = 0; i < circle.length; i++) {
            System.out.println(circle[i]);
        }
    }
}