package bback.module.poqh;

public interface Join extends SQL {

    From ON(Predictor... predictors);

    Table getJoinTable();
}
