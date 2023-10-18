package bback.module.poqh;

import bback.module.poqh.impl.Value;

public interface Column extends Native, JPQL {

    String getAttr();

    Predictor EQ(Column column);

    Predictor IN(Column... columns);

    Predictor LIKE(Column column, LikeType likeType);

    Predictor NULL();
    Predictor NOT_NULL();

    default Predictor LIKE(Column column) {
        return LIKE(column, LikeType.ANY);
    }

    boolean hasAlias();


    static Value VALUE(Object data) {
        return new Value(data);
    }
}
