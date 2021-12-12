package logic;

import entity.Point;
import entity.Quadrangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class.getName());

    public List<Double> getCordsOfShape(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint){
        double firstX=firstPoint.getX();
        double secondX=secondPoint.getX();
        double thirdX=thirdPoint.getX();
        double fourthX=fourthPoint.getX();
        double firstY=firstPoint.getY();
        double secondY=secondPoint.getY();
        double thirdY=thirdPoint.getY();
        double fourthY=fourthPoint.getY();

        List<Double> cords = new ArrayList<>();
        cords.add(firstX);
        cords.add(secondX);
        cords.add(thirdX);
        cords.add(fourthX);
        cords.add(firstY);
        cords.add(secondY);
        cords.add(thirdY);
        cords.add(fourthY);

        return cords;
    }

    public List<Double> getLengthOfEdges(Quadrangle quadrangle){

        List<Double> cords =getCordsOfShape(quadrangle.getFirstPoint(),quadrangle.getSecondPoint(), quadrangle.getThirdPoint(), quadrangle.getFourthPoint());

        List<Double> edges = new ArrayList<>();
        double firsEdge= Math.sqrt(Math.pow((cords.get(1)-cords.get(0)),2)+Math.pow(cords.get(5)-cords.get(4),2));
        edges.add(firsEdge);
        double secondEdge= Math.sqrt(Math.pow((cords.get(2)-cords.get(1)),2)+Math.pow(cords.get(6)-cords.get(5),2));
        edges.add(secondEdge);
        double thirdEdge= Math.sqrt(Math.pow((cords.get(3)-cords.get(2)),2)+Math.pow(cords.get(7)-cords.get(6),2));
        edges.add(thirdEdge);
        double fourthEdge= Math.sqrt(Math.pow((cords.get(0)-cords.get(3)),2)+Math.pow(cords.get(4)-cords.get(7),2));
        edges.add(fourthEdge);

        return edges;
    }

   public double calculatePerimeter(Quadrangle quadrangle){

        List<Double> edges = getLengthOfEdges(quadrangle);

       double firsEdge = edges.get(0);
       double secondEdge=edges.get(1);
       double thirdEdge= edges.get(2);
       double fourthEdge=edges.get(3);

       logger.info("perimeter was calculated");
       return firsEdge+secondEdge+thirdEdge+fourthEdge;
   }

    public double calculateSquare(Quadrangle quadrangle){

        List<Double> edges = getLengthOfEdges(quadrangle);
        double firsEdge = edges.get(0);
        double secondEdge=edges.get(1);
        double thirdEdge= edges.get(2);
        double fourthEdge=edges.get(3);

        double halfPerimeter=calculatePerimeter(quadrangle)/2;

        double square= Math.sqrt((halfPerimeter-firsEdge)*(halfPerimeter-secondEdge)*(halfPerimeter-thirdEdge)*(halfPerimeter-fourthEdge));

        return square;
    }

    public boolean isQuadrangleConvex(Quadrangle quadrangle){

        List<Double> cords =getCordsOfShape(quadrangle.getFirstPoint(),quadrangle.getSecondPoint(), quadrangle.getThirdPoint(), quadrangle.getFourthPoint());
        double firstY=cords.get(4);
        double secondY=cords.get(5);
        double thirdY=cords.get(6);

        double pointHeight;
        double halfHeight;
        if (secondY>thirdY){
            halfHeight= (secondY-firstY)/2;
            pointHeight=thirdY-firstY;
        } else {
            halfHeight=(thirdY-firstY)/2;
            pointHeight=secondY-firstY;
        }
        return (pointHeight>halfHeight);
    }

    public boolean isQuadrangleSquare(Quadrangle quadrangle){

        List<Double> cords =getCordsOfShape(quadrangle.getFirstPoint(),quadrangle.getSecondPoint(), quadrangle.getThirdPoint(), quadrangle.getFourthPoint());

        double firstX=cords.get(0);
        double secondX=cords.get(1);
        double thirdX=cords.get(2);
        double fourthX=cords.get(3);
        double firstY=cords.get(4);
        double secondY=cords.get(5);
        double thirdY=cords.get(6);
        double fourthY=cords.get(7);

        return (firstX==secondX && firstY==fourthY && secondY==thirdY&& thirdX==fourthX);

    }
    public boolean isQuadrangleTrapezoid(Quadrangle quadrangle){

        List<Double> cords =getCordsOfShape(quadrangle.getFirstPoint(),quadrangle.getSecondPoint(), quadrangle.getThirdPoint(), quadrangle.getFourthPoint());

        double firstX=cords.get(0);
        double secondX=cords.get(1);
        double thirdX=cords.get(2);
        double fourthX=cords.get(3);
        double firstY=cords.get(4);
        double secondY=cords.get(5);
        double thirdY=cords.get(6);
        double fourthY=cords.get(7);

        return (firstY==fourthY && thirdY==secondY) ||( firstX==secondX && thirdX==fourthX);

    }

    public boolean isQuadrangleRhomb(Quadrangle quadrangle){

        List<Double> edges = getLengthOfEdges(quadrangle);
        double firsEdge = edges.get(0);
        double secondEdge=edges.get(1);
        double thirdEdge= edges.get(2);
        double fourthEdge=edges.get(3);

        return (firsEdge==secondEdge && thirdEdge==fourthEdge);

    }

}
