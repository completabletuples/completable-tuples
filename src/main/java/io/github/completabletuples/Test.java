package io.github.completabletuples;

import java.util.concurrent.ExecutionException;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final CompletableTuple3<String, String, String> tasks = CompletableTuples
                .of(
                        () -> "task:1 calling service-1.",
                        () -> "task:2 calling service-2.",
                        () -> "task:3 calling service-3."
                )
                .waitForAllSticky();

        String t1 = tasks.getT1();
        System.out.println("task:1's result is " + t1);

        String t2 = tasks.getT2();
        System.out.println("task:2's result is " + t2);

        String t3 = tasks.getT3();
        System.out.println("task:3's result is " + t3);


    }
}
