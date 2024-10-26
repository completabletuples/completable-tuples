package io.github.completabletuples;

public interface Tuple3<T1, T2, T3> {
    T1 getT1();

    T2 getT2();

    T3 getT3();

    static <T1, T2, T3> Tuple3<T1, T2, T3> of(T1 t1, T2 t2, T3 t3) {
        return new Tuple3<T1, T2, T3>() {
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
        };
    }
}
