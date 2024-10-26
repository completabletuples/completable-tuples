package io.github.completabletuples;

interface CompletableTuple<CT> {

    CT waitForAll();

    CT waitForAllSticky();

    Object waitForAny();

    Object waitForAnySticky();

    boolean isAllSucceeded();
}
