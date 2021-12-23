package logic;

import entity.Point;
import org.junit.Assert;
import org.junit.Test;

public class QuadrangleShapeValidatorTest {

    @Test
    public void testValidatorShouldValidateWhenShapeCorrect() {
        //given
        QuadrangleShapeValidator quadrangleShapeValidator= new QuadrangleShapeValidator();
        //when
        Point firstPoint = new Point(1.0,1.0);
        Point secondPoint = new Point(1.0,2.0);
        Point thirdPoint = new Point(4.0,3.0);
        Point fourthPoint = new Point(3.0,4.0);
        boolean result =  quadrangleShapeValidator.isObjectIsQuadrangle(firstPoint,secondPoint,thirdPoint,fourthPoint);
        //Then
        Assert.assertTrue(result);
    }


    @Test
    public void testValidatorShouldValidateWhenShapeNotCorrect() {
        //given
        QuadrangleShapeValidator quadrangleShapeValidator= new QuadrangleShapeValidator();
        //when
        Point firstPoint = new Point(1.0,1.0);
        Point secondPoint = new Point(1.0,2.0);
        Point thirdPoint = new Point(1.0,3.0);
        Point fourthPoint = new Point(3.0,4.0);
        boolean result =  quadrangleShapeValidator.isObjectIsQuadrangle(firstPoint,secondPoint,thirdPoint,fourthPoint);
        //Then
        Assert.assertFalse(result);
    }

}
