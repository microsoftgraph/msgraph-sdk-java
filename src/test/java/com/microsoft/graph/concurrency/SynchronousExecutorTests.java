package com.microsoft.graph.concurrency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.Test;

public class SynchronousExecutorTests {

	@Test
	public void testExecute() throws Exception {
        final AtomicBoolean success = new AtomicBoolean(false);
        final CountDownLatch latch = new CountDownLatch(1);
        SynchronousExecutor synchronousExecutor = new SynchronousExecutor();
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

}
