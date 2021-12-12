package logic;

import entity.Point;
import entity.Quadrangle;

import java.util.ArrayList;
import java.util.List;

public class QuadrangleObservable extends Quadrangle implements Observable {
    private final Integer id;
    private final List<Observer> observers=new ArrayList<>();
    public QuadrangleObservable(Integer id, Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        super(firstPoint, secondPoint, thirdPoint, fourthPoint);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setFirstPoint(Point firstPoint){
        super.setFirstPoint(firstPoint);
        notifyObservers();
    }
    @Override
    public void setSecondPoint(Point secondPoint){
        super.setSecondPoint(secondPoint);
        notifyObservers();
    }
    @Override
    public void setThirdPoint(Point thirdPoint){
        super.setThirdPoint(thirdPoint);
        notifyObservers();
    }
    @Override
    public void setFourthPoint(Point fourthPoint){
        super.setFourthPoint(fourthPoint);
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers){
            observer.update(this);
        }
    }

}
