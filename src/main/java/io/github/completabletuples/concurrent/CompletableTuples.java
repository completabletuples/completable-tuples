package io.github.completabletuples.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

public final class CompletableTuples {
    private CompletableTuples() {
    }

    public static <T1> CompletableTuple1<T1> of(CompletableFuture<T1> task1) {
        return CompletableTuple1.of(task1);
    }

    public static <T1> CompletableTuple1<T1> of(Supplier<T1> task1) {
        return CompletableTuples.of(CompletableFuture.supplyAsync(task1));
    }

    public static <T1> CompletableTuple1<T1> of(Supplier<T1> task1, Executor executor) {
        return CompletableTuples.of(CompletableFuture.supplyAsync(task1, executor));
    }


    public static <T1, T2> CompletableTuple2<T1, T2> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2
    ) {
        return CompletableTuple2.of(task1, task2);
    }

    public static <T1, T2> CompletableTuple2<T1, T2> of(
            Supplier<T1> task1,
            Supplier<T2> task2
    ) {
        return CompletableTuple2.of(CompletableFuture.supplyAsync(task1), CompletableFuture.supplyAsync(task2));
    }

    public static <T1, T2> CompletableTuple2<T1, T2> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Executor executor
    ) {
        return CompletableTuple2.of(CompletableFuture.supplyAsync(task1, executor), CompletableFuture.supplyAsync(task2, executor));
    }


    public static <T1, T2, T3> CompletableTuple3<T1, T2, T3> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3
    ) {
        return CompletableTuple3.of(task1, task2, task3);
    }

    public static <T1, T2, T3> CompletableTuple3<T1, T2, T3> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3
    ) {
        return CompletableTuple3.of(CompletableFuture.supplyAsync(task1), CompletableFuture.supplyAsync(task2), CompletableFuture.supplyAsync(task3));
    }

    public static <T1, T2, T3> CompletableTuple3<T1, T2, T3> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Executor executor
    ) {
        return CompletableTuple3.of(
                CompletableFuture.supplyAsync(task1, executor),
                CompletableFuture.supplyAsync(task2, executor),
                CompletableFuture.supplyAsync(task3, executor)
        );
    }


    public static <T1, T2, T3, T4> CompletableTuple4<T1, T2, T3, T4> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4
    ) {
        return CompletableTuple4.of(task1, task2, task3, task4);
    }

    public static <T1, T2, T3, T4> CompletableTuple4<T1, T2, T3, T4> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4
    ) {
        return CompletableTuple4.of(
                CompletableFuture.supplyAsync(task1),
                CompletableFuture.supplyAsync(task2),
                CompletableFuture.supplyAsync(task3),
                CompletableFuture.supplyAsync(task4)
        );
    }

    public static <T1, T2, T3, T4> CompletableTuple4<T1, T2, T3, T4> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Executor executor
    ) {
        return CompletableTuple4.of(
                CompletableFuture.supplyAsync(task1, executor),
                CompletableFuture.supplyAsync(task2, executor),
                CompletableFuture.supplyAsync(task3, executor),
                CompletableFuture.supplyAsync(task4, executor)
        );
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

    public static <T1, T2, T3, T4, T5> CompletableTuple5<T1, T2, T3, T4, T5> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5
    ) {
        return CompletableTuple5.of(
                CompletableFuture.supplyAsync(task1),
                CompletableFuture.supplyAsync(task2),
                CompletableFuture.supplyAsync(task3),
                CompletableFuture.supplyAsync(task4),
                CompletableFuture.supplyAsync(task5)
        );
    }

    public static <T1, T2, T3, T4, T5> CompletableTuple5<T1, T2, T3, T4, T5> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Executor executor

    ) {
        return CompletableTuple5.of(
                CompletableFuture.supplyAsync(task1, executor),
                CompletableFuture.supplyAsync(task2, executor),
                CompletableFuture.supplyAsync(task3, executor),
                CompletableFuture.supplyAsync(task4, executor),
                CompletableFuture.supplyAsync(task5, executor)
        );
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

    public static <T1, T2, T3, T4, T5, T6> CompletableTuple6<T1, T2, T3, T4, T5, T6> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6
    ) {
        return CompletableTuple6.of(
                CompletableFuture.supplyAsync(task1),
                CompletableFuture.supplyAsync(task2),
                CompletableFuture.supplyAsync(task3),
                CompletableFuture.supplyAsync(task4),
                CompletableFuture.supplyAsync(task5),
                CompletableFuture.supplyAsync(task6)
        );
    }


    public static <T1, T2, T3, T4, T5, T6> CompletableTuple6<T1, T2, T3, T4, T5, T6> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Executor executor

    ) {
        return CompletableTuple6.of(
                CompletableFuture.supplyAsync(task1, executor),
                CompletableFuture.supplyAsync(task2, executor),
                CompletableFuture.supplyAsync(task3, executor),
                CompletableFuture.supplyAsync(task4, executor),
                CompletableFuture.supplyAsync(task5, executor),
                CompletableFuture.supplyAsync(task6, executor)
        );
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


    public static <T1, T2, T3, T4, T5, T6, T7> CompletableTuple7<T1, T2, T3, T4, T5, T6, T7> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Supplier<T7> task7
    ) {
        return CompletableTuple7.of(
                CompletableFuture.supplyAsync(task1),
                CompletableFuture.supplyAsync(task2),
                CompletableFuture.supplyAsync(task3),
                CompletableFuture.supplyAsync(task4),
                CompletableFuture.supplyAsync(task5),
                CompletableFuture.supplyAsync(task6),
                CompletableFuture.supplyAsync(task7)
        );
    }

    public static <T1, T2, T3, T4, T5, T6, T7> CompletableTuple7<T1, T2, T3, T4, T5, T6, T7> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Supplier<T7> task7,
            Executor executor

    ) {
        return CompletableTuple7.of(
                CompletableFuture.supplyAsync(task1, executor),
                CompletableFuture.supplyAsync(task2, executor),
                CompletableFuture.supplyAsync(task3, executor),
                CompletableFuture.supplyAsync(task4, executor),
                CompletableFuture.supplyAsync(task5, executor),
                CompletableFuture.supplyAsync(task6, executor),
                CompletableFuture.supplyAsync(task7, executor)
        );
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

    public static <T1, T2, T3, T4, T5, T6, T7, T8> CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Supplier<T7> task7,
            Supplier<T8> task8
    ) {
        return CompletableTuple8.of(
                CompletableFuture.supplyAsync(task1),
                CompletableFuture.supplyAsync(task2),
                CompletableFuture.supplyAsync(task3),
                CompletableFuture.supplyAsync(task4),
                CompletableFuture.supplyAsync(task5),
                CompletableFuture.supplyAsync(task6),
                CompletableFuture.supplyAsync(task7),
                CompletableFuture.supplyAsync(task8)
        );
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Supplier<T7> task7,
            Supplier<T8> task8,
            Executor executor

    ) {
        return CompletableTuple8.of(
                CompletableFuture.supplyAsync(task1, executor),
                CompletableFuture.supplyAsync(task2, executor),
                CompletableFuture.supplyAsync(task3, executor),
                CompletableFuture.supplyAsync(task4, executor),
                CompletableFuture.supplyAsync(task5, executor),
                CompletableFuture.supplyAsync(task6, executor),
                CompletableFuture.supplyAsync(task7, executor),
                CompletableFuture.supplyAsync(task8, executor)
        );
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

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> CompletableTuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Supplier<T7> task7,
            Supplier<T8> task8,
            Supplier<T9> task9
    ) {
        return CompletableTuple9.of(
                CompletableFuture.supplyAsync(task1),
                CompletableFuture.supplyAsync(task2),
                CompletableFuture.supplyAsync(task3),
                CompletableFuture.supplyAsync(task4),
                CompletableFuture.supplyAsync(task5),
                CompletableFuture.supplyAsync(task6),
                CompletableFuture.supplyAsync(task7),
                CompletableFuture.supplyAsync(task8),
                CompletableFuture.supplyAsync(task9)
        );
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> CompletableTuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Supplier<T7> task7,
            Supplier<T8> task8,
            Supplier<T9> task9,
            Executor executor

    ) {
        return CompletableTuple9.of(
                CompletableFuture.supplyAsync(task1, executor),
                CompletableFuture.supplyAsync(task2, executor),
                CompletableFuture.supplyAsync(task3, executor),
                CompletableFuture.supplyAsync(task4, executor),
                CompletableFuture.supplyAsync(task5, executor),
                CompletableFuture.supplyAsync(task6, executor),
                CompletableFuture.supplyAsync(task7, executor),
                CompletableFuture.supplyAsync(task8, executor),
                CompletableFuture.supplyAsync(task9, executor)
        );
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

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> CompletableTuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Supplier<T7> task7,
            Supplier<T8> task8,
            Supplier<T9> task9,
            Supplier<T10> task10
    ) {
        return CompletableTuple10.of(
                CompletableFuture.supplyAsync(task1),
                CompletableFuture.supplyAsync(task2),
                CompletableFuture.supplyAsync(task3),
                CompletableFuture.supplyAsync(task4),
                CompletableFuture.supplyAsync(task5),
                CompletableFuture.supplyAsync(task6),
                CompletableFuture.supplyAsync(task7),
                CompletableFuture.supplyAsync(task8),
                CompletableFuture.supplyAsync(task9),
                CompletableFuture.supplyAsync(task10)
        );
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> CompletableTuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(
            Supplier<T1> task1,
            Supplier<T2> task2,
            Supplier<T3> task3,
            Supplier<T4> task4,
            Supplier<T5> task5,
            Supplier<T6> task6,
            Supplier<T7> task7,
            Supplier<T8> task8,
            Supplier<T9> task9,
            Supplier<T10> task10,
            Executor executor

    ) {
        return CompletableTuple10.of(
                CompletableFuture.supplyAsync(task1, executor),
                CompletableFuture.supplyAsync(task2, executor),
                CompletableFuture.supplyAsync(task3, executor),
                CompletableFuture.supplyAsync(task4, executor),
                CompletableFuture.supplyAsync(task5, executor),
                CompletableFuture.supplyAsync(task6, executor),
                CompletableFuture.supplyAsync(task7, executor),
                CompletableFuture.supplyAsync(task8, executor),
                CompletableFuture.supplyAsync(task9, executor),
                CompletableFuture.supplyAsync(task10, executor)
        );
    }


}
