package io.github.completabletuples.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface CompletableTuple6<T1, T2, T3, T4, T5, T6> extends CompletableTuple<CompletableTuple6<T1, T2, T3, T4, T5, T6>> {
    T1 getT1() throws ExecutionException, InterruptedException;

    T2 getT2() throws ExecutionException, InterruptedException;

    T3 getT3() throws ExecutionException, InterruptedException;

    T4 getT4() throws ExecutionException, InterruptedException;

    T5 getT5() throws ExecutionException, InterruptedException;

    T6 getT6() throws ExecutionException, InterruptedException;

    static <T1, T2, T3, T4, T5, T6> CompletableTuple6<T1, T2, T3, T4, T5, T6> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5,
            CompletableFuture<T6> task6
    ) {

        return new CompletableTuple6<T1, T2, T3, T4, T5, T6>() {
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
            public CompletableTuple6<T1, T2, T3, T4, T5, T6> waitForAll() {
                CompletableFuture.allOf(task1, task2, task3, task4, task5, task6);
                return this;
            }

            @Override
            public CompletableTuple6<T1, T2, T3, T4, T5, T6> waitForAllSticky() {
                CompletableFuture.allOf(task1, task2, task3, task4, task5, task6).join();
                return this;
            }

            @Override
            public Object waitForAny() {
                return CompletableFuture.anyOf(task1, task2, task3, task4, task5, task6);
            }

            @Override
            public Object waitForAnySticky() {
                return CompletableFuture.anyOf(task1, task2, task3, task4, task5, task6).join();
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
                    return true;
                } catch (Throwable e) {
                    return false;
                }
            }
        };
    }

}
