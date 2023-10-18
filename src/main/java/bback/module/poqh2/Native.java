package bback.module.poqh2;

import bback.module.poqh2.impl.NativeTable;

public interface Native extends SQL {

    String ASTERISK = "*";

    static Table TABLE(Class<?> clazz) {
        return TABLE(clazz, null);
    }

    static Table TABLE(Class<?> clazz, String alias) {
        return new NativeTable(clazz, alias);
    }
}
