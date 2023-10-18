package bback.module.poqh;

import java.util.List;
import java.util.Optional;

public interface QueryResultHandler<T> {


    List<T> list(String query);
    Optional<T> detail(String query);
}
