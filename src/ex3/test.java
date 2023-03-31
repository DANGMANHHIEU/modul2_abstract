package ex3;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0]=new Circle(3.0);
        circles[1]=new Circle();
        circles[2]=new Circle(2.0);
        System.out.println("circle");
        for (Circle c:circles){
            System.out.println(c);
        }
        System.out.println();
        Comparator a =new CircleTest();
        Arrays.sort(circles,a);
        System.out.println("circle:");
        for (Circle c:circles){
            System.out.println(c);
        }
    }
}
