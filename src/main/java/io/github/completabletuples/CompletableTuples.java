package io.github.completabletuples;

import java.util.concurrent.CompletableFuture;

public final class CompletableTuples {
    private CompletableTuples() {
    }

    public static <T1> CompletableTuple1<T1> of(CompletableFuture<T1> task1) {
        return CompletableTuple1.of(task1);
    }

    public static <T1, T2> CompletableTuple2<T1, T2> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2
    ) {
        return CompletableTuple2.of(task1, task2);
    }

    public static <T1, T2, T3> CompletableTuple3<T1, T2, T3> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3
    ) {
        return CompletableTuple3.of(task1, task2, task3);
    }

    public static <T1, T2, T3, T4> CompletableTuple4<T1, T2, T3, T4> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4
    ) {
        return CompletableTuple4.of(task1, task2, task3, task4);
    }

    public static <T1, T2, T3, T4, T5> CompletableTuple5<T1, T2, T3, T4, T5> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5
    ) {
        return CompletableTuple5.of(task1, task2, task3, task4, task5);
    }

    public static <T1, T2, T3, T4, T5, T6> CompletableTuple6<T1, T2, T3, T4, T5, T6> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5,
            CompletableFuture<T6> task6
    ) {
        return CompletableTuple6.of(task1, task2, task3, task4, task5, task6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> CompletableTuple7<T1, T2, T3, T4, T5, T6, T7> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5,
            CompletableFuture<T6> task6,
            CompletableFuture<T7> task7
    ) {
        return CompletableTuple7.of(task1, task2, task3, task4, task5, task6, task7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5,
            CompletableFuture<T6> task6,
            CompletableFuture<T7> task7,
            CompletableFuture<T8> task8
    ) {
        return CompletableTuple8.of(task1, task2, task3, task4, task5, task6, task7, task8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> CompletableTuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5,
            CompletableFuture<T6> task6,
            CompletableFuture<T7> task7,
            CompletableFuture<T8> task8,
            CompletableFuture<T9> task9
    ) {
        return CompletableTuple9.of(task1, task2, task3, task4, task5, task6, task7, task8, task9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> CompletableTuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5,
            CompletableFuture<T6> task6,
            CompletableFuture<T7> task7,
            CompletableFuture<T8> task8,
            CompletableFuture<T9> task9,
            CompletableFuture<T10> task10
    ) {
        return CompletableTuple10.of(task1, task2, task3, task4, task5, task6, task7, task8, task9, task10);
    }

}
