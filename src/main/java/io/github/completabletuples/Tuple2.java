package io.github.completabletuples;

public interface Tuple2<T1, T2> {
    T1 getT1();

    T2 getT2();

    static <T1, T2> Tuple2<T1, T2> of(T1 t1, T2 t2) {
        return new Tuple2<T1, T2>() {
            @Override
            public T1 getT1() {
                return t1;
            }
            @Override
            public T2 getT2() {
                return t2;
            }
        };
    }
}
