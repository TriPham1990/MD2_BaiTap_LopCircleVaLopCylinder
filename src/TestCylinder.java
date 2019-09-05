public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());

        cylinder.setHeight(10);
        cylinder.setColor("purple");
        cylinder.setRadius(7);
        System.out.println(cylinder);
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());
    }
}
