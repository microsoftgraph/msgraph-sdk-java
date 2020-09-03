package com.microsoft.graph.concurrency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.logger.MockLogger;

/**
 * Test cases for {@see DefaultExecutors}
 */
public class DefaultExecutorsTests {
	
    private DefaultExecutors defaultExecutors;
    private MockLogger mLogger;
    
	@Before
	public void setUp() throws Exception {
		mLogger = new MockLogger();
		defaultExecutors = new DefaultExecutors(mLogger);
	}

	@Test
	public void testNotNull() {
		assertNotNull(mLogger);
        assertNotNull(defaultExecutors);
    }

	@Test
    public void testPerformOnBackground() {
		final String expectedLogMessage = "Starting background task, current active count: 0";
        final String expectedResult = "test perform on background success";
        final ExecutorTestCallback<String> callback = new ExecutorTestCallback<>();

        defaultExecutors.performOnBackground(new Runnable() {
            @Override
            public void run() {
                callback.success(expectedResult);
            }
        });

        callback.waitForCompletion();;
        assertTrue(callback._successCalled.get());
        assertEquals(expectedResult, callback._successResult.get());
        assertEquals(1,mLogger.getLogMessages().size());
        assertTrue(mLogger.hasMessage(expectedLogMessage));
    }

	@Test
    public void testPerformOnForegroundWithResult() {
        final String expectedResult = "result value";
        final String expectedLogMessage = "Starting foreground task, current active count:0, with result result value";
        final ExecutorTestCallback<String> callback = new ExecutorTestCallback<>();

        defaultExecutors.performOnForeground(expectedResult,callback);

        callback.waitForCompletion();
        assertTrue(callback._successCalled.get());
        assertFalse(callback._failureCalled.get());
        assertEquals(expectedResult, callback._successResult.get());
        assertEquals(1,mLogger.getLogMessages().size());
        assertTrue(mLogger.hasMessage(expectedLogMessage));
    }

	@Test
    public void testPerformOnForegroundWithProgress() throws Exception {
		final String expectedLogMessage = "Starting foreground task, current active count:0, with progress  1, max progress2";
        final ExecutorTestCallback<String> callback = new ExecutorTestCallback<>();
        final int expectedCurrentValue = 1;
        final int expectedMaxValue = 2;

        defaultExecutors.performOnForeground(expectedCurrentValue, expectedMaxValue, callback);

        callback.waitForCompletion();;
        assertFalse(callback._successCalled.get());
        assertFalse(callback._failureCalled.get());
        assertTrue(callback._progressCalled.get());
        assertEquals(expectedCurrentValue, callback._progressResultCurrent.get());
        assertEquals(expectedMaxValue, callback._progressResultMax.get());
        assertEquals(1,mLogger.getLogMessages().size());
        assertTrue(mLogger.hasMessage(expectedLogMessage));
    }

	@Test
    public void testPerformOnForegroundWithClientException() {
        final String expectedExceptionMessage = "client exception message";
        final String expectedLogMessage = "Starting foreground task, current active count:0, with exception com.microsoft.graph.core.ClientException: client exception message";
        final ExecutorTestCallback<String> callback = new ExecutorTestCallback<>();

        defaultExecutors.performOnForeground(new ClientException(expectedExceptionMessage,null),
                callback);

        callback.waitForCompletion();
        assertFalse(callback._successCalled.get());
        assertTrue(callback._failureCalled.get());
        assertEquals(expectedExceptionMessage, callback._exceptionResult.get().getMessage());
        assertEquals(1,mLogger.getLogMessages().size());
        assertTrue(mLogger.hasMessage(expectedLogMessage));
    }

	private class ExecutorTestCallback<T> implements IProgressCallback<T> {
        CountDownLatch latch = new CountDownLatch(1);

        AtomicBoolean _successCalled = new AtomicBoolean(false);
        AtomicReference<T> _successResult = new AtomicReference<>();

        AtomicBoolean _failureCalled = new AtomicBoolean(false);
        AtomicReference<ClientException> _exceptionResult = new AtomicReference<>();

        AtomicBoolean _progressCalled = new AtomicBoolean(false);
        AtomicLong _progressResultCurrent = new AtomicLong(-1);
        AtomicLong _progressResultMax = new AtomicLong(-1);

        @Override
        public void success(final T result) {
            _successCalled.set(true);
            _successResult.set(result);
            latch.countDown();
        }

        @Override
        public void failure(final ClientException ex) {
            _failureCalled.set(true);
            _exceptionResult.set(ex);
            latch.countDown();
        }

        @Override
        public void progress(final long current, final long max) {
            _progressCalled.set(true);
            _progressResultCurrent.set(current);
            _progressResultMax.set(max);
            latch.countDown();
        }
        
        void waitForCompletion() {
            try {
                // use a big enough wait to handle a big gc
                Assert.assertTrue(latch.await(20, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
