package logic;

import entity.Point;
import entity.Quadrangle;

public class QuadrangleCreator {
    public static final String DELIMITER = " ";

    private Point createPoint(String x, String y ){
        double xCord =Double.parseDouble(x);
        double yCord =Double.parseDouble(y);
        return new Point(xCord,yCord);
    }

    public Quadrangle create (String row){
        String [] elementsOfRow = row.split(DELIMITER);
        Point firstPoint =createPoint(elementsOfRow[0],elementsOfRow[1]);
        Point secondPoint =createPoint(elementsOfRow[2],elementsOfRow[3]);
        Point thirdPoint =createPoint(elementsOfRow[4],elementsOfRow[5]);
        Point fourthPoint =createPoint(elementsOfRow[6],elementsOfRow[7]);

        QuadrangleShapeValidator quadrangleShapeValidator=new QuadrangleShapeValidator();
        if (quadrangleShapeValidator.isObjectIsQuadrangle(firstPoint,secondPoint,thirdPoint,fourthPoint)){
        return new Quadrangle(firstPoint,secondPoint,thirdPoint,fourthPoint);
        }
        return null;
    }

}
