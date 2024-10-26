package io.github.completabletuples.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface CompletableTuple1<T1> extends CompletableTuple<CompletableTuple1<T1>> {
    T1 getT1() throws ExecutionException, InterruptedException;

    static <T1> CompletableTuple1<T1> of(CompletableFuture<T1> task1) {

        return new CompletableTuple1<T1>() {
            @Override
            public T1 getT1() throws ExecutionException, InterruptedException {
                return task1.get();
            }

            @Override
            public CompletableTuple1<T1> waitForAll() {
                CompletableFuture.allOf(task1);
                return this;
            }

            @Override
            public CompletableTuple1<T1> waitForAllSticky() {
                CompletableFuture.allOf(task1).join();
                return this;
            }

            @Override
            public Object waitForAny() {
                return CompletableFuture.anyOf(task1);
            }

            @Override
            public Object waitForAnySticky() {
                return CompletableFuture.anyOf(task1).join();
            }

            @Override
            public boolean isAllSucceeded() {
                try {
                    this.getT1();
                    return true;
                } catch (Throwable e) {
                    return false;
                }
            }
        };
    }

}
