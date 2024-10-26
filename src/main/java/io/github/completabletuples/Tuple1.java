package io.github.completabletuples;

public interface Tuple1<T1> {
    T1 getT1();

    static <T1> Tuple1<T1> of(T1 t1) {
        return () -> t1;
    }
}
