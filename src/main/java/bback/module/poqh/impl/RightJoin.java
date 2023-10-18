package bback.module.poqh.impl;

import bback.module.poqh.From;
import bback.module.poqh.Table;

class RightJoin extends AbstractJoin {

    public RightJoin(From from, Table joinTable) {
        super(from, joinTable);
    }

    @Override
    protected String getExpression() {
        return " right join ";
    }
}
