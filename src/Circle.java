public class Circle {
    private double radius = 5;
    private String color = "blue";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString(){
        return "A Circle with radius = "
                + this.radius
                + ",color of "
                + this.color;
    }
}
