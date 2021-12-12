package data;

import entity.Quadrangle;
import logic.QuadrangleCreator;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private DataReader reader;
    private QuadrangleLineValidator validator = new QuadrangleLineValidator();
    private QuadrangleCreator creator = new QuadrangleCreator();

    public Director(DataReader reader) {

        this.reader = reader;
    }

    public List<Quadrangle> read (String path) throws DataException {
        List<Quadrangle> quadrangles = new ArrayList<>();
        List<String> rows = reader.read(path);
        for(String row : rows){
            if(validator.isValidQuadrangle(row)){
                quadrangles.add(creator.create(row));
            }

        }
        return quadrangles;
    }

}
