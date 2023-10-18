package bback.module.poqh.impl;

import bback.module.poqh.Column;
import bback.module.poqh.LikeType;
import bback.module.poqh.Predictor;

class Likes implements Predictor {

    private final Column source;
    private final Column target;
    private final LikeType likeType;

    public Likes(Column source, Column target, LikeType likeType) {
        this.source = source;
        this.target = target;
        this.likeType = likeType;
    }

    @Override
    public String toQuery() {
        return String.format("%s like '%s'", source.toQuery(), likeType.toQuery(target.toQuery()));
    }
}
