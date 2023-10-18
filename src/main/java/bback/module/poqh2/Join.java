package bback.module.poqh2;

public interface Join extends SQL {

    From ON(Predictor... predictors);

    Table getJoinTable();
}
