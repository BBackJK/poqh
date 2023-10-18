package bback.module.poqh.impl;

import bback.module.poqh.From;
import bback.module.poqh.Table;

class InnerJoin extends AbstractJoin {


    public InnerJoin(From from, Table joinTable) {
        super(from, joinTable);
    }

    @Override
    protected String getExpression() {
        return " join ";
    }
}
