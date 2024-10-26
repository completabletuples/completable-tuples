package org.completabletuples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface CompletableTuple5<T1, T2, T3, T4, T5> extends CompletableTuple<CompletableTuple5<T1, T2, T3, T4, T5>> {
    T1 getT1() throws ExecutionException, InterruptedException;

    T2 getT2() throws ExecutionException, InterruptedException;

    T3 getT3() throws ExecutionException, InterruptedException;

    T4 getT4() throws ExecutionException, InterruptedException;

    T5 getT5() throws ExecutionException, InterruptedException;

    static <T1, T2, T3, T4, T5> CompletableTuple5<T1, T2, T3, T4, T5> of(
            CompletableFuture<T1> task1,
            CompletableFuture<T2> task2,
            CompletableFuture<T3> task3,
            CompletableFuture<T4> task4,
            CompletableFuture<T5> task5
    ) {

        return new CompletableTuple5<T1, T2, T3, T4, T5>() {
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
            public CompletableTuple5<T1, T2, T3, T4, T5> waitForAll() {
                CompletableFuture.allOf(task1, task2, task3, task4, task5);
                return this;
            }

            @Override
            public CompletableTuple5<T1, T2, T3, T4, T5> waitForAllSticky() {
                CompletableFuture.allOf(task1, task2, task3, task4, task5).join();
                return this;
            }

            @Override
            public Object waitForAny() {
                return CompletableFuture.anyOf(task1, task2, task3, task4, task5);
            }

            @Override
            public Object waitForAnySticky() {
                return CompletableFuture.anyOf(task1, task2, task3, task4, task5).join();
            }

            @Override
            public boolean isAllSucceeded() {
                try {
                    this.getT1();
                    this.getT2();
                    this.getT3();
                    this.getT4();
                    this.getT5();
                    return true;
                } catch (Throwable e) {
                    return false;
                }
            }
        };
    }

}
