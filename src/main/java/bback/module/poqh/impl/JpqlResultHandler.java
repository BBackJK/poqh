package bback.module.poqh.impl;

import bback.module.poqh.QueryResultHandler;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class JpqlResultHandler<T> implements QueryResultHandler<T> {

    private final EntityManager entityManager;
    private final Class<T> resultType;

    public JpqlResultHandler(EntityManager em, Class<T> resultType) {
        this.entityManager = em;
        this.resultType = resultType;
    }



    @Override
    public List<T> list(String query) {
        return this.getTypedQuery(query).getResultList();
    }

    @Override
    public Optional<T> detail(String query) {
        return Optional.ofNullable(
                this.getTypedQuery(query).getSingleResult()
        );
    }

    private TypedQuery<T> getTypedQuery(String query) {
        return this.entityManager.createQuery(query, this.resultType);
    }
}
