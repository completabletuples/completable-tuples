package org.completableuples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface CompletableTuple4<T1, T2, T3, T4> extends CompletableTuple<CompletableTuple4<T1, T2, T3, T4>> {
    T1 getT1() throws ExecutionException, InterruptedException;

    T2 getT2() throws ExecutionException, InterruptedException;

    T3 getT3() throws ExecutionException, InterruptedException;

    T4 getT4() throws ExecutionException, InterruptedException;

    static <T1, T2, T3, T4> CompletableTuple4<T1, T2, T3, T4> of(CompletableFuture<T1> task1, CompletableFuture<T2> task2, CompletableFuture<T3> task3, CompletableFuture<T4> task4) {

        return new CompletableTuple4<T1, T2, T3, T4>() {
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
            public CompletableTuple4<T1, T2, T3, T4> waitForAll() {
                CompletableFuture.allOf(task1, task2, task3, task4);
                return this;
            }

            @Override
            public CompletableTuple4<T1, T2, T3, T4> waitForAllSticky() {
                CompletableFuture.allOf(task1, task2, task3, task4).join();
                return this;
            }

            @Override
            public Object waitForAny() {
                return CompletableFuture.anyOf(task1, task2, task3, task4);
            }

            @Override
            public Object waitForAnySticky() {
                return CompletableFuture.anyOf(task1, task2, task3, task4).join();
            }

            @Override
            public boolean isAllSucceeded() {
                try {
                    this.getT1();
                    this.getT2();
                    this.getT3();
                    this.getT4();
                    return true;
                } catch (Throwable e) {
                    return false;
                }
            }
        };
    }

}
