package ex2;

public class ComparableCircle extends  circle implements Comparable<ComparableCircle>{

    public ComparableCircle(){}
    public ComparableCircle(String color,boolean filled,double radius){
        super(color,filled,radius);
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius()>o.getRadius())return 1;
        else if(getRadius()<o.getRadius())return -1;
        return 1;
    }
}
