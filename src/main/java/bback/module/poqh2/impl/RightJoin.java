package bback.module.poqh2.impl;

import bback.module.poqh2.From;
import bback.module.poqh2.Table;

class RightJoin extends AbstractJoin {

    public RightJoin(From from, Table joinTable) {
        super(from, joinTable);
    }

    @Override
    protected String getExpression() {
        return " right join ";
    }
}
