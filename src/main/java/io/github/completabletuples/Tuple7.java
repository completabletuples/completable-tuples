package io.github.completabletuples;

public interface Tuple7<T1, T2, T3, T4, T5, T6, T7> {
    T1 getT1();

    T2 getT2();

    T3 getT3();

    T4 getT4();

    T5 getT5();

    T6 getT6();

    T7 getT7();

    static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> of(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return new Tuple7<T1, T2, T3, T4, T5, T6, T7>() {
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

            @Override
            public T5 getT5() {
                return t5;
            }

            @Override
            public T6 getT6() {
                return t6;
            }

            @Override
            public T7 getT7() {
                return t7;
            }
        };
    }
}