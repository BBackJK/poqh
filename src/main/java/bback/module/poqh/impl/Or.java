package bback.module.poqh.impl;

import bback.module.poqh.Predictor;
import bback.module.poqh.exceptions.DMLValidationException;

public class Or implements Predictor {

    private final Predictor predictorA;
    private final Predictor predictorB;

    public Or(Predictor predictorA, Predictor predictorB) {
        this.predictorA = predictorA;
        this.predictorB = predictorB;
    }


    @Override
    public String toQuery() {
        this.validationQuery();
        return String.format("(%s or %s)", this.predictorA.toQuery(), this.predictorB.toQuery());
    }


    private void validationQuery() {
        if ( this.predictorB == null ) {
            throw new DMLValidationException(" Predictor is null exception ");
        }
    }

    @Override
    public boolean isConnector() {
        return true;
    }
}
