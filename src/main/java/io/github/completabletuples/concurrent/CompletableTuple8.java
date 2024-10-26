package io.github.completabletuples.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8> extends
        CompletableTuple<CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8>> {
    T1 getT1() throws ExecutionException, InterruptedException;

    T2 getT2() throws ExecutionException, InterruptedException;

    T3 getT3() throws ExecutionException, InterruptedException;

    T4 getT4() throws ExecutionException, InterruptedException;

    T5 getT5() throws ExecutionException, InterruptedException;

    T6 getT6() throws ExecutionException, InterruptedException;

    T7 getT7() throws ExecutionException, InterruptedException;

    T8 getT8() throws ExecutionException, InterruptedException;

    static <T1, T2, T3, T4, T5, T6, T7, T8> CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5,
            CompletableFuture<T6> task6,
            CompletableFuture<T7> task7,
            CompletableFuture<T8> task8
    ) {

        return new CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8>() {
            @Override
            public T1 getT1() throws ExecutionException, InterruptedException {
                return task1.get();
            }

            @Override
            public T2 getT2() throws ExecutionException, InterruptedException {
                return task2.get();
            }

            @Override
            public T3 getT3() throws ExecutionException, InterruptedException {
                return task3.get();
            }

            @Override
            public T4 getT4() throws ExecutionException, InterruptedException {
                return task4.get();
            }

            @Override
            public T5 getT5() throws ExecutionException, InterruptedException {
                return task5.get();
            }

            @Override
            public T6 getT6() throws ExecutionException, InterruptedException {
                return task6.get();
            }

            @Override
            public T7 getT7() throws ExecutionException, InterruptedException {
                return task7.get();
            }

            @Override
            public T8 getT8() throws ExecutionException, InterruptedException {
                return task8.get();
            }

            @Override
            public CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8> waitForAll() {
                CompletableFuture.allOf(task1, task2, task3, task4, task5, task6, task7, task8);
                return this;
            }

            @Override
            public CompletableTuple8<T1, T2, T3, T4, T5, T6, T7, T8> waitForAllSticky() {
                CompletableFuture.allOf(task1, task2, task3, task4, task5, task6, task7, task8).join();
                return this;
            }

            @Override
            public Object waitForAny() {
                return CompletableFuture.anyOf(task1, task2, task3, task4, task5, task6, task7, task8);
            }

            @Override
            public Object waitForAnySticky() {
                return CompletableFuture.anyOf(task1, task2, task3, task4, task5, task6, task7, task8).join();
            }

            @Override
            public boolean isAllSucceeded() {
                try {
                    this.getT1();
                    this.getT2();
                    this.getT3();
                    this.getT4();
                    this.getT5();
                    this.getT6();
                    this.getT7();
                    this.getT8();
                    return true;
                } catch (Throwable e) {
                    return false;
                }
            }
        };
    }

}
