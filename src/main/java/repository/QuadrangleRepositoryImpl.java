package repository;

import logic.QuadrangleObservable;

import java.util.*;

public class QuadrangleRepositoryImpl implements QuadrangleRepository{

    private Map<Integer,QuadrangleObservable> store =new HashMap<>();

    public void add(QuadrangleObservable quadrangle) {

    }

    public void delete(QuadrangleObservable quadrangle) {

    }

    public void update(QuadrangleObservable quadrangle) {

    }

    public List<QuadrangleObservable> query(Specification specification) {
        List <QuadrangleObservable> quadrangles= new ArrayList<>();
        for (QuadrangleObservable quadrangle : store.values()){
            if (specification.specified(quadrangle)){
                quadrangles.add(quadrangle);
            }
        }
        return quadrangles;
    }

    @Override
    public List<QuadrangleObservable> sort(Comparator<QuadrangleObservable> comparator) {
        return null;
    }

}
