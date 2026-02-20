# Completable-Tuples

Completable-Tuples is an open-source library designed to simplify the execution of multiple tasks concurrently using
Java's CompletableFuture. Built with ease-of-use in mind, Completable-Tuples allows developers to submit Supplier or
Runnable objects for execution without the complexity of manually joining or combining multiple CompletableFutures. This
library is particularly valuable for streamlining asynchronous programming patterns, where multiple tasks need to be
executed and aggregated efficiently specifically in microservices applications for communicating with external services
concurrently without a sequential flow.

## Key Features

- *Easy Task Submission:* Supports the submission of tasks as Supplier or Runnable objects, enabling effortless
  concurrent task execution.
- *Automatic Combining of Futures:* Avoids the hassle of manually implementing joining logic for multiple
  CompletableFutures by automatically aggregating results into a single task.
- *Tuple Support:* Provides up to 10 tuple structures to easily access and manage results of concurrent tasks.
- *Enhanced Readability and Maintainability:* Improves code readability and maintenance by abstracting the
  CompletableFuture composition logic into a concise, easy-to-use API.

## Why Use Completable-Tuples?

Java 8’s CompletableFuture offers a powerful model for asynchronous programming by providing non-blocking operations,
but managing multiple concurrent tasks can often become cumbersome. Developers usually need to implement joining and
combining logic to wait until all tasks have completed, which can quickly lead to complex code structures.
AsyncMultiTask eliminates this overhead, allowing you to focus on task execution and retrieval of results without
boilerplate code.


```java

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

```

## How To Use Completable-Tuples?

### Maven

```xml

<dependency>
  <groupId>io.github.completabletuples</groupId>
  <artifactId>completable-tuples</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Gradle

```gradle
implementation group: 'io.github.completabletuples', name: 'completable-tuples', version: '1.0.0'
```