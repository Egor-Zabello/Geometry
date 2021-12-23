package logic;

import entity.Point;

public class QuadrangleShapeValidator {

    public boolean isObjectIsQuadrangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint){

        double firstX=firstPoint.getX();
        double secondX=secondPoint.getX();
        double thirdX=thirdPoint.getX();
        double fourthX=fourthPoint.getX();
        double firstY=firstPoint.getY();
        double secondY=secondPoint.getY();
        double thirdY=thirdPoint.getY();
        double fourthY=fourthPoint.getY();


        return !((firstX==secondX && secondX== thirdX) || (thirdX==fourthX && fourthX==secondX))
                &&(!((firstY==secondY && secondY== thirdY) || (thirdY==fourthY && fourthY==secondY)))
                && !((firstX/firstY==secondX/secondY && thirdX/thirdY==fourthX/fourthY)||(thirdX/thirdY==secondX/secondY && thirdX/thirdY==fourthX/fourthY));
    }

}
