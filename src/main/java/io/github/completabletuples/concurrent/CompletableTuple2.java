package io.github.completabletuples.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface CompletableTuple2<T1, T2> extends CompletableTuple<CompletableTuple2<T1, T2>> {
    T1 getT1() throws ExecutionException, InterruptedException;

    T2 getT2() throws ExecutionException, InterruptedException;

    static <T1, T2> CompletableTuple2<T1, T2> of(CompletableFuture<T1> task1, CompletableFuture<T2> task2) {

        return new CompletableTuple2<T1, T2>() {
            @Override
            public T1 getT1() throws ExecutionException, InterruptedException {
                return task1.get();
            }

            @Override
            public T2 getT2() throws ExecutionException, InterruptedException {
                return task2.get();
            }

            @Override
            public CompletableTuple2<T1, T2> waitForAll() {
                CompletableFuture.allOf(task1, task2);
                return this;
            }

            @Override
            public CompletableTuple2<T1, T2> waitForAllSticky() {
                CompletableFuture.allOf(task1, task2).join();
                return this;
            }

            @Override
            public Object waitForAny() {
                return CompletableFuture.anyOf(task1, task2);
            }

            @Override
            public Object waitForAnySticky() {
                return CompletableFuture.anyOf(task1, task2).join();
            }

            @Override
            public boolean isAllSucceeded() {
                try {
                    this.getT1();
                    this.getT2();
                    return true;
                } catch (Throwable e) {
                    return false;
                }
            }
        };
    }

}
