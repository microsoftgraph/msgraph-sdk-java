package com.microsoft.graph.concurrency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SynchronousExecutorTests {

    @Test
    public void testExecute() throws Exception {
        final AtomicBoolean success = new AtomicBoolean(false);
        final CountDownLatch latch = new CountDownLatch(1);
        SynchronousExecutor synchronousExecutor = SynchronousExecutor.instance();
        synchronousExecutor.execute(new Runnable() {
            @Override
            public void run() {
                success.set(true);
                latch.countDown();
            }
        });
        // use a big enough wait to handle a big gc
        assertTrue(latch.await(20, TimeUnit.SECONDS));
        assertTrue(success.get());
        assertEquals(0, synchronousExecutor.getActiveCount());
    }

    @Test(timeout = 20000)
    public void testManyReentrantCalls() {
        final SynchronousExecutor executor = SynchronousExecutor.instance();
        // choose a number whose size is greater than the stack call count that would
        // incur a StackOverflowException
        final AtomicInteger count = new AtomicInteger(100000);
        final AtomicReference<Runnable> runnable = new AtomicReference<Runnable>();
        runnable.set(new Runnable() {
            @Override
            public void run() {
                if (count.decrementAndGet() != 0) {
                    executor.execute(runnable.get());
                }
            }
        });
        executor.execute(runnable.get());
        assertEquals(0, count.get());
        assertEquals(0, executor.getActiveCount());
    }

    @Test
    public void testMultipleTasksWhenRemoveOnEmptyIsTrue() {
        final SynchronousExecutor executor = SynchronousExecutor.instance();
        final AtomicInteger count = new AtomicInteger();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                count.incrementAndGet();
            }
        };
        executor.execute(r);
        executor.execute(r);
        assertEquals(2, count.get());
        assertEquals(0, executor.getActiveCount());
    }

    @Test
    public void testRunnableThatThrowsRuntimeException() {
        final SynchronousExecutor executor = SynchronousExecutor.instance();
        final RuntimeException exception = new RuntimeException();
        try {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    throw exception;
                }
            });
        } catch (RuntimeException e) {
            assertTrue(exception == e);
        }
        assertEquals(0, executor.getActiveCount());
    }

    @Test
    public void testRunnableThatThrowsError() {
        final SynchronousExecutor executor = SynchronousExecutor.instance();
        final Error error = new StackOverflowError();
        try {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    throw error;
                }
            });
        } catch (Throwable e) {
            assertTrue(error == e);
        }
        assertEquals(0, executor.getActiveCount());
    }

    @Test
    public void testActiveCount() {
        final SynchronousExecutor executor = SynchronousExecutor.instance();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                assertEquals(1, executor.getActiveCount());
            }
        });
        assertEquals(0, executor.getActiveCount());
    }

    @Test
    public void testQueueIsClearedWhenRunnableThrows() {
        final SynchronousExecutor executor = SynchronousExecutor.instance();
        final AtomicBoolean secondTaskCalled = new AtomicBoolean();
        try {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    executor.execute(new Runnable() {

                        @Override
                        public void run() {
                            secondTaskCalled.set(true);
                        }
                    });
                    throw new RuntimeException();
                }
            });
            Assert.fail("should have thrown");
        } catch (RuntimeException e) {
            // expected
        }
        assertFalse(secondTaskCalled.get());
        // the next time the executor gets called the second task should not be queued
        // up still
        executor.execute(new Runnable() {
            @Override
            public void run() {
                // do nothing
            }
        });
        assertFalse(secondTaskCalled.get());
    }

    @Test
    public void testOrderIsPreservedWhenRentrantCallsToExecuteMade() {
        final List<Integer> list = new ArrayList<Integer>();
        final SynchronousExecutor executor = SynchronousExecutor.instance();
        executor.execute(new Runnable() {

            @Override
            public void run() {
                list.add(1);
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        list.add(2);
                    }
                });
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        list.add(3);
                    }
                });
            }
        });
        assertEquals(Arrays.asList(1, 2, 3), list);
    }

}
