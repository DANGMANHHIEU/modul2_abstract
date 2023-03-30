package ex2;

public class rectangle extends Shape{
    private double width =1.0;
    private double length =1.0;
    public rectangle(){};
    public rectangle(String color, boolean filled,double width,double length){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    public String toString(){
        return "A rectangle with width= "+getWidth()+" and length= "+getLength()+" , which is a subclass "+super.toString();
    }
}
