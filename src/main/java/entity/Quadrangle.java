package entity;

import java.util.Objects;

public class Quadrangle {
private Point firstPoint;
private Point secondPoint;
private Point thirdPoint;
private Point fourthPoint;

    public Quadrangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.fourthPoint = fourthPoint;
    }

    public Point getFirstPoint() {

        return firstPoint;
    }

    public Point getSecondPoint() {

        return secondPoint;
    }

    public Point getThirdPoint() {

        return thirdPoint;
    }


    public Point getFourthPoint() {

        return fourthPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public void setThirdPoint(Point thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public void setFourthPoint(Point fourthPoint) {
        this.fourthPoint = fourthPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Quadrangle that = (Quadrangle) o;
        return Objects.equals(firstPoint, that.firstPoint) &&
                Objects.equals(secondPoint, that.secondPoint) &&
                Objects.equals(thirdPoint, that.thirdPoint) &&
                Objects.equals(fourthPoint, that.fourthPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPoint, secondPoint, thirdPoint, fourthPoint);
    }
}
