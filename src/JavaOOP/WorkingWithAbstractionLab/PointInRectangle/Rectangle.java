package JavaOOP.WorkingWithAbstractionLab.PointInRectangle;

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
        if (point.getCordinatesY() < bottomLeft.getCordinatesY() || point.getCordinatesY() > topRight.getCordinatesY()) {
            return false;
        }
        return true;
    }
}
