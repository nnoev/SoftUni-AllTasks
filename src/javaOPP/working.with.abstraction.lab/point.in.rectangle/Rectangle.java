package javaOPP.working.with.abstraction.lab.point.in.rectangle;

public class Rectangle {
    Point bottomLeft;
    Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }


    public boolean contains(Point point) {
        if (point.getCordinatesX() < bottomLeft.cordinatesX || point.getCordinatesX() > topRight.cordinatesX)
            return false;
        return point.getCordinatesY() >= bottomLeft.getCordinatesY() && point.getCordinatesY() <= topRight.getCordinatesY();
    }
}
