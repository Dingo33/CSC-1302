
//(1)
public class Circle {
    //(8) (a)
    private double radius;
    //    (b) encapsulate so no outside class can access private data fields of another class
    //    (c) error 'radius' has private access in 'circle'
    //    (d) because C1 was accessing the data directly from Circle, not using a getter


    //(3)
    public Circle(){
        this.radius = 3.5;
    }
    //(4)
    public  Circle(double radius){
        this.radius = radius;
    }
    //(6) (a) error miss return statement
    //    (b) means that if it has a return type, it has to actually return something

    //(7) (a)
    public double getRadius() {
        return radius;
    }
    //    (b) return type should be double
    //    (c) because radius is a double
    //    (d) radius is a class field

    //(9) (a)
    public double print(){
        return getRadius();
    }

    //(10) (a)
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //     (b) return type should be void
    //     (c) it isn't return anything, just changing a value
    //     (d) we must pass parameters to the setter

    //(12) (a)
    //     (b) return type should be double
    //     (c) because radius is a double and the area is likely going to be a decimal
    //     (d) no parameters because radius is a class field
    public double area() {
        return Math.pow(radius, 2)*Math.PI;
    }


}
