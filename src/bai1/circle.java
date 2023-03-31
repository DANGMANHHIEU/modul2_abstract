package bai1;

public class circle implements Resizeable{
    private double radius=1.0;
    public circle(){}
    public circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double percent) {
        this.radius= this.radius+this.radius*(percent/100);
    }
}
