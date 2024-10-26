package io.github.completabletuples.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface CompletableTuple3<T1, T2, T3> extends CompletableTuple<CompletableTuple3<T1, T2, T3>> {
    T1 getT1() throws ExecutionException, InterruptedException;

    T2 getT2() throws ExecutionException, InterruptedException;

    T3 getT3() throws ExecutionException, InterruptedException;

    static <T1, T2, T3> CompletableTuple3<T1, T2, T3> of(CompletableFuture<T1> task1, CompletableFuture<T2> task2, CompletableFuture<T3> task3) {

        return new CompletableTuple3<T1, T2, T3>() {
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
            public CompletableTuple3<T1, T2, T3> waitForAll() {
                CompletableFuture.allOf(task1, task2, task3);
                return this;
            }

            @Override
            public CompletableTuple3<T1, T2, T3> waitForAllSticky() {
                CompletableFuture.allOf(task1, task2, task3).join();
                return this;
            }

            @Override
            public Object waitForAny() {
                return CompletableFuture.anyOf(task1, task2, task3);
            }

            @Override
            public Object waitForAnySticky() {
                return CompletableFuture.anyOf(task1, task2, task3).join();
            }

            @Override
            public boolean isAllSucceeded() {
                try {
                    this.getT1();
                    this.getT2();
                    this.getT3();
                    return true;
                } catch (Throwable e) {
                    return false;
                }
            }
        };
    }

}
