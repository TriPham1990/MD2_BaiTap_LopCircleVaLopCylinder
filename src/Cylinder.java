public class Cylinder extends Circle {
    private double height = 2;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public double getPerimeter(){
        return super.getPerimeter() * this.height;
    }

    @Override
    public String toString(){
        return "A Cylinder with radius = "
                + super.getRadius()
                + ",color of "
                + super.getColor();
    }
}
