package bback.module.poqh;

public enum LikeType {

    ANY {
        @Override
        public String toQuery(String pattern) {
            return '%' + pattern + '%';
        }
    },
    START {
        @Override
        public String toQuery(String pattern) {
            return '%' + pattern;
        }
    },
    END {
        @Override
        public String toQuery(String pattern) {
            return pattern + '%';
        }
    }
    ;


    public abstract String toQuery(String pattern);
}
