package io.github.completabletuples;

public interface Tuple4<T1, T2, T3, T4> {
    T1 getT1();

    T2 getT2();

    T3 getT3();

    T4 getT4();

    static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(T1 t1, T2 t2, T3 t3, T4 t4) {
        return new Tuple4<T1, T2, T3, T4>() {
            @Override
            public T1 getT1() {
                return t1;
            }

            @Override
            public T2 getT2() {
                return t2;
            }

            @Override
            public T3 getT3() {
                return t3;
            }

            @Override
            public T4 getT4() {
                return t4;
            }
        };
    }
}
