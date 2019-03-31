public class circleDriver {
    public static void main(String[] args) {

        // 2) (a)
        Circle circle = new Circle();
        // (b) radius will be 0.0
        // (c) the double radius has no been assign a value

        //(5)
        Circle C1 = new Circle();
        Circle C2 = new Circle(1);
        //System.out.println(C1.radius);
       // System.out.println(C2.radius);

        //(7) (a)
        System.out.println(circle.getRadius());

        //(9) (b)
        System.out.println(C1.print());

        //(11)
        C1.setRadius(15);
        C1.print();

        //(12)
        System.out.println(C1.area());

    }
}
