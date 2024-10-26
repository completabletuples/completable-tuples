package org.completableuples;

interface CompletableTuple<CT> {

    CT waitForAll();

    CT waitForAllSticky();

    Object waitForAny();

    Object waitForAnySticky();

    boolean isAllSucceeded();
}
