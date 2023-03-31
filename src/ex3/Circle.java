package ex3;

public class Circle {
    private double radius =1.0;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String toString(){
        return "Radius{ "+getRadius()+ " }";
    }
}
