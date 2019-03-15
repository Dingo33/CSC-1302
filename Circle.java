public class Circle extends Sphere {

    public Circle(double radius){
        super(radius);
    }

    @Override
    public double surface() {
        return radius*2*Math.PI;
    }

    @Override
    public double volume() {
        return radius*radius*Math.PI;
    }


}
