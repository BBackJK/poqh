package bback.module.poqh;

import bback.module.poqh.impl.SQLContextImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.EntityManager;

public final class SQLContextFactory {

    private static final ObjectMapper om = new ObjectMapper();

    private SQLContextFactory() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static <T> SQLContext<T> getContext(EntityManager entityManager, Class<T> resultType) {
        return new SQLContextImpl<>(entityManager, resultType, om);
    }
}
