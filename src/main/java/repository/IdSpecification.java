package repository;

import logic.QuadrangleObservable;

public class IdSpecification implements Specification{

    private final Integer id;

    public IdSpecification(Integer id) {

        this.id = id;
    }

    @Override
    public boolean specified(QuadrangleObservable quadrangle) {

        return quadrangle.getId().equals(id);//TODO convention
    }
}
