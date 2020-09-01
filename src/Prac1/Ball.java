package Prac1;

public class Ball {
    private String color;
    private double radius;

    public Ball()
    {
        this.color = "white";
        this.radius = 1.0;
    }

    public Ball(String color, double radius)
    {
        this.color = color;
        this.radius= radius;
    }

    public Ball(String color)
    {
        this.color = color;
    }

    public Ball(double radius)
    {
        this.radius = radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public String getColor()
    {
        return this.color;
    }

    public double getRadius()
    {
        return this.radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
