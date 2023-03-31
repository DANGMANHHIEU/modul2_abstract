package bai1;

public class test {
    public static void main(String[] args) {
        Resizeable[] r = new Resizeable[2];
        r[0 ]= new circle(2.0);
        r[1]=new circle();

        circle a =(circle) r[0];
        a.resize(100.0);
        System.out.println(a.getRadius());
    }
}
