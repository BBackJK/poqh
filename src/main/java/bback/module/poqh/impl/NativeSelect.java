package bback.module.poqh.impl;

import bback.module.poqh.Column;
import bback.module.poqh.QueryResultHandler;
import bback.module.poqh.Select;
import bback.module.poqh.logger.Log;
import bback.module.poqh.logger.LogFactory;

import java.util.ArrayList;
import java.util.List;


public class NativeSelect implements Select {

    private final Class<?> resultType;
    private final List<Column> constructorColumnList = new ArrayList<>();


    public NativeSelect(Class<?> resultType) {
        this.resultType = resultType;
    }

    @Override
    public void setSelectColumnList(List<Column> columnList) {
        this.constructorColumnList.clear();
        this.constructorColumnList.addAll(columnList);
    }

    @Override
    public String toQuery() {
        StringBuilder sb = new StringBuilder(" select ");
        int columnCount = constructorColumnList.size();
        int n=1;
        for (int i=0; i<columnCount; i++, n++) {
            boolean isLast = n == columnCount;
            Column column = constructorColumnList.get(i);
            sb.append(column.toQuery());
            if (column.hasAlias()) {
                sb.append(" as ");
                sb.append(column.getAttr());
            }
            if (!isLast) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}