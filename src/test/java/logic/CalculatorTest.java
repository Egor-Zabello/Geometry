package logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testCalculatePerimeterShouldCalculatePerimeterWhenShapeCorrect() {
        //given
        Calculator calculator= new Calculator();
        //when
        QuadrangleCreator quadrangleCreator= new QuadrangleCreator();
        double result = calculator.calculatePerimeter(quadrangleCreator.create("1.0 1.0 1.0 3.0 4.0 3.0 4.0 1.0"));
        //Then
        Assert.assertEquals(10,result,0.0001);
    }
    @Test
    public void testCalculateSquareShouldCalculateSquareWhenShapeCorrect() {
        //given
        Calculator calculator= new Calculator();
        //when
        QuadrangleCreator quadrangleCreator= new QuadrangleCreator();
        double result = calculator.calculateSquare(quadrangleCreator.create("1.0 1.0 1.0 3.0 4.0 3.0 4.0 1.0"));
        //Then
        Assert.assertEquals(6,result,0.0001);
    }
    @Test
    public void testisQuadrangleConvexShouldCalculateWhenShapeIsConvex() {
        //given
        Calculator calculator= new Calculator();
        //when
        QuadrangleCreator quadrangleCreator= new QuadrangleCreator();
         boolean result = calculator.isQuadrangleConvex(quadrangleCreator.create("1.0 1.0 1.0 4.0 2.0 3.0 4.0 1.0"));
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testIsQuadrangleSquareShouldCalculateWhenShapeIsSquare() {
        //given
        Calculator calculator= new Calculator();
        //when
        QuadrangleCreator quadrangleCreator= new QuadrangleCreator();
        boolean result = calculator.isQuadrangleSquare(quadrangleCreator.create("1.0 1.0 1.0 4.0 4.0 4.0 4.0 1.0"));
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testIsQuadrangleTrapezoidShouldCalculateWhenShapeIsTrapezoid() {
        //given
        Calculator calculator= new Calculator();
        //when
        QuadrangleCreator quadrangleCreator= new QuadrangleCreator();
        boolean result = calculator.isQuadrangleTrapezoid(quadrangleCreator.create("2.0 1.0 4.0 5.0 10.0 5.0 11.0 1.0"));
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testIsQuadrangleRhombShouldCalculateWhenShapeIsRhomb() {
        //given
        Calculator calculator= new Calculator();
        //when
        QuadrangleCreator quadrangleCreator= new QuadrangleCreator();
        boolean result = calculator.isQuadrangleRhomb(quadrangleCreator.create("4.0 1.0 2.0 4.0 4.0 7.0 6.0 4.0"));
        //Then
        Assert.assertTrue(result);
    }

}

