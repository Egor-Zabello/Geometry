package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DataReader {

    public List<String> read(String path) throws DataException {
        List<String> rowsOfFile = new ArrayList<>();
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                rowsOfFile.add(scanner.nextLine());
            }
        } catch (IOException e){
            throw new DataException(e);
        }
        return rowsOfFile;
    }
}
