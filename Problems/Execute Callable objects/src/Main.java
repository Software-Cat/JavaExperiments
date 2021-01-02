/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;


class FutureUtils {

    private static final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        ArrayList<Callable<Integer>> callables = new ArrayList<>();
        for (Future<Callable<Integer>> future : items) {
            try {
                callables.add(future.get());
            } catch (InterruptedException | ExecutionException ignored) {
            }
        }
        Collections.reverse(callables);

        List<Future<Integer>> futures = new ArrayList<>();
        try {
            futures = executorService.invokeAll(callables);
        } catch (InterruptedException ignored) {
        }

        int sum = 0;
        for (Future<Integer> future : futures) {
            try {
                sum += future.get();
            } catch (InterruptedException | ExecutionException ignored) {
            }
        }

        executorService.shutdown();
        return sum;
    }

}