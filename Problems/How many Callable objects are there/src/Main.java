/*
 * Copyright © Bowen Wu 2020.
 * All rights reserved.
 */

import java.util.concurrent.*;

class FutureUtils {

    private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();

    public static int determineCallableDepth(Callable<?> callable) throws Exception {
        int callableDepth = 1;

        while (true) {
            Future<?> future = EXECUTOR.submit(callable);

            Object object = future.get();
            if (object instanceof Callable) {
                callable = (Callable<?>) object;
                callableDepth++;
            } else {
                break;
            }
        }

        EXECUTOR.shutdown();
        return callableDepth;
    }

}