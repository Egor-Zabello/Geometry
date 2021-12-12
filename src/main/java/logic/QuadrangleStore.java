package logic;

import java.util.HashMap;
import java.util.Map;

public class QuadrangleStore implements Observer{

    private static QuadrangleStore instance;

    private final Map<Integer,Parameters> parameters = new HashMap<>();

    private final Calculator calculator = new Calculator();

    private QuadrangleStore() {};

    public void update(QuadrangleObservable quadrangle){
        double perimeter= calculator.calculatePerimeter(quadrangle);
        double square=calculator.calculateSquare(quadrangle);
        parameters.put(quadrangle.getId(),new Parameters(perimeter,square));
    }

    public static QuadrangleStore getInstance(){
        if (instance==null){
            instance=new QuadrangleStore();
        }
        return instance;
    }
}
