package data;

import org.junit.Assert;
import org.junit.Test;

public class QuadrangleLineValidatorTest {

    @Test
    public void testValidatorShouldValidateWhenDataCorrect() {
        //given
       QuadrangleLineValidator quadrangleValidator= new QuadrangleLineValidator();

        //when
        String enteredLine = "1.0 1.0 2.0 2.0 3.0 3.0 4.0 4.0";
        boolean result = quadrangleValidator.isValidQuadrangle(enteredLine);

        //Then
        Assert.assertTrue(result);

    }
}