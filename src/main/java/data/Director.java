package data;

import entity.Quadrangle;
import logic.QuadrangleCreator;;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private static final Logger logger = LogManager.getLogger(Director.class.getName());
    private DataReader reader;
    private QuadrangleLineValidator validator = new QuadrangleLineValidator();
    private QuadrangleCreator creator = new QuadrangleCreator();

    public Director(DataReader reader) {

        this.reader = reader;
    }

    public Director(DataReader reader, QuadrangleLineValidator validator, QuadrangleCreator creator) {
    }

    public List<Quadrangle> read (String path) throws DataException {
        List<Quadrangle> quadrangles = new ArrayList<>();
        List<String> rows = reader.read(path);
        for(String row : rows){
            if(validator.isValidQuadrangle(row)){
                quadrangles.add(creator.create(row));
            }

        }
        logger.info("Director worked well");
        return quadrangles;
    }

}
