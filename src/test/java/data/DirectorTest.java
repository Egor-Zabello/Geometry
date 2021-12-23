package data;

import entity.Quadrangle;
import logic.QuadrangleCreator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class DirectorTest {

    private final static String PATH="test";
    private final static String VALID_LINE="1.0 1.0 1.0 3.0 4.0 3.0 4.0 1.0";
    private final static String INVALID_LINE="1.0 1.01.0 3.0 1.0 3.0 4.0 1.0";
    private final static Quadrangle QUADRANGLE= Mockito.mock(Quadrangle.class);

    @Test
    public void testReadShouldCreateWhenDataValid() throws DataException {
        //given
        DataReader reader=Mockito.mock(DataReader.class);
        when(reader.read(PATH)).thenReturn(Arrays.asList(VALID_LINE));

        QuadrangleLineValidator validator = Mockito.mock(QuadrangleLineValidator.class);
        when(validator.isValidQuadrangle(VALID_LINE)).thenReturn(true);

        QuadrangleCreator creator = Mockito.mock(QuadrangleCreator.class);
        when(creator.create(VALID_LINE)).thenReturn(QUADRANGLE);

        Director director = new Director(reader,validator,creator);

        //when
        List<Quadrangle> quadrangles = director.read(PATH);

        //then
        Assert.assertEquals(Arrays.asList(QUADRANGLE),quadrangles);
    }
}
