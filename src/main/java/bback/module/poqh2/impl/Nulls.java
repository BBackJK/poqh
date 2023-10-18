package bback.module.poqh2.impl;

import bback.module.poqh2.Column;
import bback.module.poqh2.Predictor;

class Nulls implements Predictor {

    private final Column source;
    private final boolean isNot;

    public Nulls(Column source, boolean isNot) {
        this.source = source;
        this.isNot = isNot;
    }

    @Override
    public String toQuery() {
        StringBuilder sb = new StringBuilder();
        sb.append(source.toQuery());
        sb.append(" is ");
        if (isNot) {
            sb.append("not ");
        }
        sb.append("null ");
        return sb.toString();
    }
}
