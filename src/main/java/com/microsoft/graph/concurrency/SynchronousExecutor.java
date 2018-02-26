// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * An {@link Executor} that runs only on the current thread and queues tasks to
 * ensure stack overflow does not occur.
 */
public final class SynchronousExecutor implements Executor {

    private static final SynchronousExecutor INSTANCE = new SynchronousExecutor();

    public static SynchronousExecutor instance() {
        return INSTANCE;
    }

    /**
     * The current number of synchronously executing actions across all threads.
     */
    private final AtomicInteger activeCount = new AtomicInteger(0);

    private final ThreadLocal<Tasks> tasks;

    private SynchronousExecutor() {
        this.tasks = new ThreadLocal<Tasks>() {
            @Override
            protected Tasks initialValue() {
                return new Tasks();
            }
        };
    }

    @Override
    public void execute(Runnable runnable) {
        tasks.get().add(runnable);
    }

    /**
     * Returns the current number of executing actions across all threads.
     * 
     * @return the current number of executing actions across all threads
     */
    public int getActiveCount() {
        return activeCount.get();
    }

    private final class Tasks {

        private final Queue<Runnable> queue;
        private boolean draining;

        Tasks() {
            // as we expect the queue to be recreated frequently we choose a
            // low allocation cost implementation of Queue
            queue = new LinkedList<Runnable>();
        }

        void add(Runnable runnable) {
            activeCount.incrementAndGet();
            queue.add(runnable);
            drain();
        }

        private void drain() {
            if (draining) {
                // reentrancy detected
                return;
            } else {
                draining = true;
                try {
                    Runnable r;
                    while ((r = queue.poll()) != null) {
                        try {
                            r.run();
                        } finally {
                            activeCount.decrementAndGet();
                        }
                    }
                } catch (Throwable e) {
                    // clear the queue and reduce the activeCount
                    while (queue.poll() != null) {
                        activeCount.decrementAndGet();
                    }
                    // is not a checked exception so must be an Error or RuntimeException
                    if (e instanceof RuntimeException) {
                        throw (RuntimeException) e;
                    } else {
                        throw (Error) e;
                    }
                } finally {
                    // clear the ThreadLocal value for this thread
                    // so that memory leak detectors don't complain
                    // on application shutdown. This is particularly
                    // relevant for application servers that use
                    // container-wide thread pools like Tomcat or 
                    // JEE implementations.
                    tasks.remove();
                    draining = false;
                }
            }
        }

    };

}
