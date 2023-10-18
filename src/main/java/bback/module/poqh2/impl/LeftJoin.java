package bback.module.poqh2.impl;


import bback.module.poqh2.From;
import bback.module.poqh2.Table;

class LeftJoin extends AbstractJoin {

    public LeftJoin(From from, Table joinTable) {
        super(from, joinTable);
    }

    @Override
    protected String getExpression() {
        return " left join ";
    }
}
