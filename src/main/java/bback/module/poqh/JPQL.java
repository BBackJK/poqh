package bback.module.poqh;


import bback.module.poqh.impl.JpqlTable;

public interface JPQL extends SQL {

    static Table TABLE(Class<?> entityType) {
        return TABLE(entityType, null);
    }

    static Table TABLE(Class<?> entityType, String alias) {
        return new JpqlTable(entityType, alias);
    }
}
