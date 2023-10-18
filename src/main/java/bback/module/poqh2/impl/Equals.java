package bback.module.poqh2.impl;

import bback.module.poqh2.Column;
import bback.module.poqh2.Predictor;

class Equals implements Predictor {

    private final Column source;

    private final Column target;

    public Equals(Column source, Column target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public String toQuery() {
        return String.format("%s = %s", source.toQuery(), target.toQuery());
    }
}
