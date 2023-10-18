package bback.module.poqh.impl;


import bback.module.poqh.From;
import bback.module.poqh.Table;

class LeftJoin extends AbstractJoin {

    public LeftJoin(From from, Table joinTable) {
        super(from, joinTable);
    }

    @Override
    protected String getExpression() {
        return " left join ";
    }
}
