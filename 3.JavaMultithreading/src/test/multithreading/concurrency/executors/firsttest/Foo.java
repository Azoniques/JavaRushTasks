package test.multithreading.concurrency.executors.firsttest;

import java.util.concurrent.*;

public class Foo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };




        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());
        executor.shutdownNow();
        Integer result = future.get();

        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + result);
    }




}
