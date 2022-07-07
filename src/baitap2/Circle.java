package baitap2;

public class Circle {
    private double radius  = 1;

    public Circle(){

    }

    public Circle(double radius){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double dienTich = Math.pow(radius,2) *3.14;
        return dienTich;
    }


    public double getCircumference(){
        double chuVi = radius * 3.14;
        return chuVi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
